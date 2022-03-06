package inheritance;

public class Review extends Restaurant{

//    . Each Review should have a body, an author, and a number of stars.
    String body;
    String author;
    int numOfStar;
    double TotalRate =5;

    public Review( String name, int numOfStar, String price, String body, String author ){
        super(name,numOfStar,price);
//        ("Jabri", 4, 200, "Excellent Service", "Renad Khawatreh")
        this.body = body;
        this.author = author;
        this.numOfStar = numOfStar;
        TotalRate = calculateRate(numOfStar);
    }

    @Override
    public String toString() {
        return "Review {" +
                " name = '" + name + '\'' +
                " Number of Star = '" + numOfStar + '\'' +
                " Price = '" + price +"$"+ '\'' +
                ", body = '" + body + '\'' +
                ", author = " + author +
                " Total Rate = '" + TotalRate + '\'' +
                '}';
    }
}
