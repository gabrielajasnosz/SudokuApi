package com.demo.springboot.dto;


import java.util.List;

public class IncorrectSudokuDto {
    private List<Integer> lineIds;
    private List<Integer> columnIds;
    private List<Integer> areaIds;

    public IncorrectSudokuDto() {
    }

    public IncorrectSudokuDto(List<Integer> lineIds, List<Integer> columnIds, List<Integer> areaIds) {
        this.lineIds = lineIds;
        this.columnIds = columnIds;
        this.areaIds = areaIds;
    }

    public List<Integer> getLineIds() {
        return lineIds;
    }

    public void setLineIds(List<Integer> lineIds) {
        this.lineIds = lineIds;
    }

    public List<Integer> getColumnIds() {
        return columnIds;
    }

    public void setColumnIds(List<Integer> columnIds) {
        this.columnIds = columnIds;
    }

    public List<Integer> getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(List<Integer> areaIds) {
        this.areaIds = areaIds;
    }
}
