package inf319ng.assocobj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author esoft38 - Rafael Mardegan Marquini
 */

public class ContratosDeTrabalho {

	Map<Pessoa, ArrayList<Contrato>> contratosColaborador;
	Map<Companhia, ArrayList<Contrato>> contratosEmpregador;
	
	/**
	 * CONSTRUTOR DE ContratosDeTrabalho
	 */
	public ContratosDeTrabalho() {
		this.contratosColaborador = new HashMap<Pessoa, ArrayList<Contrato>>();
		this.contratosEmpregador = new HashMap<Companhia, ArrayList<Contrato>>();
	}
	
	/**
	 * RETORNA OS CONTRATOS DE COMPANHIAS QUE EMPREGAM O COLABORADOR
	 * @param colaborador
	 * @return
	 */
	public List<Contrato> getEmpregadoresDoColaborador(Pessoa colaborador) {
		return contratosColaborador.get(colaborador);
	}
	
	/**
	 * RETORNA OS CONTRATOS DE COLABORADORES QUE A COMPANHIA EMPREGA
	 * @param companhia
	 * @return
	 */
	public List<Contrato> getColaboradoresDoEmpregador(Companhia companhia) {
		return contratosEmpregador.get(companhia);
	}
	
	/**
	 * O METODO EMPREGA NESTA IMPLEMENTACAO PERMITE QUE UM COLABORADOR POSSA MANTER
	 * UMA RELACAO CONTRATUAL COM MAIS DE UMA COMPANHIA AO MESMO TEMPO
	 * @param companhia
	 * @param colaborador
	 * @param salario
	 * @throws Exception
	 */
	public void emprega(Companhia companhia, Pessoa colaborador, double salario) throws Exception {
		
		try {
			
			ArrayList<Contrato> contratosDoColaborador = contratosColaborador.get(colaborador);
			if (contratosDoColaborador == null) {
				contratosDoColaborador = new ArrayList<Contrato>();
				contratosColaborador.put(colaborador, contratosDoColaborador);
			}
			
			ArrayList<Contrato> contratosDaCompanhia = contratosEmpregador.get(companhia);
			if (contratosDaCompanhia == null) {
				contratosDaCompanhia = new ArrayList<Contrato>();
				contratosEmpregador.put(companhia, contratosDaCompanhia);
			}
			
			Contrato contrato = new Contrato(companhia, colaborador, salario);
			contratosDaCompanhia.add(contrato);
			contratosDoColaborador.add(contrato);
			
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	/**
	 * NESTA IMPLEMENTACAO DO METODO DEMITE EH POSSIVEL IDENTIFICAR ATRAVES DA ASSOCIACAO DA 
	 * CLASSE Pessoa COM Companhia QUAL EH O CONTRATADO QUE FOI REINCIDIDO, E ASSIM, REMOVER
	 * O COLABORADOR SOMENTE DA COMPANHIA INFORMADA, MANTENDO-O NAS DEMAIS
	 * @param companhia
	 * @param colaborador
	 * @throws Exception
	 */
	public void demite(Companhia companhia, Pessoa colaborador) throws Exception {
		
		try {
			ArrayList<Contrato> contratosDoColaborador = contratosColaborador.get(colaborador);
			if (contratosDoColaborador != null) {
				Contrato contratoParaRemover = null;
				for (Contrato contrato : contratosDoColaborador) {
					if (contrato.getColaborador().equals(colaborador) && contrato.getCompanhia().equals(companhia)) {
						contratoParaRemover = contrato;
						break;
					}
				}
				if (contratoParaRemover != null) {
					contratosDoColaborador.remove(contratoParaRemover);
				}
			}
			
			ArrayList<Contrato> contratosDaCompanhia = contratosEmpregador.get(companhia);
			if (contratosDaCompanhia != null) {
				Contrato contratoParaRemover = null;
				for (Contrato contrato : contratosDaCompanhia) {
					if (contrato.getColaborador().equals(colaborador) && contrato.getCompanhia().equals(companhia)) {
						contratoParaRemover = contrato;
						break;
					}
				}
				if (contratoParaRemover != null) {
					contratosDaCompanhia.remove(contratoParaRemover);
				}
			}
		} catch (Exception e) {
			throw e;
		}
		
	}
	
}
