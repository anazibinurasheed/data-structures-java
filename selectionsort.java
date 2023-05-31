
/**
 * selectionsort
 */
public class selectionsort {

    static int [] selectsort(int arr[]){
        for(int i = 0 ; i< arr.length;i++){

    int min = i ; 
    
    for (int j = i+1; j< arr.length;j++){
        if ( arr[j]>arr[min]){
            min = j;
        }
    }
    if(i!=min){
        int temp = arr[i];
        arr[i] = arr[min ];
        arr[min] = temp;
    }
        }
        return arr;
    }
    public static void main(String[] args) {

        int array[]={67,33,22,11,44,77};
     int res []=  selectsort(array);
for (int i = 0 ; i<res.length ; i++){
    System.out.print("\t"+res[i]);
}
    }
}