public class PotatoHead{
    private boolean mustache;
    private String color_ears;
    private String nose_color;
    private boolean teeth;
    private String eyes_color;
    private int miles;

    public PotatoHead(){
        mustache = true;
        color_ears = "pink";
        nose_color = "pink";
        teeth = true;
        eyes_color = "black";
        miles = 3;
    }

    public PotatoHead(boolean m, String c, String n, boolean t, String e){
        mustache = m;
        color_ears = c;
        nose_color = n;
        teeth = t;
        eyes_color = e;
    }
    
    public boolean getmustache(){
        return mustache;
    }

    public String getcolor_ears(){
        return color_ears;
    }

    public String getnose_color(){
        return nose_color;
    }
    public boolean getteeth(){
        return teeth;
    }
    public String geteyes_color(){
        return eyes_color;
    }

    public int getmiles(){
        return miles;
    }

    public void setmustache(boolean k){
        mustache = k;
    }
    
    public void setcolor_ears(String y){
        color_ears = y;
    }

    public void setnose_color(String o){
        nose_color = o;
    }

    public void setteeth(boolean n){
        teeth = n;
    }

    public void seteyes_color(String b){
        eyes_color = b;
    }

    public void setmiles(int mi){
        miles = mi;
    }

    public void talk(){
        System.out.println("Superb");
    }

    public void interview(){
        System.out.println("Hi I am a potato head");
    }

    public void run(int mi){
        miles ++;
        System.out.println(miles);
    }

    public String toString(){
        return "The color of my ears is "+ color_ears + ". The color of my eyes is "+ eyes_color +".";
    }
    public static void main(String[]args){
        PotatoHead jim = new PotatoHead();
        PotatoHead bob = new PotatoHead (true, "pink", "pink", true, "black");
        String eye = bob.geteyes_color();
        jim.setcolor_ears("black");
        System.out.println(bob.toString());
        jim.talk();
        jim.run(8);
        jim.interview();
    }
}