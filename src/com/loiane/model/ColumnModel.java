package com.loiane.model;

/**
 * Define as configura��es de uma coluna do grid.
 * Para saber mais e outras op��es de configura��es, visite:
 * http://extjs.com/deploy/ext/docs/output/Ext.grid.ColumnModel.html
 * e olhe a se��o Config Option
 * 
 * @author Loiane Groner
 * @see http://extjs.com/deploy/ext/docs/output/Ext.grid.ColumnModel.html
 */
public class ColumnModel {
	
	/*
	 * Uso:
	 * var colModel = new Ext.grid.ColumnModel([
	 * {header: "Ticker", width: 60, sortable: true},
	 * {header: "Company Name", width: 150, sortable: true},
	 * {header: "Market Cap.", width: 100, sortable: true},
	 * {header: "$ Sales", width: 100, sortable: true},
	 * {header: "Employees", width: 100, sortable: true}
 	 * ]);
	 */
	
	/**
	 * (Opcional) Seta o alinhamento - CSS das colunas e dados
	 * no grid.
	 * Por padr�o, � indefinido.
	 * Op��es:
	 * <li>center</li> - centro
	 * <li>left</li> - esquerda
	 * <li>right</li> - direita
	 */
	private String align;
	
	/**
	 * Nome do campo na defini��o do Ext.data.Record do Ext.data.Store.
	 * Utilizado para fazer o 'casamento' das configura��es
	 */
	private String dataIndex;
	
	/**
	 * Texto que aparece no cabe�alho do grid
	 */
	private String header;
	
	/**
	 * Define se a coluna poder� ser ordenada.
	 * true se a ordena��o � permitida, false para o contr�rio.
	 */
	private String sortable;
	
	/**
	 * Tamanho inicial da largura da coluna (em pixels).
	 * Exemplo proibido: width:"50%"
	 * Exemplo permitido: width:"50"
	 */
	private int width;
	

	/**
	 * Construtor com par�metros
	 * @param align
	 * @param dataIndex
	 * @param header
	 * @param sortable
	 * @param width
	 */
	public ColumnModel(String align, String dataIndex, String header,
			String sortable, int width) {
		super();
		this.align = align;
		this.dataIndex = dataIndex;
		this.header = header;
		this.sortable = sortable;
		this.width = width;
	}
	
	
	/**
	 * Construtor padr�o
	 */
	public ColumnModel() {
		super();
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public String getDataIndex() {
		return dataIndex;
	}

	public void setDataIndex(String dataIndex) {
		this.dataIndex = dataIndex;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getSortable() {
		return sortable;
	}

	public void setSortable(String sortable) {
		this.sortable = sortable;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
