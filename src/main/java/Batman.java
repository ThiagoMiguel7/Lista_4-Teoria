public class Batman extends Heroi implements Golpear {

    public Batman(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " está atacando!");
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando!");
    }
}
