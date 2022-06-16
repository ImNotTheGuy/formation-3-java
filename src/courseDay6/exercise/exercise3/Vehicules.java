package courseDay6.exercise.exercise3;

/*TP : Véhicules
Objectif:
Créer une classe abstraite.
Dériver une classe abstraite.
Implémenter une méthode abstraite.
Énoncé:
Un parc auto se compose des voitures et des camions qui ont des caractéristiques communes
regroupées dans la classe Véhicule.
Chaque véhicule est caractérisé par son matricule, l’année de son modèle, son prix.
Lors de la création d’un véhicule, son matricule est incrémenté selon le nombre de véhicules créés.
Tous les attributs de la classe véhicule sont supposés privés. ce qui oblige la création des accesseurs
(get…) et des mutateurs (set….) ou les propriétés.
La classe Véhicule possède également deux méthodes abstraites démarrer() et accélérer() qui seront définies
dans les classes dérivées et qui affichent des messages personnalisés.
La méthode ToString() de la classe Véhicule retourne une chaîne de caractères qui contient les valeurs du
matricule, de l’année du modèle et du prix.
Les classes Voiture et Camion étendent la classe Véhicule en définissant concrètement les méthodes accélérer()
et démarrer() en affichant des messages personnalisés.
Travail à faire:
Créer la classe abstraite Véhicule.
Créer les classes Camion et Voiture.
Créer une classe Test  qui permet de tester la classe Voiture et la classe Camion
(edited)*/
public abstract class Vehicules {


    private int matricule;
    private int anneeModele;
    private float prix;
    private static int counter = 0;

    public Vehicules(int anneeModele, float prix) {
        counter++;
        this.anneeModele = anneeModele;
        this.prix = prix;
        this.matricule = counter;
    }

    abstract void demarrer();

    abstract void accelerer();

    public int getMatricule() {
        return matricule;
    }

    public int getAnneeModele() {
        return anneeModele;
    }

    public void setAnneeModele(int anneeModele) {
        this.anneeModele = anneeModele;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "_____________\n" +
                "matricule: " + matricule +
                "\nanneeModele: " + anneeModele +
                "\nprix: " + prix + "\n_____________\n";
    }
}
