    #include <iostream>
#include <string>
using namespace std;

class Student
{
private:
    int rollNo;
    string name;
    double marks;

public:
    Student(void)
    {
        rollNo = 0;
        name = "";
        marks = 0.0;
    }

    void setRollNo(int rollNo)
    {
        this->rollNo = rollNo;
    }

    void setName(string name)
    {
        this->name = name;
    }

    void setMarks(double marks)
    {
        if (marks < 0)
        {
            throw marks;
        }

        this->marks = marks;
    }

    void display(void)
    {
        cout << "Roll No : " << rollNo << endl;
        cout << "Name    : " << name << endl;
        cout << "Marks   : " << marks << endl;
    }
};


// User-defined Smart Pointer
class StudentPtr
{
private:
    Student *ptr;

public:
    StudentPtr(Student *ptr)
    {
        this->ptr = ptr;
    }

    ~StudentPtr(void)
    {
        delete ptr;
    }

    Student* operator->(void)
    {
        return ptr;
    }
};


int main()
{
    try
    {
        StudentPtr s(new Student);

        int rollNo;
        string name;
        double marks;

        cout << "Enter Roll No: ";
        cin >> rollNo;

        cout << "Enter Name: ";
        cin >> name;

        cout << "Enter Marks: ";
        cin >> marks;

        s->setRollNo(rollNo);
        s->setName(name);
        s->setMarks(marks);

        s->display();
    }
    catch(...)
    {
        cout << "Invalid input" << endl;
    }

    return 0;
}