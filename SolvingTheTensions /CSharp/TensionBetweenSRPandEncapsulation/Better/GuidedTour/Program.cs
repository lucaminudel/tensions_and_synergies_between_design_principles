using System;

namespace GuidedTour
{
    // Goal dell'esercizio:
    // fare refactoring per eliminare i getter sulla classe Group sennza aggiungere metodi non void
    // su Group o su GuidedTour e senza mergiare le due classi.

    class Program
    {
        static void Main()
        {
            var tour = new GuidedTour();

            var group1 = new Group(9, "pino@gmail.com", "via dell'Indipendenza 1, Roma");
            var group2 = new Group(17, "gino@gmail.com", "via XX Settembre 1818, Roma");
            var group3 = new Group(5, "nino@gmail.com", "via Garibaldi, 1000, Roma");

            group1.SubscribeTo(tour);
            group2.SubscribeTo(tour);

            try
            {
                group3.SubscribeTo(tour);
            }
            catch (ArgumentException e)
            {
                Console.WriteLine("Errore: " + e.Message);                
            }
        }
    }
}