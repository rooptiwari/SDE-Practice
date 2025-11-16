package INterviewQuestion;


    public class DuplicateElement {
        public static int findUniqueBinarySearch(int[] arr) {
            int left = 0, right = arr.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                // Check if mid is even
                if (mid % 2 == 0) {
                    if (arr[mid] == arr[mid + 1]) {  // Pair is on the right
                        left = mid + 2;
                    } else {  // Unique element is in the left part
                        right = mid;
                    }
                } else {
                    if (arr[mid] == arr[mid - 1]) {  // Pair is on the left
                        left = mid + 1;
                    } else {  // Unique element is in the left part
                        right = mid;
                    }
                }
            }
            return arr[left];
        }

        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 3, 3, 5, 5 ,5};  // Unique element is 4

            System.out.println(findUniqueBinarySearch(arr));
        }
    }

