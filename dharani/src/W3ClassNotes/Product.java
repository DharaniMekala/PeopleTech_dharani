package W3ClassNotes;

public class Product implements Comparable<Product>{
double price;
String name;
int rating;

public Product(double price, String name, int rating) {
	super();
	this.price = price;
	this.name = name;
	this.rating = rating;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getProductname() {
	return name;
}
public void setProductname(String name) {
	this.name = name;
}
public int getProductrating() {
	return rating;
}
public void setProductrating(int rating) {
	rating = rating;
}
@Override
public String toString() {
	return "Product [price=" + price + ", name=" + name + ", rating=" + rating + "]";
}
@Override
public int compareTo(Product o) {
	
	return this.compareTo(o);
}
public int getRating() {
	// TODO Auto-generated method stub
	return this.rating;
}

}
