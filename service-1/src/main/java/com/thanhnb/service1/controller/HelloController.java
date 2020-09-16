package com.thanhnb.service1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/service-1")
public class HelloController {

    @RequestMapping(value = "/hi")
    public String hi() {
        return "Data from Hi Controller";
    }

    public static void main(String[] args) {
        int [] arr = {2,6};
        int [] brr = {24,36};
        System.out.println(total(arr, brr));
    }

    static int total(int[] arr, int[] brr) {
        int count = 0;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(brr).max().getAsInt();
        for (int i = min; i < max; i++) {
            if (checkChiaHet(arr, i) && checkArrChiaHet(brr, i)) count++;
        }
        return count;
    }

    static boolean checkChiaHet(int[] arr, int val) {
        for (int value : arr) {
            if (value == 0 && val % value != 0) return false;
        }
        return true;
    }

    static boolean checkArrChiaHet(int[] brr, int val) {
        for (int value : brr) {
            if (val != 0 && value % val != 0) return false;
        }
        return true;
    }

}
