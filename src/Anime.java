public class Anime implements Video {
    //atributos
    private String nome;
    private int duracao; //OBRIGATORIO NO TRABALHO
    private String idiomaAudio; //OBRIGATORIO NO TRABALHO
    private String idiomaLegenda;  //OBRIGATORIO NO TRABALHO
    private boolean estaPausado; //OBRIGATORIO NO TRABALHO
    private int qtdTemporadas;
    private int episodiosPorTemporada;

    //metodo contrutor
    public Anime(String nome, int qtdTemporadas, int episodiosPorTemporada){
        this.nome = nome;
        this.qtdTemporadas = qtdTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        estaPausado = false;
        idiomaAudio = "Português (Brasil)";
        idiomaLegenda = "Português (Brasil)";
    }
    //metodos específicos da classe

    public void executar() {
        if(estaPausado == false){
            System.out.println("Você começou o anime: "+ nome);
        }else{
            System.out.println("O seu anime está executando");
        }
    }
    public void pausar() {
        estaPausado = true;
        System.out.println("Você pausou o anime.");
    }

    public void mudarAudio() {
        if(idiomaAudio == "Japonês (Original)"){
            idiomaAudio = "Português (Brasil)";
        }else{
            idiomaAudio = "Japonês (Original)";
        }
        System.out.println("Idioma alterado para: "+idiomaAudio);
    }

    public void mudarLegenda() {
        if(idiomaLegenda == "Sem legenda"){
            idiomaLegenda = "Português (Brasil)";
        }else{
            idiomaLegenda = "Sem legenda";
        }
        System.out.println("Legenda alterada para: "+ idiomaLegenda);
    }

    public String exibirDetalhes() {
        System.out.println(nome+"("+qtdTemporadas+" temporadas). "+episodiosPorTemporada+ " episódios por temporada.");
        return null;
    }

    public void fechar() {
        System.out.println("Você fechou o anime.");
    }
    
    //metodos getters e setters
    
}
