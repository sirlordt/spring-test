package spring.application;

public class CHelloWorld {

    protected String strMessage = null;

    public void init() {
        
        System.out.println( "Init method" );
        
    }
     
    public void destroy() {
    
        System.out.println( "Destroy method." );
    
    }
     
    public void setMessage( String strMessage ) {
    
        this.strMessage  = strMessage;
        
    }

    public String getMessage() {
       
        return strMessage;
        
    }
    
}
