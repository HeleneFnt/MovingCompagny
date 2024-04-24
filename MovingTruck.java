public class MovingTruck {
    static int truckCapacity = 9;
    static int totalBoxes = 34;

    public static void main(String[] args) {
        int trips = 0; // Initialise le nombre de voyage nécessaire

        // Tant qu'il reste des cartons on poursuit le déménagement
        while (totalBoxes > 0) {
            // Chargement du camion
            if (totalBoxes >= truckCapacity) {
                System.out.println("Le camion est plein !");
                totalBoxes -= truckCapacity;
            } else {
                System.out.println("Le camion contient " + totalBoxes + " cartons.");
                totalBoxes = 0; // On vide le camion car il contient moins de cartons que sa capacité
            }

            // Déchargement du camion
            if (totalBoxes == 0) {
                System.out.println("Le camion est déchargé.");
            } else {
                System.out.println("Il reste " + totalBoxes + " carton(s) dans le camion.");
            }

            trips++;
        }

        System.out.println("Nombre total de voyages nécessaires : " + trips);
    }
}
