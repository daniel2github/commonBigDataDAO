package com.architecture.bigdata.common;

import java.math.BigInteger;
import java.util.List;

import com.architecture.bigdata.exception.CommonException;

/**
 * Define o contrato das operações básicas disponíveis
 * @author daniel.menezes - <tt>daniel.afmenezes@gmail.com</tt>
 */
public interface CommonDAO<E extends CommonBean> {

	/**
	 * Encontra um entidade pelo identificador
	 * @param key Identificador da entidade
	 * @return entidade
	 */
	public E findByKey(BigInteger key) throws CommonException;
	/**
	 * Remove a entidade
	 * @param E Entity a ser removida
	 * @return <tt>TRUE</tt> caso a entidade tenha sido removida com sucesso,<br><tt>FALSE</tt> caso contrário.
	 */
	public void delete(E entity) throws CommonException;
	/**
	 * Cria ou atualiza a entidade passada como parâmetro
	 * @param bean Entidade a ser salva/ atualizada
	 * @return Entidade persistida na base de dados
	 */
	public E saveOrUpdate(E bean) throws CommonException;
	/**
	 * Cria ou atualiza a lista de entidade passadas como parâmetro
	 * @param beanList Lista de entidades
	 * @return Entidade persistida na base de dados
	 */
	public void saveOrUpdateAll(List<E> beanList) throws CommonException;

}
