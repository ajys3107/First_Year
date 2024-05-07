 class linear {
    public static int linearSearch(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 2, 89, 90};
        int size = arr.length;
        int element = 4;

        int searchIndex = linearSearch(arr, size, element);
        if (searchIndex != -1) {
            System.out.println("The element " + element + " was found at index " + searchIndex);
        } else {
            System.out.println("The element " + element + " was not found in the array.");
        }
    }
}

