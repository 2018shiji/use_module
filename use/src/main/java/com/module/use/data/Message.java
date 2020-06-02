package com.module.use.data;

import com.module.use.data.type.Type;

import java.util.Objects;

public class Message {
    private String message;
    private Type type;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        if(Objects.isNull(message) || message.isEmpty())
            throw new IllegalArgumentException("message can not be null or empty");

        this.message = message;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
