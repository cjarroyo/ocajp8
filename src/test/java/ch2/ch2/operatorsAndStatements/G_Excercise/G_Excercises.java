package ch2.ch2.operatorsAndStatements.G_Excercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class G_Excercises {

    @Test
    public void cuatro() {

        long x = 10;
        int y = (int) (2 * x);

    }

    @Test
    public void cinco() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(14);

        for (int x : list) {
            System.out.print(x + ", ");
            break;
        }
    }


    @Test
    public void seis(){
        int x = 4;
        long y = x * 4 - x++;

        if (y<10) System.out.println("Too Low");
        else System.out.println("Just Right");
        //else System.out.println("Too High");
    }

    @Test
    public void nueve(){
        for(int i = 0; i<10; ){
            i = i++;
            System.out.println("Hello World");
        }

    }

    @Test
    public void diez(){
        byte a = 40, b = 50;
        byte sum = (byte) ((byte) a + b);
        System.out.println(sum);

    }

    @Test
    public void doce(){
        int x = 0;
        String s = null;
       /* if (x == s)
            System.out.println("");*/
    }

    @Test
    public void trece(){
        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        if(b = true)
            System.out.println("Success");
        else
            System.out.println("Failure");

    }

    @Test
    public void quince(){
        int x = 1, y = (int)15L;

    }

    @Test
    public void dieznueve(){
        int m = 9, n = 1, x = 0;
        while(m > n){
            m--;
            n += 2;
            x += m + n;
        }
        System.out.println(x);

    }

    @Test
    public void veinte(){
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade){
            case a :
            case 'B': System.out.println("great");
            case 'C': System.out.println("good");break;
            case d:
            case 'F':System.out.println("not good");
        }
    }

}
