#include <iostream>
using namespace std;

class Matrix
{
private:
    int rows, cols;
    int **data;

public:
  
    Matrix(int r, int c)
    {
        rows = r;
        cols = c;
        data = new int*[rows];
        for (int i = 0; i < rows; i++)
        {
            data[i] = new int[cols];
        }
    }


    Matrix(const Matrix &m)
    {
        rows = m.rows;
        cols = m.cols;
        data = new int*[rows];
        for (int i = 0; i < rows; i++)
        {
            data[i] = new int[cols];
            for (int j = 0; j < cols; j++)
            {
                data[i][j] = m.data[i][j];
            }
        }
    }

    void input()
    {
        cout << "Enter " << rows << "x" << cols << " matrix elements:" << endl;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                cin >> data[i][j];
    }

    void display() const
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
                cout << data[i][j] << " ";
            cout << endl;
        }
    }

    // Operator + overload
    Matrix operator+(const Matrix &m)
    {
        Matrix result(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.data[i][j] = data[i][j] + m.data[i][j];
        return result;
    }

    // Operator - overload
    Matrix operator-(const Matrix &m)
    {
        Matrix result(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.data[i][j] = data[i][j] - m.data[i][j];
        return result;
    }

    // Operator * overload (matrix multiplication)
    Matrix operator*(const Matrix &m)
    {
        Matrix result(rows, m.cols);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < m.cols; j++)
            {
                int sum = 0;
                for (int k = 0; k < cols; k++)
                {
                    sum += data[i][k] * m.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    // Destructor - deallocate memory
    ~Matrix()
    {
        for (int i = 0; i < rows; i++)
        {
            delete[] data[i];
        }
        delete[] data;
    }
};

int main()
{
    int r, c;
    cout << "Enter rows and columns: ";
    cin >> r >> c;

    Matrix m1(r, c), m2(r, c);

    cout << "Matrix 1 " << endl;
    m1.input();
    cout << "Matrix 2 " << endl;
    m2.input();

    Matrix sum = m1 + m2;
    Matrix diff = m1 - m2;
    Matrix product = m1 * m2;

    cout << "Sum " << endl;
    sum.display();

    cout << "Difference" << endl;
    diff.display();

    cout << "Product " << endl;
    product.display();

    return 0;
}