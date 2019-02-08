
public class ProxyInternetAccess implements OfficeInternetAccess {

	    private String nomEmployee;  
	    public ProxyInternetAccess(String empName) {  
	        this.nomEmployee = empName;  
	    }  
	    @Override  
	    public void grantInternetAccess() {  
	        System.out.println("Accès Internet accordé au salarié: "+ nomEmployee);  
	    }  
	}  


