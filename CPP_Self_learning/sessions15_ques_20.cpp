#include <iostream>
#include <memory>
using namespace std;

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

    void display(void)
    {
        cout << "Roll No: " << rollNo << endl;
        cout << "Name: " << name << endl;
    }

    ~Student(void)
    {
        cout << "Student object destroyed." << endl;
    }
};


int main()
{
    unique_ptr<Student> p1(new Student(101, "Geetish"));

    cout << "Student through p1:" << endl;
    p1->display();

    unique_ptr<Student> p2 = move(p1);

    cout << endl;
    cout << "Ownership transferred from p1 to p2." << endl;

    cout << "Student through p2:" << endl;
    p2->display();

    if (p1 == NULL)
    {
        cout << "p1 no longer owns the object." << endl;
    }


    cout << endl;

    shared_ptr<Student> s1(new Student(102, "Rahul"));

    shared_ptr<Student> s2 = s1;

    cout << "Student through s1:" << endl;
    s1->display();

    cout << endl;
    cout << "Student through s2:" << endl;
    s2->display();

    cout << endl;
    cout << "Number of owners: " << s1.use_count() << endl;




    cout << endl;

    weak_ptr<Student> w1 = s1;

    cout << "weak_ptr created." << endl;

    cout << "Number of shared owners: "
         << s1.use_count() << endl;

    if (!w1.expired())
    {
        cout << "Object is still alive." << endl;

        shared_ptr<Student> temp = w1.lock();

        if (temp != NULL)
        {
            cout << "Student accessed through weak_ptr:" << endl;
            temp->display();
        }
    }

    return 0;
}