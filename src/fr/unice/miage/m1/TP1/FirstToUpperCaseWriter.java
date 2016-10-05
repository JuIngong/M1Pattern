package fr.unice.miage.m1.TP1;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by JuIngong on 28/09/2016.
 */
public class FirstToUpperCaseWriter extends Writer {

    private Writer writer;

    public FirstToUpperCaseWriter(Writer writer) {
        this.writer = writer;
    }


    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        boolean toUp = true;
        for (int i = 0; i < len; i++) {
            if (toUp && Character.isLetter(cbuf[i])) {
                cbuf[i] = Character.toUpperCase(cbuf[i]);
                toUp = false;
            } else if (cbuf[i] == '.' || cbuf[i] == '!' || cbuf[i] == '?') {
                toUp = true;
            }

        }
        writer.write(cbuf, off, len);
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
