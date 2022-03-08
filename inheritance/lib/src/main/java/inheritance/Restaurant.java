package inheritance;

public class Restaurant {
//    should have a name,
//    a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
    String name;
    int numOfStar;
    String price;
    public double RateStar=0.0;

    public Restaurant(String name, int numOfStar, String price) {
        this.name = name;
        this.numOfStar= numOfStar;
        this.price = price;
        RateStar = RateStar+calculateRate(numOfStar);
    }
    public double calculateRate(double numOfStar){
       double result = (this.RateStar+numOfStar)/2;
       this.RateStar=result;
       return result;
    }
    public void addReview(Review R){
        R.TotalRate =calculateRate(R.numOfStar);
        R.toString();
    }
    @Override
    public String toString() {

        return ("Restaurant{" +
                "name='" + name + '\'' +
                ", numOfStar=" + numOfStar +
                ", price='" + price + "$"+'\'' +
                '}');

    }
}
