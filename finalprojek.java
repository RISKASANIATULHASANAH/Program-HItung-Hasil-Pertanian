import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class finalprojek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);


        String namapanen;
        int jumlahData = 1; // jumlah hasil jual
        int hargajualperkg =1000000000; // // Harga Jual per kg


        System.out.println("PROGRAM HITUNG HASIL PERTANIAN");

        System.out.print("Hasil Pertanian : " );
        namapanen =input.nextLine();


        System.out.print("Masukkan jumlah hasil pertanian: ");
        int[] hasilpertanian = new int[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            hasilpertanian[i] = scanner.nextInt(); // data hasil pertanian
        }

        System.out.print("Harga jual perKG :");
        hargajualperkg=input.nextInt();


        // Menampilkan nota hasil pertanian
        System.out.println("======= NOTA PERTANIAN =======");

        // Menggunakan array
        int totalHasilPertanianArray = hitungTotalHasilPertanianArray(hasilpertanian);
        int totalHargaJualArray = totalHasilPertanianArray * hargajualperkg;
        System.out.println("Total hasil pertanian (Array): " + totalHasilPertanianArray);
        System.out.println("Total harga jual (Array): " + totalHargaJualArray);

        // Menggunakan queue
        int totalHasilPertanianQueue = hitungTotalHasilPertanianQueue(hasilpertanian);
        int totalHargaJualQueue = totalHasilPertanianQueue * hargajualperkg;
        System.out.println("Total hasil pertanian (Queue): " + totalHasilPertanianQueue);
        System.out.println("Total harga jual (Queue): " + totalHargaJualQueue);

        // Menggunakan linked list
        int totalHasilPertanianLinkedList = hitungTotalHasilPertanianLinkedList(hasilpertanian);
        int totalHargaJualLinkedList = totalHasilPertanianLinkedList * hargajualperkg;
        System.out.println("Total hasil pertanian (Linked List): " + totalHasilPertanianLinkedList);
        System.out.println("Total harga jual (Linked List): " + totalHargaJualLinkedList);

        // Menggunakan stack
        int totalHasilPertanianStack = hitungTotalHasilPertanianStack(hasilpertanian);
        int totalHargaJualStack = totalHasilPertanianStack * hargajualperkg;
        System.out.println("Total hasil pertanian (Stack): " + totalHasilPertanianStack);
        System.out.println("Total harga jual (Stack): " + totalHargaJualStack);
    }

    public static int hitungTotalHasilPertanianArray(int[] hasilPertanian) {
        int total = 0;
        for (int i = 0; i < hasilPertanian.length; i++) {
            total += hasilPertanian[i];
        }
        return total;
    }

    public static int hitungTotalHasilPertanianQueue(int[] hasilPertanian) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < hasilPertanian.length; i++) {
            queue.offer(hasilPertanian[i]);
        }
        int total = 0;
        while (!queue.isEmpty()) {
            total += queue.poll();
        }
        return total;
    }

    public static int hitungTotalHasilPertanianLinkedList(int[] hasilpertanian) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < hasilpertanian.length; i++) {
            linkedList.add(hasilpertanian[i]);
        }
        int total = 0;
        for (int num : linkedList) {
            total += num;
        }
        return total;
    }

    public static int hitungTotalHasilPertanianStack(int[] hasilPertanian) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < hasilPertanian.length; i++) {
            stack.push(hasilPertanian[i]);
        }
        int total = 0;
        while (!stack.isEmpty()) {
            total += stack.pop();
        }
        return total;
    }
}
