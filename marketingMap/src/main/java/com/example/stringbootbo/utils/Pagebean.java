package com.example.stringbootbo.utils;

import lombok.Data;

import java.util.List;
@Data
public class Pagebean<T> {

    private int pageNo;
    private int pageSize;
    private int pageCount;
    private List<T> dateList;




}
