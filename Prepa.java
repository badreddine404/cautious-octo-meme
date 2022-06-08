/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepa;
import java.util.Scanner;
import java.time.Clock;

/**
 *
 * @author admin
 */


public class Prepa {
    int d;
    public  Prepa(int d){
        this.d=d;
    }
    
    {
        
 System.out.println("=");
    }
    /**
     * @param args the command line arguments
     */
     int num;
   
 
     /* public Prepa(){
        num = scanner.nextInt();
        
    }*/
    public void p(){
        System.out.println("enter number");
        num = scanner.nextInt();
  System.out.print(num+" * 1 = ");  num=num*1;  System.out.println(num);
  System.out.print(num+" * 2 = ");  num=num*2;  System.out.println(num);
  System.out.print(num+" * 3 = ");  num=num*3;  System.out.println(num);
  System.out.print(num+" * 4 = ");  num=num*4;  System.out.println(num);
  System.out.print(num+" * 5 = ");  num=num*5;  System.out.println(num);
  System.out.print(num+" * 6 = ");  num=num*6;  System.out.println(num);
  System.out.print(num+" * 7 = ");  num=num*7;  System.out.println(num);
  System.out.print(num+" * 8 = ");  num=num*8;  System.out.println(num);
  System.out.print(num+" * 9 = ");  num=num*9;  System.out.println(num);
  System.out.print(num+" * 10 = "); num=num*10; System.out.println(num);
    }
     public void p2(){
        System.out.println("enter number");
        num = scanner.nextInt();
        
          for(int i=1;i<=10;i++){
            System.out.print(num+" * "+i+" = "); 
            num=num*i;System.out.println(num+" \n\r");
        }
        
 /* System.out.print(num+" * 1 = ");  num=num*1;  System.out.println(num);
  System.out.print(num+" * 2 = ");  num=num*2;  System.out.println(num);
  System.out.print(num+" * 3 = ");  num=num*3;  System.out.println(num);
  System.out.print(num+" * 4 = ");  num=num*4;  System.out.println(num);
  System.out.print(num+" * 5 = ");  num=num*5;  System.out.println(num);
  System.out.print(num+" * 6 = ");  num=num*6;  System.out.println(num);
  System.out.print(num+" * 7 = ");  num=num*7;  System.out.println(num);
  System.out.print(num+" * 8 = ");  num=num*8;  System.out.println(num);
  System.out.print(num+" * 9 = ");  num=num*9;  System.out.println(num);
  System.out.print(num+" * 10 = "); num=num*10; System.out.println(num);*/
    }
 ///////////////////////////////////////////////////////////////////////////////////////////////////   
    void f(){
int i;
for (i=0;i<10;i++){
        System.out.println("="+i);
        if(i%3==0)
            break;
    }
System.out.println(i);}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
void ii(int p){
  p=10; 
   System.out.println("="+p);
}
public void A(int size){
    System.out.println("size entre 1 to 3");
    
    if(size<4&size>0){
        System.out.println("bien");
    }else{
        System.out.println("shit" );
    }
     System.out.println(size );
}
    Scanner scanner = new Scanner( System.in );
public void B(){
    System.out.println("size entre 1 to 3 :");
    int size =scanner.nextInt();
   
   // size =scanner.nextInt();
    if(size<4&&size>0){
        System.out.println("bien");
    }else{
         System.out.println("Try agains" );
    } 
    
     //System.out.println(size );
}

  static void myMethod() {
    System.out.println("I just got executed!");
  }






 //////////////////////////////////////////////////////////////////////////////////////////////////////
 //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new Scanner( System.in );
            
            
        Prepa p = new Prepa(2);
        myMethod();
        
