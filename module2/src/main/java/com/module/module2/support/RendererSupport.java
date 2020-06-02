package com.module.module2.support;

import com.module.module2.renderer.SimpleRenderer;
import com.module.use.data.Message;
import com.module.use.data.type.Type;

public class RendererSupport {
    private Message message = new Message();

    public void render(String message) {
        this.message.setMessage(message);
        this.message.setType(Type.STRING);
        new SimpleRenderer().renderAsString(this.message);
    }

    public Message getCurrentMessage() {
        return this.message;
    }

}
