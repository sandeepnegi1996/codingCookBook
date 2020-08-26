class Bird {

    public static int numberOfLegs=2;
    public static float speedOfFlying=20.34f;

    private  boolean isFlyable;
    private String name;

    public static Bird b3;
    
    Bird(String name,boolean isFlyable) {
        this.name=name;
        this.isFlyable=isFlyable;

    }
    
    public void fly() {
        System.out.println("Flying");
    }

    public int displayCharacterstics(float age) {
        System.out.println("=============================================");
        System.out.println("Name of the bird is :  "+name);
        System.out.println("Flying of the bird Status :  "+isFlyable);
        System.out.println("Number of legs: "+Bird.numberOfLegs);
        System.out.println("Speed of Flying: "+Bird.speedOfFlying);

        return (int)age;
        }
    
}


 class TestClass {
   private  static Bird b1=new Bird("hen",false);

   private static Bird b2=new Bird("ostrich",false);
   private static int testCounter=1;



   public static void main(String[] args) {

       
        //System.out.println("Printing the Bird class static variables:  "+TestClass.b1.numberOfLegs);

        // System.out.println("Printing the instance variable of Bird B1: ");
        // b1.displayCharacterstics();

        // System.out.println("============================================================");
        // System.out.println("Printing the instance variable of Bird B2: ");
        // b2.displayCharacterstics();

        Bird.b3=new Bird("koyal",true);
       String result= (String)Bird.b3.displayCharacterstics(12.45f);
    System.out.println(result);


    String x=23;
    System.out.println(x);

   }


}

