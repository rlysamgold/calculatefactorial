import java.awt.*;
import java.awt.image.IndexColorModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Abrite on 01.11.15.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(reader.readLine());
        System.out.println(faktorial(input));


    }

    public static Integer faktorial(Integer integer) {
        if (Math.abs(integer) == 1) {
            return integer;
        } else{
            if(integer>1)
                return integer * faktorial(integer-1);
            else
            {
                return integer * faktorial(integer+1);
            }

        }
    }
}