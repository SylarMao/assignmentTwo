package V2;
class trigonometry
{
    public double sin(double degree)
    {
        return degree;
    }

    public double cos(double degree)
    {
        return degree;
    }

    public double tan(double degree)
    {
        return degree;
    }

    public double arcsin(double degree)
    {
        return degree;
    }

    public double arccos(double degree)
    {
        return degree;
    }

    public double arctan(double degree)
    {
        return degree;
    }

    public double sec(double degree)
    {
        return degree;
    }

    public double csc(double degree)
    {
        return degree;
    }

    public double cot(double degree)
    {
        return degree;
    }

    double abs(double num)
    {
        if (num<0)
            return -num;
        return num;
    }

    double factorial(int i)
    {
        double factorial = i;
        for(; i>1; i--)
        {
            factorial=factorial*(i-1);
        }
        return factorial;
    }

    double pow(double i,long j)
    {
        if(j==0)
        {
            return 1;
        }
        double k=i;
        for(; j>1; j--)
        {
            i=i*k;
        }
        return i;
    }

    private static class invalidInputException extends Exception
    {
        invalidInputException(String message)
        {
            System.out.println(message);
        }
    }
}

