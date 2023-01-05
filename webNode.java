import java.util.*; 

public class WebNode {
    private String name; 
    private ArrayList<String> neighbors;
    private Country country;

    public WebNode(String str, ArrayList<String> nei, Country c) {
        name = str;
        neighbors = nei;
        country = c; 
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public int listNumNeighbors() {
        return neighbors.size();
    }

    public String nameAtIndex(int i) {
        return neighbors.get(i);
    }
}

