package com.G.system.model;

public class UserRoleResources {
    private String userId;
    private String roleId;
    private String resourcesId;
    private String operating;
    private String resourcesName;
    private String resourcesUrl;
    private String resourcesDescription;

    public UserRoleResources() {
    }

    public UserRoleResources(String userId, String roleId, String resourcesId, String operating, String resourcesName, String resourcesUrl, String resourcesDescription) {
        this.userId = userId;
        this.roleId = roleId;
        this.resourcesId = resourcesId;
        this.operating = operating;
        this.resourcesName = resourcesName;
        this.resourcesUrl = resourcesUrl;
        this.resourcesDescription = resourcesDescription;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(String resourcesId) {
        this.resourcesId = resourcesId;
    }

    public String getOperating() {
        return operating;
    }

    public void setOperating(String operating) {
        this.operating = operating;
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
