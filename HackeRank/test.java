import java.util.*;
    public class test {
        public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> counts = new HashMap<>();
            
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
            
        for (int i = 0; i < n; i++) {
                
            int num = in.nextInt();
            deque.add(num);   
            int count = counts.getOrDefault(num, 0);
            counts.put(num, ++count);
            System.out.println(counts);
            
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