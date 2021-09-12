class Cordados {
    public String eucariontes = "Eucarionte";
    public String nome_cordado;
}

class Vertebrados extends Cordados {
    public String Coluna_vertebral = "Coluna Vertebral";
    public String Medula_espinhal = "Medula Espinhal";
}

class Mamiferos extends Vertebrados {
    public String pelos = "Pelos";
    public String glandulas_mamarias = "Glandulas Mamarias";
    public String pulmao = "Pulmao";
    public String nome = "";

    public String getNome() {
        return nome;
    }
}

class Voador extends Mamiferos {
    public String nome = "Aguia";

    public Voador() {

    }

    public Voador(String nome) {
        nome_cordado = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Terrestres extends Mamiferos {
    public String nome = "MACACO";

    public Terrestres() {

    }

    public Terrestres(String nome) {
        nome_cordado = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Marinho extends Mamiferos {
    public String nome = "Baleia-orca";

    public Marinho() {

    }

    public Marinho(String nome) {
        nome_cordado = nome;
    }

    public String getNome() {
        return nome;
    }

}

public class ReinoAnimal {

    public static void main(String[] args) {

        Cordados cordado = new Cordados();
        Vertebrados verte = new Vertebrados();
        Mamiferos mami = new Mamiferos();
        Mamiferos terres = new Terrestres("Leao");
        Mamiferos voad = new Voador("Morcego");
        Mamiferos marin = new Marinho("Baleia-orca");

        System.out.printf("\n\n");
        System.out.println("---------- Cordados --------------------");
        System.out.println("Caracteristica: " + cordado.eucariontes);
        System.out.println("----------------------------------------------");
        System.out.printf("\n\n");
        System.out.println("---------- Vertebrados --------------------");
        System.out.println("Caracteristica: " + verte.eucariontes);
        System.out.println("Caracteristica: " + verte.Medula_espinhal);
        System.out.println("Caracteristica: " + verte.Coluna_vertebral);
        System.out.println("----------------------------------------------");
        System.out.printf("\n\n");
        System.out.println("---------- Mamiferos --------------------");
        System.out.println("Caracteristica: " + mami.eucariontes);
        System.out.println("Caracteristica: " + mami.pelos);
        System.out.println("Caracteristica: " + mami.pulmao);
        System.out.println("Caracteristica: " + mami.glandulas_mamarias);
        System.out.println("----------------------------------------------");
        System.out.printf("\n\n");
        System.out.println("---------- Terrestres --------------------");
        System.out.println("Caracteristica: " + terres.eucariontes);
        System.out.println("Nome: " + terres.nome_cordado);
        System.out.println("----------------------------------------------");
        System.out.printf("\n\n");
        System.out.println("---------- Voador --------------------");
        System.out.println("Caracteristica: " + voad.eucariontes);
        System.out.println("Nome: " + voad.nome_cordado);
        System.out.println("----------------------------------------------");
        System.out.printf("\n\n");
        System.out.println("---------- Marinho --------------------");
        System.out.println("Caracteristica: " + marin.eucariontes);
        System.out.println("Nome: " + marin.nome_cordado);
        System.out.println("----------------------------------------------");
    }

}
