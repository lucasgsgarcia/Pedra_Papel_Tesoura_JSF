package dados;

import beans.CounterBean;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;


@ManagedBean(name = "gameMechanic")
@SessionScoped
public class gameMechanic {
    
    @Inject
    CounterBean contador;
    
    public String jogada;
    public String resultado;
    public String jogadaPc;

    public gameMechanic() {
    }

    public gameMechanic(String jogada, String resultado, String jogadaPc) {
        this.jogada = jogada;
        this.resultado = resultado;
        this.jogadaPc = jogadaPc;
    }
    
    @PostConstruct
    public void iniciar(){
        int x = contador.getCounter();
    }

    public CounterBean getContador() {
        return contador;
    }

    public void setContador(CounterBean contador) {
        this.contador = contador;
    }
    
    public int getCount(){
        return contador.getCounter();
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getJogadaPc() {
        return jogadaPc;
    }

    public void setJogadaPc(String jogadaPc) {
        this.jogadaPc = jogadaPc;
    }
    
    

    public String getJogada() {
        return jogada;
    }

    public void setJogada(String jogada) {
        this.jogada = jogada;
    }
    
    public String getJogarPc(){
        Random rand = new Random();
        int jogadaPcInt = rand.nextInt(3);
        switch (jogadaPcInt) {
                case 0:
                    jogadaPc =  "Pedra";
                    break;
                case 1:
                    jogadaPc =  "Papel";
                    break;
                case 2:
                    jogadaPc =  "Tesoura";
                    break;
                default:
                    break;
            }
        return jogadaPc;
    }
    
    
    public String getJogar(){
        contador.inc();
        String jgPc = getJogadaPc();
        if (null != jogada)
        switch (jogada) {
            case "Pedra":
            switch (jgPc) {
                case "Pedra":
                    resultado =  "Empate";
                    break;
                case "Papel":
                    resultado =  "Derrota!";
                    break;
                case "Tesoura":
                    resultado =  "Vitória!";
                    break;
                default:
                    break;
            }
                break;

            case "Papel":
            switch (jogadaPc) {
                case "Pedra":
                    resultado =  "Vitória!";
                    break;
                case "Papel":
                    resultado =  "Empate";
                    break;
                case "Tesoura":
                    resultado =  "Derrota!";
                    break;
                default:
                    break;
            }
                break;

            case "Tesoura":
            switch (jogadaPc) {
                case "Pedra":
                    resultado =  "Derrota!";
                    break;
                case "Papel":
                    resultado =  "Vitória!";
                    break;
                case "Tesoura":
                    resultado =  "Empate";
                    break;
                default:
                    break;
            }
                break;

            default:
                break;
        }
        return resultado;
    }

    
    
}
