public class Main {
    public static void main(String[] args) {

        int arr[] = {16,1,0,9,100};
        int n = arr.length;
        sort(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

    }
    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}