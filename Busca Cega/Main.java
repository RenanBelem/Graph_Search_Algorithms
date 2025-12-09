public class Main {

    public static void main(String[] args) {


        Estado maranhao = new Estado("MARANHAO");
        Estado ceara = new Estado("CEARA");
        Estado piaui = new Estado("PIAUI");
        Estado rioGrandeDoNorte = new Estado("RIO GRANDE DE NORTE");
        Estado paraiba = new Estado("PARAIBA");
        Estado pernambuco = new Estado("PERNAMBUCO");
        Estado alagoas = new Estado("ALAGOAS");
        Estado sergipe = new Estado("SERGIPE");
        Estado bahia = new Estado("BAHIA");
        Estado minasGerais = new Estado("MINAS GERAIS");
        Estado espiritoSanto = new Estado("ESPIRITO SANTO");
        Estado rioDeJaneiro = new Estado("RIO DE JANEIRO");
        Estado saoPaulo = new Estado("SAO PAULO");
        Estado parana = new Estado("PARANA");
        Estado santaCatarina = new Estado("SANTA CATARINA");
        Estado rioGrandeDoSul = new Estado("RIO GRANDE DO SUL");
        Estado amazonas = new Estado("AMAZONAS");
        Estado para = new Estado("PARA");
        Estado roraima = new Estado("RORAIMA");
        Estado amapa = new Estado("AMAPA");
        Estado acre = new Estado("ACRE");
        Estado rondonia = new Estado("RONDONIA");
        Estado tocantins = new Estado("TOCANTINS");
        Estado matoGrosso = new Estado("MATO GROSSO");
        Estado goias = new Estado("GOIAS");
        Estado distritoFederal = new Estado("DISTRITO FEDERAK");
        Estado matoGrossoDoSul = new Estado("MATO GROSSO DO SUL");

        // ADICIONANDO FRONTEIRAS
        amazonas.addEstado(roraima);
        amazonas.addEstado(para);
        amazonas.addEstado(acre);
        amazonas.addEstado(rondonia);
        amazonas.addEstado(matoGrosso);
        para.addEstado(roraima);
        para.addEstado(amazonas);
        para.addEstado(amapa);
        para.addEstado(maranhao);
        para.addEstado(tocantins);
        para.addEstado(matoGrosso);
        para.addEstado(rondonia);
        roraima.addEstado(amazonas);
        roraima.addEstado(para);
        amapa.addEstado(para);
        acre.addEstado(amazonas);
        rondonia.addEstado(amazonas);
        roraima.addEstado(matoGrosso);
        tocantins.addEstado(para);
        tocantins.addEstado(maranhao);
        tocantins.addEstado(piaui);
        tocantins.addEstado(bahia);
        tocantins.addEstado(goias);
        tocantins.addEstado(matoGrosso);
        matoGrosso.addEstado(amazonas);
        matoGrosso.addEstado(rondonia);
        matoGrosso.addEstado(matoGrossoDoSul);
        matoGrosso.addEstado(goias);
        matoGrosso.addEstado(tocantins);
        matoGrosso.addEstado(para);
        goias.addEstado(matoGrosso);
        goias.addEstado(matoGrossoDoSul);
        goias.addEstado(saoPaulo);
        goias.addEstado(minasGerais);
        goias.addEstado(bahia);
        goias.addEstado(tocantins);
        goias.addEstado(distritoFederal);
        distritoFederal.addEstado(goias);
        matoGrossoDoSul.addEstado(matoGrosso);
        matoGrossoDoSul.addEstado(goias);
        matoGrossoDoSul.addEstado(minasGerais);
        matoGrossoDoSul.addEstado(saoPaulo);
        matoGrossoDoSul.addEstado(parana);
        maranhao.addEstado(para);
        maranhao.addEstado(tocantins);
        maranhao.addEstado(bahia);
        maranhao.addEstado(piaui);
        ceara.addEstado(rioGrandeDoNorte);
        ceara.addEstado(paraiba);
        ceara.addEstado(pernambuco);
        ceara.addEstado(piaui);
        piaui.addEstado(maranhao);
        piaui.addEstado(tocantins);
        piaui.addEstado(bahia);
        piaui.addEstado(pernambuco);
        piaui.addEstado(ceara);
        piaui.addEstado(distritoFederal);
        rioGrandeDoNorte.addEstado(ceara);
        rioGrandeDoNorte.addEstado(paraiba);
        paraiba.addEstado(rioGrandeDoNorte);
        paraiba.addEstado(ceara);
        paraiba.addEstado(pernambuco);
        pernambuco.addEstado(paraiba);
        pernambuco.addEstado(ceara);
        pernambuco.addEstado(piaui);
        pernambuco.addEstado(bahia);
        pernambuco.addEstado(alagoas);
        alagoas.addEstado(pernambuco);
        alagoas.addEstado(bahia);
        alagoas.addEstado(sergipe);
        bahia.addEstado(pernambuco);
        bahia.addEstado(alagoas);
        bahia.addEstado(sergipe);
        bahia.addEstado(piaui);
        bahia.addEstado(maranhao);
        bahia.addEstado(tocantins);
        bahia.addEstado(goias);
        bahia.addEstado(minasGerais);
        bahia.addEstado(espiritoSanto);
        minasGerais.addEstado(espiritoSanto);
        minasGerais.addEstado(bahia);
        minasGerais.addEstado(goias);
        minasGerais.addEstado(matoGrossoDoSul);
        minasGerais.addEstado(saoPaulo);
        minasGerais.addEstado(rioDeJaneiro);
        espiritoSanto.addEstado(bahia);
        espiritoSanto.addEstado(minasGerais);
        espiritoSanto.addEstado(rioDeJaneiro);
        rioDeJaneiro.addEstado(espiritoSanto);
        rioDeJaneiro.addEstado(minasGerais);
        rioDeJaneiro.addEstado(saoPaulo);
        saoPaulo.addEstado(rioDeJaneiro);
        saoPaulo.addEstado(minasGerais);
        saoPaulo.addEstado(matoGrossoDoSul);
        saoPaulo.addEstado(parana);
        parana.addEstado(saoPaulo);
        parana.addEstado(matoGrossoDoSul);
        parana.addEstado(santaCatarina);
        santaCatarina.addEstado(parana);
        santaCatarina.addEstado(rioGrandeDoSul);
        rioGrandeDoSul.addEstado(santaCatarina);

        Grafo grafo = new Grafo();
        grafo.add(amazonas);        grafo.add(acre);            grafo.add(roraima);
        grafo.add(amapa);           grafo.add(para);            grafo.add(rondonia);
        grafo.add(tocantins);       grafo.add(matoGrosso);      grafo.add(goias);
        grafo.add(distritoFederal); grafo.add(matoGrossoDoSul); grafo.add(maranhao);
        grafo.add(ceara);           grafo.add(piaui);           grafo.add(rioGrandeDoNorte);
        grafo.add(paraiba);         grafo.add(pernambuco);      grafo.add(alagoas);
        grafo.add(sergipe);         grafo.add(bahia);           grafo.add(minasGerais);
        grafo.add(espiritoSanto);   grafo.add(rioDeJaneiro);    grafo.add(saoPaulo);
        grafo.add(parana);          grafo.add(santaCatarina);   grafo.add(rioGrandeDoSul);


        System.out.println("======= EXERCÍCIO 5 [BUSCA LARGURA] =======");
        String exercicio5 = BLargura.buscaLargura(grafo, saoPaulo.getNome(), amazonas.getNome());
        System.out.println("5) "+ exercicio5 +"\n");


        System.out.println("======= EXERCÍCIO 6 [BUSCA PRODFUNDIDADE] =======");
        String exercicio6 = BProfundidade.buscaProfundidade(grafo, saoPaulo.getNome(), amazonas.getNome());
        System.out.println("6) "+ exercicio6 +"\n");


        System.out.println("======= EXERCÍCIO 7 [BUSCA APROFUNDAMENTO ITERATIVO] =======");
        String exercicio7 = BProfundidade.buscaAprofundamentoIterado(grafo, saoPaulo.getNome(), amazonas.getNome());
        System.out.println("7) " + exercicio7);


    }

}
