package Reviews;

public abstract class Review {

    String body;
    String author;
    String movie;
    int numOfStar;
    double TotalRate =5;
    public double RateStar=5.0;
    public abstract String toString();

    public double calculateRate(double numOfStar){
        double result = (this.RateStar+numOfStar)/2;
        this.RateStar=result;
        return result;
    }
    public void addReview(Review R){
        this.numOfStar = R.numOfStar;
        TotalRate =calculateRate(R.numOfStar);
        R.toString();
    }

}
