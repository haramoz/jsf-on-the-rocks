package com.dr.sattlers.bar.jsf.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void submit() {
        System.out.println("Submitted name: " + name);
    }
}
