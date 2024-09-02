package exercicio05;

public class TesteCachorro {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bobby", "Tombê de Lateau", 20);

        System.out.println(cachorro);
        System.out.println(cachorro.getNome());
        cachorro.setNome("");
        System.out.println(cachorro.getNome());
        cachorro.setNome(null);
        System.out.println(cachorro.getNome());
        cachorro.setNome("Bobby Stanley");
        System.out.println(cachorro.getNome());

        System.out.println(cachorro);

    }
}
