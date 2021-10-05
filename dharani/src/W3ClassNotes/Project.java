package W3ClassNotes;

public class Project {
int id;
 String Companyname;
 int Duration;
public Project(int id, String companyname, int duration) {
	super();
	this.id = id;
	Companyname = companyname;
	Duration = duration;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompanyname() {
	return Companyname;
}
public void setCompanyname(String companyname) {
	Companyname = companyname;
}
public int getDuration() {
	return Duration;
}
public void setDuration(int duration) {
	Duration = duration;
}
@Override
public String toString() {
	return "Project [id=" + id + ", Companyname=" + Companyname + ", Duration=" + Duration + "]";
}
 
}
