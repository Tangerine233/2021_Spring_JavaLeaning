
//1. Write a BlueRayDisk class which has:
public class BlueRayDisk {
    //a. Public attributes called title and director (strings), year of release (int) and cost
    //(double).
    public String title=null;
    public String director=null;
    public int yearRelease=0;
    public double cost=0;

    //b. Constructor which takes in the 4 attributes and sets the objects variables.
    public BlueRayDisk(String title, String director, int yearRelease, double cost){
        this.title = title;
        this.director = director;
        this.yearRelease = yearRelease;
        this.cost = cost;
    }

    //c. Override of toString/ToString which prints the objects variables as follows:
    //[Dollar sign]Cost [space] Year of release [Space] Title [comma] Director
    //$19.99 2019 Avengers - Endgame, Anthony Russo & Joe Russo
    @Override
    public String toString() {
        return "$"+cost+" "+yearRelease+" "+title+", "+director;
    }
}




//2. Write a node class which has a data field that holds a BlueRayDisk and a next field which
//is a link to another node.
class Node {
    BlueRayDisk br =null;
    Node next =null;

    public Node(BlueRayDisk br, Node next){
        this.br = br;
        this.next = next;
    }

}




//3. Write a BlueRayCollection class which has:
class BlueRayCollection{
    //a. A private link called head that links to a Node, it should be initialized to null
    private Node head =null;
    private Node tail=null;

    //b. A public method called add() which takes 4 parameters (title, director, year of
    //release, cost) and returns nothing. It should create a new Node and add it to the
    //end of the linked list.
    public void add(String title, String director, int yearRelease, double cost){
        Node node = new Node(new BlueRayDisk(title, director, yearRelease, cost),null);
        if (tail==null){
            head = node;
        }
        else{
            tail.next = node;
        }
        tail = node;
    }

    //c. A public method called show_all() which takes no parameters and returns nothing,
    //but prints out all the BlueRays in the collection. It should utilize the toString or
    //ToString method to print each BlueRay.
    public void show_all(){
        Node current = head;

        System.out.println(current.br);
        while (current.next!=null){
            current = current.next;
            System.out.println(current.br);
        }
    }

}
