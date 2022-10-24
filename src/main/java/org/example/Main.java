package org.example;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] strArrray = {"First", "SecOnD", "tHREE","First","tHREE","THREE"};

        if(strArrray.length > 10){
            System.out.println("Error: supera la cantidad de elementos del array");
        }else {
            Predicate<String> p = Pattern.compile("[^a-zA-Z\\s]").asPredicate();
            boolean noValido = Arrays.stream(strArrray).anyMatch(p);
            if (noValido) {
                System.out.println("Error: Contiene caracteres no permitidos");
            } else {
                System.out.println(Arrays.stream(strArrray).collect(Collectors.joining(" ")).toLowerCase());
            }
        }
    }
}
