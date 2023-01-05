import java.util.*; 

public class webNode {
    private String name; 
    private ArrayList<String> neighbors;
    private Country country;

    public webNode(String str, ArrayList<String> nei, Country c) {
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

