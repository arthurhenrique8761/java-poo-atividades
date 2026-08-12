import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter file full path: ");
        String st = sc.next();
        String path = st.replace("\\", "\\\\"); // troca a barra inversa unica por uma dupla
        // String path = "C:\\Users\\chais\\OneDrive\\Área de Trabalho\\MapInterfaceProject\\Register.csv";
        System.out.println(path);
        
        Map<String, Integer> map = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] vect = line.split(",");
                String name = vect[0];
                int votes = Integer.parseInt(vect[1]);
                
                if (map.containsKey(name)) {    // verifica se o mapa possui a chave em nome, se sim, ele soma os votos ja presentes com os da iteração atual...
                    int votesSoFar = map.get(name);
                    map.put(name, (votes + votesSoFar));
                }
                else {  // .. se não, ele cria um novo
                    map.put(name, votes);
                }

                line = br.readLine();
            }

            for (String vote : map.keySet()) {
                System.out.println(vote + ", Votes: " + map.get(vote));
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}