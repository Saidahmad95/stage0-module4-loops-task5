package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = cathetusLength; i >= 1; i--) {
            for (int j = i; j <= cathetusLength; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
