/*
Operation in Arrays and Time Complexity
Retrieve with index  O(1) Constant time.
Retrieve without index O(n) linear Search.
Add an element to a full array   O(n) by creating a new array and copy over array to it.
Add an element to end of an array(has space) O(n);
Insert or update an element at a specific index. O(1)
Delete an element by setting to null   O(1)
Delete an element by shifting elements O(n)
 */


import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,-4,-11,1};
        System.out.println(linearSearch(list,4));
        System.out.println(linearSearch(list,-4));
        System.out.println(linearSearch(list,5));
        Arrays.sort(list);
        for (int l : list) {
            System.out.println(l);
        }
        System.out.print("Using binary Search "+binarySearch(list,2));


    }

    //linearSearch method compares the key value with each element in the array.
    //linear search is insufficient for large arrays.
    public static int linearSearch(int[] array , int key){
        for (int i = 0; i < array.length; i++) {
            if(key == array[i])
                return i;
        }
        return -1;
    }

    //binary Search method.
    public static int binarySearch(int[] array, int key){
        int low= 0;
        int high= array.length -1;
        while (high >= low){
            int mid = (high+ low) /2 ;
            if(key < array[mid]) high = mid-1;
            else if (key == array[mid]) return mid;
            else low = mid+1;


        }
        return -low-1;// now high < low , key not found

    }
}
