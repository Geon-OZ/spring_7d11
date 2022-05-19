public class Model {
    int id;
    int maxCustomers;
    int currentCustomers;
    int oil;
    int speed;
    int currentSpeed;
    int fee;

    String status;

    public void drive(){
        if (oil>10){
            System.out.println("dirve start");
        } else{
            System.out.println("oil is empty");
        }
    }
    public void minOil(int minOil){
        oil-=minOil;
    }
    public int getNum(){return id;}
    public int getFee(){
        return fee;
    }
    public int nowOil(){
        return oil;
    }
    public String nowStatus(){
        return status;
    }
    public int getCurrentCustomers(){
        return currentCustomers;
    }
}
