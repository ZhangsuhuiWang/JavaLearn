package chap12;

class NeedCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ConstructionException extends Exception {

}

class NeedCleanup2 extends NeedCleanup{
    public NeedCleanup2() throws ConstructionException {

    }
}

public class CleanupIdiom {
    public static void main(String[] args) {
        NeedCleanup nc1 = new NeedCleanup();
        try {

        } finally {
            nc1.dispose();
        }

        NeedCleanup nc2 = new NeedCleanup();
        NeedCleanup nc3 = new NeedCleanup();
        try {

        } finally {
            nc2.dispose();
            nc3.dispose();
        }

        try {
            NeedCleanup2 nc4 = new NeedCleanup2();
            try {
                NeedCleanup2 nc5 = new NeedCleanup2();
                try {

                }finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) {
                System.out.println(e);
            }finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) {
            System.out.println(e);
        }
    }
}
