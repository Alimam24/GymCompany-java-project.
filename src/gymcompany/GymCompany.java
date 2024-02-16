package gymcompany;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.LocalDate;

public class GymCompany {

    static void main_menu_interface() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                        Welcome to GYM                             |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  Are you:                                                         |\n"
                + "|  1-employee                                                       |\n"
                + "|  2-stackholder                                                    |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter the number of your choice:");
       
        int op_num = input.nextInt();
        if (op_num == 1) {
            employee Emp = employee_login_interface();
            if (Emp == null) {
                main_menu_interface();
            } else {
                employee_operations_interface(Emp);
            }
        } else if (op_num == 2) {
            stakeholder Sth = stakeholder_login_interface();
            if (Sth == null) {
                main_menu_interface();
            } else {
                stakeholder_operations_interface(Sth);
            }
        } else {
            System.exit(0);
        }


    }
    static stakeholder stakeholder_login_interface() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                              Login                                |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  name:                                                             \n"
                + "|                                                                   |\n"
                + "|  access code:                                                     |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter your first name : ");
        String first_name = input.next();
        System.out.print("please enter your last name: ");
        String last_name = input.next();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                              Login                                |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  name: " + first_name + " " + last_name + "                                \n"
                + "|                                                                   |\n"
                + "|  access code:                                                     |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter the access code : ");
        int access_code = input.nextInt();
        stakeholder Sth = stakeholder.is_authenticated(access_code, first_name, last_name);
        if (Sth != null) {
            return Sth;
        } else {
            for (int i = 0; i < 40; i++) {
                System.out.println();
            }
            System.out.print(
                    "---------------------------------------------------------------------\n"
                    + "|                              Login                                |\n"
                    + "|-------------------------------------------------------------------|\n"
                    + "|                                                                   |\n"
                    + "|                                                                   |\n"
                    + "|                    wrong access code or name                       \n"
                    + "|                                                                   |\n"
                    + "|                                                                   |\n"
                    + "---------------------------------------------------------------------\n"
                    + "Enter 'T' to try again or 'X' to return to the main menu : ");
            char op = input.next().charAt(0);
            switch (op) {
                case 't':
                    employee_login_interface();
                    break;
                case 'x':
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }
    static void stakeholder_operations_interface(stakeholder Sth){
    Scanner input=new Scanner(System.in);
    for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                              Hello                                |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  1-Add new employee                                               |\n"
                + "|  2-view all employees                                             |\n"
                + "|  3-Add new stakeholder                                            |\n"
                + "|  4-view all stakeholders                                          |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter the number of your choice:\n"
                + "enter '8' to return to logout your stakeholder account and return to the main menu\n"
                + "enter '0' to exit the program\n");
        
        int op_num=input.nextInt();
        switch (op_num) {
            case 1:
                add_new_employee_interface(Sth);
                break;
            case 2:
                view_all_employees_interface(Sth);
                break;
            case 3:
                add_new_stakeholder_interface(Sth);
                break;
            case 4:
                view_all_stakeholders_interface(Sth);
                break;
            case 0:
                 System.exit(0);
            case 8:
                main_menu_interface();
            default:
                break;
        }
}
    static void add_new_employee_interface(stakeholder Sth){
        String First_name;
        String Last_name;
        String gender;
        int phone;
        String username;
        String password;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW EMPLOYEE                         |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:                                                      |\n"
                + "|  Last name:                                                       |\n"
                + "|  gender:                                                          |\n"
                + "|  phone:                                                           |\n"
                + "|  username:                                                        |\n"
                + "|  password:                                                        |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter employee First name : ");
    First_name=input.next();
    for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW EMPLOYEE                         |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:                                                       |\n"
                + "|  gender:                                                          |\n"
                + "|  phone:                                                           |\n"
                + "|  username:                                                        |\n"
                + "|  password:                                                        |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter employee Last name : ");
        Last_name=input.next();
          for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW EMPLOYEE                         |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:"+Last_name+"                                           \n"
                + "|  gender:                                                          |\n"
                + "|  phone:                                                           |\n"
                + "|  username:                                                        |\n"
                + "|  password:                                                        |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter employee gender : ");
        gender=input.next();
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW EMPLOYEE                         |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:"+Last_name+"                                           \n"
                + "|  gender:"+gender+"                                                 \n"
                + "|  phone:                                                           |\n"
                + "|  username:                                                        |\n"
                + "|  password:                                                        |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter employee phone : ");
        phone=input.nextInt();
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW EMPLOYEE                         |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:"+Last_name+"                                           \n"
                + "|  gender:"+gender+"                                                 \n"
                + "|  phone:"+phone+"                                                   \n"
                + "|  username:                                                        |\n"
                + "|  password:                                                        |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter employee username : ");
        username=input.next();
         for (int i = 0; i < 40; i++) {
            System.out.println();
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW EMPLOYEE                         |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:"+Last_name+"                                           \n"
                + "|  gender:"+gender+"                                                 \n"
                + "|  phone:"+phone+"                                                   \n"
                + "|  username:"+username+"                                             \n"
                + "|  password:                                                        |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter employee password : ");
        password=input.next();
        for(int i=0;i<40;i++)
            System.out.println();
        Sth.AddEmployee(First_name, Last_name, gender, phone, username, password);
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW EMPLOYEE                         |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:"+Last_name+"                                           \n"
                + "|  gender:"+gender+"                                                 \n"
                + "|  phone:"+phone+"                                                   \n"
                + "|  username:"+username+"                                             \n"
                + "|  password: ******                                                 |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n");       
        System.out.println("employee added succesfully\n"
                         +"Enter:"                
                         + " 'A' to add another employee"
                         + " 'O' to return to operation list\n");
        char op=input.next().charAt(0);
        if(op=='a')
            add_new_employee_interface(Sth);
        else if(op=='o')
            stakeholder_operations_interface(Sth);
            
}
    static void view_all_employees_interface(stakeholder Sth){
    Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                           EMPLOYEES                               |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  name:                  phone:             username&password:     |\n");
        for(int i=0;i<employee.getEmplist().size();i++){
            System.out.print(
                  "|"+employee.getEmplist().get(i).getName()+"            "+ employee.getEmplist().get(i).getPhone()+"                   "+ employee.getEmplist().get(i).getUser_name()+"\n"
                 +"|                                           "+ employee.getEmplist().get(i).getPassword()+"\n");
        }
        System.out.println("|-------------------------------------------------------------------|\n");
        System.out.println("to return to operations list enter 'R'");
        char op=input.next().charAt(0);
        if (op=='r')
            stakeholder_operations_interface(Sth);
}
    static void add_new_stakeholder_interface(stakeholder Sth){
    Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                      ADD NEW STAKEHOLDER                          |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:                                                      |\n"
                + "|  Last name:                                                       |\n"
                + "|  gender:                                                          |\n"
                + "|  phone:                                                           |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter stakeholder first name : ");
        String First_name=input.next();
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                      ADD NEW STAKEHOLDER                          |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:                                                       |\n"
                + "|  gender:                                                          |\n"
                + "|  phone:                                                           |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter stakeholder last name : ");
        String Last_name=input.next();
         for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                      ADD NEW STAKEHOLDER                          |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:"+Last_name+"                                           \n"
                + "|  gender:                                                          |\n"
                + "|  phone:                                                           |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter stakeholder gender : ");
        String gender=input.next();
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                      ADD NEW STAKEHOLDER                          |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:"+Last_name+"                                           \n"
                + "|  gender:"+gender+"                                                 \n"
                + "|  phone:                                                           |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter stakeholder phone : ");
        int phone = input.nextInt();
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
        Sth.Add_New_Stakeholder(First_name, Last_name, gender, phone);
                System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                      ADD NEW STAKEHOLDER                          |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:"+First_name+"                                         \n"
                + "|  Last name:"+Last_name+"                                           \n"
                + "|  gender:"+gender+"                                                 \n"
                + "|  phone: "+phone+"                                                  \n"
                + "---------------------------------------------------------------------\n"
                +"stakeholder added succesfully\n"
                +"Enter:\n"                
                + " 'A' to add another stakeholde\n"
                + " 'O' to return to operation list\n");
        char op = input.next().charAt(0);
        if (op == 'a') {
            add_new_stakeholder_interface(Sth);
        } else if (op == 'o') {
            stakeholder_operations_interface(Sth);
        }
}
    static void view_all_stakeholders_interface(stakeholder Sth){
      Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                           STAKEHOLDERS                            |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  name:                      phone:                                |\n");
        for(int i=0;i<Sth.getStakeholders().size();i++){
            System.out.println("|  "+Sth.getStakeholders().get(i).getname()+"                   "+Sth.getStakeholders().get(i).getPhone()+"     \n");
        }
        System.out.println("|-------------------------------------------------------------------|\n");
        System.out.println("to return to operations list enter R");
        char op=input.next().charAt(0);
        if(op=='r')
           stakeholder_operations_interface(Sth);
}
    
    static employee employee_login_interface() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                              Login                                |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  Username:                                                        |\n"
                + "|                                                                   |\n"
                + "|  Password:                                                        |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter your username: ");
        String username = input.nextLine();

        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                              Login                                |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  Username:" + username + "                                         \n"
                + "|                                                                   |\n"
                + "|  Password:                                                        |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter your password: ");
        String password = input.nextLine();
        employee Emp = employee.isUserAuthenticated(username, password);

        if (Emp != null) {
            return Emp;
        } else {
            for (int i = 0; i < 40; i++) {
                System.out.println();
            }
            System.out.print(
                    "---------------------------------------------------------------------\n"
                    + "|                             Login                                 |\n"
                    + "|-------------------------------------------------------------------|\n"
                    + "|                                                                   |\n"
                    + "|                                                                   |\n"
                    + "|                   Wrong username or password                      |\n"
                    + "|                                                                   |\n"
                    + "|                                                                   |\n"
                    + "---------------------------------------------------------------------\n"
                    + "Enter 'T' to try again or 'X' to return to the main menu :"
            );
            char op = input.next().charAt(0);
            switch (op) {
                case 't':
                    employee_login_interface();
                    break;
                case 'x':
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }
    static void employee_operations_interface(employee Emp) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                              Hello                                |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  1-Add new client                                                 |\n"
                + "|  2-Add new sport                                                  |\n"
                + "|  3-Add new card to client                                         |\n"
                + "|  4-Add new subsicribe                                             |\n"
                + "|  5-veiw all clients and their category                            |\n"
                + "|  6-list of sports with subsribers less than 3                     |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter the number of your choice:\n"
                + "or\n"
                + "enter '8' to return to logout your stakeholder account and return to the main menu\n"
                + "enter '0' to exit the program\n");
        int op_num = input.nextInt();

        switch (op_num) {
            case 1:
                addNewClient_interface(Emp);
                break;
            case 2:
                add_New_sport_interface(Emp);
                break;
            case 3:
                addNewCard_to_client_interface(Emp);
                break;
            case 4:
                add_NewSubscribtion(Emp);
                break;
            case 5:
                Allclients_with_subType_interface(Emp);
                break;
            case 6:
                sports_less_3_susbsecriptions(Emp);
                break;
            case 0:
                 System.exit(0);
            case 8:
                main_menu_interface();
            default:
                System.exit(0);
        }

    }
    static void add_New_sport_interface(employee Emp) {
        Scanner input = new Scanner(System.in);
        String name;
        int Room_num;
        int num_place;
        LocalTime timing;
        int hour;
        int min;
        String coach_Name;
        int sub_price;
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.println(
                "---------------------------------------------------------------------\n"
                + "|                        ADDING NEW SPORT                             |\n"
                + "|--------------------------------------------------------------------|\n"
                + "|  name:                                                             |\n"
                + "|  room number:                                                      |\n"
                + "|  number of avaliable places:                                       |\n"
                + "|  timing:                                                           |\n"
                + "|  coach name:                                                       |\n"
                + "|  subsicription price:                                              |\n"
                + "|                                                                    |\n"
                + "---------------------------------------------------------------------");
        System.out.print("enter sport name: ");
        name = input.nextLine();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }

        System.out.println(
                "---------------------------------------------------------------------\n"
                + "|                        ADDING NEW SPORT                             |\n"
                + "|---------------------------------------------------------------------|\n"
                + "|  name:" + name + "                                                   \n"
                + "|  room number:                                                       |\n"
                + "|  number of avaliable places:                                        |\n"
                + "|  timing:                                                            |\n"
                + "|  coach name:                                                        |\n"
                + "|  subsicription price:                                               |\n"
                + "|                                                                     |\n"
                + "---------------------------------------------------------------------");
        System.out.print("enter the room number: ");
        Room_num = input.nextInt();

        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.println(
                "---------------------------------------------------------------------\n"
                + "|                        ADDING NEW SPORT                             |\n"
                + "|---------------------------------------------------------------------|\n"
                + "|  name:" + name + "                                                   \n"
                + "|  room number:" + Room_num + "                                        \n"
                + "|  number of avaliable places:                                        |\n"
                + "|  timing:                                                            |\n"
                + "|  coach name:                                                        |\n"
                + "|  subsicription price:                                               |\n"
                + "|                                                                     |\n"
                + "---------------------------------------------------------------------");

        System.out.print("enter the available places: ");
        num_place = input.nextInt();

        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.println(
                "---------------------------------------------------------------------\n"
                + "|                        ADDING NEW SPORT                             |\n"
                + "|---------------------------------------------------------------------|\n"
                + "|  name:" + name + "                                                   \n"
                + "|  room number:" + Room_num + "                                        \n"
                + "|  number of avaliable places:" + num_place + "                        \n"
                + "|  timing:                                                            |\n"
                + "|  coach name:                                                        |\n"
                + "|  subsicription price:                                               |\n"
                + "|                                                                     |\n"
                + "---------------------------------------------------------------------");

        System.out.println("enter the timing of the sport class: ");
        System.out.print("enter the hour: ");
        hour = input.nextInt();
        System.out.print("enter the minutes: ");
        min = input.nextInt();
        timing = LocalTime.of(hour, min);

        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.println(
                "---------------------------------------------------------------------\n"
                + "|                        ADDING NEW SPORT                             |\n"
                + "|---------------------------------------------------------------------|\n"
                + "|  name:" + name + "                                                   \n"
                + "|  room number:" + Room_num + "                                        \n"
                + "|  number of avaliable places:" + num_place + "                        \n"
                + "|  timing: " + timing + "                                              \n"
                + "|  coach name:                                                        |\n"
                + "|  subsicription price:                                               |\n"
                + "|                                                                     |\n"
                + "---------------------------------------------------------------------");
        System.out.print("enter coach name: ");
        coach_Name = input.next();

        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.println(
                "---------------------------------------------------------------------\n"
                + "|                        ADDING NEW SPORT                             |\n"
                + "|---------------------------------------------------------------------|\n"
                + "|  name:" + name + "                                                   \n"
                + "|  room number:" + Room_num + "                                        \n"
                + "|  number of avaliable places:" + num_place + "                        \n"
                + "|  timing: " + timing + "                                              \n"
                + "|  coach name:" + coach_Name + "                                       \n"
                + "|  subsicription price:                                               |\n"
                + "|                                                                     |\n"
                + "---------------------------------------------------------------------");
        System.out.print("enter subsicription price: ");
        sub_price = input.nextInt();

        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.println(
                "---------------------------------------------------------------------\n"
                + "|                        ADDING NEW SPORT                             |\n"
                + "|---------------------------------------------------------------------|\n"
                + "|  name:" + name + "                                                   \n"
                + "|  room number:" + Room_num + "                                        \n"
                + "|  number of avaliable places:" + num_place + "                        \n"
                + "|  timing: " + timing + "                                              \n"
                + "|  coach name:" + coach_Name + "                                       \n"
                + "|  subsicription price:" + sub_price + "                               \n"
                + "|                                                                     |\n"
                + "---------------------------------------------------------------------");

        Emp.AddSport(name, Room_num, num_place, timing, coach_Name, sub_price);
        System.out.println("new sport added successfully");
        System.out.println("enter:\n"
                + " 'A' to add another sport\n"
                + " 'R' to return to the employee operation list\n"
                + " 'M' to logout your enmployee profile and retun to the main menu\n");
        char op = input.next().charAt(0);
        switch (op) {
            case 'r':
                employee_operations_interface(Emp);
                break;
            case 'a':
                add_New_sport_interface(Emp);
                break;
            case 'm':
                main_menu_interface();
                break;
            default:
                System.exit(0);
        }
    }

    static void addNewClient_interface(employee Emp) {
        String First_name;
        String Last_name;
        String gender;
        int phone;
        int age;
        double weight;
        double height;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }

        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW CLIENT                           |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:                                                      |\n"
                + "|  Last name:                                                       |\n"
                + "|  gender:                                                          |\n"
                + "|  phone:                                                           |\n"
                + "|  age:                                                             |\n"
                + "|  weight:                                                          |\n"
                + "|  height:                                                          |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter client first name : ");
        First_name = input.next();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW CLIENT                           |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:" + First_name + "                                     \n"
                + "|  Last name:                                                       |\n"
                + "|  gender:                                                          |\n"
                + "|  phone:                                                           |\n"
                + "|  age:                                                             |\n"
                + "|  weight:                                                          |\n"
                + "|  height:                                                          |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter client last name : ");
        Last_name = input.next();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW CLIENT                           |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:" + First_name + "                                     \n"
                + "|  Last name:" + Last_name + "                                       \n"
                + "|  gender:                                                          |\n"
                + "|  phone:                                                           |\n"
                + "|  age:                                                             |\n"
                + "|  weight:                                                          |\n"
                + "|  height:                                                          |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter client gender : ");
        gender = input.next();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW CLIENT                           |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:" + First_name + "                                     \n"
                + "|  Last name:" + Last_name + "                                       \n"
                + "|  gender:" + gender + "                                             \n"
                + "|  phone:                                                           |\n"
                + "|  age:                                                             |\n"
                + "|  weight:                                                          |\n"
                + "|  height:                                                          |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter client phone : ");
        phone = input.nextInt();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW CLIENT                           |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:" + First_name + "                                     \n"
                + "|  Last name:" + Last_name + "                                       \n"
                + "|  gender:" + gender + "                                             \n"
                + "|  phone: " + phone + "                                              \n"
                + "|  age:                                                             |\n"
                + "|  weight:                                                          |\n"
                + "|  height:                                                          |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter client age : ");
        age = input.nextInt();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW CLIENT                           |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:" + First_name + "                                     \n"
                + "|  Last name:" + Last_name + "                                       \n"
                + "|  gender:" + gender + "                                             \n"
                + "|  phone: " + phone + "                                              \n"
                + "|  age:" + age + "                                                   \n"
                + "|  weight:                                                          |\n"
                + "|  height:                                                          |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter client weight : ");
        weight = input.nextDouble();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW CLIENT                           |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:" + First_name + "                                     \n"
                + "|  Last name:" + Last_name + "                                       \n"
                + "|  gender:" + gender + "                                             \n"
                + "|  phone: " + phone + "                                              \n"
                + "|  age:" + age + "                                                   \n"
                + "|  weight:" + weight + "                                             \n"
                + "|  height:                                                          |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter client height : ");
        height = input.nextDouble();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                          ADD NEW CLIENT                           |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  First name:" + First_name + "                                     \n"
                + "|  Last name:" + Last_name + "                                       \n"
                + "|  gender:" + gender + "                                             \n"
                + "|  phone: " + phone + "                                              \n"
                + "|  age:" + age + "                                                   \n"
                + "|  weight:" + weight + "                                             \n"
                + "|  height:" + height + "                                             \n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
        );
        client Cnt=Emp.AddClient(First_name, Last_name, gender, phone, age, weight, height);
        System.out.println("new client added successfully");
        System.out.println("enter:\n"
                + " 'C' to add card to this client\n"
                + " 'A' to add another client\n"
                + " 'R' to return to the employee operation list\n"
               );
        char op = input.next().charAt(0);
        switch (op) {
            case 'r':
                employee_operations_interface(Emp);
                break;
            case 'a':
                addNewClient_interface(Emp);
                break;
            case 'c':
                addNewCard_to_client_interface(Emp,Cnt);
                break;
            default:
                System.exit(0);
        }

    }
    static void addNewCard_to_client_interface(employee Emp,client c){
    Scanner input = new Scanner(System.in);
   for (int i = 0; i < 40; i++)
            System.out.println();
    System.out.print(
                  "---------------------------------------------------------------------\n"
                + "|                       ADD NEW CARD TO CLIENT                      |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  Start_date:                                                      |\n"
                + "|                                                                   |\n"
                + "|  End_date:                                                        |\n" 
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter the Start Date (year)  ");
   int year=input.nextInt();
    System.out.print("please enter the Start Date (month)");
    int month=input.nextInt();
    System.out.print("please enter the Start Date (day)");
    int day=input.nextInt();
    LocalDate start_date=LocalDate.of(year, month,day);
     for (int i = 0; i < 40; i++)
            System.out.println();
    System.out.print(
                  "---------------------------------------------------------------------\n"
                + "|                       ADD NEW CARD TO CLIENT                      |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  Start_date:"+start_date+"                                         \n"
                + "|                                                                   |\n"
                + "|  End_date:                                                        |\n" 
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter the End date (year)  ");
    year=input.nextInt();
     System.out.print("please enter the End Date (month)");
    month=input.nextInt();
    System.out.print("please enter the End Date (day)");
    day=input.nextInt();
    LocalDate end_date=LocalDate.of(year,month,day);
    for (int i = 0; i < 40; i++)
            System.out.println();
    System.out.print(
                  "---------------------------------------------------------------------\n"
                + "|                       ADD NEW CARD TO CLIENT                      |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  Start_date:"+start_date+"                                         \n"
                + "|                                                                   |\n"
                + "|  End_date:"+end_date+"                                             \n" 
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                );
    card new_card=new card(start_date, end_date);
    c.setC_card(new_card);
        System.out.println("card added succesfully");
        System.out.println("your card id:"+new_card.getCard_num());
         System.out.println("enter:\n"
                + " 'A' to add another client\n "
                + " 'R' to return to the employee operation list"
               );
        char op = input.next().charAt(0);
        switch (op) {
            case 'r':
                employee_operations_interface(Emp);
                break;
            case 'a':
                addNewClient_interface(Emp);
                break;
            default:
                System.exit(0);
}}
    static void RenewCard_to_client_interface(employee Emp,client c){
    Scanner input = new Scanner(System.in);
   for (int i = 0; i < 40; i++)
            System.out.println();
    System.out.print(
                  "---------------------------------------------------------------------\n"
                + "|                       ADD NEW CARD TO CLIENT                      |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  Start_date:                                                      |\n"
                + "|                                                                   |\n"
                + "|  End_date:                                                        |\n" 
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter the Start Date (year)  ");
   int year=input.nextInt();
    System.out.print("please enter the Start Date (month)");
    int month=input.nextInt();
    System.out.print("please enter the Start Date (day)");
    int day=input.nextInt();
    LocalDate start_date=LocalDate.of(year, month,day);
     for (int i = 0; i < 40; i++)
            System.out.println();
    System.out.print(
                  "---------------------------------------------------------------------\n"
                + "|                       ADD NEW CARD TO CLIENT                      |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  Start_date:"+start_date+"                                         \n"
                + "|                                                                   |\n"
                + "|  End_date:                                                        |\n" 
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter the End date (year)  ");
    year=input.nextInt();
     System.out.print("please enter the End Date (month)");
    month=input.nextInt();
    System.out.print("please enter the End Date (day)");
    day=input.nextInt();
    LocalDate end_date=LocalDate.of(year,month,day);
    for (int i = 0; i < 40; i++)
            System.out.println();
    System.out.print(
                  "---------------------------------------------------------------------\n"
                + "|                       ADD NEW CARD TO CLIENT                      |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  Start_date:"+start_date+"                                         \n"
                + "|                                                                   |\n"
                + "|  End_date:"+end_date+"                                             \n" 
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                );
    card new_card=new card(start_date, end_date);
    c.setC_card(new_card);
        System.out.println("card renewd succesfully");
        System.out.println("your card id:"+new_card.getCard_num());
         System.out.println("enter:\n"
                + " 'S' to add a subsecribion\n "
                + " 'R' to return to the employee operation list"
               );
        char op = input.next().charAt(0);
        switch (op) {
            case 'r':
                employee_operations_interface(Emp);
                break;
            case 's':
                add_NewSubscribtion(Emp);
                break;
            default:
                System.exit(0); 
}}
    static void addNewCard_to_client_interface(employee Emp) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                 ENTER CLIENT's Name TO ADD CARD                   |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  First name:                                                      |\n"
                + "|                                                                   |\n"
                + "|  Last name:                                                       |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter First name  ");
        String first_name = input.next();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                 ENTER CLIENT's Name TO ADD CARD                   |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  First name:" + first_name + "                                         \n"
                + "|                                                                   |\n"
                + "|  Last name:                                                       |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter Last name ");
        String last_name = input.next();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                 ENTER CLIENT's Name TO ADD CARD                   |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  First name:" + first_name + "                                     \n"
                + "|                                                                   |\n"
                + "|  Last name:" + last_name + "                                       \n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n");
        client Clt=employee.Is_client_Authenticated(first_name, last_name);
        if (Clt==null) {
            for (int i = 0; i < 40; i++) {
                System.out.println();
            }

            System.out.print(
                    "---------------------------------------------------------------------\n"
                    + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                    + "|-------------------------------------------------------------------|\n"
                    + "|                                                                   |\n"
                    + "|                           Wrong input                             |\n"
                    + "|                                                                   |\n"
                    + "|                                                                   |\n"
                    + "---------------------------------------------------------------------\n"
                    + "Enter:\n"
                    + " 'y' to try again\n"
                    + " 'O' to return to the employee operation list\n");
            char op = input.next().charAt(0);
            if (op == 'y') {
                addNewCard_to_client_interface(Emp);
            }
            if (op == 'o') {
                employee_operations_interface(Emp);
            } else {
                System.exit(0);
            }
        }
        else {

            for (int i = 0; i < 40; i++) {
                System.out.println();
            }
            System.out.print(
                    "---------------------------------------------------------------------\n"
                    + "|                       ADD NEW CARD TO CLIENT                      |\n"
                    + "|-------------------------------------------------------------------|\n"
                    + "|                                                                   |\n"
                    + "|  Start_date:                                                      |\n"
                    + "|                                                                   |\n"
                    + "|  End_date:                                                        |\n"
                    + "|                                                                   |\n"
                    + "---------------------------------------------------------------------\n"
                    + "please enter the Start Date (year):  ");
            int year = input.nextInt();
            System.out.print("please enter the Start Date (month):");
            int month = input.nextInt();
            System.out.print("please enter the Start Date (day):");
            int day = input.nextInt();
            LocalDate start_date = LocalDate.of(year, month, day);
            for (int i = 0; i < 40; i++) {
                System.out.println();
            }
            System.out.print(
                    "---------------------------------------------------------------------\n"
                    + "|                       ADD NEW CARD TO CLIENT                      |\n"
                    + "|-------------------------------------------------------------------|\n"
                    + "|                                                                   |\n"
                    + "|  Start_date:" + start_date + "                                     \n"
                    + "|                                                                   |\n"
                    + "|  End_date:                                                        |\n"
                    + "|                                                                   |\n"
                    + "---------------------------------------------------------------------\n"
                    + "please enter the End date (year)  ");
            year = input.nextInt();
            System.out.print("please enter the End Date (month)");
            month = input.nextInt();
            System.out.print("please enter the End Date (day)");
            day = input.nextInt();
            LocalDate end_date = LocalDate.of(year, month, day);
            for (int i = 0; i < 40; i++) {
                System.out.println();
            }
            System.out.print(
                    "---------------------------------------------------------------------\n"
                    + "|                       ADD NEW CARD TO CLIENT                      |\n"
                    + "|-------------------------------------------------------------------|\n"
                    + "|                                                                   |\n"
                    + "|  Start_date:" + start_date + "                                     \n"
                    + "|                                                                   |\n"
                    + "|  End_date:" + end_date + "                                         \n"
                    + "|                                                                   |\n"
                    + "---------------------------------------------------------------------\n"
            );
            
            
            
            
            
            card new_card=new card(start_date, end_date);
            Clt.setC_card(new_card);
            System.out.println("card added succesfully\n"
                             + "enter:\n"
                             + " 'R' to return to the employee operation list\n");
        char op = input.next().charAt(0);
        switch (op) {
            case 'r':
                employee_operations_interface(Emp);
                break;
            default:
                System.exit(0);
        }
        }}
    
    static void view_available_sports(employee Emp) {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                             SPORTS                                  |\n"
                + "|---------------------------------------------------------------------|\n"
                + "|  sport name               avaliable places           price          |\n"
        );
        for (int i = 0; i < Emp.getSportslist().size(); i++) {
            System.out.println(
                    "| " + i + "-" + "sport name" + Emp.getSportslist().get(i).getName() + "                " + Emp.getSportslist().get(i).getNumOfavPlaces() + "                " + Emp.getSportslist().get(i).getSub_price() + "            ");
        }
        System.out.print(
                "|                                                                     |\n"
                + "---------------------------------------------------------------------\n");

    }
    static void add_NewSubscribtion(employee Emp) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|                                                                   |\n"
                + "|  Card number:                                                     |\n"
                + "|                                                                   |\n"
                + "|                                                                   |\n"
                + "---------------------------------------------------------------------\n"
                + "please enter the card number of the client: ");
        int card_num = input.nextInt();
        int client_index = Emp.Find_client(card_num);
        //right card number
        if (client_index != -1) {
            //card is valid
            if (Emp.is_valid_card_index(client_index)) {
                view_available_sports(Emp);
                System.out.print("please enter the sport number: ");
                int sport_num = input.nextInt();

                //if invalid input
                if (sport_num < 0 || sport_num > Emp.getSportslist().size()) {
                    for (int i = 0; i < 40; i++) {
                        System.out.println();
                    }

                    System.out.print(
                            "---------------------------------------------------------------------\n"
                            + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                            + "|-------------------------------------------------------------------|\n"
                            + "|                                                                   |\n"
                            + "|                           Wrong input                             |\n"
                            + "|                                                                   |\n"
                            + "|                                                                   |\n"
                            + "---------------------------------------------------------------------\n"
                    );
                     System.out.println("enter:\n"
                            + " 'A' to add anouther subsecribtion\n"
                            + " 'R' to return to the employee operation list\n");
                    char op = input.next().charAt(0);
                    switch (op) {
                        case 'r':
                            employee_operations_interface(Emp);
                            break;
                        case 'a':
                            add_NewSubscribtion(Emp);
                            break;
                        default:
                            System.exit(0);
                    }
                    
                    
                    
                } else if (Emp.getSportslist().get(sport_num).getNumOfavPlaces() <= 0) {
                    for (int i = 0; i < 40; i++) {
                        System.out.println();
                    }

                    System.out.print(
                            "---------------------------------------------------------------------\n"
                            + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                            + "|-------------------------------------------------------------------|\n"
                            + "|                                                                   |\n"
                            + "|                       Their is no places                          |\n"
                            + "|                                                                   |\n"
                            + "|                                                                   |\n"
                            + "---------------------------------------------------------------------\n"
                    );
                     System.out.println("enter:\n"
                            + " 'A' to add anouther subsecribtion\n"
                            + " 'R' to return to the employee operation list\n");
                    char op = input.next().charAt(0);
                    switch (op) {
                        case 'r':
                            employee_operations_interface(Emp);
                            break;
                        case 'a':
                            add_NewSubscribtion(Emp);
                            break;
                        default:
                            System.exit(0);
                    }
                    

                } //here all the inputs is right and will do the subscribtion operation    
                else {
                    Subsecription sub = Emp.New_Subscription(client_index, sport_num);

                    for (int i = 0; i < 40; i++) {
                        System.out.println();
                    }

                    System.out.print(
                            "---------------------------------------------------------------------\n"
                            + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                            + "|-------------------------------------------------------------------|\n"
                            + "|                                                                   |\n"
                            + "|  " + Emp.getclients().get(client_index).First_name + " subsicribtion in " + Emp.getSportslist().get(sport_num).getName() + " have been done successfully" + "\n"
                            + "|  total price of this subsicription is after discount:"+sub.getTotal_price()+"\n"
                            + "|                                                                   |\n"
                            + "---------------------------------------------------------------------\n"
                    );

                    System.out.println("enter:\n"
                            + " 'O' to add another sport to the subsicribtion\n"
                            + " 'R' to return to the employee operation list\n"
                            + " 'M' to logout your enmployee profile and retun to the main menu");
                    char op = input.next().charAt(0);
                    switch (op) {
                        case 'r':
                            employee_operations_interface(Emp);
                            break;
                        case 'o':
                            add_sport_to_subsecribtion(Emp, sub, client_index, card_num);
                            break;
                        case 'm':
                            main_menu_interface();
                            break;
                        default:
                            System.exit(0);
                    }
                }
            } //card is expierd
            else {
                for (int i = 0; i < 40; i++) {
                    System.out.println();
                }

                System.out.print(
                        "---------------------------------------------------------------------\n"
                        + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                        + "|-------------------------------------------------------------------|\n"
                        + "|                                                                   |\n"
                        + "|                      Your card is expierd                         |\n"
                        + "|                                                                   |\n"
                        + "|                                                                   |\n"
                        + "---------------------------------------------------------------------\n"
                );
                System.out.println("enter:\n"
                            + " 'C' to make a new card\n"
                            + " 'R' to return to the employee operation list\n");
                    char op = input.next().charAt(0);
                    switch (op) {
                        case 'r':
                            employee_operations_interface(Emp);
                            break;
                        case 'c':
                            RenewCard_to_client_interface(Emp,employee.getclients().get(client_index));
                            break;
                        default:
                            System.exit(0);
                    }

            }
        } //wrong card number
        else {
            for (int i = 0; i < 40; i++) {
                System.out.println();
            }

            System.out.print(
                    "---------------------------------------------------------------------\n"
                    + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                    + "|-------------------------------------------------------------------|\n"
                    + "|                                                                   |\n"
                    + "|          sorry,their is no clients with this card number         |\n"
                    + "|                                                                   |\n"
                    + "|                                                                   |\n"
                    + "---------------------------------------------------------------------\n"
            );
            System.out.println("Enter 'R' to retry enter the card num or 'O' to return to the employee operation list ");
            char op = input.next().charAt(0);
            if (op == 'r') {
                add_NewSubscribtion(Emp);
            }
            if (op == 'o') {
                employee_operations_interface(Emp);
            } else {
                System.exit(0);
            }
        }
    }
    static void add_sport_to_subsecribtion(employee Emp, Subsecription sub, int client_index, int card_num) {
        Scanner input = new Scanner(System.in);
        view_available_sports(Emp);
        System.out.print("please enter the sport number: ");
        int sport_num = input.nextInt();

        //if invalid input
        if (sport_num < 0 && sport_num > Emp.getSportslist().size()) {
            for (int i = 0; i < 40; i++) {
                System.out.println();
            }

            System.out.print(
                    "---------------------------------------------------------------------\n"
                    + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                    + "|-------------------------------------------------------------------|\n"
                    + "|                                                                   |\n"
                    + "|                           Wrong input                             |\n"
                    + "|                                                                   |\n"
                    + "|                                                                   |\n"
                    + "---------------------------------------------------------------------\n"
            );
        } else if (Emp.getSportslist().get(sport_num).getNumOfavPlaces() <= 0) {
            for (int i = 0; i < 40; i++) {
                System.out.println();
            }

            System.out.print(
                    "---------------------------------------------------------------------\n"
                    + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                    + "|-------------------------------------------------------------------|\n"
                    + "|                                                                   |\n"
                    + "|                       Their is no places                          |\n"
                    + "|                                                                   |\n"
                    + "|                                                                   |\n"
                    + "---------------------------------------------------------------------\n"
            );

        } //here all the inputs is right and will do the subscribtion operation    
        else {
            Emp.addSport_tosub(client_index,sub,sport_num);

            for (int i = 0; i < 40; i++) {
                System.out.println();
            }

            System.out.print(
                            "---------------------------------------------------------------------\n"
                            + "|                    ADDING NEW SUBSICRIBTION                       |\n"
                            + "|-------------------------------------------------------------------|\n"
                            + "|                                                                   |\n"
                            + "|  " + Emp.getclients().get(client_index).First_name + " subsicribtion in " + Emp.getSportslist().get(sport_num).getName() + " have been done successfully" + "\n"
                            + "|  total price of this subsicription is after discount:"+sub.getTotal_price()+"\n"
                            + "|                                                                   |\n"
                            + "---------------------------------------------------------------------\n"
                    );

            System.out.println("enter:"
                    + "'A' to subecribe anouther sport"
                    + " O to add another subsicribtion\n "
                    + " 'R' to return to the employee operation list\n"
                    + " 'M' to logout your enmployee profile and retun to the main menu\n");
            char op = input.next().charAt(0);
            switch (op) {
                case 'a':
                    add_sport_to_subsecribtion(Emp, sub, client_index, card_num);
                    break;
                case 'r':
                    employee_operations_interface(Emp);
                    break;
                case 'o':
                    add_NewSubscribtion(Emp);
                    break;
                case 'm':
                    main_menu_interface();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    
     static void Allclients_with_subType_interface(employee Emp) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.print(
                "---------------------------------------------------------------------\n"
                + "|                       ADD NEW CARD TO CLIENT                      |\n"
                + "|-------------------------------------------------------------------|\n"
                + "|  name                         subscription type                   |\n");
        for (int i = 0; i < Emp.getclients().size(); i++) {
            
            card c=Emp.getclients().get(i).getC_card();
            if(c==null)
            System.out.print("|  "+ Emp.getclients().get(i).getFirst_name()+" " + Emp.getclients().get(i).getLast_name() + "                    " +"not a subscriber" +"\n");
            else
            System.out.print( "|  "+Emp.getclients().get(i).getFirst_name()+" " + Emp.getclients().get(i).getLast_name() +"                    " + c.getSub_type() +"\n");
        }
        System.out.println("---------------------------------------------------------------------\n");

        System.out.println("Enter 'R' to return to the employee opertation list");
        char op = input.next().charAt(0);
        if (op == 'r') {
            employee_operations_interface(Emp);
        } else {
            System.exit(0);
        }

    }
    static void sports_less_3_susbsecriptions(employee Emp){
        Scanner input = new Scanner(System.in);
       for (int i = 0; i < 40; i++) {
            System.out.println();
        }
       System.out.print( "---------------------------------------------------------------------\n"
                + "|                SPORTS LESS THAN 3 SUBSECRIPTIONS                    |\n"
                + "|---------------------------------------------------------------------|\n");
        for(int i=0;i<employee.getSportslist().size();i++)
            if(employee.getSportslist().get(i).getNumOfplaces()-employee.getSportslist().get(i).getNumOfavPlaces()<3)
                System.out.print("|                                                                     |\n"
                +                "|      "+employee.getSportslist().get(i).getName()+                  "\n");
        System.out.println("---------------------------------------------------------------------\n");
         System.out.println("Enter 'R' to return to the employee opertation list");
        char op = input.next().charAt(0);
        if (op == 'r') {
            employee_operations_interface(Emp);
        } else {
            System.exit(0);
        }
                }
        
    public static void main(String[] args) {
        employee.new_employee("walid", "alimam", "M", 0, "ww", "aa");
        employee Emp = employee.getEmplist().get(0);
        
        //adding some sports
        Emp.AddSport("Football", 1, 20, LocalTime.of(18, 0), "John Doe", 100);
        Emp.AddSport("Basketball", 2, 15, LocalTime.of(17, 0), "Jane Smith", 80);
        Emp.AddSport("Tennis", 3, 10, LocalTime.of(16, 0), "Alex Johnson", 120);
        Emp.AddSport("Swimming", 4, 25, LocalTime.of(15, 0), "Emily Wilson", 150);
        Emp.AddSport("Volleyball", 5, 18, LocalTime.of(17, 30), "Michael Brown", 90);
        
        
        stakeholder.Add_New_Stakeholder("yy","hh","M",963);
        stakeholder Stl=stakeholder.getStakeholders().get(0);

        main_menu_interface();


    }
}
