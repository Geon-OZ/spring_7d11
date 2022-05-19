public class Bus extends Model{




    int moreCustomers;


    private int nowMoney;
    private int nowCustomers;




    public Bus(int id){
        this.id = id;
        this.maxCustomers = 30;
        this.currentCustomers = 0;
        this.fee = 0;
        this.oil = 100;
        this.currentSpeed = 0;
        this.status = "driving";
    }




    public void pluOil(int pluoil){
        oil+=pluoil;
    }

    public void setSpeed(int changeSpeed){
        int more=changeSpeed-currentSpeed;
        for(int i=changeSpeed; i > 0; i++){
            currentSpeed+=more;
        }
    }
    public void changeStatus(){
        if(status=="chagozi"){
            status="driveon";
        }else if(status=="driveon"){
            status="chagozi";

        }
    }

    public void checkOil(){
        System.out.println("[oil: "+nowOil()+"] [status:"+nowStatus()+"]");
        if (oil<=10){
            status = "chagozi";
            System.out.println("oil is empty! bus need oil!");
        }
    }




    public void takeBus(int getCustomer) {
        int sum = getCustomer+currentCustomers;
        int money = fee;
        int cus = currentCustomers;
        for (int i = 0; i < getCustomer; i++) {
            if(sum<=maxCustomers) {
                this.currentCustomers++;
                this.fee += 1000;
                nowMoney = fee-money;
                nowCustomers = currentCustomers-cus;
            } else if(sum>maxCustomers){
                System.out.println("full");
                break;
            }
        }

    }
    public void rightNow(){
        System.out.println("[now customers: "+nowCustomers+"] [empty customers: "+getMoreCustomers()+"] [now money: "+nowMoney+"]");
    }





    public int getMoreCustomers(){
        moreCustomers = maxCustomers-currentCustomers;
        return moreCustomers;
    }


    public void showInfo(){
        System.out.println("[bus number: "+getNum()+"] [current customers: "+getCurrentCustomers()+"] [empty cutomers:"+getMoreCustomers()+"] [money: "+getFee()+"]");
    }
}