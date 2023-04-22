//implementing the 'Worksheet' interface
class matrix implements worksheet
{
    //created matrix will be a subset of complete worksheet
    matrix(int m, int n)
    {
    }

    //taking worksheet and New row number as input
    float[][] addRow(float[][] worksheet, int m)
    {
        return worksheet;
    }

    //taking worksheet and New column number as input
    float[][] addColumn(float[][] worksheet, int n)
    {
        return worksheet;
    }

    //taking worksheet and 'to be deleted' row number as input
    float[][] deleteColumn(float[][] worksheet, int m)
    {
    return worksheet;
    }

    //taking worksheet and 'to be deleted' column number as input
    float[][] deleteRow(float[][] worksheet, int n)
    {
    return worksheet;
    }

    //taking expression (operands and operation) as a parameter to evaluate
    public float calculator(String exp)
    {
        return 0;
    }
}