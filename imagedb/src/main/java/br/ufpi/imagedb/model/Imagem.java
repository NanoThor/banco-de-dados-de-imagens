package br.ufpi.imagedb.model;

public class Imagem {
    private int id;

    private byte[] imagem;

    // TODO: Adicionar Campos
    private int altura;
    private int largura;
    private int iso;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the imagem
     */
    public byte[] getImagem() {
        return imagem;
    }

    /**
     * @param imagem
     *            the imagem to set
     */
    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura
     *            the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura
     *            the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @return the iso
     */
    public int getIso() {
        return iso;
    }

    /**
     * @param iso
     *            the iso to set
     */
    public void setIso(int iso) {
        this.iso = iso;
    }

}
