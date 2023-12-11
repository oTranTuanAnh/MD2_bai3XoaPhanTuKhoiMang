import java.util.Scanner;

public class DeleteArr {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + (i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s","Mang ban dau la: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }

        int num;
        int index = -1;
        System.out.println();
        System.out.print("Nhap so can xoa: ");
        num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                index = i;
            }
        }
        if (index >= 0){
            for (int i = index; i <arr.length-1 ; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = 0;
        }

        System.out.printf("%-20s%s","Mang da xoa: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }


    }
}
