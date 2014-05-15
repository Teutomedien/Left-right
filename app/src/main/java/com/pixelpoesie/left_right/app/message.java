package com.pixelpoesie.left_right.app;

/**
 * Created by christophwolff on 14.05.14.
 */
public class Message {

    public String msg_text;
    public String time_send;
    public String sender;
    public String reciever;





    public Message(){
        super();
    }

    public Message(String msg_test, String time_send, String sender, String reciever) {
        this.msg_text = msg_test;
        this.time_send = time_send;
        this.sender = sender;
        this.reciever = reciever;
    }

    public void setMsg_text(String msg_text) {
        this.msg_text = msg_text;
    }

    public String getMsg_text() {
        return msg_text;
    }

    public String getTime_send() {
        return time_send;
    }

    public void setTime_send(String time_send) {
        this.time_send = time_send;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    @Override
    public String toString() {
        return this.msg_text + "... " + this.time_send + " " + this.sender + " . " + this.reciever;
    }
}
