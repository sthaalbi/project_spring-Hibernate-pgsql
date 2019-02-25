package com.ensg.spring;

import com.ensg.spring.hello.Evenement;
import com.ensg.spring.hello.EvenementRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.print.Book;

import static com.ensg.spring.hello.EvenementRepository.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}


