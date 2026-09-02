#include <iostream>
using namespace std;

inline long factorial(int n)
{
    long result = 1;
    for (int i = 2; i <= n; i++)
    {
        result = result * i;
    }
    return result;
}

inline double power(double base, int exp)
{
    double result = 1;
    for (int i = 0; i < exp; i++)
    {
        result = result * base;
    }
    return result;
}

int main()
{
    int num, n;
    double base;
    int exp;

    cout << "Enter a number to find factorial: ";
    cin >> num;
    cout << "Factorial of " << num << " is: " << factorial(num) << endl;

    cout << "\nEnter base and exponent to calculate power: ";
    cin >> base >> exp;
    cout << base << " ^ " << exp << " = " << power(base, exp) << endl;

    return 0;
}