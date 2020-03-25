package ch09.filters;

public class Waveform {
    private static long count ;
    private final long id = count++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
 