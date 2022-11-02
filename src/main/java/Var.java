import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Var {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello1");
        list.add("Hello2");
        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(list);
        list1.addAll(1, list);
        System.out.println(list1);
        List<String> list2 = (ArrayList<String>) list1.clone();
        list1.clear();
        System.out.println("clear " + list1);

        System.out.println("clone " + list2);

        System.out.println(palindromStr("Hello"));
        System.out.println(palindromStr("KabaK"));

    }

    private static boolean palindromStr(String str) {
        char ch1, ch2;
        for (int i = 0; i < str.length() / 2; i++) {
            ch1 = str.charAt(i);
            ch2 = str.charAt(str.length() - i - 1);
            System.out.println(ch1 + " = " + ch2);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

}
