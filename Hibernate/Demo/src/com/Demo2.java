package com;
import java.util.*;
import java.io.*;

class Demo2 {

    public static void main(String[] args) {
        String line = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter File name : ");
            String fname = br.readLine();

            File f = new File(fname);
            if (f.exists()) {
                BufferedReader fr = new BufferedReader(new FileReader(fname));
                while ((line = fr.readLine()) != null) {
                    System.out.println(line);
                }
                fr.close();
            } else {
                System.out.println("Sorry! File does not exist.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
