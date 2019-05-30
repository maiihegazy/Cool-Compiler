import org.antlr.v4.runtime.*;


import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.*;
import java.io.*;
import java.lang.reflect.Field;
public class CodegenTest {

    public static BufferedWriter writer, writer2 ;


    public static void main(String[] args) {
        try{
            String TestCaseFile = args[0];
            String OutputFile =  args[0] + "-CST";
            String astOutput = args[0] + "-lex";
            File file = new File(OutputFile);
            File file2 = new File(astOutput);
            file.delete();
            file2.delete();

            writer = new BufferedWriter(new FileWriter(OutputFile, true));
            writer2 = new BufferedWriter(new FileWriter(astOutput, true));

            FileInputStream fis = new FileInputStream(new File(TestCaseFile));
            ANTLRInputStream input = new ANTLRInputStream(fis);
            lex lexer = new lex(input);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            tokenStream.fill();
            parse parser = new parse(tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(new ThrowingErrorListener());



            parse.ProgramContext prog = parser.program();
            //prog = parser.program();

//          System.out.println(prog.value.getString(""));
            writer2.write(prog.value.getString(""));
            prog.value.gen();
//            System.out.println(AST.prog3AdCode);

            for(String s: AST.prog3AdCode){
                System.out.println(s);
                writer.write(s + "\n");
            }
            writer.close();
            writer2.close();


        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }



    }


}