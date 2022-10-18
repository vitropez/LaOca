
import java.util.Scanner;

/**
 *
 * @author yagoa
 */
public class laOca {

    static int dado;
    static int posada1;
    static int posada2;
    static int posada3;
    static int posada4;
    static int prision1;
    static int prision2;
    static int prision3;
    static int prision4;

    static int tirarDado() {
        dado = (int) (Math.random() * 6 + 1);
        return dado;
    }

    static int moverFichaOca(int casilla) {

        switch (casilla) {
            case 1, 5,14,23,32,41,50,59 -> {
                System.out.println("DE OCA A OCA Y TIRO PORQUE ME TOCA");
                casilla = casilla + 4;

                volverAJugar();
                dado = tirarDado();
                casilla = casilla + dado;
                System.out.println("EN ESTA TIRADA HA SACADO UN " + dado);

            }
            case 19,18,27,36,45,54 -> {
                System.out.println("DE OCA A OCA Y TIRO PORQUE ME TOCA");

                casilla = casilla + 5;
                volverAJugar();
                dado = tirarDado();

                casilla = casilla + dado;
                System.out.println("EN ESTA TIRADA HA SACADO UN " + dado);

            }
            case 63 -> {
                System.out.println("DE OCA A OCA Y TIRO PORQUE ME TOCA");

                volverAJugar();
                dado = tirarDado();
                //casilla = casilla + dado;
                System.out.println("EN ESTA TIRADA HA SACADO UN " + dado);
            }

        }
        return casilla;
    }

    static int players;

