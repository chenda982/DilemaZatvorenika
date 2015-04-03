/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dilemazatvorenikanew;

import java.util.Random;

/**
 *
 * @author Cheda
 */
public class Strategije {
    
    
    public int tft (int[] a, int i)
    {
        if (i != 0) // da li je prvi potez
        {
            if (a[i-1]==1) // koji je zadnji potez
            return 1;
            else
            return 0;
        }
        else
        {   
            return 1;
        }
    }
    
    public int Pavlov (int[] a, int[] b, int i )
    {
        if (i != 0)
        {
        if (a[i-1]==b[i-1])
            return 1;
        else
            return 0;
        }
        else
        return 1;
    }
    
    public int tf2t (int[] a, int i)
    {
        if (i != 0)
        {
        if (a[i-1]==0 && a[i]==0)
            return 0;
        else
            return 1;
        }
        else
        return 1;
    }
    
    public int spite (int[] a, int i)
    {
        if (proveriNiz(a, i, 0))
            return 1;
        else
            return 0;
    }
    public int random_m ()
    {
        int ishod;
        Random rg = new Random();
        ishod = rg.nextInt(2);
        return ishod;
        
    }
    
    public int softMajo(int[] a, int i)
    {
        int c = 0;
        int d = 0;
         if (i != 0) // da li je prvi potez
        {
            for (int j=0; j<=i; j++)
            {
                if (a[j]==1)
                    c++;
                else
                    d++; 
                    
                    
            }
            if (c>d)
                return 1;
            else
                return 0;
        }
        else
        {   
            return 1;
        } 
    }
    
    
    public boolean proveriNiz(int[] a, int i, int ishod)
    {
        boolean prom = true;
        for (int j=0; j<=i; j++)
        {
            if (a[j]==ishod)
            prom = false;
        }
        return prom;
        
    }
}
