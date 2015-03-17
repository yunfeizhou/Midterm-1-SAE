package SAE;

public class staff extends employee{
    private String title;
    public staff(){
    }
    
    public staff(String title, String string, String string2, String string3){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
    this.title =title;
    }
}
