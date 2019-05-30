import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMainClass {


    @Test
    public void ExampleTest() {
        int[][] resul = new int[][]{{1,1},{1,2},{1,3},{2,1},{2,3},{3,1},{3,2},{3,3}};
        assertArrayEquals( resul, Main.cartesianNeighbor(2, 2)) ;

    }


}
