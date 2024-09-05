//Buat Object Class dari Driver Class berikut
public class PlayInstument {
    public static void main(String[] args) {
        Instrument a = new Instrument();     
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.0);
         
        //Gunakan if-else untuk menentukan Instrument yg paling mahal dan paling murah

        a.setType("Guitar");
        a.setPrice(101.5);
        b.setType("Piano");
        b.setPrice(200.0);
        c.setType("Violin");
        c.setPrice(150.0);
        a.print();
        b.print();
        c.print(); 
        
       if(a.getPrice() > b.getPrice() && a.getPrice() > b.getPrice()) {
        System.out.println("Harga guitar lebih mahal");
       }else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
        System.out.println("Harga piano lebih mahal");
       }else if (c.getPrice() > a.getPrice() && c.getPrice() > b.getPrice()) {
        System.out.println("Harga violin lebih mahal");
       }

       if(a.getPrice() < b.getPrice() && a.getPrice() < b.getPrice()) {
        System.out.println("Harga guitar lebih murah");
       }else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
        System.out.println("Harga piano lebih murah");
       }else if (c.getPrice() < a.getPrice() && c.getPrice() < b.getPrice()) {
        System.out.println("Harga violin lebih murah");
       }
    
    
    
        }

}
