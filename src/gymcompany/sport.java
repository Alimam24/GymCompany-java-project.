package gymcompany;
import java.time.LocalTime;

public class sport {
    static int count=0;
    private int id;
    private String name;
    private int Room_num;
    private int numOfplaces;
    private int numOfavPlaces;
    private LocalTime timing;
    private String coach_Name;
    private int sub_price;

    public sport(String name, int Room_num,int numOfplaces, LocalTime timing, String coach_Name, int sub_price) {
        this.id=++count;
        this.name = name;
        this.Room_num = Room_num;
        this.numOfplaces = numOfplaces;
        this.numOfavPlaces=numOfplaces;
        this.timing = timing;
        this.coach_Name = coach_Name;
        this.sub_price = sub_price;
    }

    //getters
    public static int getCount() {
        return count;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getRoom_num() {
        return Room_num;
    }
    public int getNumOfplaces() {
        return numOfplaces;
    }
    public int getNumOfavPlaces() {
        return numOfavPlaces;
    }
    public String getCoach_Name() {
        return coach_Name;
    }
    public int getSub_price() {
        return sub_price;
    }
    
    //setters
    public void setTiming(LocalTime timing) {
        this.timing = timing;
    }
    public static void setCount(int count) {
        sport.count = count;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRoom_num(int Room_num) {
        this.Room_num = Room_num;
    }
    public void setNumOfplaces(int numOfplaces) {
        this.numOfplaces = numOfplaces;
    }
    public void setCoach_Name(String coach_Name) {
        this.coach_Name = coach_Name;
    }
    public void setSub_price(int sub_price) {
        this.sub_price = sub_price;
    }
    
    //to check if their is available places in the sport class
    public boolean check_availability(){
    if(numOfavPlaces>0)
        return true;
    else 
        return false;
    }
    
    //to decrease the number of available places by one
    public void decreasePlace(){
    numOfavPlaces--;
    }
    
    

}