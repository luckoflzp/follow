package com.G.system.model;

public class RoleUser {
    private String userId;

    private String roleId;

    public RoleUser(String userId, String roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public RoleUser() {
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
}