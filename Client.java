public class Client{
private int id;
private String firstname;
private String lastname;
private double amount;

public Client(int id,String firstname,String lastname,double amount){
this.id = id;
this.firstname = firstname;
this.lastname = lastname;
this.amount = amount;
}

public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}
public String getFirstName(){
    return firstname;
}
public void set(String firstname){
    this.firstname = firstname;
}
public String getLastName(){
    return lastname;
}
public void setLastName(String lastname){
    this.lastname = lastname;
}
public double getAmount(){
    return amount;
}
public void setAmount(double amount){
    this.amount = amount;
}
public void addMoney(double money){
 amount+=money;
}
public void subMoney(double money){
     amount-=money;
}

public String toString(){
    return "ID"+ id + "\nName"+ firstname + " " + lastname + "\nAmount" + amount + "\n";
}
}