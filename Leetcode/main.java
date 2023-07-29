import com.sun.tools.javac.Main;

//
//class Solution {
//    public void reverseString(char[] s) {
//
//    }
//}
public class main {

        public void reverseString(char[] s) {
            System.out.println(s);
//            for (int i = s.length-1; i >= 0; i--) {
//                System.out.print(s[i]);
//            }
            int left = 0;
            int right = s.length -1;
            while(left < right){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
            System.out.println(s);
        }
    public static void main(String[] args) {
        System.out.println("kfod");
        char[] myChain = new char[] {'h','e','l','l','o'};
        main obj = new main();
        obj.reverseString(myChain);
    }
}
