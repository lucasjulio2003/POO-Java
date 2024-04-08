public class Contrato {
    private Proprietario proprietario;
    private Imovel imovel;
    private float percentualDesconto;

    public Contrato(Proprietario proprietario, Imovel imovel, float percentualDesconto) {
        this.proprietario = proprietario;
        this.imovel = imovel;
        this.percentualDesconto = percentualDesconto;
    }

    public String consultar(){
        return String.format(
            """
            Proprietário: %s
            Imóvel:
            %s
            Percentual de desconto: %.1f%%
            """,
            proprietario.getNome(), imovel.consultar(), percentualDesconto);
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public float getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
    
}
