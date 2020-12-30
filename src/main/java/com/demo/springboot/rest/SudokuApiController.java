package com.demo.springboot.rest;

import com.demo.springboot.dto.IncorrectSudokuDto;
import com.demo.springboot.service.SudokuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/sudoku")
public class SudokuApiController {

    @Autowired
    SudokuService sudokuService;

    @PostMapping(value = "/verify")
    public ResponseEntity verify() {
        if (sudokuService.checkSudoku()) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().body(sudokuService.getIncorrectSudokuDto());

    }
}



