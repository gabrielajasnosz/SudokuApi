package com.demo.springboot.repository;

import com.demo.springboot.dto.SudokuDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CsvOperationsImpl implements CsvOperations {
    private static final Logger LOGGER = LoggerFactory.getLogger(CsvOperationsImpl.class);

    private List<String> lines;

    public CsvOperationsImpl() {

        lines = new ArrayList<>();
    }

    @Override
    public List<String> readCsvFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH));

            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }


    public SudokuDto convertLinesToSudoku(List<String> lines) {

        List<List<Integer>> records = new ArrayList<>();
        for (final String line : lines) {
            String[] tab = line.split(",");
            List<Integer> holder = new ArrayList<>();
            for (String item : tab) {
                holder.add(Integer.parseInt(item));
            }
            records.add(holder);
        }
        for (List<Integer> o : records) {
            System.out.println(o);

        }

        return new SudokuDto(records);
    }



}
