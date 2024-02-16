package gymcompany;
import java.util.ArrayList;
public class stakeholder extends person {
    private static ArrayList<stakeholder> stakeholders = new ArrayList<stakeholder>();
    private static final int access_code=12345;
    public stakeholder(String First_name,String Last_name,String gender,int phone){
         this.First_name = First_name;
         this.Last_name = Last_name;
         this.gender = gender;
         this.phone = phone;
    }

    //getters
    public String getFirst_name() {
        return First_name;
    }
    public String getLast_name() {
        return Last_name;
    }
    public int getPhone() {
        return phone;
    }
    public static ArrayList<stakeholder> getStakeholders(){
        return stakeholders;
    }
    public String getname(){
        return First_name+"  "+Last_name;
    }
    
    public static stakeholder is_authenticated(int code,String first_name,String last_name){
        if(code==access_code){
            for(int i=0;i<stakeholders.size();i++){
                 if((first_name.equals(stakeholders.get(i).getFirst_name()))&&last_name.equals(stakeholders.get(i).getLast_name()))
                    return stakeholders.get(i);
            }
        }
            
        return null;
    }
    public static boolean boolis_authenticated(int code,String fname,String lname){
        if(code==access_code){
            for(int i=0;i<stakeholders.size();i++){
                if((fname.equals(stakeholders.get(i).getFirst_name()))&&lname.equals(stakeholders.get(i).getLast_name()))
                    return true;
            }
        }
            
        return false;
    }
    
    //to add to the lists
    public static void Add_New_Stakeholder(String First_name,String Last_name,String gender,int phone){
        stakeholder newstakeholder=new stakeholder(First_name,Last_name,gender,phone);
        stakeholders.add(newstakeholder);
    }
    public void  AddEmployee(String First_name, String Last_name, String gender, int phone, String User_name, String Password){
     employee new_employee= new employee(First_name,Last_name,gender,phone,User_name,Password);
        employee.getEmplist().add(new_employee);
     
    }
    
    public ArrayList view_employees(){
        return employee.getEmplist();
    }
}
