package com.practika.credithistory.Controllers;

import com.practika.credithistory.entity.Application;
import com.practika.credithistory.entity.Client;
import com.practika.credithistory.repo.ApplicationRepository;
import com.practika.credithistory.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
public class MainController {
    @Autowired
    private ClientRepository res;

    @Autowired
    private ApplicationRepository app;

    @PostMapping("/add")
    public String Clientadd(@RequestParam String firstName, @RequestParam String lastName, @RequestParam LocalDate birthDate, @RequestParam String email, @RequestParam String phone, @RequestParam Integer workExperience, @RequestParam BigDecimal monthlyIncome, @RequestParam String employmentType, @RequestParam BigDecimal amount, @RequestParam Integer term, @RequestParam String purpose){
        Client client = new Client(firstName, lastName, birthDate, email, phone, workExperience, monthlyIncome,employmentType);
        res.save(client);

        Application application = new Application(client, amount, term, purpose);
        app.save(application);


        return "/";
    }


    }



