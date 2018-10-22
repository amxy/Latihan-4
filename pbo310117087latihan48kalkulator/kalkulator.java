package pbo310117087latihan48kalkulator;

/**
 *
 * @author amxyfa
 */
public class kalkulator {
    private double value1,value2;
    
    public double getValue1(){
    return value1;
    }
    
    public void setValue1(double value1){
    this.value1 = value1;
    }
    
    public double getValue2(){
    return value2;
    }
    
    public void setValue2 (double value2){
    this.value2 = value2;
    }
    
    public void setNameProject(String nameProject){
        System.out.println("Project Calculator");    
    }
    
    public void setNoteProject(String noteProject){
        System.out.println("This Project Shown You how to manage method in "
                + "java");
    }
    
    public double add (){
    return value1 + value2;
    }
    
    public double minus (){
    return value1 - value2;
    }
    
    public double multiple (){
    return value1 * value2;
    }
    
    public double division(){
    return value1/value2;
    }
}
