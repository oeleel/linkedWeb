public class linkedWeb implements Webable {
    public ArrayList<WebNode> board; 
    public linkedWeb (anyType v, String name) {
        this.name = name;
        this.v = v; 
    }

    public boolean add(String n, List<String> nei, Country c) {
        board.add(new WebNode(n, nei, c));
        return true;
    }

    public boolean addNeighbors(String n, List<String> nei) {

    }
    public boolean areNeighbors(String n , String b) {

    }
    public void clear() {

    }
    public boolean containsName(String n) {

    }
    public WebNode get(String n) {

    }
    public WebNode set(String n, List<String> nei, anyType v) {

    }
    public String showUnlinked() {

    }
    public int size() {

    }
    public Object[] toArray() {

    }
}
