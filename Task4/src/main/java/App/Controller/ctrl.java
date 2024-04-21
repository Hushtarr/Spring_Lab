package App.Controller;

import App.Model.employeeModel;
import App.Service.EmployeeService;
import App.bootStrap.Country;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/employee")
public class ctrl
    {
    private final EmployeeService service;

    public ctrl(EmployeeService service)
        {
        this.service = service;
        }


    @GetMapping("/register")
    public String employeeRegister(Model model)
        {
        // "th:text=#{key}"
        // "th:text=${attributeName}"
        //  <th:field="*{name}">
        // <tr th:each="element: ${collection}">
        // <th:if="${condition} == ??? "  th:text="!!!" >
        // <th:unless="${condition} == ??? " th:text="!!!" />


//        model.addAttribute("countries", Country.getList());
        model.addAttribute("employee_info",new employeeModel());
        return "registerPage";
        }

    @PostMapping("/registerDone")
    public String employeeRegisterDone(@Valid employeeModel employeeModel, BindingResult bindingResult)
        {
        if (bindingResult.hasErrors())
            {
            return "/registerPage";
            }
        service.saveInfo(employeeModel);
        return "/redirect:allInfo";
        }
            //model.addAttribute("countries", Country.getList());
//            return "redirect:register";

    @GetMapping("/allInfo")
    public String info(Model model)
        {
        model.addAttribute("service",service.getAllInfo());
        return "InfoPage";
        }

    @ModelAttribute
    public void general(Model model)
        {
        model.addAttribute("title","Employee");
        model.addAttribute("countries", Country.getList());
        /*Map<String,String>countries = new HashMap<>();
        countries.put("USA","US");
        countries.put("Europe","EU");
        countries.put("Australia","AU");
        countries.put("Belgium","BG");
        countries.put("Germany","GD");
        model.addAttribute("countries",countries );*/
        }





    }

