
public class Node<E> {
	
	//Attribute
	private E info;			//Das Element selbst
    private Node<E> next;	//Verweis/Referenz aufs nächste Element in der verketteten Liste.

    //Konstruktor ohne übergebene Parameter
    public Node() {
        info = null;
        next = null;
    }

    //Konstruktor mit einem übergebenen Parameter info 
    public Node(E info) {
        setInfo(info);
    }
    
    //Konstruktor mit zwei übergebenen Parameter info zum akt. Node und dem Nachfolger
    public Node(E info, Node<E> next) {
        setInfo(info);
        setNext(next);
    }

    /*** Getter und Setter-Methoden ***/
    
    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}