package com.example.chatapplication.messages;

public class MessagesList {

    private String name, mobile, lastmessage;
    private int unseenMessages;

    public MessagesList(String name, String mobile, String lastmessage, int unseenMessages) {
        this.name = name;
        this.mobile = mobile;
        this.lastmessage = lastmessage;
        this.unseenMessages = unseenMessages;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public int getUnseenMessages() {
        return unseenMessages;
    }
}
