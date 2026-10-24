import java.util.ArrayList;
import java.util.Objects;

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

    public boolean equals( Object obj ){


        if(obj instanceof LinkedList){
            LinkedList other = (LinkedList)obj;

            return Objects.equals(this.stackPair, other.stackPair);


        } else {
            return false;
        }


    }

    public String toString(){

        ArrayList<String> result = new ArrayList<>();
        Pair<T> current = stackPair;

        while(current != null){

            result.add(current.head().toString());
            current = current.tail();
            if(current != null){
            }
        }

        return result.toString();
    }
}
