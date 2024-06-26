
class PairSum {

    public static int pairSum(int arr[], int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 4, 5, 6};
        System.out.println(pairSum(arr, 5));
    }

}
