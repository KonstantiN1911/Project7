import java.util.HashMap;
import java.util.Map;

public class Project1 {
        public static void main(String[] args) {
                Project1 project1 = new Project1();
                project1.map();
        }


        public HashMap<Integer, String> map(){
                HashMap<Integer, String> key = new HashMap<>();
                key.put(19, "Алексей");
                key.put(28, "Ваня");
                key.put(30, "Валера");

                HashMap<String, Integer> key2 = new HashMap<>();
                for (Map.Entry<Integer, String> keys : key.entrySet()) {
                        key2.put(keys.getValue(), keys.getKey());
                }
                System.out.println(key);
                System.out.println(key2);
                return key;
        }
}