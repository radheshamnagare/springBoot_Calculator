package com.all_files;

import javax.swing.JButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 *
 * @author radhe
 */

public class SpringBootCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
       Calculator cal=(Calculator)context.getBean("cal");
       cal.setVisible(true);
    }
    
}
