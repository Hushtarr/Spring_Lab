package App.Service;

import App.Model.employeeModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService
    {
    public static List<employeeModel> employeeList = new ArrayList<>();
    public void saveInfo(employeeModel employee)
        {
        employeeList.add(employee);
        }
    public List<employeeModel>getAllInfo()
        {
        return employeeList;
        }
    }
