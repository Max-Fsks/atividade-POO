package POO;

public class Microondas {

    String cor;
    int potencia;
    int tamanho;
    int largura;
    int garantia;

    public Microondas(String cor, int potencia, int tamanho, int largura, int garantia) {
        this.cor = cor;
        this.potencia = potencia;
        this.tamanho = tamanho;
        this.largura = largura;
        this.garantia = garantia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
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

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    void ImprimirDadosMicroondas() {
        System.out.println("------MICROONDAS------");
        System.out.println("cor: " + cor);
        System.out.println("tamanho: " + tamanho + "cm");
        System.out.println("potencia: " + potencia + "W");
        System.out.println("largura: " + largura + "cm");
        System.out.println("garantia: " + garantia + " anos");
    }

}
