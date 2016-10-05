package fr.unice.miage.m1.TP1;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by JuIngong on 28/09/2016.
 */
public class DummyWriter extends Writer {

    private Writer writer;

    public DummyWriter(Writer writer) {
        this.writer = writer;
    }


    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
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
