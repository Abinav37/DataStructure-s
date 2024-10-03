import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] edges = new int[n];
        
        for (int i = 0; i < n; i++) {
            edges[i] = sc.nextInt();
        }
        
        int cell1 = sc.nextInt();
        int cell2 = sc.nextInt();
        
        int result = find(edges, cell1, cell2);
        
        System.out.println(result);
    }

    public static int find(int[] edges, int cell1, int cell2) {
        Set<Integer> visited1 = new HashSet<>();
        Set<Integer> visited2 = new HashSet<>();

        int temp = cell1;
        while (temp != -1 && !visited1.contains(temp)) {
            visited1.add(temp);
            temp = edges[temp];
        }

        temp = cell2;
        while (temp != -1 && !visited2.contains(temp)) {
            visited2.add(temp);
            if (visited1.contains(temp)) {
                return temp;
            }
            temp = edges[temp];
        }

        return -1;
    }
}

