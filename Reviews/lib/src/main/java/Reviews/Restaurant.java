package Reviews;

import jdk.jfr.Description;

public class Restaurant extends Review {
    String name;
    int numOfStar;
    String price;
    String Desc;

    public Restaurant(Restaurant R) {
        this.name = R.name;
        this.numOfStar= R.numOfStar;
        this.price = R.price;
        author = R.author;
        this.Desc = R.Desc;
        RateStar = calculateRate(R.numOfStar);

    }
    public Restaurant(String name, int numOfStar, String price, String Description) {
        this.name = name;
        this.numOfStar= numOfStar;
        this.price = price;
        this.Desc = Description;
        RateStar = calculateRate(numOfStar);
    }
    public Restaurant(Restaurant R, int numOfStar, String price, String Description) {
        this.name = R.name;
        this.numOfStar= numOfStar;
        author = R.author;
        Desc = Description;
        this.price = price;
        RateStar = calculateRate(numOfStar);
    }

    @Override
    public String toString() {
        System.out.println("Restaurant{" +
                "name='" + name + '\'' +
                ", price='" + price + "$"+'\'' +
                ", number of Star='" + numOfStar + '\'' +
                ", totalRate ='" + RateStar +'\'' +
                ", Description ='" + Desc +'\'' +
                '}');
        return ("Restaurant{" +
                "name='" + name + '\'' +
                ", price='" + price + "$"+'\'' +
                ", totalRate ='" + RateStar +'\'' +
                '}');
    }
}
