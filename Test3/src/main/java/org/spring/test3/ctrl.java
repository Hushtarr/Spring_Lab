package org.spring.test3;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        model.addAttribute("player_",new Faker().name().firstName());
        return "Character";
        }

    @RequestMapping("/new")
    public String NewChar(Model model)
        {
        NewCharacter tes=new NewCharacter();
        model.addAttribute("First_name",tes.getFirstname());
        model.addAttribute("Last_name",tes.getLastname());
        model.addAttribute("Country",tes.getCountry());
        List<NewCharacter>alist=new ArrayList<>();
        for (int i = 0; i < 3; i++)
            {
            alist.add(new NewCharacter());
            }
        model.addAttribute("List",alist);

        return "newChar";
        }

    public NewCharacter generate()
        {
        NewCharacter t =new NewCharacter();
       return t;
        }
    }
