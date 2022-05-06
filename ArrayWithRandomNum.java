import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithRandomNum {
    public static void main(String[] args) {
        //initialize the array
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a integer number for size of the array: ");
         int n = scan.nextInt();
        double[] randArr = new double[n];
        int[]  randIntArr = new int[n];
        for (int i = 0; i < randArr.length; i++) {
            //Generating random numbers

            randArr[i] = Math.random() * 10;
        }
      //Printing Array using forEach
        for (double ele : randArr) {
            System.out.println(ele);
        }

        for (int i = 0; i < randIntArr.length; i++) {
            //Generating random numbers
            //(int) converts double to int
            //Math.floor(Math.random()*(max-min+1)+min)
            randIntArr[i]=(int) Math.floor(Math.random()*51)+50;
        }

        //print array using
        for (int ele : randIntArr) {
            System.out.println(ele);
        }

        //Printing Array in reverse order
        System.out.println("Printing Array in reverse order");
        for (int i = randIntArr.length - 1; i >= 0; i--) {
            System.out.println(randIntArr[i]);
        }

        //Printing array in one line

        System.out.println("Printing array in one line "+ Arrays.toString(randIntArr));

        //Print array using Stream();

        System.out.println("print array using stream ");
        Arrays.stream(randIntArr).forEach(System.out::print);


       //finding the maximum value in array
         int max =randIntArr[0];
        for (int i = 0; i < randIntArr.length; i++) {
            if(randIntArr[i]> max)
                max = randIntArr[i];
        }
        System.out.println("\n the largest element in the array is: "+max);

        //Finding the index of the largest element
         max =randIntArr[0];
        int indexOfMax =0;

        for (int i = 0; i < randIntArr.length; i++) {
         if(randIntArr[i]>max) {
             max = randIntArr[i];
             indexOfMax = i;
         }
        }
        System.out.println("\n the largest element in the array is: "+max+" and the index of max is: "+indexOfMax);

     //Find the two smallest element in the Array

        int smallest = randIntArr[0];
        int secondSmallest= randIntArr[1];
        for (int i = 0; i < randIntArr.length; i++) {
            if(randIntArr[i]<smallest) {
                secondSmallest = smallest;
                smallest=randIntArr[i];

            } else if (randIntArr[i]<secondSmallest){
                secondSmallest=randIntArr[i];
            }
        }
        System.out.println("The 1st smallest number is : "+smallest +" and 2nd smallest element is: "+ secondSmallest);

        //Copying array
        //1- using for loop

         int[] sourceArr ={1,2,3,4,5,6,7,8,9,10};
         int[] targetArr =new int[sourceArr.length];

        for (int i = 0; i < sourceArr.length; i++) {
            targetArr[i]=sourceArr[i];
        }

        for (int ele : targetArr) {
            System.out.println(ele);
        }
        //2- using for arraycopy method

        int[] targetArrayCopy = new int[sourceArr.length];

        System.arraycopy(sourceArr,0,targetArrayCopy,0,sourceArr.length);

        for (int ele : targetArrayCopy) {
            System.out.println(ele);
        }

        //Passing array to methods
        System.out.println("passing array as argument method: ");
        printArray(sourceArr);

        //return an array in a method





    }
    public static void printArray(int[] array) {
        for (int ele : array) {
            System.out.println(ele);
        }
    }











}
