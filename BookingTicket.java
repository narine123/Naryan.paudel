public class BookingTicket {
    public static void main(String[] args) {
        System.out.println("start booking tickets online.");
        Tickets tickets1 = new Tickets("sandeep", "pokhara", 5000);
        Tickets tickets2 = new Tickets("Ashok", "Kathmandu", 9800);
        tickets2.booked();
        tickets1.booked();
        tickets1.printTickets();
        tickets2.printTickets();

        tickets2.priceChanged(9999);

    }
}

class Tickets
{
    private String name;
    private String destination ;
   //rivate double date;
    private double price;

    Tickets(String name,String destination, double price)  {
        this.name= name;
        this.destination=destination;
       //his.date= date;
        this.price= price;
    }
    void booked(){
        System.out.println("Thank you."+"The person with name "+name+" flying to "+destination+" has been booked for Rs."+price);

    }
    void priceChanged(double updatedPrice){
        System.out.println("Your price has been reduced"+updatedPrice);
        price= price- updatedPrice;
        System.out.println("here is your new updated ticket");
        System.out.println("-------------------------------");
        printTickets();

    }
    void printTickets(){
    System.out.println("congratulations!!! here is your is ticket.");
    System.out.println(name+ " "+destination+" "+price);
    System.out.println("Enjoy!!!11");

}
}