import java.util.*;

public class Optimal {
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

        for (int i = 0; i < n; i++) {
            int page = pages[i];

            if (!frame.contains(page)) {
                pageFaults++;

                if (frame.size() < frames) {
                    frame.add(page);
                } else {
                    int indexToReplace = -1;
                    int farthest = i + 1;

                    for (int j = 0; j < frame.size(); j++) {
                        int k;

                        for (k = i + 1; k < n; k++) {
                            if (frame.get(j) == pages[k]) {
                                break;
                            }
                        }

                        if (k == n) {
                            indexToReplace = j;
                            break;
                        }

                        if (k > farthest) {
                            farthest = k;
                            indexToReplace = j;
                        }
                    }

                    frame.set(indexToReplace, page);
                }
            }

            System.out.println("Frames: " + frame);
        }

        System.out.println("Total Page Faults = " + pageFaults);
    }
}