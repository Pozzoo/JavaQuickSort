public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 4, 2 ,3, 8, 6, 2, 1, 7, 8, 9, 3};

        quickSort(array, 0, array.length - 1);
        print(array);
    }

    public static int partition(int[] array, int start, int end){
        int i = start - 1, aux;
        int pivot = array[end];

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot){
                i++;

                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
        aux = array[i+1];
        array[i+1] = array[end];
        array[end] = aux;

        return i + 1;
    }
    public static void quickSort(int[] array, int start, int end){
        if (start < end) {
            int pivot = partition(array, start, end);

            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static void print(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]" + "\n");
    }
}