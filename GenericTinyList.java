
public class GenericTinyList<T> {

    T inside;

    public T getValue(){
        return inside;
    }

    public void setValue(T newValue){
        inside = newValue;
    }

    public boolean isEmpty(){
        // if(inside == null)
        //     return true;
        // else    
        //     return false;
        return inside == null;
    }

    public int size(){
        // if(isEmpty())
        //     return 0;
        // else
        //     return 1;
        return isEmpty() ? 0 : 1;
    }

}