public class MyClass {
    public static void main(String args[]) {
        int a=Integer.parseInt(args[0]);
        int c=0;
        
        for(int i=2;i<a/2;i++)
        {
        if(a%i==0){
            
        
            c++;
        }
        
            
        }
        if(c==0){
            System.out.println("pirme number");
        }
        else {
            System.out.println("not prime");
        }
     
    }
}