package com.dio.app;

import java.util.Scanner;

import com.dio.exception.ParametrosInvalidosException;

public class Contador 
{
    public static void main(String[] args) 
    {
        Scanner terminal  = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");  
        int firstParameter = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int secondParameter = terminal.nextInt();
        terminal.close();

        try 
        {
           int count = calculate(firstParameter, secondParameter);
           counter(count);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
           
    private static int calculate(int firstParameter, int secondParameter) 
    {
        if(firstParameter > secondParameter) 
        {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        return secondParameter - firstParameter;
    }

    private static void counter(int count) 
    {
      for(int counter = 1; counter <= count; counter++) 
      {
          System.out.println("Imprimindo o número " + counter);
      }
    } 
}
