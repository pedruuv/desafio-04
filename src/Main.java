import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = """
                {
                    "nome" : "Pedro",
                    "idade" : 20,
                    "cidade" : "Fortaleza",
                    "estuda" : true
                }
                """;

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto pessoa: " + pessoa);
    }
}
