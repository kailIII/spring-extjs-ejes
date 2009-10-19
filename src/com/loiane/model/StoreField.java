package com.loiane.model;

/**
 * Objeto que representa um campo no Ext.data.Record do Ext.data.Store,
 * que especifica o nome do campo e, opcionalmente, tipo do dado, etc.
 * Para saber mais e outras op��es de configura��es, visite:
 * http://extjs.com/deploy/ext/docs/output/Ext.data.Record.html
 * e olhe a se��o Create
 * 
 * @author Loiane Groner
 * @see http://extjs.com/deploy/ext/docs/output/Ext.data.Record.html - create
 *
 */
public class StoreField {
	
	/**
	 * Nome que o campo � referenciado no Ext.data.Record do Ext.data.Store
	 */
	private String name;

	
	public StoreField() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
