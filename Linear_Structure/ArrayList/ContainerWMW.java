package Linear_Structure.ArrayList;

import java.util.ArrayList;

public class ContainerWMW {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        // bruteforce
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> heights = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println(storeWater(heights));
    }
}
