package W3ClassNotes;

import java.util.Objects;

public class Movie {
int id;
String title;
int duration;
int price;
public Movie(int id, String title, int duration, int price) {
	super();
	this.id = id;
	this.title = title;
	this.duration = duration;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override

public String toString() {
	return "Movie [id=" + id + ", title=" + title + ", duration=" + duration + ", price=" + price + "]";
}

}
