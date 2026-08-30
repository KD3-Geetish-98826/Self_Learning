#include <iostream>
using namespace std;

class Student
{
private:
    int rollno;
    int marks;

public:
    Student(void) : rollno(0), marks(0) {}
    Student(int rollno, int marks) : rollno(rollno), marks(marks) {}

    void acceptRecord()
    {
        cout << "Enter the roll no.: ";
        cin >> rollno;
        cout << "Enter the marks: ";
        cin >> marks;
    };

    void showRecord()
    {
        cout << "Roll no. : " << rollno << endl;
        cout << "Marks: " << marks << endl;
    }

    void setMarks(int marks)
    {
        this->marks = marks;
    }
    int getMarks(void)
    {
        return marks;
    }
};

int menuList()
{
    int choice;
    cout << "Enter 0 to exist the program " << endl;
    cout << "Enter 1 to display All student records " << endl;
    cout << "Enter 2 to display Highest marks " << endl;
    cin >> choice;
    return choice;
};

int main()
{
    int n;
    int choice;
    cout << "Enter the no. of students: ";
    cin >> n;

    Student *arr = new Student[n];
    for (int index = 0; index < n; index++)
    {
        arr[index].acceptRecord();
    }

    while ((choice = menuList()) != 0)
    {
        switch (choice)
        {
        case (1):
        {
            for (int index = 0; index < n; index++)
            {
                arr[index].showRecord();
            }
            break;
        }
        case (2):
        {
            int max = arr[0].getMarks();
            for (int index = 1; index < n; index++)
            {
                if (arr[index].getMarks() > max)
                    max = arr[index].getMarks();
            }
            cout << "Heightest Marks is: " << max << endl;
            break;
        }
        default:
            cout << "Invaid choice" << endl;
            break;
        }
    }
    delete[] arr;
    arr = NULL;
    return 0;
}