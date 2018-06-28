package com.mitro.controller;

import com.mitro.model.Employee;
import com.mitro.model.Greetings;
import com.mitro.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AlessioMitrotta on 20-Jun-18.
 * If you have any problem with this code please let me know at amitrotta@soldo.com
 */
@RestController
public class TestController {

    @Autowired
    GreetingsService greetingsService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstPage() {

        Employee emp = new Employee();
        emp.setName("emp1");
        emp.setDesignation("manager");
        emp.setEmpId("2");
        emp.setSalary(3000);

        return emp;
    }

    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message) {
        Greetings greetings = new Greetings();
        greetings.setMessage(message);
        greetingsService.sendGreeting(greetings);
    }
}
