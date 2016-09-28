package br.ufpi.imagedb.view;

import br.ufpi.imagedb.controller.ImagemController;
import br.ufpi.imagedb.model.ImagensDAO;

public class Main {
    public static void main(String[] args) {
        ImagensDAO dao = null;
        ImagemController controlador = null;
        controlador.setImagemDao(dao);

        // TODO: adicionar o restante da lógica da gui;

    }
}
