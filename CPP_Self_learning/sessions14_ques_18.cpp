#include <iostream>
using namespace std;

template <class T>
class Array
{
private:
    T *arr;
    int size;

public:
    Array(void)
    {
        arr = NULL;
        size = 0;
    }

    Array(int size)
    {
        this->size = size;
        arr = new T[size];
    }

    Array(const Array<T> &a)
    {
        this->size = a.size;

        arr = new T[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = a.arr[i];
        }
    }

    Array<T>& operator=(const Array<T> &a)
    {
        if (this != &a)
        {
            delete[] arr;

            this->size = a.size;
            arr = new T[size];

            for (int i = 0; i < size; i++)
            {
                arr[i] = a.arr[i];
            }
        }

        return *this;
    }

    T& operator[](int index)
    {
        return arr[index];
    }

    int getSize(void)
    {
        return size;
    }


    ~Array(void)
    {
        delete[] arr;
    }
};


class Student
{
private:
    int rollNo;
    string name;

public:
    Student(void)
    {
        rollNo = 0;
        name = "";
    }

    Student(int rollNo, string name)
    {
        this->rollNo = rollNo;
        this->name = name;
    }

    void accept(void)
    {
        cout << "Enter Roll No: ";
        cin >> rollNo;

        cout << "Enter Name: ";
        cin >> name;
    }

    void display(void)
    {
        cout << "Roll No: " << rollNo << endl;
        cout << "Name: " << name << endl;
    }
};


int main()
{
    int n;

    cout << "Enter size of integer array: ";
    cin >> n;

    Array<int> a(n);

    cout << "Enter elements:" << endl;

    for (int i = 0; i < a.getSize(); i++)
    {
        cin >> a[i];
    }

    cout << endl;
    cout << "Integer Array:" << endl;

    for (int i = 0; i < a.getSize(); i++)
    {
        cout << a[i] << " ";
    }

    cout << endl;


    cout << endl;
    cout << "Enter number of students: ";
    cin >> n;

    Array<Student> students(n);

    for (int i = 0; i < students.getSize(); i++)
    {
        cout << endl;
        cout << "Enter details of Student " << i + 1 << ":" << endl;

        students[i].accept();
    }

    cout << endl;
    cout << "Student Details:" << endl;

    for (int i = 0; i < students.getSize(); i++)
    {
        students[i].display();
        cout << endl;
    }

    return 0;
}