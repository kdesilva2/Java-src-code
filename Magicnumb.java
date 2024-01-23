
import java.io.IOException;

public class Magicnumb {


    public static void main(String[] args) throws IOException {

        int magicNumber = 12;
        int[] gems = {3, 5, 7, 9};

        int[] result = new int[2];

        for (int i = 0; i < gems.length; i++) {
            for (int j = i + 1; j < gems.length; j++) {
                if (gems[i] + gems[j] == magicNumber) {
                    // Found two gemstones with the required sum
                    result[0] = i ; // Gemstone indices start from 1
                    result[1] = j ;
                    System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
                    return;
                }
            }



    }
}

}


