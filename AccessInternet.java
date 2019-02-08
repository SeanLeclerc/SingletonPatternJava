
	public class AccessInternet implements OfficeInternetAccess {  
	    private String nomEmployee;  
	    public AccessInternet(String nomEmp) {  
	        this.nomEmployee = nomEmp;  
	    }  
	    @Override  
	    public void grantInternetAccess() {  
	        System.out.println("Accès Internet accordé au salarié: "+ nomEmployee);  
	    }  
	} 


