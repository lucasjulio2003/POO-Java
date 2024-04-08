public class App {
    public static void main(String[] args) throws Exception {
        Imovel imovel = new Imovel("Rua 01", 0, null, null, null, null, null);
        Proprietario proprietario = new Proprietario("Lucas", null, null, null, 0, null, null, null, null, null);
        Contrato contrato = new Contrato(proprietario, imovel, 20);
        System.out.println(">> Imóvel\n" + imovel.consultar());
        System.out.println(">> Proprietário\n" + proprietario.consultaSimples());
        System.out.println(">> Contrato\n" + contrato.consultar());
    }
}
