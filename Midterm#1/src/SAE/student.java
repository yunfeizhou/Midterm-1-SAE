package SAE;

public class student extends person{
    private final String CLASS_STATUS;
    
    public student(String CLASS_STATUS, String string, String string2, String string3){
        this.CLASS_STATUS =CLASS_STATUS;
    }
    public String getClassStatus(){
        return CLASS_STATUS;
    }
}
