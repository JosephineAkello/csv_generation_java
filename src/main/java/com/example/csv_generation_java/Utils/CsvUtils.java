package com.example.csv_generation_java.Utils;


import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.example.csv_generation_java.domain.Developer;

public class CsvUtils {
    public static void main(String[] args) throws Exception{
        String csvFile = "home/Documents/developer.csv";
        FileWriter writer = new FileWriter(csvFile);

        List<Developer> developers = Arrays.asList(
                new Developer("jos", new BigDecimal(10000), 25),
                new Developer("Maureen", new BigDecimal(20000), 27),
                new Developer("Akello", new BigDecimal(15000), 26)
        );
        
    }

}
