package SAE;

public class person {
	private String name, address, phone, email;
	public person(){
	}

	public person(String name, String address, String phone, String email){
		this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
	
	public String getName(){
        return name;
    }
	
	public void setName(String name){
        this.name = name;
    }
	
	public String getAddress(){
	    return address;
	}
	
	public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getEmail(){
        return phone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "\n" + name;
    }
	
}



