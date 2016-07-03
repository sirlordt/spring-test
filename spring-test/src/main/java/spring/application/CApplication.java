package spring.application;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CApplication {

    public static void main(String[] args) {

        AbstractApplicationContext context = null;
        
        try {
        
            context = new ClassPathXmlApplicationContext( "beans.xml" );
        
            CHelloWorld helloWorld = context.getBean( CHelloWorld.class, "helloWorld" );
        
            System.out.println( helloWorld.getMessage() );
            
        }
        catch ( Exception ex ) {
            
            ex.printStackTrace();
            
        }
        finally {
            
            if ( context != null )
                context.close();
            
        }
        
    }

}
