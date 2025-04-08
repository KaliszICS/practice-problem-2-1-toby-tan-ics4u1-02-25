public class PracticeProblem {

    public static void main(String args[]) {
    }

    public static int find(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }


    public static int findLast(String[] array, String str) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(str)) { 
                return i;
            }
        }
        return -1;  
    }
	public static int findSecond(char[] arr, char c) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == c) {
                count++;
                if (count == 2) {
                    return j;
                }
            }
        }
        return -1;
    }
}