        p.ii(12);
        //  p.p();
          p.p2();
        //p.f();
       // p.A(2);
       // p.A(6);
     /////////////////////////////////   
        /*  int size=0;
    System.out.println("size entre 1 to 3");
    size =scanner.nextInt();
    if(size<4&size>0){
        System.out.println("bien");
    }else if(size>4){
        System.out.println("shit" );
         System.out.println("size agin" );
            
    }else{
         System.out.println("merde" );
         
    }*/
    // System.out.println(size );
    /////////////////////////////////////////////    ////////////////////////////////////////
        /* int size;
     do{
        
    System.out.println("size entre 1 to 3");
    size =scanner.nextInt();
    if(size<4&&size>0){
        System.out.println("bien");
    }else{
         System.out.println("Try agains" );
    } 
    
     }while(size>3);   */
        
           ///////////////////////////////////////////////////////////////////////////////////////// 
/*String txt = "Hello";
System.out.println(txt.toUpperCase());


String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));


String txts = "Hello Everybody";
System.out.println(txts.indexOf("e"));

int x = 5;
int y = 10;
//Math.max(x,y);
System.out.println(Math.max(x,y));
System.out.println(Math.random());// Math.random();

for (int i = 0; i < 5;i++ ) {
  System.out.println("yes");
}
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(cars[1]);
}

for (int i = 0; i < 10; i++) {
  if (i == 4) {
   continue ;
  }
  System.out.println(i);      
}*/

/*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
           System.out.println("//////");
String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < car.length; i++) {
  System.out.println(car[i]);
}*/

//System.out.println("enter number");
        
 int num;
       /* for(num = scanner.nextInt();num<11;num++){
        System.out.println("number"+num);}*/
 
        
        
        

        
        /*num+=10;
        System.out.println("number"+num);
        System.out.println("////////////////////////////");*/
        
  //int nums = scanner.nextInt();   
 // int nums=num;
       /*  System.out.println("enter number");
         int num = scanner.nextInt();
         for(int i=1;i<=10;i++)
             System.out.println(num+" * "+i+" = "+(num*i));*/
 /**System.out.println("enter number");
          num = scanner.nextInt();
         
            
         //int i = 0;
       // while(num<i){
      
         for( int i=1;i<num;i++)
            // num=num+i;
             System.out.println((num+i));
   // }/*
         
         ///////////////////////////////////////////////////////////////////////////////
/*System.out.println("enter number agants");
         num = scanner.nextInt();
 System.out.println(num+" * 1 = "+(num*1)); // System.out.print(num);
  System.out.println(num+" * 2 = "+(num*2));   // System.out.println(num);
  System.out.println(num+" * 3 = "+(num*3));  //  System.out.println(num);
  System.out.println(num+" * 4 = "+(num*4));   // System.out.println(num);
  System.out.println(num+" * 5 = "+(num*5));   // System.out.println(num);
  System.out.println(num+" * 6 = "+(num*6));   // System.out.println(num);
  System.out.println(num+" * 7 = "+(num*7));   // System.out.println(num);
  System.out.println(num+" * 8 = "+(num*8));   // System.out.println(num);
  System.out.println(num+" * 9 = "+(num*9));    //System.out.println(num);
  System.out.println(num+" * 10 = "+(num*10));  // System.out.println(num);*/

  //  System.out.println("number");
 /* switch(num){
      
      case 1:num=num*1; System.out.println(num+" * 1 = ");
          break;
          case 2: System.out.println(num+" * 2 = "+nums);num=num*2;
              break;
  }   */  
       //System.out.println(num);
        
        
        //p.p();
 p.B();
     System.out.println("entre nembre");
 int child = scanner.nextInt();
       /*switch(child){
            case 14:if(child>=12) System.out.println("poussin");
                break;
            default:System.out.println("none");
        }
        */
       
 int day=4;

      if(child>=6&&child<8){
     System.out.println("poussin");
     }else if(child>=8&&child<10){
         System.out.println("pupille");
         
     }else if(child>=10&&child<10){
         System.out.println("minime");
               switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
     }else if(child>=12){
         System.out.println("cadet");
               switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
     }
     else{
        System.out.println("enter betwen 6 and 12");
        switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
    }
int x = 5;
    x &= 3;
    System.out.println(x);
  Prepa b = new prepa2(6);
}
}



