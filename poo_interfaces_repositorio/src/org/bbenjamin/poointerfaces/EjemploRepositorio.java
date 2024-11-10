package org.bbenjamin.poointerfaces;

import org.bbenjamin.poointerfaces.repositorio.*;
import org.bbenjamin.poointerfaces.models.*;
public class EjemploRepositorio {

    CrudRepositorio repo = new ClienteListRepositorio();

    repo.crear( new Cliente("Benjamin", "Benitez" ));
}
