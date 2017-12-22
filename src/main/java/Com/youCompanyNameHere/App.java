package Com.youCompanyNameHere;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        INDArray x = Nd4j.create(new double[] {1, 2, 3, 4, 5, 6}, new int[]{3, 2});
        System.out.println(x);

        System.out.println( "Hello World!" );
    }
}
