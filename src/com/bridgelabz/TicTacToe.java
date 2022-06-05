package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;



public class TicTacToe {
    static char[] arr = new char[10];
    static char user;
    static char computer;
    static int counter = 0;
    static int toss = 0;


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("WElcome to TicTacToe Program");

        uc1();
        System.out.println("Please enter your symbol , X - O");
        uc2();
        uc6();
        //uc3();
        while (counter < 10) {
            if (counter % 2 == 0) {
                uc4();

            } else {
                uc5();

            }
            counter++;

        }


    }

    public static void uc1() {

        arr[0] = ' ';
        for (int i = 1; i < 10; i++) {
            arr[i] = ' ';

        }
    }

    public static void uc2() {
        Scanner sc = new Scanner(System.in);
        char user = sc.next().charAt(0);
        char computer;
        if (user == 'X' || user == 'x') {
            System.out.println("User choose X");
            System.out.println("Computer have 0");
            computer = 'O';


        } else {
            System.out.println("User choose O");
            System.out.println("Computer have X");
            computer = 'X';

        }

    }

    public static void uc3() {
        System.out.println();

        System.out.println(arr[1] + " | " + arr[2] + " | " + arr[3]);
        System.out.println("----------");
        System.out.println(arr[4] + " | " + arr[5] + " | " + arr[6]);
        System.out.println("----------");
        System.out.println(arr[7] + " | " + arr[8] + " | " + arr[9]);
        System.out.println("----------");


    }



    public static  void uc4(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        if(counter < 9){
            System.out.println("please choose the position (1-9)");
            int pos = sc.nextInt();

            if(arr[pos] == ' ') {
                arr[pos] = user;
                //counter++;
            }else{
                System.out.println("Entered position is not empty please try again");
                uc4();
            }
        }else{
            System.out.println("No more free space");
        }
        uc3();

   }
   public static void uc5() {
            Random random = new Random();
            System.out.println();
            if (counter < 9){
                System.out.println("Computer's turn");

                //int pos = random.nextInt(9)+1;
                //if(arr[pos] == ' '){
                  //  arr[pos] = computer;
                    //counter++;


                //}else{
                  //  uc5();

                //}
            }else{
                System.out.println("no more free space");
            }
            uc3();

        }
        public static void uc6(){
          Random random = new Random();

          toss = random.nextInt(2);
          if(toss == 0){
              System.out.println();
              System.out.println("TOSS");
              System.out.println("user will play first");
              System.out.println();
              while(counter<10){
                  if (counter % 2 == 0){
                      uc4();

                  }else{
                      uc5();

                  }
                  counter++;
                  uc7();


              }

          }else {
              System.out.println();
              System.out.println("Computer will play first");
              System.out.println();
              while (counter < 10) {
                  if (counter % 2 == 1) {
                      uc4();

                  } else {
                      uc5();

                  }
                  counter++;
                  uc7();

              }


          }





        }
        public static  void uc7(){
            if ((counter-1) % 2 == 0){

                if(arr[1]==arr[2] && arr[1]==arr[3] && arr[1]==user){
                    System.out.println("User won");
                    System.exit(0);

                }else if (arr[4]==arr[5] && arr[4]==arr[6] && arr[4]==user){
                    System.out.println("User won");
                    System.exit(0);
                }else if (arr[7]==arr[8] && arr[9]==arr[7] && arr[7]==user) {
                    System.out.println("User won");
                    System.exit(0);
                }else if (arr[1]==arr[4] && arr[4]==arr[7] && arr[4]==user) {
                    System.out.println("User won");
                    System.exit(0);

                } else if (arr[2]==arr[5] && arr[2]==arr[8] && arr[2]==user) {
                    System.out.println("User won");
                    System.exit(0);
                } else if (arr[3]==arr[6] && arr[3]==arr[9] && arr[3]==user) {
                    System.out.println("User won");
                    System.exit(0);
                }  else if (arr[1]==arr[5] && arr[1]==arr[9] && arr[1]==user) {
                    System.out.println("User won");
                    System.exit(0);
                }else if (arr[3]==arr[5] && arr[3]==arr[7] && arr[3]==user) {
                    System.out.println("User won");
                    System.exit(0);
                }else{

                }


            }else{

                if(arr[1]==arr[2] && arr[1]==arr[3] && arr[1]==computer){
                    System.out.println("computer won ");
                    System.exit(0);
                } else if (arr[4]==arr[5] && arr[4]==arr[6] && arr[4]==computer) {
                    System.out.println("computer won ");
                    System.exit(0);
                }else if (arr[7]==arr[8] && arr[7]==arr[9] && arr[7]==computer) {
                    System.out.println("computer won ");
                    System.exit(0);
                }else if (arr[1]==arr[4] && arr[4]==arr[7] && arr[4]==computer) {
                    System.out.println("computer won ");
                    System.exit(0);
                }else if (arr[2]==arr[5] && arr[2]==arr[8] && arr[2]==computer) {
                    System.out.println("computer won ");
                    System.exit(0);
                }else if (arr[3]==arr[6] && arr[3]==arr[9] && arr[3]==computer) {
                    System.out.println("computer won ");
                    System.exit(0);
                }else if (arr[1]==arr[5] && arr[1]==arr[9] && arr[1]==computer) {
                    System.out.println("computer won ");
                    System.exit(0);
                }else if (arr[3]==arr[5] && arr[3]==arr[7] && arr[3]==computer) {
                    System.out.println("computer won ");
                    System.exit(0);
                }else{

                }
            }
        }
        public static void uc8(){
        Random random = new Random();

            if(arr[1]==arr[2] && arr[1]==computer && arr[3]==' '){
                arr[3] = computer;
            } else if (arr[2]==arr[3] && arr[2]==computer && arr[1]==' ') {
                arr[1] = computer;
            } else if (arr[1]==arr[3] && arr[1]==computer && arr[2]==' ') {
                arr[2] = computer;
            } else if (arr[4]==arr[5] && arr[4]==computer && arr[6]==' ') {
                arr[6] = computer;
            } else if (arr[5]==arr[6] && arr[5]==computer && arr[4]==' ') {
                arr[4] = computer;
            } else if (arr[4]==arr[6] && arr[4]==computer && arr[5]==' ') {
                arr[5] = computer;
            } else if (arr[7]==arr[8] && arr[8]==computer && arr[9]==' ') {
                arr[9] = computer;
            } else if (arr[8]==arr[9] && arr[8]==computer && arr[7]==' ') {
                arr[7] = computer;
            } else if (arr[9]==arr[7] && arr[7]==computer && arr[8]==' ') {
                arr[8] = computer;
            } else if (arr[1]==arr[4] && arr[4]==computer && arr[7]==' ') {
                arr[7] = computer;
            } else if (arr[2]==arr[5] && arr[5]==computer && arr[8]==' ') {
                arr[8] = computer;
            } else if (arr[3]==arr[6] && arr[6]==computer && arr[9]==' ') {
                arr[9] = computer;
            } else if (arr[1]==arr[7] && arr[7]==computer && arr[4]==' ') {
                arr[4] = computer;
            } else if (arr[2]==arr[8] && arr[8]==computer && arr[5]==' ') {
                arr[5] = computer;
            } else if (arr[9]==arr[3] && arr[3]==computer && arr[6]==' ') {
                arr[6] = computer;
            } else if (arr[4]==arr[7] && arr[7]==computer && arr[1]==' ') {
                arr[1] = computer;
            } else if (arr[5]==arr[8] && arr[8]==computer && arr[2]==' ') {
                arr[2] = computer;
            } else if (arr[6]==arr[9] && arr[9]==computer && arr[3]==' ') {
                arr[3] = computer;
            } else if (arr[1]==arr[5] && arr[5]==computer && arr[9]==' ') {
                arr[9] = computer;
            } else if (arr[1]==arr[9] && arr[9]==computer && arr[5]==' ') {
                arr[5] = computer;
            } else if (arr[9]==arr[5] && arr[5]==computer && arr[1]==' ') {
                arr[1] = computer;
            } else if (arr[7]==arr[5] && arr[5]==computer && arr[3]==' ') {
                arr[3] = computer;
            } else if (arr[3]==arr[5] && arr[5]==computer && arr[7]==' ') {
                arr[7] = computer;
            } else if (arr[3]==arr[7] && arr[7]==computer && arr[5]==' ') {
                arr[5] = computer;
            }else{
                int pos = random.nextInt(9)+1;
                if(arr[pos] == ' ') {
                    arr[pos] = computer;
                }else{
                    uc5();
                }
            }


        }
    public static void uc9(){

        if(arr[1]==arr[2] && arr[1]==user && arr[3]==' '){
            arr[3] = computer;
        } else if (arr[2]==arr[3] && arr[2]==user && arr[1]==' ') {
            arr[1] = computer;
        } else if (arr[1]==arr[3] && arr[1]==user && arr[2]==' ') {
            arr[2] = computer;
        } else if (arr[4]==arr[5] && arr[4]==user && arr[6]==' ') {
            arr[6] = computer;
        } else if (arr[5]==arr[6] && arr[5]==user && arr[4]==' ') {
            arr[4] = computer;
        } else if (arr[4]==arr[6] && arr[4]==user && arr[5]==' ') {
            arr[5] = computer;
        } else if (arr[7]==arr[8] && arr[8]==user && arr[9]==' ') {
            arr[9] = computer;
        } else if (arr[8]==arr[9] && arr[8]==user && arr[7]==' ') {
            arr[7] = computer;
        } else if (arr[9]==arr[7] && arr[7]==user && arr[8]==' ') {
            arr[8] = computer;
        } else if (arr[1]==arr[4] && arr[4]==user && arr[7]==' ') {
            arr[7] = computer;
        } else if (arr[2]==arr[5] && arr[5]==user && arr[8]==' ') {
            arr[8] = computer;
        } else if (arr[3]==arr[6] && arr[6]==user && arr[9]==' ') {
            arr[9] = computer;
        } else if (arr[1]==arr[7] && arr[7]==user && arr[4]==' ') {
            arr[4] = computer;
        } else if (arr[2]==arr[8] && arr[8]==user && arr[5]==' ') {
            arr[5] = computer;
        } else if (arr[9]==arr[3] && arr[3]==user && arr[6]==' ') {
            arr[6] = computer;
        } else if (arr[4]==arr[7] && arr[7]==user && arr[1]==' ') {
            arr[1] = computer;
        } else if (arr[5]==arr[8] && arr[8]==user && arr[2]==' ') {
            arr[2] = computer;
        } else if (arr[6]==arr[9] && arr[9]==user && arr[3]==' ') {
            arr[3] = computer;
        } else if (arr[1]==arr[5] && arr[5]==user && arr[9]==' ') {
            arr[9] = computer;
        } else if (arr[1]==arr[9] && arr[9]==user && arr[5]==' ') {
            arr[5] = computer;
        } else if (arr[9]==arr[5] && arr[5]==user && arr[1]==' ') {
            arr[1] = computer;
        } else if (arr[7]==arr[5] && arr[5]==user && arr[3]==' ') {
            arr[3] = computer;
        } else if (arr[3]==arr[5] && arr[5]==user && arr[7]==' ') {
            arr[7] = computer;
        } else if (arr[3]==arr[7] && arr[7]==user && arr[5]==' ') {
            arr[5] = computer;
        }else{

        }
    }
}

