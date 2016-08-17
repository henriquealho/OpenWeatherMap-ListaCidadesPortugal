using System;
using System.Globalization;
using System.IO;

namespace citiesList
{
    class pt_example
    {
        static void Main(string[] args)
        {
            string[] lines = File.ReadAllLines("pt_cities.txt");
            int i = 1; // Line number 
            foreach (var line in lines)
            {
                string[] tokens = line.Split(new char[] { '\t' });

                long id = long.Parse(tokens[0].ToString());
                string name = tokens[1].ToString().Replace("_", " "); // Replace underscore by space
                float latitude = float.Parse(tokens[2].ToString(), CultureInfo.InvariantCulture); // InvariantCulture: handles FormatException
                float longitude = float.Parse(tokens[3].ToString(), CultureInfo.InvariantCulture);
                string countryCode = tokens[4].ToString();

                // Print cities
                Console.WriteLine("-- #" + i);
                Console.WriteLine("ID: " + id);
                Console.WriteLine("Name: " + name);
                Console.WriteLine("Latitude: " + latitude);
                Console.WriteLine("Longitude: " + longitude);
                Console.WriteLine("Country Code: " + countryCode);

                i++;
            }
        }
    }
}
