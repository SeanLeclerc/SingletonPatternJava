
	public class ProxyAccessInternet implements OfficeInternetAccess {  
        private String nomEmployee;  
        private AccessInternet  vraiacces;  
            public ProxyAccessInternet(String nomEmployee) {  
         this.nomEmployee = nomEmployee;  
     }  
     @Override  
     public void grantInternetAccess()   
     {  
         if (getRole(nomEmployee) > 4)   
         {  
             vraiacces = new AccessInternet(nomEmployee);  
             vraiacces.grantInternetAccess();  
         }   
         else   
         {  
             System.out.println("No Internet access granted. Your job level is below 5");  
         }  
     }  
     public int getRole(String emplName) {  
    	// Vérifier le rôle de la base de données en fonction du nom et de la désignation
        // Retourne le niveau d'emploi ou la désignation du poste.  
         return 9;  
     }  
}


