package com.module.module.main;

import com.module.module2.support.RendererSupport;

public class Client {
    public static void main(String[] args) {
        RendererSupport support = new RendererSupport();
        support.render("welcome to java 13 module");
        System.out.println(support.getCurrentMessage().getMessage()
            + support.getCurrentMessage().getType());
    }
}
