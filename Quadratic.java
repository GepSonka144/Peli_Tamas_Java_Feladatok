public class Quadratic {
    public static void main(String[] args) {
        System.out.println(QuadraticSolver(2, -1, -3));
    }


    public static String QuadraticSolver(double a, double b, double c){

        double D = (b*b) - 4 * a * c;
        if(D > 0 ){
            double x1 = (b + Math.sqrt(D))/(2*a);
            double x2 = (b - Math.sqrt(D))/(2*a);

            return "Az egyenlet megoldása: x1 = " + x1 + " , x2 = " + x2;
        }
        else if(D == 0){
            double x1 = (b + Math.sqrt(D))/(2*a);
            return "Az egyenlet megoldása: x = " + x1;

        }
        else{
            return "Az egyenletnek nincs megoldása";
        }


    }
}
