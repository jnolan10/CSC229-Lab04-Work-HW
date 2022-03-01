/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc229_lab04_work;



public class NewClass {
  private static int sum;
  
    public static void main(String[] args) {
       
        //testing countdown method
        countDown(8);
        
        //GCD method test
        System.out.println("Gcd is: " + gcd(125,25));
        
        //static reference to printHello method
        printHello(2);
        
        //test case with the sumNum method correct answer should be 2,860,858 if 7000 is included. 
        System.out.println("The sum of all nums divisible by 7 are: " + sumNum(3000,7000));
        
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        
        //binary search for simple array
        System.out.println("index of value is: " + binarySearch(arr, 0, arr.length, 5));
        
    }
    
     //the big O value of this method is Big O = (n) because the highest order of time complexity in any line is n.
    static void countDown(int num) {

        if (num == 0) // test
        {
            System.out.println("Blastoff!");
        } else {

            if(num % 2 == 0)
            System.out.println(num);

            countDown(num - 1); // recursive call

        }

    }
    
    //the output of this code is an integer that represents the greatest common divisor between integers x and y
    static int gcd(int x, int y) {

        if(x != y)
        {
            if(x > y)
            return gcd((x-=y),y);
            else
            return gcd(x,(y-=x));
        } return x;

    }
    
    //the big O value of this method is Big O = (n) because the highest order of time complexity in any line is n.
    static int fib(int n) {

        if (n <= 0) // base case
        {
            return 0;
        } else if (n == 1) // base case
        {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    static int sumNum(int x, int y){
        
        
        if(x >= y)
        {
            return sum += x;
        }else{
            if(x % 7 == 0)
                sum += x;
            return sumNum(x+1,y);
                
        }
        
    }
    
    static void printHello(int n){
        if(n == 0)
        {
            System.out.println("Complete.");
        }else{
            System.out.println("Hello World!");
            printHello(n-1);
        }
        
    }
        
        //searching algorithm for binary search using a recursive means
        static int binarySearch(int[] arr, int start, int end, int search){
   
            int middle = (start + end) / 2;
            
            //checks if middle value is greater than the value searched for, if so check the bottom half of array
            if (arr[middle] > search)
                return binarySearch(arr, start, middle - 1, search);
            
            //checks if middle value is less than the value searched for, if so check the top half of array
            if(arr[middle] < search)
            return binarySearch(arr, middle + 1, end, search);  
            
            //if searched for value is equal to the middle value, return the index of searched for value in sorted array
            if (arr[middle] == search)
                return middle;
            
            //if nothing is found
            return -1;
        }
        
}
