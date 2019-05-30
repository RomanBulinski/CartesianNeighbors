import java.util.Arrays;

public class Main {

    public static int[][] cartesianNeighbor(int x, int y) {

        int[][] result = new int[8][2];

        int counter = 0;
        int starty = y - 1;

        while (counter < 8) {
            int counter2 = 0;
            int startx = x - 1;

            while (counter2 < 3) {
                if( starty==y && startx ==x){
                    counter--;
                }
                result[counter][0] = startx;
                result[counter][1] = starty;
                startx++;
                counter2++;
                counter++;
            }
            starty++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] resultinMain = cartesianNeighbor(2, 2);
        Arrays.stream(resultinMain).forEach(n -> Arrays.stream(n).forEach(m -> System.out.println(m)));

    }

}
