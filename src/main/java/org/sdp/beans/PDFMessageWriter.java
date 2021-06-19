package org.sdp.beans;

public class PDFMessageWriter implements IMessageWriter {
    @Override
    public String write(String message) {
        return "<PDF>"+message+"</PDF>";
    }
}
