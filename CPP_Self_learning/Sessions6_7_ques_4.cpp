#include<iostream>
using namespace std;

class Laptop{

    private:
    int brandId;
    double price;

    public:
    Laptop(void): brandId(1), price(50000){
        cout<<"Laptop Constructor Called"<<endl;
    }
    ~Laptop(){
        cout<<"Laptop Destructor Called"<<endl;
    }
    void display(){
        cout<<"Laptop Brand ID: "<<brandId<<endl;
        cout<<"Laptop Price: "<<price<<endl;
    }

};

int main(){
    Laptop l;
    l.display();
}