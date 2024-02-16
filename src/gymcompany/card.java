package gymcompany;

import java.time.LocalDate;

public class card {

    private static int count = 0;
    private int card_num = 0;
    private LocalDate start_date;
    private LocalDate end_date;
    private String sub_type;

    public card(LocalDate start_date, LocalDate end_date) {
        this.card_num = ++count;
        this.start_date = start_date;
        this.end_date = end_date;
        this.sub_type = "Normal client";

    }

    public int getCard_num() {
        return card_num;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public String getSub_type() {
        return sub_type;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }
//to set subsicription type for client and return discount percentage
    public double setSub_type(int numOfsports) {
        if (numOfsports == 2) {
            this.sub_type = "Silver client";
            return 0.1;

        } else if (numOfsports >= 3) {
            this.sub_type = "Golden client";
            return 0.15;
        }
        return 0;
    }
    
    

}
