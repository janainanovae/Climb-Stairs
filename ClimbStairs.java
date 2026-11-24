public class ClimbStairs {

    /**
     * Retorna de quantas maneiras distintas é possível subir uma escada de n degraus,
     * subindo 1 ou 2 degraus por vez.
     *
     * Relação de recorrência: F(n) = F(n - 1) + F(n - 2)
     * (o último passo foi de 1 degrau, vindo de n-1, ou de 2 degraus, vindo de n-2)
     */
    public static int subirEscada(int n) {
        // Caso base: com 1 degrau há 1 maneira; com 2 degraus há 2 maneiras (1+1 ou 2)
        if (n <= 2) {
            return n;
        }

        // Caso recursivo: soma das maneiras dos dois subproblemas menores
        return subirEscada(n - 1) + subirEscada(n - 2);
    }

    // Compara o resultado obtido com o esperado e imprime o teste
    private static void testar(int n, int esperado) {
        int resultado = subirEscada(n);
        String status = (resultado == esperado) ? "OK" : "ERRO";

        System.out.println("n = " + n + " -> " + resultado
                + " (esperado: " + esperado + ") [" + status + "]");
    }

    public static void main(String[] args) {
        System.out.println("===== Exemplos do enunciado =====");
        testar(2, 2);
        testar(3, 3);
        testar(4, 5);

        System.out.println();
        System.out.println("===== Outros valores =====");
        testar(1, 1);
        testar(5, 8);
        testar(6, 13);
        testar(7, 21);
        testar(10, 89);
    }
}
