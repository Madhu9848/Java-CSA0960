public class OutputProgram {
    public static void main(String[] args) {
        int num[] = {7, 7, 6, 6, 5, 5, 4, 4};
        for (int i = 0; i < 8; i = i + 2) {
            System.out.print(num[i]);
        }
        // Output: 7654
    }
}
