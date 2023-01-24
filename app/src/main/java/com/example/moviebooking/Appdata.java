package com.example.moviebooking;

public class Appdata {
    public String id;
    public String data;
    public String name;
    public String phone;
    public String email;
    public String title;
    public String amount;
    public String time;

public Appdata() {
    this.id = "";
    this.data = "";
    this.name = "";
    this.phone = "";
    this.email = "";
    this.title = "";
    this.amount = "";
    this.time = "";
}

public String getData() {
    return data;
}
public void setData(String id,String name, String phone, String email, String title, String time, String amount){
        StringBuffer i = new StringBuffer(this.data);
    i.append("Name: " + name  + "\nPhone Number:  " + phone + "\nE-mail: " + email + "\nTitle:" + title + "     Time: " + time + "\n\n Amount: " + amount + "\n\nTicket Number :" + id + "-769" + id +"15672" + id + "10"  );
this.data = i.toString();
}


}
