package com.beauney.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zengjiantao
 * @since 2020-08-12
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c:/test.text");
        //InputStreamReader就是一个适配器，因为BufferedReader无法直接使用FileInputStream读流，所有中间加一个InputStreamReader作为转换
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        br.close();
    }
}
