public class MainH {
    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil", -15.7939, -47.8828);
        Pais argentina = new Pais("Argentina", -34.6037, -58.3816);
        Pais paraguai = new Pais("Paraguai", 25.2644, -57.6682);
        Pais uruguai = new Pais("Uruguai", -34.9011, -56.1645);
        Pais chile = new Pais("Chile", -33.4489, -70.6693);
        Pais bolivia = new Pais("Bolivia", -16.4897, -68.1193);
        Pais peru = new Pais("Peru", -12.0464, -77.0428);
        Pais equador = new Pais("Equador", -0.1807, -78.4678);
        Pais colombia = new Pais("Colômbia", -4.7109, -74.0721);
        Pais venezuela = new Pais("Venezuela", 10.4806, -66.9036);
        Pais guiana = new Pais("Guiana", 6.8013, -58.1551);
        Pais suriname = new Pais("Suriname", 5.8520, -55.2038);
        Pais guianaFrancesa = new Pais("Guiana Francesa", 4.9220, -52.3135);
        Pais panama = new Pais("Panamá", 8.9824, 79.5199);
        Pais costaRica = new Pais("Costa Rica", 9.9281, -84.0907);
        Pais nicaragua = new Pais("Nicarágua", 12.1149, -86.2362);
        Pais honduras = new Pais("Honduras", 14.0818, -87.2068);
        Pais elSalvador = new Pais("El Salvador", 13.6929, -89.2182);
        Pais guatemala = new Pais("Guatemala", 14.6248, -90.5328);
        Pais belize = new Pais("Belize", 17.2510, -88.7590);
        Pais mexico = new Pais("México", 19.4326, -99.1332);
        Pais eua = new Pais("Estados Unidos", 38.9072, -77.0369);
        Pais canada = new Pais("Canadá", 45.4215, -75.6972);

        brasil.addPais(paraguai);
        brasil.addPais(argentina);
        brasil.addPais(uruguai);
        brasil.addPais(bolivia);
        brasil.addPais(peru);
        brasil.addPais(colombia);
        brasil.addPais(venezuela);
        brasil.addPais(guiana);
        brasil.addPais(guianaFrancesa);
        brasil.addPais(suriname);

        argentina.addPais(brasil);
        argentina.addPais(uruguai);
        argentina.addPais(paraguai);
        argentina.addPais(chile);
        argentina.addPais(bolivia);

        paraguai.addPais(brasil);
        paraguai.addPais(argentina);
        paraguai.addPais(bolivia);

        uruguai.addPais(argentina);
        uruguai.addPais(brasil);

        chile.addPais(peru);
        chile.addPais(bolivia);
        chile.addPais(argentina);

        bolivia.addPais(brasil);
        bolivia.addPais(peru);
        bolivia.addPais(argentina);
        bolivia.addPais(paraguai);
        bolivia.addPais(chile);

        peru.addPais(bolivia);
        peru.addPais(chile);
        peru.addPais(equador);
        peru.addPais(brasil);

        equador.addPais(colombia);
        equador.addPais(peru);

        colombia.addPais(equador);
        colombia.addPais(panama);
        colombia.addPais(peru);
        colombia.addPais(venezuela);
        colombia.addPais(brasil);

        venezuela.addPais(colombia);
        venezuela.addPais(brasil);
        venezuela.addPais(guiana);

        guiana.addPais(brasil);
        guiana.addPais(suriname);
        guiana.addPais(venezuela);

        suriname.addPais(guianaFrancesa);
        suriname.addPais(guiana);
        suriname.addPais(brasil);

        guianaFrancesa.addPais(suriname);
        guianaFrancesa.addPais(brasil);

        panama.addPais(colombia);
        panama.addPais(costaRica);

        costaRica.addPais(panama);
        costaRica.addPais(nicaragua);

        nicaragua.addPais(costaRica);
        nicaragua.addPais(honduras);

        honduras.addPais(nicaragua);
        honduras.addPais(guatemala);
        honduras.addPais(elSalvador);

        elSalvador.addPais(honduras);
        elSalvador.addPais(guatemala);

        belize.addPais(mexico);
        belize.addPais(guatemala);

        guatemala.addPais(belize);
        guatemala.addPais(elSalvador);
        guatemala.addPais(honduras);
        guatemala.addPais(mexico);

        mexico.addPais(eua);
        mexico.addPais(belize);
        mexico.addPais(guatemala);

        eua.addPais(mexico);
        eua.addPais(canada);

        canada.addPais(eua);

        GrafoH g = new GrafoH();
        g.add(brasil);
        g.add(chile);
        g.add(paraguai);
        g.add(uruguai);
        g.add(argentina);
        g.add(bolivia);
        g.add(peru);
        g.add(equador);
        g.add(colombia);
        g.add(venezuela);
        g.add(guiana);
        g.add(suriname);
        g.add(guianaFrancesa);
        g.add(panama);
        g.add(costaRica);
        g.add(nicaragua);
        g.add(honduras);
        g.add(elSalvador);
        g.add(guatemala);
        g.add(belize);
        g.add(mexico);
        g.add(eua);
        g.add(canada);

        System.out.println("\n");

        long inicioCaminhoHeuristico = System. currentTimeMillis();
        String caminhoHeuristico = BHeuristica.buscaGulosa(g, brasil.getNome(), canada.getNome());
        System.out.println(" ====== Busca Gulosa ====== \n " + caminhoHeuristico + "\n");
        long fimCaminhoHeuristico = System. currentTimeMillis() - inicioCaminhoHeuristico;
        System.out.println(fimCaminhoHeuristico);

        long inicioCaminhoAEstrela = System. currentTimeMillis();
        String caminho_a_estrela = BHeuristica.A_estrela(g, brasil.getNome(), canada.getNome());
        System.out.println(" ====== Busca A* ====== \n " + caminho_a_estrela + "\n");
        long fimCaminhoAEstrela = System. currentTimeMillis() - inicioCaminhoAEstrela;
        System.out.println(fimCaminhoAEstrela);
    }
}


