import java.util.Scanner;
class TypesOfFishesInPond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int types=1;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(ar[i]!=ar[i+1]){
                types++;
            }
        }
        System.out.println(count);
    }
}
