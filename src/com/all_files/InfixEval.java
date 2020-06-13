package com.all_files;


import java.util.Iterator;
import java.util.Stack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author radhe
 */
@Component
public class InfixEval {
    
    private char sing;
    private String eval,number;
    
    private Stack<Double> stack1;
    private Stack<Character> stack2 ;
           
    private double flag1,flag2,result;
    
    public InfixEval() {
    	stack1 =new Stack<Double>();
        stack2=new Stack<Character>();
    	init();
    	initFlag();
    	initSing();
    }
    
    public void resetStack(){
        stack1.clear();
        stack2.clear();
        init();
        initFlag();
        initSing();
    }
    public void setExpresion(String eval){
        this.eval = eval;
    }
    
    
    private void init(){
        number = "";
    }
    private void initSing(){
        sing = '+';
    }
    
    private void initFlag(){
        flag1 = 0;
        flag2 =0;
        result =0;
    }
    
    private boolean isSingSet(){
        if(sing == '-')
            return true;
        return false;
    }
    public double evalExpresion(){
        try
        {
             for(int i=0;i<eval.length();i++)
             {
            	 
            	 
                 if(eval.charAt(i) == '('){
                     if(eval.charAt(i+1) == '-'){
                      sing = '-';
                      i++;
                     }
                     else
                     stack2.push(eval.charAt(i));
                 }
                 else if(eval.charAt(i)=='+' || eval.charAt(i)=='-' || 
                         eval.charAt(i)=='*' || eval.charAt(i)=='/'){
                    
                       if(number.length()>0) {
                         double num = Double.parseDouble(number);
                         stack1.push(num);
                       }
                         stack2.push(eval.charAt(i));  
                         init();
                 }
                 else if(Character.isDigit(eval.charAt(i)) || eval.charAt(i) == '.')
                 {
                     number+=eval.charAt(i);
                 }
                 else if(eval.charAt(i) == ')')
                 {
                     
                     if(isSingSet())
                     {
                         double num = Double.parseDouble(number);
                         num*=-1;
                         number = num+"";
                         stack1.push(num);
                         initSing();
                         continue;
                     }
                        
                         double num = Double.parseDouble(number);
                         stack1.push(num);
                        if(stack1.size()>1){
                         char pick = stack2.pop();
                         flag1 = stack1.pop();
                         flag2 = stack1.pop();
                         
                         while(pick!='(') {
                        	 result = operation(flag2, flag1, pick);
                        	 stack1.push(result);
                        	 pick = stack2.pop();
                        	 init();
                         }
                        } 
                         
                 }
                       
             }
             return stack1.pop();
        }
        catch(Exception e){
            System.out.println("error:"+e.getMessage());
        }
        return 0;
    }
    
    private double operation(double num1,double num2,char ope)
    {
        try{
            
            if(ope == '+')
                return (num1+num2);
            else if(ope == '-')
                return (num1-num2);
            else if(ope == '*')
                return (num1*num2);
            else if(ope == '/')
                return (num1/num2);
            else if(ope == '^')
                return (Math.pow(num1,num2));
        }
        catch(Exception e){
                }
        
        return 0;
    }
    
   
}
