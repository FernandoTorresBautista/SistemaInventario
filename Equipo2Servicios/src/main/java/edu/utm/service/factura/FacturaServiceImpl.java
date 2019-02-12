package edu.utm.service.factura;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import edu.utm.bd.domain.Factura;
import edu.utm.dao.factura.FacturaDao;
@Named
public class FacturaServiceImpl implements FacturaService {
	
	@Inject
	FacturaDao facturaDao;
	
	public List<Factura> findAllFacturas() {
		return facturaDao.findAllFacturas();
	}
	
	public Factura findOneFactura(Factura factura) {
		return facturaDao.findOneFactura(factura);
	}

	public Factura findOneFacturaxFecha(Factura factura) {
		return facturaDao.findOneFacturaxFecha(factura);
	}
}
