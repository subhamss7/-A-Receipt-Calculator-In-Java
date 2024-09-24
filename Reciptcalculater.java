public class Reciptcalculater {
    private  boolean isveg;
    private  boolean isprimium;
    public Reciptcalculater(boolean isveg,boolean isprimium){
        this.isveg=isveg;
        this.isprimium=isprimium;

    }
    public double getcost(){
       double cost=0;
       if(isveg){
        cost+=250;
       }else{
        cost+=300;
       }
       if(isprimium){
        cost+=100;
       }
       return cost;
    }
    public double addtopping(double cost,String topping){
        if(topping.equals("cheese")){
            cost+=20;
        }else if(topping.equals("chicken")){
            cost+=50;
        }else if(topping.equals("onion")){
            cost+=15;
        }
        return cost;

    }
    public double addTask(double cost){
    return cost + cost*0.05;
    }
    public double discount(double cost,double discount){
        return cost - cost*discount;
    }
    public static void main(String args[]){
        System.out.println("Welcome to my pizza shop");
        System.out.println("Select the pizza type");
        System.out.println("1. veg");
        System.out.println("2. nonveg");
        System.out.println("Enter your choice");
        int choice=Integer.parseInt(System.console().readLine());
        boolean isveg=false;
        if(choice==1){
            isveg=true;
        }
        System.out.println("Do you want primium pizza");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Enter your choice");
        choice=Integer.parseInt(System.console().readLine());
        boolean isprimium=false;
        if(choice==1){
            isprimium=true;
        }
        Reciptcalculater calculate=new  Reciptcalculater(isveg,isprimium);
        double cost=calculate.getcost();
        System.out.println("Wo you want to add any toppings");
        System.out.println("1. cheese");
        System.out.println("2. chickens");
        System.out.println("3. onion");
        System.out.println("4. No toppings");
        System.out.println("4. Enter your choices");
        choice=Integer.parseInt(System.console().readLine());
        if(choice!=4){
            String topping=" ";
            if(choice==1){
                topping="cheese";
            }else if(choice==2){
                topping="chicken";
            }else if(choice==3){
                topping="onion";
            }
            cost=calculate.addtopping(cost,topping);
        }
        System.out.println("Wo you want any discount");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Enter your choice");
        choice=Integer.parseInt(System.console().readLine());
        if(choice==1){
            System.out.println("Enter the discount coupen");
            double discount=Double.parseDouble(System.console().readLine());
            cost=calculate.discount(cost,discount);
        }
        cost=calculate.addTask(cost);
        System.out.println("Total cost"+cost);
        


    }
}
