package com.learn.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SampleEffectiveFinal {

    public static void main(String[] args) throws IOException {

        var writer = Files.newBufferedWriter(Path.of("/com/learn/exceptions/abc.txt"));
        // variable used as a try with resource should be final or effectively final
//        try(writer) {
//            writer.append("Welcome to the zoo");
//        }
//        writer = null;



        var anotherWriter = Files.newBufferedWriter(Path.of("/com/learn/exceptions/abc.txt"));
        try(anotherWriter) {
            anotherWriter.append("Welcome to the zoo");
        }
        anotherWriter.append("This will compile but it will fail and  throw IOException by saying stream is closed");
    }

}
