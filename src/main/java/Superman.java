public class Superman extends Heroi implements Golpear {

    public Superman(String nome, double vida) {
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
