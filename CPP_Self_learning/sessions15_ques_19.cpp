#include <iostream>
#include <list>
#include <algorithm>
using namespace std;

int main()
{
    list<int> numbers;

    numbers.push_back(25);
    numbers.push_back(10);
    numbers.push_back(45);
    numbers.push_back(5);
    numbers.push_back(30);
    numbers.push_back(15);
    numbers.push_back(50);
    numbers.push_back(20);
    numbers.push_back(40);
    numbers.push_back(35);

    cout << "List in reverse order:" << endl;

    list<int>::reverse_iterator rit;

    for (rit = numbers.rbegin(); rit != numbers.rend(); rit++)
    {
        cout << *rit << " ";
    }

    cout << endl;

    list<int>::iterator it;

    for (it = numbers.begin(); it != numbers.end(); it++)
    {
        *it = *it + 5;
    }

    cout << endl;
    cout << "List after incrementing each number by 5:" << endl;

    list<int>::const_iterator cit;

    for (cit = numbers.begin(); cit != numbers.end(); cit++)
    {
        cout << *cit << " ";
    }

    cout << endl;

    numbers.sort();

    cout << endl;
    cout << "Sorted modified list:" << endl;

    for (it = numbers.begin(); it != numbers.end(); it++)
    {
        cout << *it << " ";
    }

    cout << endl;

    return 0;
}