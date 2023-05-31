public class secondsmallest_element_array { 

public static void smallest(int a[]){
int temp=0;
    for(int i = 0;i<a.length-1;i++){
        for(int j=i+1; j<a.length;j++){
            if( a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
               
            }
        }
       
    }
    System.out.println(a[a.length-1]);
}
    
public static void main(String[] args) {
    int []array = {22,11,10,5,66,88,93};
    smallest(array);

}
}
