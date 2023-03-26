package pl.codegym.task.task04.task0442;

import java.io.*;

/**
 Created by xciechan
 on 2023-03-27

 The application sums of entered numbers, until the user enters the number "-1".
 */

public class Main {
    int number = 0;
    int sumOfNumber = 0;
    public static void main(String[] args) throws IOException {
        Main main = new Main();

        while (main.number != -1){
            main.sumOfNumber(readNumber());
        }

        System.out.println(main.sumOfNumber);
    }

    public static int readNumber () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());

        return number;
    }

    public void sumOfNumber(int number){
        this.number = number;
        this.sumOfNumber = this.sumOfNumber + number;
    }
}