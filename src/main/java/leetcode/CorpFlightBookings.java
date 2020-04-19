package leetcode;

import java.util.*;

public class CorpFlightBookings {
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for(int i = 0 ; i < bookings.length; i++) {
            booking(ans, bookings[i][0], bookings[i][1], bookings[i][2]);
        }
        return ans;
    }

    public static void booking(int[] ans, int start, int end, int numOfSeats) {
        for(int i = start-1; i < end; i++) {
            ans[i] += numOfSeats;
        }
    }

    public static void main(String[] args) {
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        System.out.println(Arrays.toString(corpFlightBookings(bookings, 5)));
    }
}
