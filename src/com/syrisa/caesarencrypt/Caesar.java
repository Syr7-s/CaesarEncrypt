package com.syrisa.caesarencrypt;

import java.util.Scanner;

public interface Caesar {
    default String message(){
        return new Scanner(System.in).nextLine();
    }
}
