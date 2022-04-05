package com.healthcheck.Controller;

import com.healthcheck.Model.HealthCheckModel;
import com.healthcheck.Service.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class Controller {

    @Autowired
    private HealthCheckService healthCheckService;

    @GetMapping(value = "/dashboard", produces = MediaType.APPLICATION_JSON_VALUE)
    public HealthCheckModel sayHello() {
        HealthCheckModel response = healthCheckService.getService1HealthCheck();
        System.out.println("Testing");
        return response;
    }
}
