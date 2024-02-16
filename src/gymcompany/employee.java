package gymcompany;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;

public class employee extends person {

    private static ArrayList<employee> employees = new ArrayList<employee>();
    private static ArrayList<sport> sports = new ArrayList<sport>();
    private static ArrayList<client> clients = new ArrayList<client>();
    private String User_name;
    private String Password;

    //constractor
    public employee(String First_name, String Last_name, String gender, int phone, String User_name, String Password) {
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.gender = gender;
        this.phone = phone;
        this.User_name = User_name;
        this.Password = Password;
    }

   public employee(){};

    //getters
    public String getUser_name() {
        return User_name;
    }
    public String getPassword() {
        return Password;
    }
    public String getFirst_name() {
        return First_name;
    }
    public String getLast_name() {
        return Last_name;
    }
    public String getGender() {
        return gender;
    }
    public int getPhone() {
        return phone;
    }
public String getName(){
    return First_name+" "+Last_name;
}
    //for adding to the lists
    public void AddSport(String name, int Room_num, int num_place, LocalTime timing, String coach_Name, int sub_price) {
        sport newSport = new sport(name, Room_num, num_place, timing, coach_Name, sub_price);
        sports.add(newSport);
    }
    // public void AddSport(sport sport){}
    public client AddClient(String First_name, String Last_name, String gender, int phone, int age, double weight, double height) {
        client newClient = new client(First_name, Last_name, gender, phone, age, weight, height);
        clients.add(newClient);
        return newClient;
    }
    public void AddCard(client c, LocalDate start_date, LocalDate end_date) {
        c.setC_card(start_date, end_date);
    }
    
  
    public void addthisclient(client c){
    clients.add(c);
    }
    //for returning the static lists
    static ArrayList<employee> getEmplist() {
        return employees;
    }
    static ArrayList<sport> getSportslist() {
        return sports;
    }
    static ArrayList<client> getclients() {
        return clients;
    }
   
    //to return a client by his card number
    public int Find_client(int card_num) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getC_card().getCard_num() == card_num) {
                return i;
            }
        }
        return -1;
    }

    
     
    //function that takes the index of the client in the clients list and return if its in date or not
    public boolean is_valid_card_index(int i) {
        LocalDate curr_Date = LocalDate.now();
        if (clients.get(i).getC_card().getEnd_date().isBefore(curr_Date)) {
            return false;
        }
        else
        return true;
    }

    public static employee isUserAuthenticated(String username, String pass_word) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUser_name().equals(username) && employees.get(i).getPassword().equals(pass_word)) {
                return employees.get(i);
            }
        }
        return null;
    }
    public static boolean boolisUserAuthenticated(String username, String pass_word) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUser_name() == username && employees.get(i).getPassword() == pass_word) {
                return true;
            }
        }
        return false;
    }
    
    public Subsecription addSport_tosub(int client_index,Subsecription sub,int sport_num){
        sub.addSport_toSubsecribtion(sports.get(sport_num));
        //to dicrease the number of available places by one
        sports.get(sport_num).decreasePlace();
        //set the membar catagory and calculate totale price amount after discount
        sub.setTotal_price_afterDiscount(clients.get(client_index).getC_card().setSub_type(clients.get(client_index).sportNumber_eachClient()));
        return sub;
    
    }
    //add new subscribtion to a certain client
    public Subsecription New_Subscription(int client_index, int sport_num) {
        //create a new subsicribtion object
        Subsecription new_sub = new Subsecription(clients.get(client_index).getC_card());
        //insert the choosen sport into the list of sports in the subsicribtion object
        new_sub.addSport_toSubsecribtion(sports.get(sport_num));
        //to dicrease the number of available places by one
        sports.get(sport_num).decreasePlace();
        //set the membar catagory and calculate totale price amount after discount
        new_sub.setTotal_price_afterDiscount(clients.get(client_index).getC_card().setSub_type(clients.get(client_index).sportNumber_eachClient()));
        //insurt the subsicribtion object into the static list of the subsicriptions in employee class
        clients.get(client_index).insert_client_Subsecription(new_sub);
return new_sub;
    }
    
    //not used at all (not compatable with the interface)
    
    public void view_available_sports_old() {
        for (int i = 0; i < sports.size(); i++) {
            if (sports.get(i).check_availability()) {
                System.out.println(i + sports.get(i).getName());
            }
        }
    }
    
    static public void new_employee(String First_name, String Last_name, String gender, int phone, String User_name, String Password){
        employee Emp=new employee(First_name,Last_name,gender,phone,User_name,Password);
    employees.add(Emp);
    
    }
    public static client Is_client_Authenticated(String fname,String lname){
         for(int i=0;i<getclients().size();i++){
        if((clients.get(i).getFirst_name().equals(fname))&&(clients.get(i).getLast_name().equals(lname)))
            return clients.get(i);
            }
         return null;
    }
    public static client get_client_by_name(String fname,String lname){
        for(int i=0;i<getclients().size();i++){
        if((clients.get(i).getFirst_name()==fname)&&(clients.get(i).getLast_name()==lname))
            return clients.get(i);
    }
     return clients.get(0);
    }
    
   
    
}
