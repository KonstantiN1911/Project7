import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Project3 {
    public static void main(String[] args) {
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("Строка 1");
        str1.add("Строка 2");
        str1.add("Строка 3");
        str1.add("Строка 7");
        str1.add("Строка 3");

        System.out.println(str1);

        LinkedHashSet<String> str2 = new LinkedHashSet<>();
        str2.addAll(str1);
        str1.clear();
        str1.addAll(str2);
        System.out.println(str1);

    }
}
