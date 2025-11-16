package Arrays_Question;

public class ReverseArray {

    public static void main(String [] args){




        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        //          {7,6,5,4,3,2,1}

        int i = 0; // 0 , 1 , 2 ,3
        int n = arr.length-1 ; // 6 ,5 ,4 ,3

        while (i < n) { // 1) 0<6 , 2)1<5  3) 2<4 4) 3 < 3
            int temp = arr[n]; //temp = 7
            arr[n] = arr[i]; // arr[n] = 1 = arr[n]
            arr[i] = temp; //
            i++;
            n--;
        }

  //       0,1,2,3,4,5,6
      //  {7,6,5,4,3,2,1}
        n = arr.length ;
        System.out.println();
        System.out.println("=========   Its my Reverse aarry ==============");
        // n = 4
        for(int j = 0 ; j < n; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
