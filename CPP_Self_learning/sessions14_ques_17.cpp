#include <iostream>
#include <fstream>
using namespace std;

class Student
{
private:
    int rollNo;
    string name;
    int age;
    double marks;

public:
    Student(void)
    {
        rollNo = 0;
        name = "";
        age = 0;
        marks = 0.0;
    }

    Student(int rollNo, string name, int age, double marks)
    {
        this->rollNo = rollNo;
        this->name = name;
        this->age = age;
        this->marks = marks;
    }

    void acceptDetails(void)
    {
        cout << "Enter Roll No: ";
        cin >> rollNo;

        cout << "Enter Name: ";
        cin >> name;

        cout << "Enter Age: ";
        cin >> age;

        cout << "Enter Marks: ";
        cin >> marks;
    }

    void display(void)
    {
        cout << "Roll No : " << rollNo << endl;
        cout << "Name    : " << name << endl;
        cout << "Age     : " << age << endl;
        cout << "Marks   : " << marks << endl;
    }

    void save(void)
    {
        ofstream fout("student.txt");

        if (!fout)
        {
            cout << "File could not be opened." << endl;
            return;
        }

        fout << rollNo << endl;
        fout << name << endl;
        fout << age << endl;
        fout << marks << endl;

        fout.close();

        cout << "Student data saved successfully." << endl;
    }

    void load(void)
    {
        ifstream fin("student.txt");

        if (!fin)
        {
            cout << "File could not be opened." << endl;
            return;
        }

        fin >> rollNo;
        fin >> name;
        fin >> age;
        fin >> marks;

        fin.close();

        cout << "Student data loaded successfully." << endl;
    }
};

int main()
{
    Student s1;

    s1.acceptDetails();

    s1.save();

    Student s2;

    s2.load();

    cout << endl;
    cout << "Student Details after Loading:" << endl;

    s2.display();

    return 0;
}