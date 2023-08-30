

public class BlueRayDisk {
    public String title=null;
    public String director=null;
    public int yearRelease=0;
    public double cost=0;

    public BlueRayDisk(String title, String director, int yearRelease, double cost){ this.title = title;
        this.director = director;
        this.yearRelease = yearRelease;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "$"+cost+" "+yearRelease+" "+title+", "+director;
    }
}


class Node {
    BlueRayDisk br =null;
    Node next =null;

    public Node(BlueRayDisk br, Node next){
        this.br = br;
        this.next = next;
    }

}


class BlueRayCollection{
    private Node head =null;
    private Node tail=null;

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

    public void show_all(){
        Node current = head;


        while (current!=null){
            System.out.println(current.br);
            current = current.next;
        }
    }

    //1. Add the search method that returns a string representing the BlueRay. It should take in a title
    //(string) and find the movie in question in the BlueRayCollection linked list.
    public String search(String title){

        Node current = head;
        while (current!=null){
            //a. You should search the linked list, looking in each node’s data field for the matching title.
            if (current.br.title.equals(title)){
                //i. If you find it, return the BlueRay object as a string.
                return current.br+"";
            }
            current = current.next;

            //b. Be sure your search works regardless of whether the list is empty, has one node, or has
            //multiple nodes.
        }

        //ii. If you can’t find it, you should return “Not Found”.
        return "Not found";

    }


    //2. Add the remove method, that returns a boolean indicating success or failure. It should take in a
    //title (string), find the movie, and remove it from the BlueRayCollection linked list.
    public boolean remove(String title){
        Node current = head;

        //a. If the BlueRayCollection is currently empty, obviously you can’t remove that movie.
        if (head==null) {

            return false;
        }
        //b. In all other cases, check the current node’s data field’s title for a matching title.
        else if (head.br.title.equals(title)){
            head = head.next;

            return true;
        }else {
            while (current.next!=null) {
                //i. If the current node matches, delete the node.
                if (current.next.br.title.equals(title)) {

                    current.next = current.next.next;
                    return true;
                }

                //ii. If it dosen’t, move onto the next node and check there.
                current = current.next;
            }
        }

        //c. Be sure your delete works regardless of whether the list is empty, has one node, or has
        //multiple nodes.

        return false;
    }

}
