package org.sdp.beans;

public class HTMLMessageWriter implements IMessageWriter{
    @Override
    public String write(String message) {
        return "<HTML>"+message+"</HTML>";
    }
}
