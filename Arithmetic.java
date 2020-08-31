package fractionarithmetic;

import fractionarithmetic.Fraction;


public class Arithmetic {

  public static void main(String[] args) {
   Fraction f1, f2,f;
   f1= new Fraction();
   f2= new Fraction();
   f = new Fraction();
  f=f1.add(f2);
   System.out.println(f.getFraction());
  f=f1.sub(f2);
   System.out.println(f.getFraction()); 
  }
}
  class Fraction {
   private int num;
   private int denum;

   public Fraction()

   {
     this(0,1);
   }
   public Fraction(int num)
   
   {
     this(num,1);
   }
   public Fraction(int num,int denum)
                
   {
     this.num=num;
     this.denum=denum;
     
     
   
   }
   
   
   public Fraction add(Fraction f)
   {
     Fraction temp;
     temp = new Fraction();      temp.num=this.num*f.denum+
                         f.num*this.denum;
     temp.denum=this.denum*f.denum;
     return temp;
   }
   public Fraction sub(Fraction f)
   {
   Fraction temp;
   temp = new Fraction();
      temp.num=this.num*f.denum-f.num*this.denum;
     temp.denum=this.denum*f.denum;
     return temp;
   }
   public Fraction mul(Fraction f)
   {
      Fraction temp;
      temp = new Fraction();
      temp.num=this.num*f.num;
     temp.denum=this.denum*f.denum;
     return temp;
   }
   public Fraction div(Fraction f)
   {
      Fraction temp;
      temp = new Fraction();
      temp.num=this.num*f.denum;
     temp.denum=this.denum*f.num;
     return temp;
   }
   
   
   public int limit()
   {
     int n=0,dn=0;
     
     if (num<0)
     n=-num;
     else
     n=num;
     
     if(denum<0)
     dn=-denum;
     else
     dn=denum;
     
     if (n>dn)
     return n;
     else
     return dn;
   }
   
   public String getFraction()
   { 
   
   int dn=0,n=0;

     for(int i=1;i<=limit();i++)
     {
       if (num%i==0&&denum%i==0)
      {
       n=num/i;
       dn=denum/i;
       }  
       
     }
 
    if(dn==0)
     return "error! zero can't be denum";
    else if(dn==1)
     return Integer.toString(n);
    else
     return n+"/"+dn;
     
   }
   
}
