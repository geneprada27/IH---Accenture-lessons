package d3;

public class Main {

    public static void main (String[] args) {
        Movie harryPotter = new Movie("Harry Potter",100);
        Movie esdla = new Movie("El Señor de los Anillos", 200);
//        Movie otherMovie = harryPotter;
//        Movie newMovie =movieCreator("Star Wars", 120);
        Movie mx = new Movie("Mad Max");

        System.out.println("Title: " + harryPotter.getTitle() + ". Duration: " + harryPotter.getDuration() + " min.");
        System.out.println("Title: " + esdla.getTitle() + ". Duration: " + esdla.getDuration() + " min.");
        harryPotter.play();
        Movie.alert();
        System.out.println(harryPotter);
        System.out.println(mx);


        HorrorMovie scream = new HorrorMovie("Scream",90,false);
        System.out.println(scream.getTitle()+" " + scream.isReallyScary());
        System.out.println(scream);
        System.out.println(harryPotter);
        scream.play();
    }

//    public static Movie movieCreator (String title, int duration) {
//        return new Movie(title, duration);
//    }
}

