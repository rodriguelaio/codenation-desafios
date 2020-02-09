package dataloader;

import domain.Time;
import domain.Jogador;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import repositories.Repository;
import static utils.MensagemException.*;
import br.com.codenation.desafio.exceptions.*;

public class DataLoader extends Repository {

    public Time incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) throws IdentificadorUtilizadoException{
        if(!validaIdInexistente(Time.class, id)) { throw new IdentificadorUtilizadoException(IDENTIFICADOR_UTILIZADO_EXCEPTION); }
        Time time = new Time(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);
        super.armazenaTime(time);
        return time;
    }

    public Jogador incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) throws IdentificadorUtilizadoException, TimeNaoEncontradoException{
        if(!super.validaIdInexistente(Jogador.class, id)) throw new IdentificadorUtilizadoException(IDENTIFICADOR_UTILIZADO_EXCEPTION);

        if(super.validaIdInexistente(Time.class, idTime)) throw new TimeNaoEncontradoException(TIME_NAO_ENCONTRADO_EXCEPTION);

        Jogador jogador = new Jogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario);
        super.armazenaJogador(jogador);
        return jogador;
    }

    public void definirCapitao(Long idJogador) throws JogadorNaoEncontradoException {

        if(super.validaIdInexistente(Jogador.class, idJogador)) throw new JogadorNaoEncontradoException(JOGADOR_NAO_ENCONTRADO_EXCEPTION);

        super.definirCapitao(idJogador);
    }

    public Long buscarCapitaoDoTime(Long idTime) throws TimeNaoEncontradoException, CapitaoNaoInformadoException {
        Long idCapitao;
        if(super.validaIdInexistente(Time.class, idTime)) throw new TimeNaoEncontradoException(TIME_NAO_ENCONTRADO_EXCEPTION);
        if((idCapitao = super.buscarCapitaoDoTime(idTime)) == null) throw new CapitaoNaoInformadoException(CAPITAO_NAO_INFORMADO_EXCEPTION);
        return idCapitao;
    }

    public String buscarNomeJogador(Long idJogador) throws JogadorNaoEncontradoException {
        if(super.validaIdInexistente(Jogador.class, idJogador)) throw new JogadorNaoEncontradoException(JOGADOR_NAO_ENCONTRADO_EXCEPTION);
        return super.buscarNomeJogador(idJogador);
    }

    public String buscarNomeTime(Long idTime) throws TimeNaoEncontradoException {
        if(super.validaIdInexistente(Time.class, idTime)) throw new TimeNaoEncontradoException(TIME_NAO_ENCONTRADO_EXCEPTION);
        return super.buscarNomeTime(idTime);
    }

    public List<Long> buscarJogadoresDoTime(Long idTime) throws TimeNaoEncontradoException {
        if(super.validaIdInexistente(Time.class, idTime)) throw new TimeNaoEncontradoException(TIME_NAO_ENCONTRADO_EXCEPTION);
        return super.buscarJogadoresDoTime(idTime);
    }

    public Long buscarMelhorJogadorDoTime(Long idTime) throws TimeNaoEncontradoException {
        if(super.validaIdInexistente(Time.class, idTime)) throw new TimeNaoEncontradoException(TIME_NAO_ENCONTRADO_EXCEPTION);
        return super.buscarMelhorJogadorDoTime(idTime);
    }

    public Long buscarJogadorMaisVelho(Long idTime) throws TimeNaoEncontradoException {
        if(super.validaIdInexistente(Time.class, idTime)) throw new TimeNaoEncontradoException(TIME_NAO_ENCONTRADO_EXCEPTION);
        return super.buscarJogadorMaisVelho(idTime);
    }

    public List<Long> buscarTimes(){
        return super.buscarTimes();
    }

    public Long buscarJogadorMaiorSalario(Long idTime) throws TimeNaoEncontradoException {
        if(super.validaIdInexistente(Time.class, idTime)) throw new TimeNaoEncontradoException(TIME_NAO_ENCONTRADO_EXCEPTION);
        return super.buscarJogadorMaiorSalario(idTime);
    }

    public BigDecimal buscarSalarioDoJogador(Long idJogador) throws JogadorNaoEncontradoException{
        if(super.validaIdInexistente(Jogador.class, idJogador)) throw new JogadorNaoEncontradoException(JOGADOR_NAO_ENCONTRADO_EXCEPTION);
        return super.buscarSalarioDoJogador(idJogador);
    }

    public List<Long> buscarTopJogadores(Integer top){
        return super.buscarTopJogadores(top);
    }

    public String buscarCorCamisaTimeDeFora(Long timeDaCasa, Long timeDeFora) throws TimeNaoEncontradoException {
        if(super.validaIdInexistente(Time.class, timeDaCasa)) throw new TimeNaoEncontradoException(TIME_NAO_ENCONTRADO_EXCEPTION);
        if(super.validaIdInexistente(Time.class, timeDeFora)) throw new TimeNaoEncontradoException(TIME_NAO_ENCONTRADO_EXCEPTION);
        return super.buscarCorCamisaTimeDeFora(timeDaCasa, timeDeFora);
    }

}
