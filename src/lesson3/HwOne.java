package lesson3;

import static java.lang.Math.pow;

public class HwOne {
    public static void main(String[] args) {
        double[] radius = {1, 0.5, 0.2};
//        radius[0] = 1;
//        radius[1] = 0.5;
//        radius[2] = 0.2;
        double[] weight = new double[3];
        double density = 0.7;
        double Pi = 3.141592653589793238462643;


        for (int i = 0; i < 3; i++) {
            weight[i]=density*(4 * Pi * pow(radius[i]*100, 3))/3;
        }
        double mass=(weight[0]+weight[1]+weight[2])/1000;
        System.out.println("snowman mass = "+mass+" kilo");
    }
}
