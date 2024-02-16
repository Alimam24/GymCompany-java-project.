package gymcompany;
import java.time.LocalDate;
import java.util.ArrayList;

public class Subsecription { 
    private card card;
    private LocalDate sub_date;
    private ArrayList<sport> sub_sports=new ArrayList<sport>();
    private int total_price;
    
    
    public Subsecription(card card) {
        this.card = card;
        this.sub_date = LocalDate.now();
        total_price=0;
    }

    public int getTotal_price() {
        return total_price;
    }
    
    
    public void  addSport_toSubsecribtion(sport sport){
    total_price=total_price+sport.getSub_price();
    sub_sports.add(sport);
    }
   
    
    public int sport_number_perSub(){
    return sub_sports.size()+1;
    
    }
    //to set total price after discount
    public void setTotal_price_afterDiscount(double discount){
    total_price-=total_price*discount;
    }
}
