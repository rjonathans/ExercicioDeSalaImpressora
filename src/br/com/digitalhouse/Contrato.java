package br.com.digitalhouse;

public class Contrato implements Imprimivel{

    private String nomeDoContrato;
    private String tipoDeContrato;

    public Contrato(){
    }

    public Contrato(String nomeContrato,String tipoContrato){
        nomeDoContrato=nomeContrato;
        tipoDeContrato=tipoContrato;
    }

    public void setNomeDoContrato(String nomeContrato) {
        nomeDoContrato = nomeContrato;
    }

    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoContrato) {
        tipoDeContrato = tipoContrato;
    }

    public String getNomeDoContrato() {
        return nomeDoContrato;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal");

    }
}
