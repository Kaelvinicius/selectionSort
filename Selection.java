public class Selection {
    public static void main(String[] args) {
        int  vet[] = {12,23,4,43,21,3};


        System.out.println("Desordenado: ");
        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " ");
        }

        System.out.println();

        System.out.println("\nOrdenado: ");
        exibirVetor(selectionSort(vet));
    }

    public static void exibirVetor(int vet[]){
        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " ");
        }
    }

    public static int[] selectionSort(int [] vet){
        int menor, aux;
        for(int i = 0; i < vet.length; i++){
            menor = i;
            for(int j = i+1; j  < vet.length; j++){
                if(vet[j] < vet[menor]){
                    menor = j;
                }
            }
            aux = vet[menor];
            vet[menor] = vet[i];
            vet[i] = aux;
        }
        return vet;
    }
}
