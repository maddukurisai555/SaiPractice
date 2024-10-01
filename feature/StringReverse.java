package feature;

public class StringReverse {

    public static void main(String[] args) {

        int[] num = {6, 5, 4, 3, 2};

        int[] revArray = {0, 0, 0, 0, 0};
        int j = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            revArray[i] = num[j];
            j++;
        }
        for (int i = 0 ; i < revArray.length; i++) {
            System.out.println(revArray[i]);
        }
    }

}
