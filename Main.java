public class Main {

    public static void main(String[] args) {
        Laptop laptop1;
        Smartphone smartphone1;
        String laptopOwner, smartphoneOwner;
        String laptopBrand, smartphoneBrand;
        String laptopSerialID, smartphoneSerialID;

        laptop1 = new Laptop(); //Create and assign values to laptop1
        laptop1.setOwnerName("Racque Cordeta");
        laptop1.setbrandName("Acer");
        laptop1.setSerialID("APRNOV0427");

        smartphone1 = new Smartphone(); //Create and assign values to smartphone1
        smartphone1.setOwnerName("Ronald Reforma");
        smartphone1.setbrandName("RealMe");
        smartphone1.setSerialID("APRNOV0427-RECO0411");

        //Output the information
        laptopOwner = laptop1.getOwnerName();
        laptopBrand = laptop1.getbrandName();
        laptopSerialID = laptop1.getSerialID();

        smartphoneOwner = smartphone1.getOwnerName();
        smartphoneBrand = smartphone1.getbrandName();
        smartphoneSerialID = smartphone1.getSerialID();

        System.out.println(laptopOwner + " owns an " + laptopBrand + " Laptop with a Serial ID of " + laptopSerialID);
        System.out.println(smartphoneOwner + " owns a " + smartphoneBrand + " Laptop with a Serial ID of " + smartphoneSerialID);

    }
}
