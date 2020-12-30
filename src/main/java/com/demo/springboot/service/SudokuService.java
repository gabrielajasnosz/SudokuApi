package com.demo.springboot.service;

import com.demo.springboot.dto.IncorrectSudokuDto;
import com.demo.springboot.dto.SudokuDto;

public interface SudokuService {
    boolean checkSudoku();

    IncorrectSudokuDto getIncorrectSudokuDto();

}
