
public class Recipe {
    private int id;
    private String name;
    private String method;
    private static int lastId = 0;

    public Recipe(String name, String method){
        id = ++lastId;
        this.name = name;
        this.method = method;
    }

    int getId(){ return id;}
    String getName(){ return name;}
    String getMethod(){ return method;}

    String getInfoString(){
        return id+" : "+name+" : "+method;
    }

}
