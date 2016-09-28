package br.ufpi.imagedb.controller;

import java.io.IOException;
import java.util.List;

import br.ufpi.imagedb.model.Imagem;
import br.ufpi.imagedb.model.ImagensDAO;

public interface ImagemController {
    public void salvarImagem(Imagem imagem) throws IOException;

    public List<Imagem> listarImagens(int inicio, int quantidade)
            throws IOException;

    public void setImagemDao(ImagensDAO dao);
}
