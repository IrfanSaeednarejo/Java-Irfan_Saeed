
class Movie{
    String rating, movieTitle;
    int ID_Number;
    double DaysMovieLate;
    Movie(){

    }
    Movie(String rating, String movieTitle, int ID_Number, double DaysMovieLate){
        this.rating = rating;
        this.movieTitle = movieTitle;
        this.ID_Number = ID_Number;
        this.DaysMovieLate = DaysMovieLate;
    }

    String getRating(){
        return rating;
    }

    String getMovieTitle(){
        return movieTitle;
    }

    int getIDnumber(){
        return ID_Number;
    }

    double getDaysMovieLate(){
        return DaysMovieLate;
    }

    boolean equals(int ID_Number1, int ID_Number2){
        if(ID_Number1 == ID_Number2){
            return true;
        }else{
            return false;
        }
    }

    double calcLateFees(double DaysMovieLate){
        return (DaysMovieLate*2);
    }
}
class Action extends Movie{

    Action(String rating, String movieTitle, int ID_Number, double DaysMovieLate){
        super(rating, movieTitle, ID_Number, DaysMovieLate);
    }
    @Override
    boolean equals(int ID_Number1, int ID_Number2){
        if(ID_Number1 == ID_Number2){
            return true;
        }else{
            return false;
        }
    }
    @Override
    double calcLateFees(double DaysMovieLate){
        return (DaysMovieLate*3);
    }
}
class Comedy extends Movie{

    Comedy(String rating, String movieTitle, int ID_Number, double DaysMovieLate){
        super(rating, movieTitle, ID_Number, DaysMovieLate);
    }
    @Override
    boolean equals(int ID_Number1, int ID_Number2){
        if(ID_Number1 == ID_Number2){
            return true;
        }else{
            return false;
        }
    }
    @Override
    double calcLateFees(double DaysMovieLate){
        return (DaysMovieLate*2.50);
    }
}
class Drama extends Movie{

    Drama(String rating, String movieTitle, int ID_Number, double DaysMovieLate){
        super(rating, movieTitle, ID_Number, DaysMovieLate);
    }
    @Override
    boolean equals(int ID_Number1, int ID_Number2){
        if(ID_Number1 == ID_Number2){
            return true;
        }else{
            return false;
        }
    }
    @Override
    double calcLateFees(double DaysMovieLate){
        return (DaysMovieLate*2) ;
    }
}
class Rental extends Movie{
    Movie rented;
    int CustomerID, Dayslate;

    Rental(Movie rented, int CustomerID, int Dayslate){
        this.rented = rented;
        this.CustomerID = CustomerID;
        this.Dayslate = Dayslate;
    }
    Movie getMovie(){
        return rented;
    }
    int getCustomerID(){
        return CustomerID;
    }
    int getDayslate(){
        return Dayslate;
    }
    double calculateRental(){
        return rented.calcLateFees(Dayslate);
    }
}
class MovieTest{
    public static double lateFeesOwed(Rental[] rentals) {
        double total = 0;
        for (int i = 0; i < rentals.length; i++) {
            total += rentals[i].calculateRental();
        }

        return total;
    }
    public static void main(String[] arg){

        Movie movie[] = new Movie[6];
        System.out.println("==========Action Movies ==========");
        movie[0] = new Action("Rated G, PG-13, R", "SherShah", 194721, 4);
        System.out.println("The Action movie name \"" + movie[0].getMovieTitle() + "\" is " + movie[0].getDaysMovieLate() + " days late.");
        System.out.println("Late fees is " + movie[0].calcLateFees(movie[0].getDaysMovieLate()) + "$");
        movie[1] = new Action("Rated H, PG-14, S", "Pathan", 194722, 3);
        System.out.println("The Action movie name \"" + movie[1].getMovieTitle() + "\" is " + movie[1].getDaysMovieLate() + " days late.");
        System.out.println("Late fees is " + movie[1].calcLateFees(movie[1].getDaysMovieLate()) + "$");
        System.out.println();
        if(movie[0].equals(movie[0].getIDnumber(), movie[1].getIDnumber()) ){
            System.out.println("Both action movies are identical.");
        }else{
            System.out.println("Both action movies are not identical.");
        }
        System.out.println();
        System.out.println("==========Comedy Movies ==========");
        movie[2] = new Comedy("Rated I, PG-27, A", "HouseFull 2", 187671, 6);
        System.out.println("The Comedy movie name \"" + movie[2].getMovieTitle() + "\" is " + movie[2].getDaysMovieLate() + " days late.");
        System.out.println("Late fees is " + movie[2].calcLateFees(movie[2].getDaysMovieLate()) + "$");
        movie[3] = new Comedy("Rated J, PG-67, C", "Hera Pheri", 187672, 2);
        System.out.println("The Comedy movie name \"" + movie[3].getMovieTitle() + "\" is " + movie[3].getDaysMovieLate() + " days late.");
        System.out.println("Late fees is " + movie[3].calcLateFees(movie[3].getDaysMovieLate()) + "$");
        System.out.println();
        if(movie[2].equals(movie[2].getIDnumber(), movie[3].getIDnumber())){
            System.out.println("Both comedy movies are identical.");
        }else{
            System.out.println("Both comedy movies are not identical.");
        }
        System.out.println();

        System.out.println("========== Drama ==========");
        movie[4] = new Drama("Rated K, PG-78, T", "Hum Tum", 172012, 1);
        System.out.println("The Drama name \"" + movie[4].getMovieTitle() + "\" is " + movie[4].getDaysMovieLate() + " days late.");
        System.out.println("Late fees is " + movie[4].calcLateFees(movie[4].getDaysMovieLate()) + "$");
        movie[5] = new Drama("Rated L, PG-79, U", "Tere Bin", 172034, 3);
        System.out.println("The Drama name \"" + movie[5].getMovieTitle() + "\" is " + movie[5].getDaysMovieLate() + " days late.");
        System.out.println("Late fees is " + movie[5].calcLateFees(movie[5].getDaysMovieLate()) + "$");
        System.out.println();
        if(movie[4].equals(movie[4].getIDnumber(), movie[5].getIDnumber())){
            System.out.println("Both dramas are identical.");
        }else{
            System.out.println("Both dramas are not identical.");
        }
        System.out.println();

        Rental rental[] = new Rental[6];
        rental[0] = new Rental(movie[0], 2345, 4);
        rental[1] = new Rental(movie[1], 4567, 3);
        rental[2] = new Rental(movie[2], 5677, 6);
        rental[3] = new Rental(movie[3], 1234, 2);
        rental[4] = new Rental(movie[4], 6789, 1);
        rental[5] = new Rental(movie[5], 1278, 3);

        System.out.println("Total late fees : " + lateFeesOwed(rental));
    }
}
