import java.util.Arrays;
import java.util.HashSet;

public class AllInOne {
    public static void main(String[] args) {
        // swapping numbers=======================================
        int a = 10;
        int b = 20;

        a = a + b; // a = 30
        b = a - b; // b = 10
        a = a - b;
        System.out.println("a=" + a + " b=" + b);


        // find factorial==================================
        int num = 5;
        int f = 1;
        for (int i = num; i >= 1; i--) {
            f = f * i;
        }
        System.out.println(f);

        // find duplicate=============================
        int[] arr = {2, 5, 8, 3, 1, 4, 5, 6, 3, 7, 7};
        HashSet<Integer> demo = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (i != j) {
                        demo.add(arr[i]);
                    }
                }
            }
        }
        System.out.println(demo);


        // largest element in Array======================================
        int[] array = {5, 8, 7, 9, 6, 4, 3, 2};
        Arrays.sort(array);
        int position = 2;
        System.out.println("biggest num on position " + position + " is :" + array[array.length - position]);

        //count the total number of characters in a String===================
        String s1 = "sachin";
        System.out.println("chars in string :" + s1.length());


        // anagram String==================================================
        String str1 = "Sachin";
        String str2 = "nihcas";
        boolean flag = true;
        String stru1 = str1.toUpperCase();
        String stru2 = str2.toUpperCase();
        char[] demo1 = stru1.toCharArray();
        Arrays.sort(demo1);
        char[] demo2 = stru2.toCharArray();
        Arrays.sort(demo2);
        if (demo2.length != demo1.length) {
            flag = false;
        }
        for (int i = 0; i < stru1.length(); i++) {
            if (demo1[i] != demo2[i]) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("yes! the string is anagram");
        } else {
            System.out.println("no! string is no anagram");
        }

        // reverse a string===========================================================
        String string = "Sach2@in";
        String final1 = "";
        String final2 = "";
        char[] demoChar = string.toCharArray();
        for (int i = demoChar.length - 1; i >= 0; i--) {
            final1 = final1 + demoChar[i];
        }
        System.out.println(final1);
        for (int length = string.length() - 1; length >= 0; length--) {
            final2 = final2 + string.charAt(length);
        }
        System.out.println(final2);


        //longest and shortest word in String=============================================

        String name = "Sachin is a intelligen boy and he is really hardworking";

        String[] strArray = name.split(" ");
        String biggest = strArray[0];
        String smallest = strArray[0];
        for (int i = 0; i < strArray.length; i++) {
            if (biggest.length() < strArray[i].length()) {
                biggest = strArray[i];

            }
            if (smallest.length() > strArray[i].length()) {
                smallest = strArray[i];
            }
        }
        System.out.println(biggest);
        System.out.println(smallest);

        //todo===============================================================================
    }
}

