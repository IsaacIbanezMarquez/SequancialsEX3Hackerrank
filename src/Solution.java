import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;





// ENUNCIADO
    /*  Continuant amb l'exemple anterior (https://www.hackerrank.com/contests/sequencials/challenges/dam-mitjana-aritmetica), ara cal que, a més d'introduir les notes de cada UF, cal que introduïu el % de ponderació de cada UF respecte la nota final.

Input Format

Introdueix 4 nombres reals. Introdueix després 4 ponderacions corresponents a cadascuna de les UFs (nombres enters de 0 a 100).

Constraints

Les notes han d'estar en l'interval [0,10] 0.0 <= nota <= 10.0, on nota és qualsevol de les 4 notes introduïdes. Les ponderacions han d'anar de 0 a 100 i totes elles han de sumar 100.

Output Format

Com a resultat s'ha de treure la mitjana artimètica ponderada de les 4 notes. En cas de decimals cal arrodonir la nota fent ús de Math.round() (https://guru99.es/math-java/)

Sample Input 0

5.2
6.0
4.0
3.2
25
25
25
25
Sample Output 0

5
Sample Input 1

5.2
6.0
4.0
3.2
3
95
1
1
Sample Output 1

6

 */





public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double n5 = sc.nextDouble()*0.01;
        double n6 = sc.nextDouble()*0.01;
        double n7 = sc.nextDouble()*0.01;
        double n8 = sc.nextDouble()*0.01;

        double notaFinal = (n1*n5)+(n2*n6)+(n3*n7)+(n4*n8);


        System.out.println(Math.round(notaFinal));


}
}
