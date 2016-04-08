

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int sum=0;
        int[][] list= new int[4][6];
        for (int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                if(4-i>4-j){
                    k=4-j;
                }else{
                    k=4-i;
                }
                sum+=k*k;
            }
        }
    }

}



