package util;

import com.mkyong.beans.Chinese;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

/**
 * Created by dell on 2017/2/3.
 */
public class DateFormat {
    
    @BeforeClass
    public static void prepare(){
        
        
    }
    
    @Test
    public void printDate(){
        Date date1 = new Date();
        long timeStamp = date1.getTime();
        System.out.println(date1);

        Chinese c1 = new Chinese();
        c1.setName("Zhanguu");
    }
    
}
