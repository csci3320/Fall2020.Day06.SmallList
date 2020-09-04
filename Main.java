public class Main{
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        TinyList tinyList = new TinyList();
        String word = new String("Pen");
        tinyList.setValue(word);
        Object getObject = tinyList.getValue();
        String getWord = (String)getObject;
        System.out.println(getWord);


        GenericTinyList<String> genericTinyList = new GenericTinyList<String>();
        String instrument = "saxophone";
        genericTinyList.setValue(instrument);
        String getInstrument = genericTinyList.getValue();
        System.out.println(getInstrument);

        SmallList<String> smallList = new SmallList<String>();
        smallList.pushBack("Small List Item");
        System.out.println(smallList.get(0));

    }
}