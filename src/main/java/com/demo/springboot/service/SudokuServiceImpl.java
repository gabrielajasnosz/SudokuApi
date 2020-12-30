package com.demo.springboot.service;


import com.demo.springboot.dto.IncorrectSudokuDto;
import com.demo.springboot.dto.SudokuDto;
import com.demo.springboot.repository.CsvOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SudokuServiceImpl implements SudokuService {

    @Autowired
    CsvOperations csvOperations;
    private IncorrectSudokuDto incorrectSudokuDto;

    public SudokuServiceImpl() {
    }

    @Override
    public IncorrectSudokuDto getIncorrectSudokuDto() {
        return incorrectSudokuDto;
    }

    @Override
    public boolean checkSudoku() {
        SudokuDto mySudoku = csvOperations.convertLinesToSudoku(csvOperations.readCsvFile());
        List<Integer> lineIds = new ArrayList<>();
        List<Integer> columnIds = new ArrayList<>();
        List<Integer> areaIds = new ArrayList<>();


        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int frequencyRows = Collections.frequency(mySudoku.getSudoku().get(i), (mySudoku.getSudoku().get(i).get(j)));
                temp.add(mySudoku.getSudoku().get(j).get(i));
                if (frequencyRows > 1) {
                    lineIds.add(i);
                    break;

                }
            }
            for (Integer t : temp) {
                if (Collections.frequency(temp, t) > 1) {
                    columnIds.add(i);
                    break;
                }
            }
            temp = new ArrayList<>();

        }

        List<List<Integer>> board = new ArrayList<>();
        List<Integer> square1 = new ArrayList<>();
        List<Integer> square2 = new ArrayList<>();
        List<Integer> square3 = new ArrayList<>();
        List<Integer> square4 = new ArrayList<>();
        List<Integer> square5 = new ArrayList<>();
        List<Integer> square6 = new ArrayList<>();
        List<Integer> square7 = new ArrayList<>();
        List<Integer> square8 = new ArrayList<>();
        List<Integer> square9 = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i < 3) {
                    if (j < 3) {
                        square1.add(mySudoku.getSudoku().get(i).get(j));
                    }
                    if (j >= 3 && j < 6) {
                        square2.add(mySudoku.getSudoku().get(i).get(j));
                    }
                    if (j >= 6 && j < 9) {
                        square3.add(mySudoku.getSudoku().get(i).get(j));
                    }
                }
                if (i >= 3 && i < 6) {
                    if (j < 3) {
                        square4.add(mySudoku.getSudoku().get(i).get(j));
                    }
                    if (j >= 3 && j < 6) {
                        square5.add(mySudoku.getSudoku().get(i).get(j));
                    }
                    if (j >= 6 && j < 9) {
                        square6.add(mySudoku.getSudoku().get(i).get(j));
                    }
                }
                if (i >= 6 && i < 9) {
                    if (j < 3) {
                        square7.add(mySudoku.getSudoku().get(i).get(j));
                    }
                    if (j >= 3 && j < 6) {
                        square8.add(mySudoku.getSudoku().get(i).get(j));
                    }
                    if (j >= 6 && j < 9) {
                        square9.add(mySudoku.getSudoku().get(i).get(j));
                    }
                }


            }
        }
        board.add(square1);
        board.add(square2);
        board.add(square3);
        board.add(square4);
        board.add(square5);
        board.add(square6);
        board.add(square7);
        board.add(square8);
        board.add(square9);

        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                if (Collections.frequency(board.get(i), (board.get(i).get(j))) > 1) {
                    areaIds.add(i);

                    break;
                }
            }

        }

        if (!lineIds.isEmpty() || !areaIds.isEmpty() || !columnIds.isEmpty()) {
            incorrectSudokuDto = new IncorrectSudokuDto(lineIds, columnIds, areaIds);
            return false;
        }
        return true;
    }


}



