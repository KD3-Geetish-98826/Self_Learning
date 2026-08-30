#include <iostream>
using namespace std;

class Programmer
{
private:
string name;
int experience;
string programmingLanguage;

public:
    Programmer(void): name(" "), experience(0), programmingLanguage(" "){
        cout<<"Constructor for ProgrammingLanguage is being called"<<endl;
    }
    void work()
    {
        cout<<"Developers programs for the betterment of society"<<endl;
    }
};

class Teacher
{
private:
    string name;
    string subject;
    int experience;
public:
    Teacher(void): name(" "), subject(" "), experience(0){
        cout<<"Constructor for Teacher is being called"<<endl;
    }
    void work()
    {
        cout<<"Teacher teach students for better future "<<endl;
    }
};

class ProgrammingTeacher : public Programmer, public Teacher
{
    private:
    string courseName;

    public:
    ProgrammingTeacher(void): courseName(" "){
        cout << "ProgrammingTeacher constructor called" << endl;
    }

};

int main(){
    ProgrammingTeacher pt;
    pt.Programmer:: work();
    pt.Teacher:: work();
}
