package com.G.system.model;

public class RoleResources {
    private String roleId;

    private String resourcesId;

    private String operating;

    public RoleResources(String roleId, String resourcesId, String operating) {
        this.roleId = roleId;
        this.resourcesId = resourcesId;
        this.operating = operating;
    }

    public RoleResources() {
        super();
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
}