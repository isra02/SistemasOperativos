/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class Ejecuta {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int opcion=0, estado=0;
        do{
            System.out.println("Introduce la opcion que quiera. "+ "\n 1.Crear SS.OO" + "\n 2.Copiar" + "\n 3.Pegar" + "\n 4.Buscar virus"
                    + "\n 5.Pantallazo azul" + "\n 6.Limpiar virus" + "\n 7.Salir");
            opcion= s.nextInt();
            s.nextLine();
            Linux l = null;
            Windows w =null;
            /*
            Mac m = null;
            switch (opcion){
                case 1:{
                    estado=opcion;
                    System.out.println("¿Que version es?");
                    String version= s.nextLine();
                    System.out.println("¿Cual es su ram maxima?");
                    String ram=s.nextLine();
                    System.out.println("¿Cuantos bits tiene?");
                    if(opcion == 1 )  l = new Linux (email, password);
                    else f = new Facebook (email, password);
                }break;
                case 2:{
                    estado=opcion;
                    System.out.println("Email");
                    String email= s.nextLine();
                    System.out.println("Password");
                    String password=s.nextLine();
                    if(opcion == 1 ) t = new Twitter (email, password);
                    else f = new Facebook (email, password); 
                }break;
                case 3:{
                    if (estado==0)System.out.println("Inicia sesión primero");
                    else if (estado==1)
                        System.out.println("Ya tienes " + t.hacerAmigos() + " amigos.");
                    else System.out.println("Ya tienes " + f.hacerAmigos() + " amigos.");
                }break;
                case 4:{
                    if (estado==0)System.out.println("Inicia sesión primero");
                    else if (estado==1)
                        System.out.println("Has eliminado un amigo." + "\n Ahora tienes " + t.eliminarAmigo() + " amigos.");
                    else System.out.println("Has eliminado un amigo." + "\n Ahora tienes " + f.eliminarAmigo() + " amigos.");
                }break; 
                case 5:{
                    if (estado==0)System.out.println("Inicia sesión primero");
                    else if (estado==1){
                        System.out.println("Introduce tu comentario");
                        t.publicar(s.nextLine());
                        System.out.println("Su comentario se ha publicado con éxito");
                    }else{
                        System.out.println("Introduce tu comentario");
                        f.publicar(s.nextLine());
                        System.out.println("Su comentario se ha publicado con éxito");
                    }
                }break;
                case 6:{
                    if (estado==0)System.out.println("Inicia sesión primero");
                    else if (estado==1){
                        System.out.println("Introduce tu comentario");
                        t.publicarConFoto(s.nextLine(),s.nextLine());
                        System.out.println("Su comentario se ha publicado con éxito");
                    }else{
                        System.out.println("Introduce tu comentario");
                        f.publicarConFoto(s.nextLine(),s.nextLine());
                        System.out.println("Su comentario se ha publicado con éxito");
                    }
                }break;
                case 7:{
                    if (estado==0)System.out.println("Inicia sesión primero");
                    else if (estado==1){
                        System.out.println("Email: " + t.getEmail());
                        System.out.println("Tienes " + t.getNumContactos() + " amigos.");
                    }else{
                        System.out.println("Email: " + f.getEmail());
                        System.out.println("Tienes " + f.getNumContactos() + " amigos.");
                    }
                }break;
                case 8:
                    System.out.println("Su sesion se ha cerrado correctamente");break;
                    
            }*/
        }while(opcion!=8);
    }
}
