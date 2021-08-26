
package MyPkg.CH_12.Midterm.review;

public class MyApp {
    public static void main(String[] args){
        double[][] values = {{2,6,0},{6,2,0}};
        System.out.println("The sum is: " + mySum(values));
        
    }
    
    public static double mySum(double[][] theArray){
        double acc=0;
        for(int i=0; i<theArray.length; i++){
            for(int j=0; j<theArray[i].length; j++){
                if(i%2==0){
                    acc+=theArray[i][j];
                }else{
                    acc-=theArray[i][j];
                }
            }
        }
        return acc;
    }
}
