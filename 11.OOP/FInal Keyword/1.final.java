package Final;

public class Final1 {

    final String UNIVERSITY_NAME = "PEC";
    final int fees; //final blank variable
    final static int id; //final static blank variable

    Final1() {

        fees = 60000;

    }

    static {

        id = 15;

    }

    final void display() {

        System.out.println("Versity: " + UNIVERSITY_NAME);
        System.out.println("FEE: " + fees);
        System.out.println("ID: " + id);

    }

}

class final2 extends Final1{

    //display() inherited
    
    void display1(){
    
        System.out.println("Extended");
    
    }

}

class main{

    public static void main(String[] args) {
       
        final2 obj = new final2();
        obj.display();
        obj.display1();
        
    }

}

