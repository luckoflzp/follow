package com.G.utils;

public class UpdateParameterUtils {
    private Object newObject;
    private Object oldObject;

    public UpdateParameterUtils(Object newObject, Object oldObject) {
        this.newObject = newObject;
        this.oldObject = oldObject;
    }

    public Object getNewObject() {
        return newObject;
    }

    public void setNewObject(Object newObject) {
        this.newObject = newObject;
    }

    public Object getOldObject() {
        return oldObject;
    }

    public void setOldObject(Object oldObject) {
        this.oldObject = oldObject;
    }
}
