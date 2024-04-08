public class Imovel {
    
    private String rua;
    private int numero;
    private String cep;
    private String estado;
    private String cidade;
    private String tipo;
    private String utilizacao;

    public Imovel(String rua, int numero, String cep, String estado, String cidade, String tipo, String utilizacao){
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.tipo = tipo;
        this.utilizacao = utilizacao;
    }

    public String consultar(){
        return String.format(
        """
        Rua: %s
        Número: %d
        Cep: %s
        Estado: %s
        Cidade: %s
        Tipo: %s
        Utilização: %s
        """,
        rua, numero, cep, estado, cidade, tipo, utilizacao);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    
}
