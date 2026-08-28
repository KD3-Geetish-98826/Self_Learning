/* 1. Write a program to implement `swap()` by value and compare the result with reference-
based swap. */

#include <iostream>
using namespace std;

void swapByValue(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
}

void swapByReference(int *a, int *b)
{
    
    int temp = *a;
    *a = *b;
    *b = temp;
}
int main()
{
    int num1 = 10;
    int num2 = 20;

    cout << "Before swapByValue: ";
    cout << num1 << " " << num2 << endl;
    
    swapByValue(num1, num2);
    cout << "After swapByValue: ";
    cout << num1 << " " << num2 << endl;
    
    cout << "\nBefore swapByReference: ";
    cout << num1 << " " << num2 << endl;
    
    swapByReference(&num1, &num2);

    cout << "After swapByReference: ";
    cout << num1 << " " << num2 << endl;
    return 0;
}