package gymcompany;
import java.util.ArrayList;
import java.time.LocalDate;
        
public class client extends person{
    private int age;
    private double weight;
    private double height;
    private card C_card;
    private ArrayList<Subsecription> client_subs=new ArrayList<Subsecription>();
    

    public client(String First_name,String Last_name,String gender,int phone,int age, double weight, double height) {
         this.First_name = First_name;
         this.Last_name = Last_name;
         this.gender = gender;
         this.phone = phone;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.C_card=null;
    }

    public String getFirst_name() {
        return First_name;
    }
    public String getLast_name() {
        return Last_name;
    }
    public card getC_card() {
        return C_card;
    }

    public void setC_card(card C_card) {
        this.C_card = C_card;
    }
    public void setC_card(LocalDate start_date, LocalDate end_date) {
        C_card.setEnd_date(end_date);
        C_card.setStart_date(start_date);
    }

    public void  insert_client_Subsecription(Subsecription new_Subsecription){
        client_subs.add(new_Subsecription);
    }
    //to return the number of sports that cliet has
    public int sportNumber_eachClient(){
    int Sn=0;
    for (int i=0;i<client_subs.size();i++){
        for(int j=0;j<client_subs.get(i).sport_number_perSub();j++){
        Sn++;
        }
    }
    return Sn;
    
    }
 public ArrayList<Subsecription> get_subscriptions(){
     return client_subs;
 }
            
}
