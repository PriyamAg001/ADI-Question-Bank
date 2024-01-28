package ADI_ETE;

import java.util.Scanner;

public class IsomorphicString {
    public static boolean isIsomorohic(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i=0; i<str1.length(); i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2. charAt(i);

            if(map1[ch1] != map2[ch2]){
                return false;
            }

            map1[ch1] = i+1;
            map2[ch2] = i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(isIsomorohic(str1, str2) ? "YES" : "NO");
    }
}
