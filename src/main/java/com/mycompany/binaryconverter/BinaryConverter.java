package com.mycompany.binaryconverter;

public class BinaryConverter {

    public static void main(String[] args) {
        
        int number = 20;
        
        String binary = "";
        
        while(number > 0){
         
            binary += (number % 2);
            number /= 2;
            
            
        }
        System.out.println(binary);
                
        
    }
}
