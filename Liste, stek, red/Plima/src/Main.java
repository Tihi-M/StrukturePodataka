import java.util.Scanner;

public class Main {
	public static Scanner sc  =new Scanner(System.in);
	
	public static void fillMatrix(int matrix[][],int m ,int n) {
		for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
	}
	
	public static int[][] azurirajMapu(int map[][], int m , int n){
        int nova[][] = new int[m][n];
        for(int i=0; i<m; i++) 
            for (int j = 0; j < n; j++)
                nova[i][j] = map[i][j];
        

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==0){
                    if(i-1>=0)
                        nova[i-1][j] = 0;
                    if(j-1>=0)
                        nova[i][j-1] = 0;
                    if(i+1<m)
                        nova[i+1][j] = 0;
                    if(j+1<n)
                        nova[i][j+1] = 0;
                }
            }
        }
        return nova;
    }
	
	public static void printMap(int[][] matrix, int m, int n) {
    	for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    	
    }
	
    public static int[][] plima(int[][] map,int m, int n, int k){
        
        for(int i=0; i<k; i++){
            map = azurirajMapu(map,m,n);
        }

        return map;
    }
    
    
    
    public static void main(String[] args) {
    	int m,n,k;
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();

        int matrix[][] = new int[m][n];
        fillMatrix(matrix,m,n);
        matrix = plima(matrix,m,n,k);
        
        printMap(matrix,m,n);
    }
    
}
