package function_returns;

/**
 * Construir un método que retorne un tipos primitivo y String
 * Utilizando Replit Crea una clase con un método main, luego crea varios métodos y cada uno debe de retornar
 * el valor del tipo de los 8 datos primitivos, también adicional crear otro método que retorne valor del tipo
 * Objeto String, posterior a todos los métodos dentro del método main.
 */
public class Primitive_types {
    public static void main(String[] args) {
    Primitive_types operation=new Primitive_types();
        System.out.println(operation.number1());
        System.out.println(operation.number2((short) 5));
        System.out.println(operation.number3());
        System.out.println(operation.number4());
        System.out.println(operation.number5());
        System.out.println(operation.number6());
        System.out.println(operation.number7());
        System.out.println(operation.number8());
        System.out.println(operation.number9());



    }
    byte number1 ( ){

        return 127;

    }
    short number2 (short n1){
     short add = n1 ;
     return add;
    }
    int number3(){

        return 5+5;
    }
    long number4 (){
        return 1222222225 + 589999996;
    }
    float number5(){
        return 8589.6f;
    }
    double number6(){
        return 4545454.2;
    }
    char number7(){
        return 2;
    }
    boolean number8(){
        return false;
    }
    String number9(){
        return "jirman roriguez";
    }

}
