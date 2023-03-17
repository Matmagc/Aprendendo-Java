package Pilhas;

public class No {

    private int dado;
    private No reno = null;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getReno() {
        return reno;
    }

    public void setReno(No reno) {
        this.reno = reno;
    }

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }

    

    
    
}
