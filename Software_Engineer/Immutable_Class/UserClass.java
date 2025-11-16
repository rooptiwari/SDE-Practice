package Software_Engineer.Immutable_Class;

import java.util.ArrayList;
import java.util.List;

public final class UserClass {
    private final int id;
    private final String name ;
    private final List<String> tags;

    public UserClass(int id , String name , List<String> tags){
        this.id = id;
        this.name = name;
        this.tags = new ArrayList<>(tags);
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    // Defensive copy to preserve immutability
    public List<String> getTags(){
        return new ArrayList<>(tags);
    }
}
