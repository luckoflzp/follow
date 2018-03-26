package com.G.system.model;

public class User {
    private String userId;

    private String userAct;

    private String userPsd;

    private String userSex;

    private String userPosition;

    private String userName;

    private String userAge;

    private String userPhone;

    private String userEnable;

    private String userEmail;

    private String updateTime;

    private String userOrganizationName;

    private String userOrganizationCode;

    private String userDepartment;

    public User(String userId, String userAct, String userPsd, String userSex, String userPosition, String userName, String userAge, String userPhone, String userEnable, String userEmail, String updateTime, String userOrganizationName, String userOrganizationCode, String userDepartment) {
        this.userId = userId;
        this.userAct = userAct;
        this.userPsd = userPsd;
        this.userSex = userSex;
        this.userPosition = userPosition;
        this.userName = userName;
        this.userAge = userAge;
        this.userPhone = userPhone;
        this.userEnable = userEnable;
        this.userEmail = userEmail;
        this.updateTime = updateTime;
        this.userOrganizationName = userOrganizationName;
        this.userOrganizationCode = userOrganizationCode;
        this.userDepartment = userDepartment;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserIid(String userIid) {
        this.userId = userIid;
    }

    public String getUserAct() {
        return userAct;
    }

    public void setUserAct(String userAct) {
        this.userAct = userAct;
    }

    public String getUserPsd() {
        return userPsd;
    }

    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEnable() {
        return userEnable;
    }

    public void setUserEnable(String userEnable) {
        this.userEnable = userEnable;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserOrganizationName() {
        return userOrganizationName;
    }

    public void setUserOrganizationName(String userOrganizationName) {
        this.userOrganizationName = userOrganizationName;
    }

    public String getUserOrganizationCode() {
        return userOrganizationCode;
    }

    public void setUserOrganizationCode(String userOrganizationCode) {
        this.userOrganizationCode = userOrganizationCode;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }
}