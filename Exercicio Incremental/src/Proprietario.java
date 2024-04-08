public class Proprietario {
    
    private String nome;
    private String cpf;
    private String identidade;
    private String rua;
    private int numero;
    private String cep;
    private String estado;
    private String cidade;
    private String telefone;
    private String pagamento;
    
    public Proprietario(String nome, String cpf, String identidade, String rua, int numero, String cep, String estado,
            String cidade, String telefone, String pagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.telefone = telefone;
        this.pagamento = pagamento;
    }

    public String consulta(){
        return String.format(
            """
            Nome: %s
            CPF: %s
            Identidade: %s
            Rua: %s
            Número: %d
            CEP: %s
            Estado: %s
            Cidade: %s
            Telefone: %s
            Pagamento: %s 
            """,
            nome, cpf, identidade, rua, numero, cep, estado, cidade, telefone, pagamento);
    }

    public String consultaSimples(){
        return String.format(
            """
            Nome: %s
            Identidade: %s
            Rua: %s
            Número: %d
            CEP: %s
            Estado: %s
            Cidade: %s
            Telefone: %s 
            """,
            nome, identidade, rua, numero, cep, estado, cidade, telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

}
