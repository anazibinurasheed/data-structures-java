package repeatweakdsa2;

public class insertionsort {

    static int[] insort(int arr[]) {
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
            int subarray = unsortedIndex - 1;

            while (subarray >= 0) {
                if (arr[unsortedIndex] < arr[subarray]) {
                    int temp = arr[subarray];
                    arr[subarray] = arr[unsortedIndex];
                    arr[unsortedIndex] = temp;
                    subarray--;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 23, 56, 1, 223 };

        int res[] = insort(arr);
        for (int i : res) {
            System.out.println(i);

        }
    }

}
