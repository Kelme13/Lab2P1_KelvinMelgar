package lab2p1_kelvinmelgar;

import java.util.Scanner;
public class Lab2P1_KelvinMelgar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int usuario;
        
        do{
            System.out.println("1. Maximo Comun Divisor.");
            System.out.println("2. Sumatoria.");
            System.out.println("3. Supermercado");
            System.out.println("4. Salir del programa.");
            System.out.print("Escriba una opcion: ");
            usuario = sc.nextInt();

            if (usuario == 1){
                int n1, n2, a, b, mcd;
                
                System.out.print("\nIngrese el primer numero: ");
                n1 = sc.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                n2 = sc.nextInt();
                
                if (n1 > 0 && n2 > 0){
                    
                    if (n1 == n2){
                        System.out.println("Los numeros son iguales...\n");
                    }
                    else{
                        //Inicializar las var. para el proceso
                        a = n1;
                        b = n2;
                        while(a != b){
                            if( a > b){
                                a = a - b;
                            }
                            else{
                                b = b - a;
                            }

                        }//Fin del ciclo mientras
                        mcd = a;
                        System.out.printf("El MCD de %d y %d es: %d%n%n", n1, n2, mcd);
                        
                        
                    }//Fin de la verificacion igualdad
                    
                    
                }
                else{
                    System.out.println("Numeros deben ser positivos...\n");
                }//Fin de la verificacion
            }//Fin de la primer opcion
            
            else if(usuario == 2){
                int k, n, e;
                float result, potencia;
                
                System.out.print("Ingrese el valor para K: ");
                k = sc.nextInt();
                
                if(k > 0){
                    result = 0;
                    n = 1;
                    while(n <= k){
                        e = 1;
                        potencia = 1;
                        while(e <= n){
                            potencia *= ((double)n / (double)(n+1));
                            e++;
                        }//Para calcular la potencia
                        
                        result += potencia;
                        n++;
                    }
                    
                    System.out.printf("El resultado fue de: %s%n%n", result);
                }
                else{
                    System.out.print("El numero deber ser positivo...\n\n");
                }//FIn de la verificacion de k
                

            }//Fin de la segunda opcion
            else if (usuario == 3){
                int tipo_cl = 5, cant = 0;
                double prec, total, desc, subto;
                
                prec = 0;
                total = 0;
                desc = 0;
                subto = 0;
                
                while(tipo_cl != 0 && tipo_cl !=1 && tipo_cl != 2 ){
                    System.out.print("\nEscriba el tipo de cliente[0, 1, 2]: ");
                    tipo_cl = sc.nextInt();
                }
                
                while(cant <= 0){
                    System.out.print("\nEscriba la cantidad: ");
                    cant = sc.nextInt();
                }
                
                while(prec <= 0){
                    System.out.print("\nEscriba el precio: ");
                    prec = sc.nextDouble();
                }
                
                if (tipo_cl == 0){
                    if (cant >= 10 && cant<= 19){
                        cant = cant - 2;
                    }
                    else if( cant > 20){
                        cant = cant - 5;
                    }
                    
                }
                else if(tipo_cl == 1){
                    if(cant >= 20 && cant <= 29){
                        cant = cant -2;
                    }
                    else if (cant > 30){
                        cant = cant - 5;
                    }
                    
                    desc = 0.10;
                }
                else if(tipo_cl == 2){
                    if(cant >= 30 && cant<=39){
                        cant = cant -2;
                    }
                    else if(cant > 40){
                        cant = cant - 5;
                    }
                    
                    desc = 0.3;
                }
                
                subto = cant * prec;
                desc = subto * desc;
                total = subto - desc;
                
                System.out.println("El total es de: " + total + "\n");
            }//Fin de la tercera opcion
            else if(usuario == 4){
                System.out.println("Saliendo...");
            }
            else{
                System.out.println("Opcion invalida....\n");
            }
            
        }while(usuario != 4);
        
        
    }
    
}
