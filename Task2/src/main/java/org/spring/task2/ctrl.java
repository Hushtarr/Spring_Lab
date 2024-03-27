package org.spring.task2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ctrl
    {

    //Query Parameter
    @RequestMapping("/info")
    public String getinfo(@RequestParam String brand, Model model)
        {
        model.addAttribute("brand",brand);
        System.out.println(brand);
        return "MyCar";
        }

    @RequestMapping("/info1")
    public String getinfo1(@RequestParam(value = "brand",required = false,defaultValue = "Audi") String brand, Model model)
        {
        model.addAttribute("brand",brand);
        System.out.println(brand);
        return "MyCar";
        }

    @RequestMapping("/info2")
    public String getinfo2(@RequestParam String brand,@RequestParam int year, Model model)
        {
        model.addAttribute("year",year);
        model.addAttribute("brand",brand);
        System.out.println(brand+year);
        return "MyCar";
        }



//Path Variable

    @RequestMapping("/info3/{brand}")
    public String getinfo3(@PathVariable String brand)
        {
        System.out.println(brand);
        return "MyCar";
        }

    @RequestMapping("/info4/{brand}/{year}")
    public String getinfo4(@PathVariable String brand,@PathVariable String year)
        {
        System.out.println(brand);
        System.out.println(year);
        return "MyCar";
        }
    }
/*在Web开发中，Query Parameter（查询参数）和Path Variable（路径变量）是两种常见的方式，
用于在HTTP请求中传递信息到服务器。下面通过Spring Boot中的Controller示例来说明这两种方式的区别和用法。

Query Parameter
http://localhost:8080/info2?brand=Bmw&year=2017

Path Variable
http://localhost:8080/info4/Bmw/2017

*/