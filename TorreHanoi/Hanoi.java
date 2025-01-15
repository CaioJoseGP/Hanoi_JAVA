public class Hanoi {
    public static void main(String[] args) {
        int n = 10;
        int[] numMovimentos = {0};

        long inicio = System.currentTimeMillis();
        Torre(n, 'A', 'B', 'C', numMovimentos);
        long fim = System.currentTimeMillis();

        long tempoGasto = fim - inicio;
        long horas = tempoGasto / (1000 * 60 * 60);
        long minutos = (tempoGasto / (1000 * 60)) % 60;
        long segundos = (tempoGasto / 1000) % 60;
        long milissegundos = tempoGasto % 1000;

        System.out.println(String.format("Número total de movimentos: %d", numMovimentos[0]));
        System.out.println(String.format("Tempo gasto: %02d:%02d:%02d:%03d", horas, minutos, segundos, milissegundos));
    }

    public static void Torre(int numDisc, char origem, char auxiliar, char destino, int[] numMovimentos) {
        if (numDisc == 1) {
            System.out.println("Mova disco " + numDisc + " de " + origem + " para " + destino);
            numMovimentos[0]++;
            return;
        }

        Torre(numDisc - 1, origem, destino, auxiliar, numMovimentos);

        System.out.println("Mova disco " + numDisc + " de " + origem + " para " + destino);
        numMovimentos[0]++;

        Torre(numDisc - 1, auxiliar, origem, destino, numMovimentos);
    }
}