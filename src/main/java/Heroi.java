public abstract class Heroi {

    protected String nome;
    protected double vida;

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }

    public abstract void andar();
}
