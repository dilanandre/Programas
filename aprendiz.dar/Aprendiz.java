public class Main {

    public static void main(String[] args) {
    Aprendiz aprendiz1 = new Aprendiz(876543, "daniel15@gmail.com");
    aprendiz1.dis = 0;
    aprendiz1.edad = 25;
    System.out.println(aprendiz1.id);
    System.out.println(aprendiz1.email);
    System.out.println(aprendiz1.dis);
    System.out.println(aprendiz1.edad);
    
    Aprendiz aprendiz2 = new Aprendiz(7856, "cristian01@gmail.com");
    aprendiz2.dis = 1;
    aprendiz2.edad = 20;
    System.out.println(aprendiz2.id);
    System.out.println(aprendiz2.email);
    System.out.println(aprendiz2.dis);
    System.out.println(aprendiz2.edad);
    
    Aprendiz aprendiz3 = new Aprendiz(1111, "leiner43@gmail.com");
    aprendiz3.dis = 1;
    aprendiz3.edad = 19;
    System.out.println(aprendiz3.id);
    System.out.println(aprendiz3.email);
    System.out.println(aprendiz3.dis);
    System.out.println(aprendiz3.edad);
    
    Aprendiz aprendiz4 = new Aprendiz(9879, "12stiven@gmail.com");
    aprendiz4.dis = 1;
    aprendiz4.edad = 17;
    System.out.println(aprendiz4.id);
    System.out.println(aprendiz4.email);
    System.out.println(aprendiz4.dis);
    System.out.println(aprendiz4.edad);
    
    Aprendiz aprendiz5 = new Aprendiz(2314, "Maria55@gmail.com");
    aprendiz5.dis = 0;
    aprendiz5.edad = 20;
    System.out.println(aprendiz5.id);
    System.out.println(aprendiz5.email);
    System.out.println(aprendiz5.dis);
    System.out.println(aprendiz5.edad);
    }
    }
    
           class Aprendiz{
            int id;
            String email;
            int dis;
            int edad;
           
    
            Aprendiz(int id, String email) {
            this.id = id;
            this.email = email;
     }
    }