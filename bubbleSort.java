public class bubblesort {
    public static void main(String[] args) {
        int[] array = { 99, 32, 2, 45, 88, 99 };

        for (int lastindex = array.length - 1; lastindex > 0; lastindex--) {

            for (int i = 0; i < lastindex; i++) {

                if (array[i] > array[i + 1]) {

                    swap(array, i, i + 1);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
