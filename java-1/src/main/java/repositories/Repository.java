package repositories;

import domain.Jogador;
import domain.Time;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Repository {
    private FileWriter arq = null;
    private PrintWriter gravarArq;
    private Path path;
    private List<String> linhas;
    private String caminhoArquivoLog = "/Users/rodrigoprates/log oficial 6.txt";
    private List<Time> times = new ArrayList<>();
    private List<Jogador> jogadores = new ArrayList<>();
    private Map<Long, String> registroIdsTimes = new HashMap<>();
    private Map<Long, String> registroIdsJogadores = new HashMap<Long, String>();
    private Map<Long, Long> registroJogadoresXTimes = new HashMap<>();
    private Map<Long, Long> registroTimesXCapitaes = new HashMap<>();

    public Repository(){
        criarArquivo();
        fecharArquivo();
        abrirArquivo();
    }

    protected boolean validaIdInexistente(Class instanciaGenerica, Long id){
        boolean retorno = false;
//        gravaLog("+--validaIdInexistente()--+");
//        gravaLog("1 - instanciaGenerica: " + instanciaGenerica.getName() + "");
//        gravaLog("2 - id: " + id + "");
        if(instanciaGenerica == Time.class) {
            retorno = registroIdsTimes.get(id) == null;
//            gravaLog("Retorno: " + retorno + "");
//            gravaLog("+-------------+");
//            gravaLog("");
            return retorno;
        }
        retorno = registroIdsJogadores.get(id) == null;
//        gravaLog("Retorno: " + retorno + "");
//        gravaLog("+-------------+");
//        gravaLog("");
        return retorno;
    }

    protected void armazenaTime(Time time){
//        gravaLog("+--armazenaTime()--+");
        times.add(time);
        registroIdsTimes.put(time.getId(), time.getNome());

//        gravaLog("id: " + time.getId() + "\n\r" +
//                "nome: " + time.getNome() + "\n\r" +
//                "data criacao: " + time.getDataCriacao() + "\n\r" +
//                "uniforme principal: " + time.getCorUniformePrincipal() + "\n\r" +
//                "uniforme secundario: " + time.getCorUniformeSecundario());
//        gravaLog("+-------------+");
//        gravaLog("");
    }

    protected void armazenaJogador(Jogador jogador){
//        gravaLog("+--armazenaJogador()--+");
        jogadores.add(jogador);
        registroIdsJogadores.put(jogador.getId(), jogador.getNome());
        registroJogadoresXTimes.put(jogador.getId(), jogador.getIdTime());

//        gravaLog("dataLoader.incluirJogador(" + jogador.getId() + "L," + "\n\r" +
//                "" + jogador.getIdTime() + "L," + "\n\r" +
//                '"' + jogador.getNome() + '"' + ',' + "\n\r" +
//                "LocalDate.parse(" + '"' + jogador.getDataNascimento() + '"' + ",DateTimeFormatter.ofPattern(" + '"' + "yyyy-MM-dd" + '"' + "))," + "\n\r" +
//                "" + jogador.getNivelHabilidade() + "," + "\n\r" +
//                "new BigDecimal(" + jogador.getSalario() + "));");
//        gravaLog("+-------------+");
//        gravaLog("");
    }

    protected void definirCapitao(Long idJogador){
        gravaLog("+--definirCapitao()--+");
        gravaLog("1 - idJogador: " + idJogador + "");
        gravaLog("Time jogador: " + idJogador + " - " + registroJogadoresXTimes.get(idJogador) + "");
        registroTimesXCapitaes.put(registroJogadoresXTimes.get(idJogador), idJogador);
        gravaLog("+-------------+");
        gravaLog("");
    }

    protected Long buscarCapitaoDoTime(Long idTime){
        gravaLog("+--buscarCapitaoDoTime()--+");
        gravaLog("1 - idTime: " + idTime + "");
        gravaLog("Capitao time: " + idTime + " - " + registroTimesXCapitaes.get(idTime) + "");
        gravaLog("+-------------+");
        gravaLog("");
        return registroTimesXCapitaes.get(idTime);
    }

    protected String buscarNomeJogador(Long idJogador){
        gravaLog("+--buscarNomeJogador()--+");
        gravaLog("1 - idJogador: " + idJogador + "");
        gravaLog("Nome do jogador: " + idJogador + " - " + registroIdsJogadores.get(idJogador) + "");
        gravaLog("+-------------+");
        gravaLog("");
        return registroIdsJogadores.get(idJogador);
    }

    protected String buscarNomeTime(Long idTime){
        gravaLog("+--buscarNomeTime()--+");
        gravaLog("1 - idTime: " + idTime + "");
        gravaLog("Nome do time: " + idTime + " - " + registroIdsTimes.get(idTime) + "");
        gravaLog("+-------------+");
        gravaLog("");
        return registroIdsTimes.get(idTime);
    }

    protected List<Long> buscarJogadoresDoTime(Long idTime){
        gravaLog("+--buscarJogadoresDoTime()--+");
        gravaLog("1 - idTime: " + idTime + "");
        List<Long> jogadoresXTime = new ArrayList<>();
        for (Map.Entry<Long, Long> entry : registroJogadoresXTimes.entrySet()) {
            if (entry.getValue().equals(idTime)) {
                jogadoresXTime.add(entry.getKey());
            }
        }
        Collections.sort(jogadoresXTime);
        gravaLog(jogadoresXTime.toString() + "");
        gravaLog("+-------------+");
        gravaLog("");
        return jogadoresXTime;
    }

    protected Long buscarMelhorJogadorDoTime(Long idTime){
        gravaLog("+--buscarMelhorJogadorDoTime()--+");
        gravaLog("1 - idTime: " + idTime + "");
        int i = 0;
        Long melhorJogadorDoTime = 0L;
        Integer maiorHabilidade = 0;
        //List<Jogador> jogadoresAux = new ArrayList(jogadores);
        Collections.sort(jogadores, new Comparator<Jogador>() {
            public int compare(Jogador j1, Jogador j2) {
                return j2.getNivelHabilidade().compareTo(j1.getNivelHabilidade());
                //return j2.getNivelHabilidade() > j1.getNivelHabilidade() ? -1 : 1;
            }
        });
        for(i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getIdTime().equals(idTime)) {
                melhorJogadorDoTime = jogadores.get(i).getId();
                maiorHabilidade = jogadores.get(i).getNivelHabilidade();
                break;
            }
        }
        for (i = 1; i < jogadores.size(); i++) {
            if(jogadores.get(i).getIdTime().equals(idTime)) {
                if (melhorJogadorDoTime > jogadores.get(i).getId() && maiorHabilidade.equals(jogadores.get(i).getNivelHabilidade())) {
                    melhorJogadorDoTime = jogadores.get(i).getId();
                }
            }
        }
        gravaLog("Melhor jogador do time: " + idTime + " - " + melhorJogadorDoTime + "");
        gravaLog("+-------------+");
        gravaLog("");
        return melhorJogadorDoTime;
    }

    protected Long buscarJogadorMaisVelho(Long idTime){
        gravaLog("+--buscarJogadorMaisVelho()--+");
        gravaLog("1 - idTime: " + idTime + "");
        AtomicInteger count = new AtomicInteger();
        AtomicLong jogadorMaisVelho = new AtomicLong(0L);
//        List<Jogador> jogadoresAux = new ArrayList(jogadores);
        Collections.sort(jogadores, new Comparator<Jogador>() {
            public int compare(Jogador j1, Jogador j2) {
                return ((Long) ChronoUnit.YEARS.between(j2.getDataNascimento(), LocalDate.now())).compareTo((Long) ChronoUnit.YEARS.between(j1.getDataNascimento(), LocalDate.now()));
            }
        });
        jogadores.stream().filter(jogador -> jogador.getIdTime().equals(idTime)).forEach(jogador -> {
            if (count.intValue() == 0) {
                jogadorMaisVelho.set(jogador.getId());
            } else {
                //if (topJogadores.get(top - 1) > jogador.getId() && jogador.getNivelHabilidade().equals(jogadores.get(count.get() - 2).getNivelHabilidade())) {
                if (jogadorMaisVelho.get() > jogador.getId() && (int) ChronoUnit.YEARS.between(jogador.getDataNascimento(), LocalDate.now()) == (int) ChronoUnit.YEARS.between(jogadores.get(count.get() - 1).getDataNascimento(), LocalDate.now())) {
                    jogadorMaisVelho.set(jogador.getId());
                }
            }
            count.getAndIncrement();
        });
        gravaLog("Jogador mais velho do time: " + idTime + " - " + jogadorMaisVelho.get() + "");
        gravaLog("+-------------+");
        gravaLog("");
        return (jogadorMaisVelho.get());
    }

    protected Long buscarJogadorMaiorSalario(Long idTime){
        gravaLog("+--buscarJogadorMaiorSalario()--+");
        gravaLog("1 - idTime: " + idTime + "");
        int i = 0;
        Long jogadorMaiorSalario = 0L;
        BigDecimal ultimoMaiorSalario = new BigDecimal(0);
//        List<Jogador> jogadoresAux = new ArrayList(jogadores);
        Collections.sort(jogadores, new Comparator<Jogador>() {
            public int compare(Jogador j1, Jogador j2) {
                return j2.getSalario().compareTo(j1.getSalario());
            }
        });
        for(i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getIdTime().equals(idTime)) {
                jogadorMaiorSalario = jogadores.get(i).getId();
                ultimoMaiorSalario = jogadores.get(i).getSalario();
                break;
            }
        }
        for (i = 1; i < jogadores.size(); i++) {
            if(jogadores.get(i).getIdTime().equals(idTime)) {
                if (jogadorMaiorSalario > jogadores.get(i).getId() && ultimoMaiorSalario.equals(jogadores.get(i).getSalario())) {
                    jogadorMaiorSalario = jogadores.get(i).getId();
                }
            }
        }
        gravaLog("Jogador com maior salario do time: " + idTime + " - " + jogadorMaiorSalario + "");
        gravaLog("+-------------+");
        gravaLog("");
        return jogadorMaiorSalario;
    }

    protected List<Long> buscarTopJogadores(Integer top){
        gravaLog("+--buscarTopJogadores()--+");
        gravaLog("1 - top: " + top + "");
        int ultimaHabilidade = 0;
        Long topJogdoresAux;
        AtomicInteger count = new AtomicInteger();
        List<Long> topJogadores = new ArrayList<>();
        List<Long> topJogadoresAux = new ArrayList<>();
        //List<Jogador> jogadoresAux = new ArrayList(jogadores);
        Collections.sort(jogadores, new Comparator<Jogador>() {
            public int compare(Jogador j1, Jogador j2) {
                //return j2.getNivelHabilidade().compareTo(j1.getNivelHabilidade());
                //return j2.getNivelHabilidade() > j1.getNivelHabilidade() ? -1 : j2.getNivelHabilidade().equals(j1.getNivelHabilidade()) && j2.getId() > j1.getId() ? 1 : 1;
                if (j2.getNivelHabilidade() > j1.getNivelHabilidade()) {
                    return -1;
                }
                if (j2.getNivelHabilidade().equals(j1.getNivelHabilidade()) && j2.getId() > j1.getId()) {
                    return 1;
                }
                if (j2.getNivelHabilidade().equals(j1.getNivelHabilidade()) && j2.getId() < j1.getId()) {
                    return -1;
                }
                if(j2.getNivelHabilidade() < j1.getNivelHabilidade()){
                    return 1;
                }
                return 0;
            }
        });
        jogadores.forEach(jogador -> topJogadoresAux.add(jogador.getId()));
        Collections.reverse(topJogadoresAux);
        for(int i = 0; i < topJogadoresAux.size(); i++){
            if (i < top){
                topJogadores.add(topJogadoresAux.get(i));
            } else {
                break;
            }
        }
//        for(int i = 0; i < jogadores.size(); i++){
//            if(topJogadores.size() == 0) {
//                topJogadores.add(jogadores.get(i).getId());
//                ultimaHabilidade = jogadores.get(i).getNivelHabilidade();
//                for (int j = i; j < jogadores.size(); j++) {
//                    if (topJogadores.get(topJogadores.size() - 1) > jogadores.get(j).getId() && ultimaHabilidade == jogadores.get(j).getNivelHabilidade()) {
//                        topJogdoresAux = topJogadores.get(topJogadores.size() - 1);
//                        topJogadores.set(topJogadores.size() - 1, jogadores.get(j).getId());
//                        topJogadores.add(topJogdoresAux);
//                    }
//                }
//            } else {
//                if(ultimaHabilidade != jogadores.get(i).getNivelHabilidade()){
//                    if(topJogadores.size() < top) {
//                        topJogadores.add(jogadores.get(i).getId());
//                        ultimaHabilidade = jogadores.get(i).getNivelHabilidade();
//                    }
//                    for (int j = i; j < jogadores.size(); j++) {
//                        if (topJogadores.get(topJogadores.size() - 1) > jogadores.get(j).getId() && ultimaHabilidade == jogadores.get(j).getNivelHabilidade()) {
//                            topJogdoresAux = topJogadores.get(topJogadores.size() - 1);
//                            topJogadores.set(topJogadores.size() - 1, jogadores.get(j).getId());
//                            topJogadores.add(topJogdoresAux);
//                        }
//                    }
//                }
//            }
//        }
        //Collections.sort(topJogadores);
        gravaLog("Top jogadores - " + topJogadores + "");
        gravaLog("+-------------+");
        gravaLog("");
        return topJogadores;
    }

    protected List<Long> buscarTimes(){
        gravaLog("+--buscarTimes()--+");
        List<Long> times = new ArrayList<>();
        this.times.forEach(time -> times.add(time.getId()));
        Collections.sort(times);
        //times.forEach(time -> gravaLog(time.toString() + ""));
        gravaLog(times.toString() + "");
        gravaLog("+-------------+");
        gravaLog("");
        return times;
    }

    protected BigDecimal buscarSalarioDoJogador(Long idJogador){
        gravaLog("+--buscarSalarioDoJogador()--+");
        gravaLog("1 - idJogador: " + idJogador + "");
        Jogador jogadorEncontrado = jogadores.stream().filter(jogador -> idJogador.equals(jogador.getId())).findAny().orElse(null);
        gravaLog("Salario do jogador: " + idJogador + " - " + jogadorEncontrado.getSalario() + "");
        gravaLog("+-------------+");
        gravaLog("");
        return jogadorEncontrado.getSalario();
    }

    protected String buscarCorCamisaTimeDeFora(Long timeDaCasa, Long timeDeFora){
        String retorno;
        gravaLog("+--buscarCorCamisaTimeDeFora()--+");
        gravaLog("1 - timeDaCasa: " + timeDaCasa + "");
        gravaLog("2 - timeDeFora: " + timeDeFora + "");
        Time timeDaCasaEcontrado = times.stream().filter(time -> timeDaCasa.equals(time.getId())).findAny().orElse(null);
        Time timeDeForaEncontrado = times.stream().filter(time -> timeDeFora.equals(time.getId())).findAny().orElse(null);
        retorno = timeDaCasaEcontrado.getCorUniformePrincipal().equals(timeDeForaEncontrado.getCorUniformePrincipal()) ? timeDeForaEncontrado.getCorUniformeSecundario() : timeDeForaEncontrado.getCorUniformePrincipal();
        gravaLog("Camisa do time de fora: " + timeDeFora + " - " + retorno + "");
        gravaLog("+-------------+");
        gravaLog("");
        return retorno;
    }

    private void criarArquivo(){
        try {
            arq = new FileWriter(caminhoArquivoLog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void abrirArquivo(){
//        gravarArq = new PrintWriter(arq);
        path = Paths.get(caminhoArquivoLog);
        try {
            linhas = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fecharArquivo(){
        try {
            arq.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void gravaLog(String registro) {
//        gravarArq.printf(registro);
//        gravarArq.flush();

        linhas.add(registro);
        try {
            Files.write(path, linhas);
        } catch (IOException e) {
            e.printStackTrace();
        }
        abrirArquivo();
    }
}
