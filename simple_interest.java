public class simple_interest {

        double P=1000.0;
        double r=2.5;
        int t=2;
    double ar;
    public static void main(String args[]){
        simple_interest s=new  simple_interest();
        s.ar=(s.P*s.r*s.t)/100;
        System.out.println("simple_interest:"+s.ar);
    
}
}
