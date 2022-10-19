/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg06;

/**
 *
 * @author HP
 */
public class Ejercicio1 {
    //by aulaenlanube.com
public static void main(String[] args)
{
    //llamada para obtener la suma de 5
    System.out.println(sum(4));
}
//método que devuelve la suma de los elementos desde n hasta 1
//ejemplo: n = 4 -> 4+3+2+1=10
static int sum(int n)
{
    //caso base
    if(n==1)
        return 1;

    //llamada recursiva
    else
        return n+sum(n-1);
}
    
}
