public class cloud_Analogy {

        public static void fun(int n) {
            // code here
            int size=n+(n-1);
            char ch=65;

            char[][] arr=new char[size][size];
            int frow=0;
            int fcol=0;
            int lrow=size-1;
            int lcol=size-1;
            int count=0;

            while(n>0 && count<(size*size))
            {
                for(int i=fcol; i<=lcol; i++)
                {
                    arr[frow][i]=(char)ch;
                    count++;
                }
                frow++;
                for(int i=frow; i<=lrow; i++)
                {
                    arr[i][lcol]=(char)ch;
                    count++;
                }
                lcol--;
                for(int i=lcol; i>=fcol; i--)
                {
                    arr[lrow][i]=(char)ch;
                    count++;
                }
                lrow--;
                for(int i=lrow; i>=frow; i--)
                {
                    arr[i][fcol]=(char)ch;
                    count++;
                }
                fcol++;
                ch++;
            }

            for(int i=0; i<size; i++)
            {
                for(int j=0; j<size; j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        int n = 5;
        fun(n);
    }
}
