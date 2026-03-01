/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.task;
public class LabTask {
    public static void main(String[] args) 
    {
        Member m1=new Member(101,"Raiyan");
        m1.updateFee(250.75);
        m1.show();
    
        Member m2 = new Member(102,"Nabila",1000);
        m2.updateFee(500.0);
        m2.show();
            
        Member m3 = new Member(103,"Arif");
        m3.updateFee(400.5);
        m3.show();
        
    System.out.println("Total Members Created: " +Member.member_no);
    }
}

class Member {
    int member_id;
    String name;
    double paid_fee;
    static int member_no=0;

//constructor 1
Member(int member_id,String name)
    {
    this.member_id = member_id;
    this.name = name;
   this.paid_fee = 0.00;
    member_no++;
}
//constructor overloading
Member(int member_id,String name,double paid_fee)
{
this(member_id,name);
this.paid_fee=paid_fee;
}

//Method Overloading 
void updateFee(double amount) 
{
    paid_fee += amount;
    //System.out.println("double");
}

void updateFee(int amount) 
{
    paid_fee += amount;
    //System.out.println("int");
}


void show()
{
System.out.println("Member ID: " + member_id );
System.out.println("Name : " + name);
System.out.println("Total Paid Fee : " +paid_fee);
System.out.println();
}
}
