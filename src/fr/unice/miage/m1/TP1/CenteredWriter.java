package fr.unice.miage.m1.TP1;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by JuIngong on 28/09/2016.
 */
public class CenteredWriter extends Writer {

    private Writer writer;
    private int width;

    public CenteredWriter(Writer writer, int width) {
        this.writer = writer;
        this.width = width;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        StringBuilder buff = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < len; i++) {
            if(Character.isLetter(cbuf[i]) ){
                while (counter < width){
                    buff.append(cbuf[i+counter]);
//                    if(Character.isWhitespace(cbuf[i+counter])){
//                        buff.append(System.lineSeparator());
//                    }
                    counter++;
                }
                buff.append(System.lineSeparator());
                i += counter -1;
                counter = 0;
            }
        }
        writer.write(buff.toString().toCharArray(), off, buff.length());
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
