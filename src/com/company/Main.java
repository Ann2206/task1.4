package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Введите день" );
        int day = sc.nextInt ();
        System.out.println ( "Введите месяц" );
        int month = sc.nextInt ();
        System.out.println ( "Введите год" );
        int year = sc.nextInt ();

        if ( day > 0 ) {

                    if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
                        if ( day <= 30 ) {
                            System.out.println ( "Дата существует" );
                        }else {
                            System.out.println ( "Даты не существует" );
                        }
                    }

                    if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
                        if ( day <= 31 ) {
                            System.out.println ( "Дата существует" );
                        }else {
                            System.out.println ( "Даты не существует" );
                        }
                    }


                    if ( year % 400 == 0 ) {
                        /*System.out.println ( "Год високосный" );*/
                        year = 1;
                    }else if ( year % 100 == 0 ) {
                      /*  System.out.println ( "Год не високосный" );*/
                        year = 0;
                    }else if ( year % 4 != 0 ) {
                       /* System.out.println ( "Год не високосный" );*/
                        year = 0;
                    }else {
                      /*  System.out.println ( "Год високосный" );*/
                        year = 1;
                    }


                    if ( year == 1 ) {
                        if ( month == 2 ) {
                            if ( day <= 29 ) {
                                System.out.println ( "Дата существует" );
                            }else {
                                System.out.println ( "Даты не существует" );
                            }
                        }
                    }

                    if ( year == 0 ) {
                        if ( month == 2 ) {
                            if ( day <= 28 ) {
                                System.out.println ( "Дата существует" );
                            }else {
                                System.out.println ( "Даты не существует" );
                            }
                        }
                    }
                }else {
                    System.out.println ( "Такаго быть не может" );

            }
        }
    }
