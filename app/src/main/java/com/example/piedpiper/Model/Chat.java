package com.example.piedpiper.Model;

import com.example.piedpiper.encrypto.AesEncryption;

public class Chat {

    private String sender;
    private String receiver;
    private String message;
    private String secret;

    public Chat(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public Chat() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
//        try {
//            return AesEncryption.decrypt(message, "43");
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "";
//        }
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
