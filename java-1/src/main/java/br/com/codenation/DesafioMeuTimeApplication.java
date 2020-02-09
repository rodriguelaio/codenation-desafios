package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.com.codenation.desafio.annotation.Desafio;
import br.com.codenation.desafio.app.MeuTimeInterface;
import br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.desafio.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.desafio.exceptions.TimeNaoEncontradoException;
import dataloader.DataLoader;

public class DesafioMeuTimeApplication implements MeuTimeInterface {

    DataLoader dataLoader = new DataLoader();

    @Desafio("incluirTime")
	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) {
//		throw new UnsupportedOperationException();
		try{
            dataLoader.incluirTime(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);
		}catch (IdentificadorUtilizadoException e){
			//e.printStackTrace();
			throw e;
		}
	}

	@Desafio("incluirJogador")
	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
//		throw new UnsupportedOperationException();
        try{
            dataLoader.incluirJogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario);
        }catch (IdentificadorUtilizadoException e){
            //e.printStackTrace();
            throw e;
        }catch (TimeNaoEncontradoException e){
            throw e;
        }
	}

	@Desafio("definirCapitao")
	public void definirCapitao(Long idJogador) {
//		throw new UnsupportedOperationException();
        try {
            dataLoader.definirCapitao(idJogador);
        }catch (JogadorNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

	@Desafio("buscarCapitaoDoTime")
	public Long buscarCapitaoDoTime(Long idTime) {
//		throw new UnsupportedOperationException();
        try {
            return dataLoader.buscarCapitaoDoTime(idTime);
        }catch (TimeNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

	@Desafio("buscarNomeJogador")
	public String buscarNomeJogador(Long idJogador) {
//		throw new UnsupportedOperationException();
        try {
            return dataLoader.buscarNomeJogador(idJogador);
        }catch (JogadorNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

	@Desafio("buscarNomeTime")
	public String buscarNomeTime(Long idTime) {
//		throw new UnsupportedOperationException();
        try {
            return dataLoader.buscarNomeTime(idTime);
        }catch (TimeNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

	@Desafio("buscarJogadoresDoTime")
	public List<Long> buscarJogadoresDoTime(Long idTime) {
//		throw new UnsupportedOperationException();
        try {
            return dataLoader.buscarJogadoresDoTime(idTime);
        }catch (TimeNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

	@Desafio("buscarMelhorJogadorDoTime")
	public Long buscarMelhorJogadorDoTime(Long idTime) {
//		throw new UnsupportedOperationException();
        try {
            return dataLoader.buscarMelhorJogadorDoTime(idTime);
        }catch (TimeNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

	@Desafio("buscarJogadorMaisVelho")
	public Long buscarJogadorMaisVelho(Long idTime) {
//		throw new UnsupportedOperationException();
        try {
            return dataLoader.buscarJogadorMaisVelho(idTime);
        }catch (TimeNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

	@Desafio("buscarTimes")
	public List<Long> buscarTimes() {
//		throw new UnsupportedOperationException();
        return dataLoader.buscarTimes();
	}

	@Desafio("buscarJogadorMaiorSalario")
	public Long buscarJogadorMaiorSalario(Long idTime) {
//		throw new UnsupportedOperationException();
        try {
            return dataLoader.buscarJogadorMaiorSalario(idTime);
        }catch (TimeNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

	@Desafio("buscarSalarioDoJogador")
	public BigDecimal buscarSalarioDoJogador(Long idJogador) {
//		throw new UnsupportedOperationException();
        try {
            return dataLoader.buscarSalarioDoJogador(idJogador);
        }catch (JogadorNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

	@Desafio("buscarTopJogadores")
	public List<Long> buscarTopJogadores(Integer top) {
//		throw new UnsupportedOperationException();
        return dataLoader.buscarTopJogadores(top);
	}

	@Desafio("buscarCorCamisaTimeDeFora")
	public String buscarCorCamisaTimeDeFora(Long timeDaCasa, Long timeDeFora) {
//		throw new UnsupportedOperationException();
        try {
            return dataLoader.buscarCorCamisaTimeDeFora(timeDaCasa, timeDeFora);
        }catch (TimeNaoEncontradoException e){
            //e.printStackTrace();
            throw e;
        }
	}

}
