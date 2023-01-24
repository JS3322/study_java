package code101_example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteFile {
    public static void writeFile(String[] input_data) {
        try {
            ArrayList<String> lines_t = new ArrayList<>(Arrays.asList("순번,학생명,첫번째문제,두번째문제,세번째문제"));
            for(int i=0; i<input_data.length; i++) {
                lines_t.add(input_data[i]);
            }


            Path textFile = Paths.get("studentData.csv");
            Files.write(textFile, lines_t, StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}