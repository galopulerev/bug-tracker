package com.vuduapps.bugtracker.cucumber;

import com.vuduapps.bugtracker.BugTrackerJHipsterApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = BugTrackerJHipsterApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
