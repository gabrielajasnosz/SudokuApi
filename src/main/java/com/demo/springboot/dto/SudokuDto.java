package com.demo.springboot.dto;

import java.util.List;

public class SudokuDto {
    private List<List<Integer>> sudoku;

    public SudokuDto() {
    }

    public SudokuDto(List<List<Integer>> sudoku) {
        this.sudoku = sudoku;
    }

    public List<List<Integer>> getSudoku() {
        return sudoku;
    }

    public void setSudoku(List<List<Integer>> sudoku) {
        this.sudoku = sudoku;
    }
}
