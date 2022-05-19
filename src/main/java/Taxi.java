public class Taxi extends Model{

    String destination;
    int lengthDestination;
    int length;
    int money;
    int totalFee;
    int lengthFee;

    public Taxi(int id){
        this.id = id;
        this.maxCustomers = 4;
        this.money = 0;
        this.fee = 3000;
        this.lengthFee = 1000;
        this.length = 1;
        this.oil = 100;
        this.status = "nomal";
        this.speed = 0;
    }

    public void takeTaxi(int getCustomer, String getDestination, int getLengthDestination) {

        for (int i = 0; i < getCustomer; i++) {
            currentCustomers=getCustomer;
            destination=getDestination;
            length=getLengthDestination;
            lengthDestination=getLengthDestination-1;
            int sum=lengthDestination*lengthFee;
            totalFee=fee+sum;
            status="Drive";
            if (getCustomer>=5) {
                System.out.println("Err: Too many customers!");
                break;
            }
            }
    }
    public int takeFee(){
       if(currentCustomers>0) {
            money += totalFee;
            currentCustomers = 0;
            status = "Nomal";
        }
       return money;
    }
    public int nowMoney(){
        return money;
    }
    public void check(){
        if(oil>10){
            System.out.println("[Oil: "+nowOil()+"] [Money: "+nowMoney()+"] [Status: "+status+"]");
        } else if(oil==0){
            status="No operation";
            System.out.println("[Oil: "+nowOil()+"] [Money: "+nowMoney()+"] [Status: "+status+"]"+"need oil!");
        } else if(oil<=10){
            System.out.println("[Oil: "+nowOil()+"] [Money: "+nowMoney()+"] [Status: "+status+"]"+"need oil!");
        }

    }




    public String getDestination(){
        return destination;
    }
    public int getLength(){
        return length;
    }
    public int getTotalFee(){
        return totalFee;
    }
    public void feeInfo(){
        System.out.println("[now customer: "+getCurrentCustomers()+"] [fee: "+getFee()+"] [Destination: "+getDestination()+"] [Length: "+getLength()+"] [Total fee: "+getTotalFee()+"] [Status: "+status+"]");
    }

}
