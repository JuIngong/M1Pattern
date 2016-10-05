package fr.unice.miage.m1.TP1;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by JuIngong on 28/09/2016.
 */
public class OnlyOneSpaceWriter extends Writer {

    private Writer writer;

    public OnlyOneSpaceWriter(Writer writer) {
        this.writer = writer;
    }


    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        StringBuilder str = new StringBuilder(new String(cbuf));
        for (int i = len; i > 0; i--) {
            if (Character.isWhitespace(cbuf[i]) && Character.isWhitespace(cbuf[i-1])) {
                str.deleteCharAt(i);
            }
        }
        writer.write(str.toString().toCharArray(), off, len);
    }

    @Override
    public void flush() throws IOException {
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }

    @Override
    public String toString() {
        return writer.toString();
    }
}
