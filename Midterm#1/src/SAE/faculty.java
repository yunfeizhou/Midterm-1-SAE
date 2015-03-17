package SAE;

public class faculty extends employee {
	 private String office_hours, rank;
	 public faculty(String string, String string2, String string3, String string4){
	 }

	 public faculty(String office_hours, String rank){
	 this.office_hours = office_hours;
	 this.rank = rank;
	 }
	 public String getOfficeHours(){
	 return office_hours;
	 }

	 public void setOfficeHours(String office_hours){
	 this.office_hours = office_hours;
	 }

	 public String getRank(){
	 return rank;
	 }

	 public void setRank(String rank){
	 this.rank = rank;
	 }
	 }