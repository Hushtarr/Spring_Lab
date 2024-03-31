package org.spring.test3;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/lol")
public class ctrl
    {
    @RequestMapping("/home")
    public String homepage()
        {
        return "Welcome";
        }
    @RequestMapping("/player")
    public String Character(Model model)
        {
        model.addAttribute("player_","Jax");
        return "Character";
        }

    @RequestMapping("/new")
    public String NewChar(Model model)
        {
        model.addAttribute("First_name",new NewCharacter().firstname);
        model.addAttribute("Last_name",new NewCharacter().lastname);
        model.addAttribute("Country",new NewCharacter().country);
        return "newChar";
        }
    }
