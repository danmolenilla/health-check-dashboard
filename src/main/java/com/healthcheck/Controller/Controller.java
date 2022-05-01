package com.healthcheck.Controller;

import com.healthcheck.Model.DashboardResponse;
import com.healthcheck.Model.GitInfoModel;
import com.healthcheck.Model.HealthCheckModel;
import com.healthcheck.Service.GitInfoCheckService;
import com.healthcheck.Service.HealthCheckService;
import org.bouncycastle.asn1.icao.DataGroupHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController(value = "/")
public class Controller {

    @Autowired
    private HealthCheckService healthCheckService;

    @Autowired
    private GitInfoCheckService gitInfoCheckService;

    @GetMapping(value = "/dashboard", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DashboardResponse> sayHello() {
        List<DashboardResponse> response = new ArrayList<>();
        DashboardResponse dashboardResponse = new DashboardResponse();

        HealthCheckModel healthCheckModel = healthCheckService.getService1HealthCheck();
        GitInfoModel gitInfoModel = gitInfoCheckService.getInfoCheckService();

        dashboardResponse.setApp(gitInfoModel.getApp().getName());
        dashboardResponse.setCommitID(gitInfoModel.getGit().getCommit().getId().getFull());
        dashboardResponse.setStatus(healthCheckModel.getStatus());

        response.add(dashboardResponse);

        System.out.println("Testing");
        return response;
    }
}
