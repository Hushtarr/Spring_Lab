package org.spring.task1.controller;

import org.spring.task1.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.spring.task1.model.Gender.F;
import static org.spring.task1.model.Gender.M;


@Controller
public class ctrl
    {
    @RequestMapping("/Mentor")
    public String getMentor(Model model)
        {
        Mentor m1=new Mentor("AA",M,23);
        Mentor m2=new Mentor("BB",F,25);
        Mentor m3=new Mentor("CC",F,23);

        List<Mentor>MentorList=new ArrayList<>(Arrays.asList(m1,m2,m3));
        model.addAttribute("List",MentorList);
        return "Test";
        }
    }
