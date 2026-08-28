/* 6. Create a class BankAccount with private data members (accountNumber,
accountHolderName, balance). Provide public member functions to deposit, withdraw, and
display balance. Create an object in main() and demonstrate encapsulation by accessing
data only through public functions i.e. deposit(), withdraw().  */

#include <iostream>
using namespace std;

class BankAccount
{
private:
    long int accountNumber;
    string accountHolderName;
    double balance;

public:
    void deposit( double deposit)
    {
        balance = balance + deposit ;
    }

    void withdraw( double withdraw)
    {
        balance = balance - withdraw ; 
    }

    double displayBalance( void ){
        return balance;
    }

};

int menuList(){
    int choice;
    cout<<"Enter 0 to exist the program"<<endl;
    cout<<"Enter 1 to make deposit in the bank account"<<endl;
    cout<<"Enter 2 to make withdraw from the bank account"<< endl;
    cout<<"Enter 3 to check the balance of the bank account"<<endl;
    cin>>choice;
    return choice;
}

int main()
{
    BankAccount b;
    int choice;
    while((choice = menuList()) != 0){
        switch (choice)
        {
        case (1):
        {
            double deposit;
            cout<<"Enter the deposit amount: ";
            cin>>deposit;
            b.deposit(deposit);
            cout<<"Deposit Done Successfully"<<endl;
            break;
        }
        case (2):
        {
            double withdraw;
            cout<<"Enter how much do you want to withdraw: ";
            cin>> withdraw;
            if (withdraw <= b.displayBalance()){
                b.withdraw(withdraw);
                cout<<"Withdrawal Done Successfully"<<endl;
            }
            else{
                cout<<"Insufficent Balance"<<endl;
            }
            break;
        }
        case (3):
        {
            cout<<"The balance is: "<<b.displayBalance()<<endl;
            break;
        }
        default:
            cout<<"Invalid choice"<<endl;
            break;
        }
    }
}