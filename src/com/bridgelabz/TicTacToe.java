package com.bridgelabz;
import java.util.Scanner;


public class TicTacToe {
    static char[] arr = new char[10];
    static char user ;
    static char computer;


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("WElcome to TicTacToe Program");

        uc1();
        System.out.println("Please enter your symbol , X - O");
        uc2();
        uc3();
        uc4();




    }
    public static void uc1(){

        arr[0] = ' ';
        for(int i=1; i<10; i++){
            arr[i] = ' ';

        }
    }
    public static  void uc2(){
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
    public static void uc3(){
        for (int i=1; i<4; i++){
            System.out.println(arr[i]+" | ");

        }
        System.out.println();
        for (int i=5; i<8; i++){
            System.out.println(arr[i]+" | ");

        }
        System.out.println();
        for (int i=8; i<10; i++){
            System.out.println(arr[i]+" | ");
        }
        System.out.println("  |  ");
    }
    public static  void uc4(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Choose the position (1-9");
        int pos = sc.nextInt();
        if(arr[pos] ==' '){
           arr[pos] = user;
       }else{
           System.out.println("Entered position is empty please try again");
           uc4();
      }
      uc3();
   }
}