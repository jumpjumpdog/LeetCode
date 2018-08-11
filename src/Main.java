
import java.util.*;


public class Main{
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[]apples = new int[n];
//        int temp =0;
//        int[]sum = new int[n];
//        for(int i=0;i<n;i++)
//        {
//            apples[i] = sc.nextInt();
//            temp = temp + apples[i];
//            sum[i] = temp;
//        }
//        int m = sc.nextInt();
//        int[] query = new int[m];
//        for(int i=0;i<m;i++)
//            query[i] = sc.nextInt();
//
//
//        for(int i=0;i<m;i++){
//
//            int mid= 0;
//            int left = 0;
//            int right = n - 1;
//
//
//            while(left<right){
//                 mid= left + (right - left) / 2;
//                if(sum[mid] >= query[i]) right = mid;//因为是寻找下界，不考虑右边还有没有元素
//                else if(sum[mid] < query[i]) left = mid+1;
//            }
//            query[i] =left+1;
//
//        }
//
//        Arrays.stream(query).forEach(p->System.out.println(p));

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;
        int[]scores  = new int[n];
        int[]status = new int[n];


        for(int i=0;i<n;i++)
            scores[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            status[i] = sc.nextInt();

        for(int i=0;i<n-k+1;i++) {
            int temp = 0;
            int p = i;
            while(p>=i+k-1){
                temp += scores[p];
                p++;
            }

//            for (int p = 0; p < n; p++)
//            {
//                if((p<i||p>i+k-1)&&status[p]==1)
//                    temp += scores[p];
//                else if(p>=i&&p<=i+k-1)
//
//                else
//                    temp += 0;
//            }
            max = max>temp?max:temp;
        }
        System.out.println(max);










//        CharMatrix charMatrix = new CharMatrix();
//        charMatrix.process();
//        wangyigame.Main main = new wangyigame.Main();
//        main.process();
//        Scanner sc = new Scanner(System.in);
//        String[]line = sc.nextLine().split(" ");
//        Arrays.stream(line).forEach(p -> {
//            System.out.println(p);
//            System.out.println("===========");
//        });
//        CountAndSay countAndSay = new CountAndSay();
//        System.out.println(countAndSay.countAndSay(10));
//            Set<Integer>set =new HashSet<>();
//            set.add(1);
//            set.add(2);
//            set.add(-1);
//            for(Integer key:set){
//                System.out.println(key);
//            }
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine().toString();

//        System.out.println(strStr.strStr("hello","ll"));


//            Scanner sc = new Scanner(System.in);
//            String a = sc.nextLine().toString();
//            String []nums = a.split(" ");
//            int cars = 0;
//            int[] weights = new int[nums.length];
//
//
//            HashMap<Integer,Integer>map = new HashMap<>();
//            for(int i=0;i<nums.length;i++){
//                int temp = Integer.parseInt(nums[i]);
//                if(map.keySet().contains(300-temp))
//                {
//                    cars++;
//                    int value = map.get(300-temp);
//                    value--;
//                    if(value==0)
//                        map.remove(300-temp);
//                    else
//                        map.put(300-temp,value);
//                }
//                map.put(temp,0);
//            }

            


    }

}