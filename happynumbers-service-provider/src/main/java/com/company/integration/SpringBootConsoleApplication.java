package com.company.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.integration.service.HappyNumberService;

import java.util.List;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootConsoleApplication.class);

    @Value("${rangeValue}")
    private Integer rangeValue;

    @Autowired
    private HappyNumberService happyNumberService;

    public static void main(String[] args) throws Exception {
    	logger.info("Springboot application started");
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    List<Integer> happyNumbers = happyNumberService.getHappyNumbers(rangeValue);
    logger.info("****HAPPY NUMBERS ARE*******"+happyNumbers);

    }
}