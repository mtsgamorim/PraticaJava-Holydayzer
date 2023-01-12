
public class Calendario {
    private Feriados[] feriados = new Feriados[11];

    void addFeriados() {
        feriados[0] = new Feriados("01/01/2023", "Confraternização mundial");
        feriados[1] = new Feriados("21/02/2023", "Carnaval");
        feriados[2] = new Feriados("17/04/2023", "Páscoa");
        feriados[3] = new Feriados("21/04/2023", "Tiradentes");
        feriados[4] = new Feriados("01/05/2023", "Dia do trabalho");
        feriados[5] = new Feriados("08/06/2023", "Corpus Christi");
        feriados[6] = new Feriados("07/09/2023", "Independência do Brasil");
        feriados[7] = new Feriados("12/10/2023" , "Nossa Senhora Aparecida");
        feriados[8] = new Feriados("02/11/2023", "Finados");
        feriados[9] = new Feriados("15/11/2023", "Proclamação da República");
        feriados[10] = new Feriados("25/12/2023", "Natal");
    }
    

    void temFeriado(String data) {
        for(int i = 0; i < feriados.length; i++) {
            if(feriados[i].getData().equals(data)) {
                System.out.println("Feriado: " + feriados[i].getNome() + " Data: " + feriados[i].getData());
                return;
            }
        }
        System.out.println("Não existe feriado na data " + data);
    }

    public Feriados[] getFeriados() {
        return feriados;
    }

    
}