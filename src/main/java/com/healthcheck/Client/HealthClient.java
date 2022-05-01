package com.healthcheck.Client;

import com.healthcheck.Model.GitInfoModel;
import com.healthcheck.Model.HealthCheckModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "health-check",  url = "${client.endpoint.service-1-health-check}")
public interface HealthClient {

    @GetMapping(value = "/actuator/health", produces = MediaType.APPLICATION_JSON_VALUE)
    HealthCheckModel getService1Health();

    @GetMapping(value = "/actuator/info", produces = MediaType.APPLICATION_JSON_VALUE)
    GitInfoModel getServiceInfo();

    @GetMapping(value = "/hello")
    String getService1Hello();
}
