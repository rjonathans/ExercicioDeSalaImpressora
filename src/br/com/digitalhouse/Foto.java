package br.com.digitalhouse;

public class Foto implements Imprimivel{
    private String nomeFoto;
    private String tipoFoto;

    public Foto(){
    }

    public Foto(String nomeDaFoto,String tipoDaFoto){
        nomeFoto=nomeDaFoto;
        tipoFoto=tipoDaFoto;
    }

    public String getNomeFoto() {
        return nomeFoto;
    }
    public void setNomeFoto(String nomedeFoto) {
        nomeFoto = nomedeFoto;
    }
    public String getTipoFoto() {
        return tipoFoto;
    }
    public void setTipoFoto(String tipodeFoto) {
        tipoFoto = tipodeFoto;
    }

        @Override
    public void imprimir() {
        System.out.println("Sou uma selfie:");
    }
}
