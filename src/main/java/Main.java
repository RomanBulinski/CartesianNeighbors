public class Main {

    public static int[][] cartesianNeighbor(int x, int y) {

        int[][] result = new int[9][];

        int counter = 0;
        int counter2 = 0;
        x = x - 1;
        y = y - 1;

        while (counter < 9) {
            while (counter2 < 3) {
            result[counter][0] = x;
            result[counter][1] = y;
            x++;
                counter2++;
            }
            y++;
            counter2++;
        }
        return result;
    }


}
