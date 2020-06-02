package com.module.module2.renderer;

import com.module.use.data.Message;

public class SimpleRenderer {
    public void renderAsString(Message message){
        System.out.println();
    }

    private String processMessage(Message msg) {
        return msg.getMessage() + msg.getType();
    }
}
