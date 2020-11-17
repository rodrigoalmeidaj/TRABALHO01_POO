public class Principal {
    public static void main(String[] args) {
        //objeto 01 da classe Filme
        Filme filme01 = new Filme ("Os Vingadores", "Ação e Ficção Científica", 143, 2012);
        filme01.exibirDetalhes();
        filme01.executar();
        filme01.pausar();
        filme01.executar();
        filme01.mudarAudio();
        filme01.mudarAudio();
        filme01.mudarLegenda();
        filme01.mudarLegenda();
        filme01.exibirDetalhes();
        filme01.fechar();
        System.out.println("\n");

        //objeto 02 da classe Filme
        Filme filme02 = new Filme ("Guardiões da Galáxia", "Ação e Ficção Científica", 125, 2014);
        filme02.exibirDetalhes();
        filme02.executar();
        filme02.pausar();
        filme02.executar();
        filme02.mudarAudio();
        filme02.mudarAudio();
        filme02.mudarLegenda();
        filme02.mudarLegenda();
        filme02.exibirDetalhes();
        filme02.fechar();
        System.out.println("\n");

        //objeto 01 da classe Anime
        Anime anime01 = new Anime ("Naruto clássico", 9, 25);
        anime01.exibirDetalhes();
        anime01.executar();
        anime01.pausar();
        anime01.executar();
        anime01.mudarAudio();
        anime01.mudarAudio();
        anime01.mudarLegenda();
        anime01.mudarLegenda();
        anime01.exibirDetalhes();
        anime01.fechar();
        System.out.println("\n");

        //objeto 02 da classe Anime
        Anime anime02 = new Anime ("Naruto Shippuden", 20, 30);
        anime02.exibirDetalhes();
        anime02.executar();
        anime02.pausar();
        anime02.executar();
        anime02.mudarAudio();
        anime02.mudarAudio();
        anime02.mudarLegenda();
        anime02.mudarLegenda();
        anime02.exibirDetalhes();
        anime02.fechar();
        
    }
    
}
