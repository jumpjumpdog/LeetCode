package pingduoduo;
import java.lang.Math.*;
public class NumCompare {
    public char compare(double x, double y){

        Double xY = y*Math.log(x);
        Double yX = x*Math.log(y);
        if(xY>yX)
            return '>';
        else if(Math.abs(xY - yX) <0.0000000001d)
            return '=';
        else
            return '<';

  }

}
