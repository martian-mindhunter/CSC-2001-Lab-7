public class LinkedList<T> {

    Pair<T> stackPair;
    public LinkedList(Pair l){
        this.stackPair = l;
    }
    public LinkedList(){
        this.stackPair = null;
    }

    public void push(T elt){
        this.stackPair = new Pair(elt, this.stackPair);
    }
}
