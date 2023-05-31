
public class mergesort {
public static void main(String[] args) {
    int arr[]= {12,23,65,45,4,5,10,2};
    mergeSort(arr, 0, arr.length-1);
    for(int i = 0 ; i<arr.length;i++)
        System.out.println(arr[i]);
    
}

   static void mergeSort(int arr[], int lb, int ub){

        if (lb<ub){
            int mid = (lb + ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1,ub);
            merge(arr, lb, mid, ub);

        }
    }
    static void merge(int arr[], int lb,int mid, int ub){
        int i = lb;
        int j = mid+1;
        int k = lb;
        int arr2[] =new int[lb-ub+1];
       while (i<=mid&&j<=ub){
        if (arr[i]<=arr[j]) {
            arr2[k++] = arr[i++];
            
        } else {
            arr2[k++]=arr[j++];
            
        }
        
       }
       while (i<=mid){
        arr2[k++]=arr[i++];
       }
       while (j<=ub){
        arr2[k++]=arr[j++];
       }
       for(int m = 0 ; m<arr2.length;m++ ){
        arr[m]=arr2[m];
       }
    }
    
}