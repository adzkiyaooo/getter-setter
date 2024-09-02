public class Instrument {
  String type;
  double price;

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Instrument() {
    type = "kosong";
    price = 0.0;
  }

  public Instrument(String i, double p) {
    type = i;
    price = p;
  }

  public void print() {
    System.out.println(" type :" + type);
    System.out.println(" harga :" + price);
  }

}
