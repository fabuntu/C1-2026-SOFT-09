package com.mycompany.tiendita;

import javax.swing.JOptionPane;

public class MenuPrin {
    Control_Empleados inicio=new Control_Empleados();
    public void MostrarMenuPrin(){
    inicio.HabilitarPersonal();
    inicio.inicializarArregloClientes();
    boolean Continuar=true;
    while(Continuar==true){
        int opc=Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenido al menú Principal "+"\n"+"Ingrese el número de la opción que desea realizar: "+"\n"+"1.Iniciar Sesión"+"\n"+"2.Registrar Usuario"+"\n"+"3.Salir del Programa"));
        switch(opc){
            case 1:
                inicio.Login();
                break;
            case 2:
                inicio.Registrar_Empleado();
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Saliendo del Programa");
                Continuar=false;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Ingrese una opción válida");
                break;
        }
    }
    }
     
}
