import java.util.ArrayList;
import java.util.HashSet;

public class Project3 {
    public static void main(String[] args) {
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("������ 1");
        str1.add("������ 2");
        str1.add("������ 3");
        str1.add("������ 7");
        str1.add("������ 3");

        System.out.println(str1);

        HashSet<String> str2 = new HashSet<>();
        str2.addAll(str1);
        str1.clear();
        str1.addAll(str2);
        System.out.println(str1);

    }
}
