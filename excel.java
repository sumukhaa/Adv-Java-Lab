class excel extends matrix
{
    excel(int m, int n) 
    {
        matrix(m, n);
    }

    public static void main(String[]args)
    {
        //creating a new worksheet
        excel worksheet= new excel(3,3);
    }
}