
public class TinyList {
    Object inside;

    public TinyList(){
        inside = null;
    }

    public void setValue(Object newValue){
        inside = newValue;
    }

    public Object getValue(){
        return inside;
    }
}