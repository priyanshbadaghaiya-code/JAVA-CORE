import java.util.*;

public class FIFO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of frames: ");
        int frames = sc.nextInt();

        System.out.print("Enter number of pages: ");
        int n = sc.nextInt();

        int[] pages = new int[n];
        System.out.println("Enter page reference string:");

        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
        }

        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        int pageFaults = 0;

        for (int page : pages) {

            if (!set.contains(page)) {
                pageFaults++;

                if (set.size() == frames) {
                    int removed = queue.poll();
                    set.remove(removed);
                }

                queue.add(page);
                set.add(page);
            }

            System.out.print("Frames: ");
            for (int p : queue) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

        System.out.println("Total Page Faults = " + pageFaults);
        sc.close();
    }
}
