package fr.unice.miage.m1.TP1;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by JuIngong on 28/09/2016.
 */
public class CodeDeBase {
    public static void main(String[] args) {
        try {
            Writer writer = new StringWriter();
            writer = new DummyWriter(writer);
            //writer = new ToUpperCaseWriter(writer);
            writer = new FirstToUpperCaseWriter(writer);
            writer = new CenteredWriter(writer, 10);
            writer = new OnlyOneSpaceWriter(writer);
            writer.write("je n'aime pas  les majuscules.  mais    en  français c'est  obligatoire.");
            writer.close();
            System.out.println(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}