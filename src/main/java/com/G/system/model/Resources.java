package com.G.system.model;

public class Resources {
    private String resourcesId;

    private String resourcesName;

    private String resourcesUrl;

    private String resourcesDescription;

    public Resources(String resourcesId, String resourcesName, String resourcesUrl, String resourcesDescription) {
        this.resourcesId = resourcesId;
        this.resourcesName = resourcesName;
        this.resourcesUrl = resourcesUrl;
        this.resourcesDescription = resourcesDescription;
    }

    public Resources() {
    }

    public String getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(String resourcesId) {
        this.resourcesId = resourcesId;
    }

    public String getResourcesName() {
        return resourcesName;
    }

    public void setResourcesName(String resourcesName) {
        this.resourcesName = resourcesName;
    }

    public String getResourcesUrl() {
        return resourcesUrl;
    }

    public void setResourcesUrl(String resourcesUrl) {
        this.resourcesUrl = resourcesUrl;
    }

    public String getResourcesDescription() {
        return resourcesDescription;
    }

    public void setResourcesDescription(String resourcesDescription) {
        this.resourcesDescription = resourcesDescription;
    }
}