public class binarysearch {

    public int sortbinary(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == num) {
                System.out.println("At position " + mid);
                return mid;
            } else if (num > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        binarysearch find = new binarysearch();
        int result = 0;
        int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        result = find.sortbinary(arr, 11);
        System.out.println(result);

    }
}
