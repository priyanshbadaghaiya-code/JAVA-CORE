import java.util.*;

public class LRU {
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

        ArrayList<Integer> frame = new ArrayList<>();
        int pageFaults = 0;

        for (int page : pages) {

            if (frame.contains(page)) {
                frame.remove(Integer.valueOf(page));
                frame.add(page);
            } else {
                pageFaults++;

                if (frame.size() == frames) {
                    frame.remove(0);
                }

                frame.add(page);
            }

            System.out.println("Frames: " + frame);
        }

        System.out.println("Total Page Faults = " + pageFaults);
    }
}