import java.util.Scanner;
class Fish {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || j==0 || i==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=1;j<n;j++){
                if(i+j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=1;j<n;j++){
                if(i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        System.out.print("\n");
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1 || j==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=1;j<n;j++){
                if(i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=1;j<n;j++){
                if(i+j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        System.out.print("\n");
        }
    sc.close();
    }
}

 
