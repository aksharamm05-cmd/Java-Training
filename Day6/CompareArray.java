public class CompareArray {
    
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};

        if (arr1.length != arr2.length) {
            System.out.println("Arrays are not equal.");
            return;
        }

        boolean equal = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                equal = false;
                break;
            }
        }

        if (equal)
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
    }
}

