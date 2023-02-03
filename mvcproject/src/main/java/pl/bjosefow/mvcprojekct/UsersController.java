package pl.bjosefow.mvcprojekct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class UsersController {

    private UserRepository userRepository;

    @Autowired
    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.GET})
    public String addUser(@RequestParam String imie, @RequestParam String nazwisko, @RequestParam (defaultValue = "0") Integer wiek) {
        if (imie != "") {
            userRepository.addUserToList(new User(imie, nazwisko, wiek));
            return "redirect:/success.html";
        } else {
            return "redirect:/err.html";
        }
    }

    @RequestMapping("/users")
    @ResponseBody
    public String printUserList() {
        List<User> allUsers = userRepository.getAllUsers();
        String result = "";
        for (User user : allUsers) {
            result += user.toString() + "</br>";
        }
        return result;
    }
}
