//********************************************************************************
//  Group Assignment       Authors: Kara Keck, Kara Uitenbroek , Pamela Kuepper
//  Date: 8/2/2018
// Class: CPS 315 Object-Oriented Programming I 
//  Chapter 12 pp 12.6
//********************************************************************************

package group_project_12_6;
import java.util.Random;

public class Group_Project_12_6 {
    // random number generator used by all functions
    public static Random r = new Random();
    public static String Blurb()
    {
        // A Blurb is a Whoozit
        String result = Whoozit();
        int num = r.nextInt(9) + 1;
        for (int i = 0; i < num; i++)
        {
            result += Whatzit();
        }
        return result;
    }
    public static String Whoozit()
    {
        // A Whoozit is the character 'x'
        String result = "x";
        int num = r.nextInt(9);
        for (int i = 0; i < num; i++)
        {
            // followed by zero or more 'y's.
            result += "y";
        }
        return result;
    }
    public static String Whatzit()
    {
        // A Whatzit is a 'q'
        String result = "q";
        int num = r.nextInt(2);
        if (num == 0)
        {
            // followed by either a 'z' or a 'd',
            result += "z";
        }
        else // (num == 1)
        {
            result += "d";
        }
        result += Whoozit();
        return result;
    }
    // main method
    public static void main(String[] args)
    {
        System.out.println(Blurb());
    
        
    }
}
