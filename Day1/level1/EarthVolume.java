public class EarthVolume {
    public static void main(String[] args) {
        double r = 6378, volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(r, 3), volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
