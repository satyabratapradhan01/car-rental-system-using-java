public class carReant {

    public static void main(String[] args) {
        
    }
}

class car{
     private String carId;

     private String brand;

     private String model;

     private double bestPricePerDay;

     private boolean isAveailable;

     public car( String carId, String brand, String model, double bestPricePerDay){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.bestPricePerDay = bestPricePerDay;
        this.isAveailable = true;
     }

     public String getcarId(){
        return carId;
     }

     public String getbrand(){
        return brand;
     }

     public String getmodel(){
        return model;
     }

     public double calculatePrice(int rentalDay){
        return bestPricePerDay*rentalDay;
     }

     public boolean isAveailable(){
        return isAveailable;
     }

     public void rent(){
        isAveailable = false;
     }
     
}

class customer{
    private String customerId;

    private String name;

    public customer(String customerId, String name){
      this.customerId = customerId;
      this.name = name;
    }

    public String getcustomerId(){
      return customerId;
    }

    public String getname(){
      return name;
    }
}

class rental{
   private car car;

   private customer customer;

   private int days;

   public rental(car car, customer customer, int days){
      this.car = car;
      this.customer = customer;
      this.days = days;
   }

   public car getcar(){
      return car;
   }

   public customer getcustomer(){
      return customer;
   }

   public int days(){
      return days;
   }
}

