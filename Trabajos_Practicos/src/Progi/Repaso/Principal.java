package Progi.Repaso;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int dia, mes, año;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el dia: ");
        dia = sc.nextInt();
        System.out.println("Digite el mes: ");
        mes = sc.nextInt();
        System.out.println("Digite el año: ");
        año = sc.nextInt();

        if ((dia >= 1) && (dia <= 30)){
            if ((mes >= 1) && (mes <= 12)){
                if (año != 0){
                    System.out.println("FECHA CORRECTA");

                } else {
                    System.out.println("El año es incorrecto");
                }
            }else {
                System.out.println("El mes en incorrecto");
            }

        } else {
            System.out.println("El dia es incorrecto");
        }

        int dia1, mes1, año1;

        System.out.println("Digite el dia: ");
        dia1 = sc.nextInt();
        System.out.println("Digite el mes: ");
        mes1 = sc.nextInt();
        System.out.println("Digite el año: ");
        año1 = sc.nextInt();

        if (mes1 == 2){
            if (dia1 >= 1 && dia1 <= 28){
                if(mes1 == 2){
                    if (año1 != 0){
                        System.out.println("La fecha es correcta: " +dia1+ "-" +mes1+ "-" +año1);
                    }
                    else {
                        System.out.println("La fecha es incorrecta, año incorrecto: " +dia1+ "-" +mes1+ "-" +año1);
                    }
                }
                else {
                    System.out.println("La fecha es incorrecta, mes incorrecto: " +dia1+ "-" +mes1+ "-" +año1);
                }
            }
            else {
                System.out.println("La fecha es incorrecta, dia incorrecto " +dia1+ "-" +mes1+ "-" +año1);
            }

        }
        else if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11){
            if (dia1 >= 1 && dia1 <= 30){
                if(mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11){
                    if (año1 != 0){
                        System.out.println("La fecha es correcta: " +dia1+ "-" +mes1+ "-" +año1);
                    }
                    else {
                        System.out.println("La fecha es incorrecta, año incorrecto: " +dia1+ "-" +mes1+ "-" +año1);
                    }
                }
                else {
                    System.out.println("La fecha es incorrecta, mes incorrecto: " +dia1+ "-" +mes1+ "-" +año1);
                }
            }
            else {
                System.out.println("La fecha es incorrecta, dia incorrecto " +dia1+ "-" +mes1+ "-" +año1);
            }

        }
        else if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12){
            if (dia1 >= 1 && dia1 <= 31){
                if(mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12){
                    if (año1 != 0){
                        System.out.println("La fecha es correcta: " +1+ "-" +mes1+ "-" +año1);
                    }
                    else {
                        System.out.println("La fecha es incorrecta, año incorrecto: " +dia1+ "-" +mes1+ "-" +año1);
                    }
                }
                else {
                    System.out.println("La fecha es incorrecta, mes incorrecto: " +dia1+ "-" +mes1+ "-" +año1);
                }
            }
            else {
                System.out.println("La fecha es incorrecta, dia incorrecto " +dia1+ "-" +mes1+ "-" +año1);
            }
        }

    }

    /* int dia,mes,año;
   dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
   mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
   año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
   if(año >= 1){
    if (dia >= 1){
     if (mes >= 1 && mes <= 12){
      if (mes == 2 && dia <= 28){
      JOptionPane.showMessageDialog(null,"Fecha correcta :D");}
      else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)&&(dia <= 30)){
      JOptionPane.showMessageDialog(null,"Fecha correcta :D");}
      else if ((mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 10 || mes == 12  )&&(dia <= 31)){
      JOptionPane.showMessageDialog(null,"Fecha correcta :D");}
      else {JOptionPane.showMessageDialog(null,"-----ERROR-----\nDia incorrecto");}
    }
     else {JOptionPane.showMessageDialog(null,"-----ERROR-----\nMes incorrecto");}
   }
   else {JOptionPane.showMessageDialog(null,"-----ERROR-----\nDia incorrecto");}
   }
   else {JOptionPane.showMessageDialog(null,"-----ERROR-----\nAño incorrecto");}
  }*/

}

