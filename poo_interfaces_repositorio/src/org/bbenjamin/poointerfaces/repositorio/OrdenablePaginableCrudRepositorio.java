package org.bbenjamin.poointerfaces.repositorio;

import org.bbenjamin.poointerfaces.modelo.poointerfaces.repositorio.ContableRepositorio;

public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio,
                        PaginableRepositorio, CrudRepositorio, ContableRepositorio {
}
