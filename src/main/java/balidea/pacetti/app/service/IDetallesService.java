package balidea.pacetti.app.service;

import balidea.pacetti.app.model.Detalle;

public interface IDetallesService {
	void insertar(Detalle detalle);
	void eliminar(int idDetalle);
}
