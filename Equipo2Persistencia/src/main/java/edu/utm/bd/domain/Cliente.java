package edu.utm.bd.domain;

public class Cliente {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cliente.IdCliente
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	private Integer idcliente;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cliente.CliTelefono
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	private String clitelefono;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cliente.IdCliente
	 * @return  the value of cliente.IdCliente
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public Integer getIdcliente() {
		return idcliente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cliente.IdCliente
	 * @param idcliente  the value for cliente.IdCliente
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cliente.CliTelefono
	 * @return  the value of cliente.CliTelefono
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public String getClitelefono() {
		return clitelefono;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cliente.CliTelefono
	 * @param clitelefono  the value for cliente.CliTelefono
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public void setClitelefono(String clitelefono) {
		this.clitelefono = clitelefono;
	}

	private String clinombre;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cliente.CliApellidos
     *
     * @mbg.generated Wed Apr 25 18:55:18 CDT 2018
     */
    private String cliapellidos;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cliente.CliDireccion
     *
     * @mbg.generated Wed Apr 25 18:55:18 CDT 2018
     */
    private String clidireccion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cliente.CliNombre
     *
     * @return the value of cliente.CliNombre
     *
     * @mbg.generated Wed Apr 25 18:55:18 CDT 2018
     */
    public String getClinombre() {
        return clinombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cliente.CliNombre
     *
     * @param clinombre the value for cliente.CliNombre
     *
     * @mbg.generated Wed Apr 25 18:55:18 CDT 2018
     */
    public void setClinombre(String clinombre) {
        this.clinombre = clinombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cliente.CliApellidos
     *
     * @return the value of cliente.CliApellidos
     *
     * @mbg.generated Wed Apr 25 18:55:18 CDT 2018
     */
    public String getCliapellidos() {
        return cliapellidos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cliente.CliApellidos
     *
     * @param cliapellidos the value for cliente.CliApellidos
     *
     * @mbg.generated Wed Apr 25 18:55:18 CDT 2018
     */
    public void setCliapellidos(String cliapellidos) {
        this.cliapellidos = cliapellidos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cliente.CliDireccion
     *
     * @return the value of cliente.CliDireccion
     *
     * @mbg.generated Wed Apr 25 18:55:18 CDT 2018
     */
    public String getClidireccion() {
        return clidireccion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cliente.CliDireccion
     *
     * @param clidireccion the value for cliente.CliDireccion
     *
     * @mbg.generated Wed Apr 25 18:55:18 CDT 2018
     */
    public void setClidireccion(String clidireccion) {
        this.clidireccion = clidireccion;
    }
}