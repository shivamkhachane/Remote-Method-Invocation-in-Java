

import java.io.*;
import java.rmi.*;
import java.net.*;
public class RMI_SERA
{
    public static void main(String args[]) throws Exception
    {
        try
        {
            Palindrome twox = new Palindrome();
            Naming.bind("palin", twox);
            System.out.println("Object registered");
        }
        catch(Exception e)
        {
            System.out.println("Exception" + e);
        }
    }
}
