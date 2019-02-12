package edu.utm.service.venta;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import edu.utm.bd.domain.Venta;
import edu.utm.dao.venta.VentaDao;

@Named
public class VentaServiceImpl implements VentaService{
	@Inject
	VentaDao ventaDao;
	
	public List<Venta> findAllVentas() {
		return ventaDao.findAllVentas();
	}

	public Venta findOneVenta(Venta venta) {
		return ventaDao.findOneVenta(venta);
	}

	public void insertVenta(Venta venta) {
		ventaDao.insertVenta(venta);
	}

}
