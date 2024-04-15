package org.spring.lab_02.config;

import org.spring.lab_02.Currency;
import org.spring.lab_02.account.Current;
import org.spring.lab_02.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class Config
    {
    @Bean
    public Currency currency()
        {
        Currency currency=new Currency();
        currency.setCode("0991");
        currency.setName("Pul");
        return currency;
        }

    @Bean
    public Current current()
        {
        Current current=new Current();
        current.setAccountId(UUID.randomUUID());
        current.setAmount(BigDecimal.valueOf(200));
        current.setCurrency(currency());    //Directly reference the bean
        return current;
        }

    @Bean
    public Saving  saving(Currency currency)
        {
        Saving saving=new Saving();
        saving.setAccountId(UUID.randomUUID());
        saving.setAmount(BigDecimal.valueOf(200));
        saving.setCurrency(currency);
        return saving;
        }


    /*1. 扫描 Bean 定义:

        Spring 框架会扫描应用程序上下文中的所有 Bean 定义，包括使用 @Bean 注解定义的 Bean。

    2. 匹配参数类型:

        Spring 框架会检查 saving 方法的参数类型（Currency）。

    3. 查找匹配的 Bean:

        Spring 框架会查找应用程序上下文中所有类型为 Currency 的 Bean。

    4. 注入 Bean:

        如果 Spring 框架找到一个匹配的 Bean，它会将该 Bean 注入到 saving 方法的参数中。

    5. 处理多个匹配:

        如果 Spring 框架找到多个匹配的 Bean，它会根据 Bean 的名称或其他配置信息选择合适的 Bean 进行注入。

    6. 处理没有匹配:

        如果 Spring 框架没有找到任何匹配的 Bean，它会抛出异常。*/
    }
