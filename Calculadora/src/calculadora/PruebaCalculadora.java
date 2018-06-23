public class PruebaCalculadora {
    public static void main(String[] args) throws IOException{
        BufferedReader ing = new BufferedReader(new InputStreamReader(System.in)); 
        try{
            
            double opcion,x,y,result;
            Calculadora cal = new Calculadora();

            System.out.println("Calculadora aritmetica basica");
            System.out.println("Ingresa la operación que desean realizar de acuerdo a las siguientes opciones: ");
            System.out.printf("Teclea 1 para realizar una suma%nTeclea 2 para realizar una resta%n"
                    + "Teclea 3 para realizar una multiplicación%nTeclea 4 para realizar una división%n"
                    + "Tu opción: ");
            
            opcion = Double.parseDouble(ing.readLine());
            
            System.out.println("Dame el primer numero: ");
            x = Double.parseDouble(ing.readLine());
            cal.setX(x);
            
            System.out.println("Dame el segundo numero: ");
            y = Double.parseDouble(ing.readLine());
            cal.setY(y);
            
            //Llama al metodo sumar
            if(opcion==1){
                result = cal.sumar();
                System.out.println("El resultado de la suma es: " + result);              
            }
            //Llama al metodo restar
            if(opcion==2){
                result = cal.restar();
                System.out.println("El resultado de la resta es: " + result);  
            }
            //Llama al metodo multiplicar
            if(opcion==3){
                result = cal.multiplicar();
                System.out.println("El resultado de la multiplicacion es: " + result);  
            }
            //Llama al metodo dividir
            if(opcion==4){
                result = cal.dividir();
                System.out.println("El resultado de la division es: " + result);                  
            }
            
        }
        catch (IOException ex){
            System.out.println(ex);    
        }
    }
}
