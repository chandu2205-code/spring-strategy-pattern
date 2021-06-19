package org.sdp.beans;

public class MessageDisplay {
    private IMessageWriter messageWriter;

    public void displayMessage() {
        System.out.println(messageWriter.write("Spring Ctx dependency is achieved."));
    }

    public void setMessageWriter(IMessageWriter messageWriter) {
        this.messageWriter = messageWriter;
    }
}
