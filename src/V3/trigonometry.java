package V3;
class trigonometry
{
    double sin(double degree)
    {
        double sum = 0;
        int sign = 1;
        for(int counter = 0; counter < 210; counter++)
        {
            sum += sign * pow(degree,counter * 2 + 1)/factorial(counter * 2 + 1);
            sign *= -1;
        }
        return sum;
    }

    double cos(double degree)
    {
        double sum = 1;
        int sign = -1;
        for(int counter = 1; counter < 210; counter++)
        {
            sum += sign * pow(degree,counter*2)/factorial(counter*2);
            sign *= -1;
        }
        return sum;
    }

    double tan(double degree)throws invalidInputException
    {
        if(abs(cos(degree))<1E-15)
        {
            throw new invalidInputException("Invalid input\nCan not tan 90 degree or 270 degree\nYour degree: "+degree+"\ncos: "+cos(degree));
        }
        return sin(degree)/cos(degree);
    }

    double arcsin(double degree)
    {
        return degree;
    }

    double arccos(double degree)
    {
        return degree;
    }

    double arctan(double degree)
    {
        return degree;
    }

    double sec(double degree) throws invalidInputException
    {
        if(abs(cos(degree))<1E-15)
        {
            throw new invalidInputException("Invalid input\nCan not sce 90 degree or 270 degree\ncos "+degree+" = "+cos(degree));
        }
        return 1/cos(degree);
    }

    double csc(double degree) throws invalidInputException
    {
        if(abs(sin(degree))<1E-15)
        {
            throw new invalidInputException("Invalid input\nCan not sce 180 degree or 360 degree\nsin "+degree+" = "+sin(degree));
        }
        return 1/sin(degree);
    }

    double cot(double degree) throws invalidInputException
    {
        return 1/tan(degree);
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

    double pow(double i, long j)
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

    static class invalidInputException extends Exception
    {
        invalidInputException(String message)
        {
            System.out.println(message);
        }
    }
}

