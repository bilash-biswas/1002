using System;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            double a;
            a = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("A={0:0.0000}" , (a * a * 3.14159));
            Console.ReadLine();
        }
    }
}
