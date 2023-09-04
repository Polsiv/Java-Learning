import java.util.*;
    public class test {
        public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> counts = new HashMap<>();

        int[] numbers = {5, 3, 5, 2, 3, 2};
            
        int n = 6;
        int m = 3;
        int max = 0;
            
        for (int i = 0; i < n; i++) {

                
            int num = numbers[i];
            deque.add(num);   
            int count = counts.getOrDefault(num, 0);
            counts.put(num, ++count);
            //System.out.println(counts);
                
            if(i >= m-1){
                if(counts.size() > max){
                    //System.out.println("counts " + counts.size());
                    max = counts.size();
                }
                
               
                int removed = deque.remove();
                int removingnumber = counts.get(removed);
                removingnumber--;
                
                if(removingnumber == 0){
                    counts.remove(removed);
                } else {
                    counts.put(removed, removingnumber);
                }
                
                }
            }     
            System.out.println(max);                      
        }
    }