public class Time {
    
    String nome;
    int golsPorPartida;

    public Time(String nomeTime ){
        this.nome = nomeTime ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    };

    public int getGolsPorPartida() {
        return golsPorPartida;
    }

    public void setGolsPorPartida(int golsPorPartida) {
        this.golsPorPartida = golsPorPartida;
    }


}
