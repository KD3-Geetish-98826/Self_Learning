#include <iostream>
using namespace std;

class Person
{
private:
    string name;
    int age;

public:
    Person(void) : name(" "), age(0) {}

    virtual void work() = 0;

    void display()
    {
        cout << "Person is working" << endl;
    }
};

class Student : public Person
{
private:
    int marks;

public:
    Student(void) : marks(0) {}

    void work()
    {
        cout << "Student is doing academic work" << endl;
    }
    void study()
    {
        cout << "Student is studying" << endl;
    }
};

class Teacher : public Person
{
private:
    double salary;

public:
    Teacher(void) : salary(0) {}

    void work()
    {
        cout << "Teacher is preparing course" << endl;
    }
    void teach()
    {
        cout << "Teacher is teaching" << endl;
    }
};

int main()
{
    Student s;
    Teacher t;

    s.study();
    t.teach();

    Person *ptr;

    ptr = &s;
    ptr->work();

    ptr = &t;
    ptr->work();
}