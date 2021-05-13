package com.lptnkv.engapp.controller;


import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.List;

public class test {
    public static void main(String[] args) {
        School school = new School(14, "СОЩ");
        System.out.println(new Gson().toJson(school));
    }


    static class School{
        int number;
        String type;

        public School(int number, String type) {
            this.number = number;
            this.type = type;
        }
    }
}
