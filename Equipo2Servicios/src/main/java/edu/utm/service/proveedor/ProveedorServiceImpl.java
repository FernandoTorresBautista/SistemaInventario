package edu.utm.service.proveedor;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import edu.utm.bd.domain.Proveedor;
import edu.utm.dao.proveedor.ProveedorDao;

@Named
public class ProveedorServiceImpl implements ProveedorService{
	@Inject
	ProveedorDao proveedorDao;
	
	public List<Proveedor> findAllProveedor() {
		return proveedorDao.findAllProveedor();
	}

	public Proveedor findOneProveedor(Proveedor proveedor) {
		return proveedorDao.findOneProveedor(proveedor);
	}
	
	public void insertProveedor(Proveedor proveedor){
		proveedorDao.insertProveedor(proveedor);
	}
	
	public void deleteOneProveedor(Proveedor proveedor){
		proveedorDao.deleteOneProveedor(proveedor);
	}
	
	public void updateProveedor(Proveedor proveedor){
		proveedorDao.updateProveedor(proveedor);
	}
}
