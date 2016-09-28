package br.ufpi.imagedb.model;

import java.io.IOException;
import java.util.List;

public interface ImagensDAO {
    public void salvarImagem(Imagem imagem) throws IOException;

    public List<Imagem> listarImagens(int inicio, int quantidade) throws IOException;
}
