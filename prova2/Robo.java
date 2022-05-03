package prova2;

public class Robo {

    private int max_x = 7, max_y = 7, x = 0, y = 0;
    private String direcao;
    
    public Robo(){}

    public String girarPara(String direcao){

        this.direcao = direcao; 

        if (direcao != "N" && direcao != "S" && direcao != "L" && direcao != "O") {

        System.out.println("Direção inválida");
                
        }

        return direcao;

    }

    public void mostrarPosicao(){

        System.out.println("Sua posição é X: " + x + " Y: " + y);

    }

    public void andar(){

        int andou;

        for(int i = 0; i < 6; i++){

            andou = i;

            if (andou == 1) {

                break;
                
            }

            if (x >= max_x || y >= max_y) {

                System.out.println("Distância máxima excedida");

                break;
                   
            }

           switch (direcao) {
               case "N":

               y++;
                   
                   break;

               case "S":

               y--;
                   
                   break;

               case "L":

               x++;
                   
                   break;
               
               case "O":

               x--;
                   
                   break;    
           
               default:
                   break;
           }


        }
        
    }

}