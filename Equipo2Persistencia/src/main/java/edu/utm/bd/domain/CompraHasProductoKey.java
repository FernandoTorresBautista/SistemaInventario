package edu.utm.bd.domain;

public class CompraHasProductoKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column compra_has_producto.Compra_id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	private String compraId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column compra_has_producto.Producto_Id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	private Integer productoId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column compra_has_producto.Compra_id
	 * @return  the value of compra_has_producto.Compra_id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public String getCompraId() {
		return compraId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column compra_has_producto.Compra_id
	 * @param compraId  the value for compra_has_producto.Compra_id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public void setCompraId(String compraId) {
		this.compraId = compraId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column compra_has_producto.Producto_Id
	 * @return  the value of compra_has_producto.Producto_Id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public Integer getProductoId() {
		return productoId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column compra_has_producto.Producto_Id
	 * @param productoId  the value for compra_has_producto.Producto_Id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}
}