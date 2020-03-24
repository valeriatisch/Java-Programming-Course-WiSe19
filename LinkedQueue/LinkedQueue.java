/*
 * Eine Queue funktioniert nach dem FIFO-Prinzip.
 * 
 * Hier wird eine Queue auf Basis einer verketteten Liste implementiert.
 * 
 * Nützliches Dokument: http://wwwusers.di.uniroma1.it/~parisi/Risorse/GenericProgramming.pdf
 * 
 * Konventionen:
 * 
 * E 	- Element type in a collection
 * K 	- Key type in a map
 * V 	- Value type in a map
 * T	- General type
 * S, U - Additional general types
 * 
 * 
 * In den Kommentaren sind Node, Knoten und Element gleichbedeutend.
 * 
 *
 */


public class LinkedQueue<E> implements Queue<E> {
		
	/*
	 * private Klassen-Attribute, auf die wir später durch bestimmte
	 * öffentl. Methoden zugreifen können
	 */
    private Node<E> top;
    private Node<E> tail;
    private int size;
    
    /*
     * Konstruktor: beim Erstellen einer LinkedQueue in der Main-Methode
     * werden alle Attribute erst mit null/0 initialisiert
     */
    public LinkedQueue(){
        top = null;
        tail = null;
        size = 0;
    }

    //Ist die Queue leer?
    public boolean isEmpty() {
    	boolean returnValue = false;
    	if (top == null)
    		returnValue = true;
        return returnValue;
        /*
         * Alternativ:
         * 
         * 	public boolean isEmpty(){
         * 		return top == null;
         * 	}
         */
    }
    
    //Gibt die Groesse der Queue zurueck
    public int size(){
        return size;
    }
    
    //Gibt das 1. bzw. älteste Element der Queue zurück
    public E front() {
        E info;
        /*
         * "if(isEmpty())" ist das Gleiche wie
         * "if(isEmpty() == true)"
         */
        if (isEmpty()) {	//Wenn die Queue leer ist, wird Info mit null initialisiert.
            info = null;
        } else {			//Ansonsten wird Info der Wert des 1. Elements zugewiesen.
            info = top.getInfo();	//Die Fkt. "getInfo()" gehört zur Klasse Node
        }
        return info;
    }

    //Fügt das übergebene Element in die Queue ein.
    public void enqueue (E info) {
        Node<E> n = new Node<E>(info, null);	//Erstellt einen neuen Knoten mit info und keinem Nachfolger
        
        if (isEmpty()) {	//Wenn die Queue leer ist, ist das neue Element das 1.
            top = n;
        } else {			//Ansonten wird das neue Element ans Ende der Queue gesetzt.
            tail.setNext(n);//Die Fkt. "setNext(Node<E> next)" ist aus der Klasse Node
        }
        tail = n;			//Das Ende der Queue wird aktualisiert, es ist jetzt der neu hinzugefügte Knoten.
        size++;				//Die Größe der Queue wird aktualisiert, also hier um 1 erhöht.
    }
    
    //Löscht das älteste Element der Queue und gibt es zurück.
    public E dequeue(){
        E info;
        if (!isEmpty()) {			
        	info = top.getInfo();	
            top = top.getNext();	//Das neue Top-Element wird aktualisiert mit dem Nachfolger vom gelöschten.
            size--;					//Die Größe der Queue wird aktualisiert.
            if (isEmpty()){			//Wenn das herausgeholte Element das letzte/einzige war,
                tail = null;		//..wird das Ende aktualisiert, also auf null gesetzt.
            }
        } else {					//Wenn die Queue leer ist, ist das zurück gegebene Element gleich null.
            info = null;
        }
        return info;
    }
    
    
    /*** Main-Methode ***/
    
    public static void main(String [] args){
    	
    	//Eine LinkedQueue, die nur Integer speichert, wird erstellt.
        LinkedQueue<Integer> q = new LinkedQueue<Integer>();   
        
        //Wir fügen Elemente der Queue hinzu:
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        
        System.out.println("Größe: " + q.size()); 
        
        //In e wird das 1. Element der Queue gespeichert.
        Integer e = q.front(); 
        System.out.println("Das 1. Element ist " + e + "."); 
        
        //Löschen die zwei ältesten Elemente:
        e = q.dequeue();
        e = q.dequeue();
        
        //Größe müsste um zwei kleiner sein:
        System.out.println("Größe: " + q.size()); 
        
        //Löschen die restlichen Elemente der Queue:
        e = q.dequeue();
        e = q.dequeue();
        e = q.dequeue();
        
        //Die Queue müsste jetzt leer sein:
        System.out.println("Größe: " + q.size() + " und isEmpty ist " + q.isEmpty() + "."); 
        
        
    }
}
