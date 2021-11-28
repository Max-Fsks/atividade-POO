package POO;

public class Geladeira {

    int tamanho;
    int largura;
    int potencia;
    int garantia;
    String cor;

    public Geladeira(int tamanho, int largura, int potencia, int garantia, String cor) {
        this.tamanho = tamanho;
        this.largura = largura;
        this.potencia = potencia;
        this.garantia = garantia;
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    void ImprimirDadosGeladeira() {
        System.out.println("------GELADEIRA------");
        System.out.println("tamanho: " + tamanho + "cm");
        System.out.println("largura: " + potencia + "cm");
        System.out.println("potencia: " + largura + "W");
        System.out.println("garantia: " + garantia + " anos");
        System.out.println("cor: " + cor);
    }

}
