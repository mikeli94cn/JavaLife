package javalife.fun_program_100;

public class Pyramid0101 {
    
    static void truePyramid(){
        //total 5 lines
        for(int i=1;i<=5;i++)
        {
            //for each line,print fill-in blanks . Blanks number is 5-line_number
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            //each line has 2*line_number stars
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
    }

    static void invertedPyramid(){
        for(int i=5;i>=1;i--){
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void rightAnglePyramid(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
    
    public static void main(String[] args) {
        truePyramid();
        invertedPyramid();
        rightAnglePyramid();
    }
}
