import Solution.RemoveDuplicates;
public class Main {

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[]arrays = new int[]{0,0,1,1,1,2,3,4,4,5};
        int[] result = solution.removeDuplicates(arrays);
        for(Object o: result){
            System.out.println(o);
        }

    }
}
