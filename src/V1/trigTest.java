package V1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class trigTest
{

    @Test
    void sin()
    {
        trigonometry a = new trigonometry();
        for(int counter=0;counter<1000;counter++)
        {
            double degree=Math.random()*2000;
            degree-=1000;
            while(degree>Math.PI)
            {
                degree-=Math.PI;
            }
            while(degree<-Math.PI)
            {
                degree+=Math.PI;
            }
            assertEquals(Math.sin(degree),a.sin(degree),1E-15);//15 Significant figures
        }
    }

    @Test
    void cos()
    {
        trigonometry a = new trigonometry();
        for(int counter=0;counter<1000;counter++)
        {
            double degree=Math.random()*2000;
            degree-=1000;
            while(degree>Math.PI)
            {
                degree-=Math.PI;
            }
            while(degree<-Math.PI)
            {
                degree+=Math.PI;
            }
            assertEquals(Math.cos(degree),a.cos(degree),1E-15);//15 Significant figures
        }
    }

    @Test
    void tan() throws trigonometry.invalidInputException
    {
        trigonometry a = new trigonometry();
        for(int counter=0;counter<1000;counter++)
        {
            double degree=Math.random()*2000;
            degree-=1000;
            while(degree>Math.PI)
            {
                degree-=Math.PI;
            }
            while(degree<-Math.PI)
            {
                degree+=Math.PI;
            }
            //15 Significant figures
            assertEquals(Math.tan(degree),a.tan(degree),1E-14*Math.pow(10,Math.abs((int)a.tan(degree)/10)+1));
        }
    }

    @Test
    void arcsin() throws trigonometry.invalidInputException
    {
        trigonometry a = new trigonometry();
        for(int counter=0;counter<1000;counter++)
        {
            double degree=Math.random()*2;
            degree-=1;
            //15 Significant figures
            assertEquals(Math.asin(degree),a.arcsin(degree),1E-14*Math.pow(10,Math.abs((int)a.arcsin(degree)/10)+1));
        }
    }

    @Test
    void arccos() throws trigonometry.invalidInputException
    {
        trigonometry a = new trigonometry();
        for(int counter=0;counter<1000;counter++)
        {
            double degree=Math.random()*2;
            degree-=1;
            //15 Significant figures
            assertEquals(Math.acos(degree),a.arccos(degree),1E-15);
        }
    }

    @Test
    void arctan()
    {
        trigonometry a = new trigonometry();
        for(int counter=0;counter<1000;counter++)
        {
            double degree=Math.random()*2000;
            degree-=1000;
            //15 Significant figures
            assertEquals(Math.atan(degree),a.arctan(degree),1E-15*Math.pow(10,Math.abs((int)a.arctan(degree)/10)+1));
        }

    }

    @Test
    void sec() throws trigonometry.invalidInputException
    {
        trigonometry a = new trigonometry();
        for(int counter=0;counter<1000;counter++)
        {
            double degree=Math.random()*2000;
            degree-=1000;
            while(degree>Math.PI)
            {
                degree-=Math.PI;
            }
            while(degree<-Math.PI)
            {
                degree+=Math.PI;
            }
            //15 Significant figures
            assertEquals(1/Math.cos(degree),a.sec(degree),1E-15*Math.pow(10,Math.abs((int)a.sec(degree)/10)+1));
        }
    }

    @Test
    void csc() throws trigonometry.invalidInputException
    {
        trigonometry a = new trigonometry();
        for(int counter=0;counter<1000;counter++)
        {
            double degree = Math.random() * 2000;
            degree -= 1000;
            while (degree > Math.PI)
            {
                degree -= Math.PI;
            }
            while (degree < -Math.PI)
            {
                degree += Math.PI;
            }
            //15 Significant figures
            assertEquals(1 / Math.sin(degree), a.csc(degree), 1E-15*Math.pow(10,Math.abs((int)a.csc(degree)/10)+1));
        }
    }

    @Test
    void cot() throws trigonometry.invalidInputException
    {
        trigonometry a = new trigonometry();
        for(int counter=0;counter<1000;counter++)
        {
            double degree=Math.random()*2000;
            degree-=1000;
            while(degree>Math.PI)
            {
                degree-=Math.PI;
            }
            while(degree<-Math.PI)
            {
                degree+=Math.PI;
            }
            //15 Significant figures
            assertEquals(1/Math.tan(degree),a.cot(degree),1E-15*Math.pow(10,Math.abs((int)a.cot(degree)/10)+1));
        }
    }


}