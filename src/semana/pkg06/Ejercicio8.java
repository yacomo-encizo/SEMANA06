/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg06;

/**
 *
 * @author HP
 */
public class Ejercicio8 {
    //by aulaenlanube.com
public static void main(String[] args)
{
    //numero a invertir
    int n = 1234;
    inv(n);
}
//método que dado un número, lo imprime por pantalla invertido
//ejemplo: n = 1234 -> 4321
static void inv(int n)
{
    if(n<10) System.out.print(n);
    else
    {
        System.out.print(n%10);
        inv(n/10);
    }
}
    
}
