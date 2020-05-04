package com.example.csv_generation_java.Utils;


import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

import com.example.csv_generation_java.domain.Developer;

public class CsvUtils{
    public static void main(String[] args) throws Exception{
        String csvFile = "home/Documents/CSV/developer.csv";
        FileWriter writer = new FileWriter(csvFile);

        List<Developer> developers = Arrays.asList(
                new Developer("jos", new BigDecimal(10000), 25),
                new Developer("Maureen", new BigDecimal(20000), 27),
                new Developer("Akello", new BigDecimal(15000), 26)
        );

        //csv header
      CSVUtils.writeLine(writer, Arrays.asList("Name", "Salary", "Age"));

        for (Developer d : developers){
            List<String> list = new ArrayList<>();
            list.add(d.getName());
            list.add(d.getSalary().toString());
            list.add(String.valueOf(d.getAge()));

            CSVUtils.writeLine(writer, list);

        }

        writer.flush();
        writer.close();
    }

}
