package com.demo.springboot.repository;

import com.demo.springboot.dto.SudokuDto;

import java.util.List;

public interface CsvOperations {
    String PATH = "sudoku.csv";

    List<String> readCsvFile();

    SudokuDto convertLinesToSudoku(List<String> lines);

}
