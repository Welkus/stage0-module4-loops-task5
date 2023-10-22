package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {


            for (int i = 1; i <= height / 2; i++) {
                for (int j = 1; j <= height; j++) {
                    if (j < i || j > height - i + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("8");
                    }
                }
                System.out.println();
            }

        int start = (height % 2 == 0) ? height / 2 : (height / 2) + 1;
        for (int i = start; i >= 1; i--) {
                for (int j = 1; j <= height; j++) {
                    if (j < height - i + 1 || j > i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("8");
                    }
                }
                System.out.println();
            }
        }
    }

