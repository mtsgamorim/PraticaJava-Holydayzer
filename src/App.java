public class App {
    public static void main(String[] args){
        Calendario calendario = new Calendario();
        calendario.addFeriados();

        Feriados[] todosFeriados = calendario.getFeriados();

        System.out.println(todosFeriados[1].getData());

        calendario.temFeriado("02/01/2023");
        calendario.temFeriado("25/12/2023");


    }
}
