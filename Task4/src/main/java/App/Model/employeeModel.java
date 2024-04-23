package App.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

@Data
public class employeeModel
    {
    @NotEmpty(message = "Cant be empty")
    private String employee_name;
    private String employee_id;
    private String employee_phone;
    private String employee_email;
    private String employee_address;
    private String employee_city;
    private String employee_state;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate employee_birthday;


    }
