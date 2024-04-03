import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Project2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            nums1.add(i);
        }
        Project2 obj = new Project2();

        int numberOfElements = 1000;

        System.out.println(obj.getRandomElement(nums1, numberOfElements));

    }

    public List<Integer> getRandomElement(List<Integer> list, int totalItems) {
        Random rand = new Random();

        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {

            int randomIndex = rand.nextInt(list.size());

            newList.add(list.get(randomIndex));

            //list.remove(randomIndex);
        }
        return newList;
    }
}
