package com.healthcheck.Service;

import com.healthcheck.Client.HealthClient;
import com.healthcheck.Model.GitInfoModel;
import com.healthcheck.Model.HealthCheckModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GitInfoCheckService {

    @Autowired
    private HealthClient healthClient;

    public GitInfoModel getInfoCheckService() {
        return healthClient.getServiceInfo();
    }
}
