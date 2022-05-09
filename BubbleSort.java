public class BubbleSort {

    public static void main(String[] args) {
     int[] list = {1,52,-8,5,4,11,-3,5,2,5,6,45};

     //Bubble algorithm
        for(int indexOfLastUnsorted = list.length-1; indexOfLastUnsorted>0; indexOfLastUnsorted-- ){
            for (int i = 0; i < indexOfLastUnsorted; i++) {
                if(list[i] > list[i+1]){
                    swap(list,i,i+1);
                }
            }
        }
        for (int ele : list) {
            System.out.println(ele);
        }
    }

    public  static void swap(int[] array, int i, int j){
        if(i==j) return;

        int temp = array[i];
         array[i] = array[j] ;
         array[j]= temp;
    }
}
