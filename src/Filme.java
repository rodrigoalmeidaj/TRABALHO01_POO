public class Filme implements Video {
    //atributos
    private String nome;
    private String genero;
    private int duracao; //obrigatorio no trabalho
    private String idiomaAudio; //obrigatorio no trabalho
    private String idiomaLegenda; //obrigatorio no trabalho
    private boolean estaPausado; //obrigatorio no trabalho
    private int anoLancamento;

    //metodo contrutor
    public Filme(String nome, String genero, int duracao, int anoLancamento){
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        estaPausado = false;
        idiomaAudio = "Português (Brasil)";
        idiomaLegenda = "Português (Brasil)";
    }
    //metodos específicos da classe
    public void executar() {
        if(estaPausado == false){
            System.out.println("Você começou o filme: "+ nome);
        }else{
            System.out.println("O seu filme está executando");
        }
    }

    public void pausar() {
        estaPausado = true;
        System.out.println("Você pausou o filme.");

    }

    public void mudarAudio() {
        if(idiomaAudio == "Inglês (Original)"){
            idiomaAudio = "Português (Brasil)";
        }else{
            idiomaAudio = "Inglês (Original)";
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
        System.out.println(nome+"("+anoLancamento+"). "+"Duração: "+duracao+" min. Gênero: "+genero);
        return null;
    }

    public void fechar() {
        System.out.println("Você fechou o filme.");

    }

    //metodos getters e setters
    
}