    public static void main(String[] args) {
        Scanner numJugadores = new Scanner(System.in);
        System.out.println("INTRODUCE NUMERO DE USUARIOS");
        int players = numJugadores.nextInt();
        int juegoTerminado = 0;
        int casillaJugador1 = 0;
        int casillaJugador2 = 0;
        int casillaJugador3 = 0;
        int casillaJugador4 = 0;

        int ocaOca;
        int i;

        int[] jugador = new int[players];

        for (i = 0; i < jugador.length; i++) {
            jugador[i] = i + 1;
        }

        while (casillaJugador1 != 63) {
            for (i = 0; i < players; i++) {

                switch (jugador[i]) {

                    case 1 -> {
                       
                        int casilla;

                        System.out.println("***********************************");
                        System.out.println("***********jugador1****************");
                        if (casillaJugador1 == 19) {
                            System.out.println("ESTÁ EN LA POSADA");
                            posada1++;
                        }
                        if (casillaJugador1 == 56) {
                            System.out.println("ESTÁ EN LA PRISIÓN");

                            prision1++;

                        }
                        
                        if ((posada1 >2) && (prision1>3)){
                            dado = volverAJugar();

                            System.out.println("EN ESTA TIRADA HA SACADO UN " + dado);

                            casillaJugador1 = casillaJugador1 + dado;
                        }
                        if (casillaJugador1 == 1 || casillaJugador1 == 5 || casillaJugador1 == 9 || casillaJugador1 == 14 || casillaJugador1 == 18
                                || casillaJugador1 == 23 || casillaJugador1 == 27 || casillaJugador1 == 32 || casillaJugador1 == 36 || casillaJugador1 == 41
                                || casillaJugador1 == 45 || casillaJugador1 == 50 || casillaJugador1 == 54 || casillaJugador1 == 63) {
                            ocaOca = moverFichaOca(casillaJugador1);

                            casillaJugador1 = ocaOca;
                            if ((casillaJugador1==6) ||(casillaJugador1==12)){
                                 casilla=casillaJugador1;
                              casillaJugador1=puente(casilla);
                        }  
                        }

                        System.out.println("ESTA EN LA CASILLA " + casillaJugador1);
                        cambiarJugador(i);
                    }

                    case 2 -> {
                        
                        int casilla=0;
                        System.out.println("***********************");
                        System.out.println("***********jugador2****************");
                        if (casillaJugador2 == 19) {
                            System.out.println("ESTÁ EN LA POSADA");
                            posada2++;
                        }
                        if (casillaJugador2 == 56) {
                            System.out.println("ESTÁ EN LA PRISIÓN");

                            prision2++;
                        }
                       
                   if ((posada2>2) && (prision2 >3)) {
                            dado = volverAJugar();

                            System.out.println("EN ESTA TIRADA HA SACADO UN " + dado);
                            casillaJugador2 = casillaJugador2 + dado;

                            if (casillaJugador2 == 1 || casillaJugador2 == 5 || casillaJugador2 == 9 || casillaJugador2 == 14 || casillaJugador2 == 18
                                    || casillaJugador2 == 23 || casillaJugador2 == 27 || casillaJugador2 == 32 || casillaJugador2 == 36 || casillaJugador2 == 41
                                    || casillaJugador2 == 45 || casillaJugador2 == 50 || casillaJugador2 == 54 || casillaJugador2 == 63) {
                                ocaOca = moverFichaOca(casillaJugador2);

                                casillaJugador2 = ocaOca;
                            }
                            if ((casillaJugador2==6) ||(casillaJugador2==12)){
                                 casilla=casillaJugador2;
                              casillaJugador2=puente(casilla);
                        }
                        }
                        System.out.println("ESTA EN LA CASILLA " + casillaJugador2);
                        cambiarJugador(i);
                    }

                    case 3 -> {
                       
                        int casilla=0;
                        System.out.println("***********************************");
                        System.out.println("***********jugador3****************");
                        if (casillaJugador3 == 19) {
                            System.out.println("ESTÁ EN LA POSADA");
                            posada3++;
                        }
                        if (casillaJugador3 == 56) {
                            System.out.println("ESTÁ EN LA PRISIÓN");

                            prision3++;

                        }
                         
                        if ((posada3 >2) && (prision3 >3)) {
                            dado = volverAJugar();

                            System.out.println("EN ESTA TIRADA HA SACADO UN " + dado);
                            casillaJugador3 = casillaJugador3 + dado;
                            if (casillaJugador3 == 1 || casillaJugador3 == 5 || casillaJugador3 == 9 || casillaJugador3 == 14 || casillaJugador3 == 18
                                    || casillaJugador3 == 23 || casillaJugador3 == 27 || casillaJugador3 == 32 || casillaJugador3 == 36 || casillaJugador3 == 41
                                    || casillaJugador3 == 45 || casillaJugador3 == 50 || casillaJugador3 == 54 || casillaJugador3 == 63) {
                                ocaOca = moverFichaOca(casillaJugador3);
                                casillaJugador3 = ocaOca;
                             if ((casillaJugador3==6) ||(casillaJugador3==12)){
                                 casilla=casillaJugador3;
                              casillaJugador3=puente(casilla);   
                            }
                        }
                        }
                        System.out.println("ESTA EN LA CASILLA " + casillaJugador3);
                        
                        cambiarJugador(i);
                    }

                    case 4 -> {
                       
                        int casilla=0;

                        System.out.println("***********************************");
                        System.out.println("***********jugador4****************");

                        if (casillaJugador4 == 19) {
                            System.out.println("ESTÁ EN LA POSADA");
                            posada4++;
                        }
                        if (casillaJugador4 == 56) {
                            System.out.println("ESTÁ EN LA PRISIÓN");

                            prision4++;
                        }
                       
                        if ((posada4 >2) && (prision4 >3)) {
                            dado = volverAJugar();

                            System.out.println("EN ESTA TIRADA HA SACADO UN " + dado);
                            casillaJugador4 = casillaJugador4 + dado;
                            if (casillaJugador4 == 1 || casillaJugador4 == 5 || casillaJugador4 == 9 || casillaJugador4 == 14 || casillaJugador4 == 18
                                    || casillaJugador4 == 23 || casillaJugador4 == 27 || casillaJugador4 == 32 || casillaJugador4 == 36 || casillaJugador4 == 41
                                    || casillaJugador4 == 45 || casillaJugador4 == 50 || casillaJugador4 == 54 || casillaJugador4 == 63) {
                                ocaOca = moverFichaOca(casillaJugador4);

                                casillaJugador4 = ocaOca;
                                if ((casillaJugador4==6) ||(casillaJugador4==12)){
                                 casilla=casillaJugador2;
                              casillaJugador4=puente(casilla);
                            }
                            }
                            System.out.println("ESTA EN LA CASILLA " + casillaJugador4);
                            i = cambiarJugador(i);
                        }

                    }

                }

            }

        }
    }

    static int cambiarJugador(int j) {
        if (j == players - 1) {
            j = 0;
        } else {
            j++;
        }
        return j;
    }

    static int volverAJugar() {

        Scanner miTurno = new Scanner(System.in);
        System.out.println("PRESIONA CUALQUIER TECLA PARA TIRAR EL DADO");
        String tirada = miTurno.nextLine();
        if (tirada != null) {
            dado = tirarDado();
        }

        return dado;

    }
    static int puente(int casilla){
        if(casilla==6){
            System.out.println( "DE PUENTE A PUENTE Y TIRO PORQUE ME LLEVA LA CORRIENTE");
            casilla=12;
        }
          if(casilla==12){
            System.out.println( "DE PUENTE A PUENTE Y TIRO PORQUE ME LLEVA LA CORRIENTE");
            casilla=6;         
    }
 return casilla;
    }
}
