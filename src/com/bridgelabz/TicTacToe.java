package com.bridgelabz;
import java.util.Scanner;


public class TicTacToe {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("WElcome to TicTacToe Program");
        uc1();
        System.out.println("Please enter your symbol , X - O");
        uc2();


    }
    static void uc1(){
        char[] arr = new char[10];
        arr[0] = ' ';
        for(int i=1; i<10; i++){
            arr[i] = ' ';

        }
    }
    static  void uc2(){
        Scanner sc = new Scanner(System.in);
        char user = sc.next().charAt(0);
        char computer;
        if (user == 'X'){
            System.out.println("User choose X");
            System.out.println("Computer have 0");
            computer = 'O';


        }else{
            System.out.println("User choose O");
            System.out.println("Computer have X");
            computer = 'X';

        }

    }



}
