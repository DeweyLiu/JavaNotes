package stringreverse;

/**
 * 用递归实现字符串倒转
 *
 * @author Dewey
 * @version 1.0.0
 * @date 2020/5/20 15:57
 */

public class StringReverse {

    public static String reverse(String originStr) {
        if (originStr == null || originStr.length() == 1) {
            return originStr;
        }
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
