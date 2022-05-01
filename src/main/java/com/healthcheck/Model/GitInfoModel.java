package com.healthcheck.Model;

public class GitInfoModel {

    private ApplicationDetails app;
    private GitInfoDetails git;
    private BuildInfoDetails build;

    public ApplicationDetails getApp() {
        return app;
    }

    public void setApp(ApplicationDetails app) {
        this.app = app;
    }

    public GitInfoDetails getGit() {
        return git;
    }

    public void setGit(GitInfoDetails git) {
        this.git = git;
    }

    public BuildInfoDetails getBuild() {
        return build;
    }

    public void setBuild(BuildInfoDetails build) {
        this.build = build;
    }
}
