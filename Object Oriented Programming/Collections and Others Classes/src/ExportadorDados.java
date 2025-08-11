import java.util.*;

public class ExportadorDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Map<String, Object>> dados = new ArrayList<>();

        System.out.println("Digite os campos no formato NOME;VALOR;TIPO (ou 'fim' para terminar):");

        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fim")) break;

            String[] partes = entrada.split(";");
            if (partes.length != 3) {
                System.out.println("Formato inválido! Use: NOME;VALOR;TIPO");
                continue;
            }

            String nome = partes[0].trim();
            String valorStr = partes[1].trim();
            String tipo = partes[2].trim().toLowerCase();

            Object valor = parseValor(valorStr, tipo);
            Map<String, Object> campo = new LinkedHashMap<>();
            campo.put("nome", nome);
            campo.put("valor", valor);
            campo.put("tipo", tipo);
            dados.add(campo);
        }

        // JSON
        System.out.println("\nJSON:\n" + gerarJSON(dados));

        // XML
        System.out.println("\nXML:\n" + gerarXML(dados));

        // YAML
        System.out.println("\nYAML:\n" + gerarYAML(dados));

        sc.close();
    }

    private static Object parseValor(String valor, String tipo) {
        try {
            switch (tipo) {
                case "inteiro": return Integer.parseInt(valor);
                case "float": return Double.parseDouble(valor);
                case "boolean": return Boolean.parseBoolean(valor);
                case "data":
                case "datahora": return valor; 
                default: return valor;
            }
        } catch (Exception e) {
            return valor;
        }
    }

    private static String gerarJSON(List<Map<String, Object>> dados) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < dados.size(); i++) {
            Map<String, Object> campo = dados.get(i);
            sb.append("  {\n");
            int j = 0;
            for (Map.Entry<String, Object> entry : campo.entrySet()) {
                sb.append("    \"").append(entry.getKey()).append("\": ");
                Object valor = entry.getValue();
                if (valor instanceof String) {
                    sb.append("\"").append(valor).append("\"");
                } else {
                    sb.append(valor);
                }
                if (j < campo.size() - 1) sb.append(",");
                sb.append("\n");
                j++;
            }
            sb.append("  }");
            if (i < dados.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    private static String gerarXML(List<Map<String, Object>> dados) {
        StringBuilder sb = new StringBuilder();
        sb.append("<dados>\n");
        for (Map<String, Object> campo : dados) {
            sb.append("  <campo>\n");
            for (Map.Entry<String, Object> entry : campo.entrySet()) {
                sb.append("    <").append(entry.getKey()).append(">")
                  .append(entry.getValue())
                  .append("</").append(entry.getKey()).append(">\n");
            }
            sb.append("  </campo>\n");
        }
        sb.append("</dados>");
        return sb.toString();
    }

    private static String gerarYAML(List<Map<String, Object>> dados) {
        StringBuilder sb = new StringBuilder();
        for (Map<String, Object> campo : dados) {
            sb.append("-\n");
            for (Map.Entry<String, Object> entry : campo.entrySet()) {
                sb.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
        }
        return sb.toString();
    }
}
