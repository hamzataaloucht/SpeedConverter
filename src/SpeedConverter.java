public class SpeedConverter {
    // The first method toMilesPerHour
    public static long toMilesPerHour(double kilometersPerHour) {
        // If the input is negative we return -1
        if (kilometersPerHour < 0) {
            return -1;
        }
        // We round our result here to the closest integer
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void main(String[] args) {
        // Testing the method toMilesPerHour
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
    }
}
