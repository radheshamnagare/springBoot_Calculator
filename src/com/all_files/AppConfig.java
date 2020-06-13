package com.all_files;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author radhe
 */

@Configuration
@ComponentScan(basePackages = "com.all_files")
public class AppConfig {
 
    @Bean
    public DefaultListModel getDefaultListModel(){
        return new DefaultListModel();
    }
    
    @Bean
    public DefaultTableModel getDefaultTableModel(){
        return new DefaultTableModel();
    }
    @Bean
    public SimpleDateFormat getSimpleDateFormat(){
        return new SimpleDateFormat("dd MMM yyyy hh:mm:ss a");
    }
    @Bean
    public Date getDate(){
        return new Date();
    }
 }
