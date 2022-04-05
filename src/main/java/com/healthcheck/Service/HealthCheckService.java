package com.healthcheck.Service;

import com.healthcheck.Client.HealthClient;
import com.healthcheck.Model.HealthCheckModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    @Autowired
    private HealthClient healthClient;

    public HealthCheckModel getService1HealthCheck() {
        healthClient.getService1Hello();
        return healthClient.getService1Health();
    }
}
