package Reviews;
import java.util.ArrayList;

public class Theater extends Review{
    String name;
    int numOfStar;
    String Desc;
    ArrayList<String> movies=new ArrayList<>();

    public Theater(Theater th) {
        this.name = th.name;
        this.numOfStar= th.numOfStar;
        this.RateStar = calculateRate(th.numOfStar);

    }
    public Theater(Theater th, int numOfStar, String movie, String Desc){
        this.name = th.name;
        this.movies = th.movies;
        th.numOfStar =numOfStar;
        this.numOfStar = numOfStar;
        this.Desc = Desc;
        this.RateStar = calculateRate(th.numOfStar);

    }
    public Theater(Theater th, int numOfStar, String Desc){
        this.name = th.name;
//        this.movies = th.movies;
        th.numOfStar =numOfStar;
        this.Desc = Desc;
        this.RateStar = calculateRate(th.numOfStar);

    }
    public Theater(String name, String movie) {
        this.name = name;
        this.movies.add(movie);

    }
    public void addMovie (String movie){
        movies.add(movie);
    }
    public void removeMovie (String movie){
        movies.remove(movie);
    }
    @Override
    public String toString() {

        System.out.println("Theater{" +
                "name='" + name + '\'' +
                ", The Rate of this Review = " + numOfStar +
                ", Description = " + Desc +
                ", totalRate = " + RateStar +
                '}');
        if(movies.isEmpty())
            return "Theater{" +
                    "name='" + name + '\'' +
                    ", Total=" + RateStar +
                    '}';
            else
            return "Theater{" +
                    "name='" + name + '\'' +
                    ", movies=" + movies +
                    ", Total=" + RateStar +
                    '}';
    }



}
