using System.IO;
using System;

class Program
{
    static void Main()
    {
    int a,b,x,i,y,c = 0;
    a = Convert.ToInt32(Console.ReadLine());
    b = Convert.ToInt32(Console.ReadLine());
    
    if(a > b)
    {
        x = b;
        y = a;
            if(x % 2 == 0)
    {
        if(x >= 0)
        {
        for(i = x + 1;i < y;i = i + 2)
        {
            c = c + i;
        }
        }
        if(x < 0)
        {
        for(i = x + 1;i < y;i = i + 2)
        {
            c = c + i;
        }
        }
    }
    else if(x % 2 != 0)
    {
        if(x >= 0)
        {
        for(i = x + 2;i < y;i = i + 2)
        {
            c = c + i;
        }
        }
        if(x < 0)
        {
        for(i = x + 2;i < y;i = i + 2)
        {
            c = c + i;
        }
        }
    }
    }
    else if(b > a)
    {
        x = a;
        y = b;
            if(x % 2 == 0)
    {
        if(x >= 0)
        {
        for(i = x + 1;i < y;i = i + 2)
        {
            c = c + i;
        }
        }
        if(x < 0)
        {
        for(i = x + 1;i < y;i = i + 2)
        {
            c = c + i;
        }
        }
    }
    else if(x % 2 != 0)
    {
        if(x >= 0)
        {
        for(i = x + 2;i < y;i = i + 2)
        {
            c = c + i;
        }
        }
        if(x < 0)
        {
        for(i = x + 2;i < y;i = i + 2)
        {
            c = c + i;
        }
        }
    }
    }
    else if(a == b)
    {
        Console.WriteLine(0);
        goto bilash;
    }
    Console.WriteLine(c);
    bilash:
    Console.ReadLine();
    }
}
