package Reviews;

public class Shop extends Review {

    String name;
    String description;
    String numDollar;

    public Shop(String name, String description, String numDollar) {
        this.name = name;
        this.description = description;
        this.numDollar = numDollar;
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
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numDollar='" + numDollar + '\'' +
                '}';
    }
}
