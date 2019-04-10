package br.com.digitalhouse;

public class Documento implements Imprimivel {
    private String nomeDoDocumento;
    private String tipoDoDocumento;

    public Documento(){

    }
    public Documento(String nomeDocumento,String tipoDocumento){
        nomeDoDocumento=nomeDocumento;
        tipoDoDocumento=tipoDocumento;
    }

    public String getNomeDoDocumento() {
        return nomeDoDocumento;
    }
    public void setNomeDoDocumento(String nomeDocumento) {
        nomeDoDocumento = nomeDocumento;
    }
    public String getTipoDoDocumento() {
        return tipoDoDocumento;
    }
    public void setTipoDoDocumento(String tipoDocumento) {
        tipoDoDocumento = tipoDocumento;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word");
    }
}
