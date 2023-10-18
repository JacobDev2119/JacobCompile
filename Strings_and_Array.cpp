#include <iostream>
using namespace std;

string names[5];
string ages[5];
string addresses[5];
char genders[5];
int numPeople = 0;

void insertInformation() {
    if (numPeople < 5) {
        cout << "Enter Name: ";
        cin >> names[numPeople];
        cout << "Enter Age: ";
        cin >> ages[numPeople];
        cout << "Enter Address: ";
        cin >> addresses[numPeople];
        cout << "Enter Gender (M/F): ";
        cin >> genders[numPeople];
        numPeople++;
    } else {
        cout << "Maximum capacity reached." << endl;
    }
}

void displayInformation() {
    int index;
    cout << "Enter the index of the person you want to display (0-4): ";
    cin >> index;

    if (index >= 0 && index < numPeople) {
        cout << "Name: " << names[index] << endl;
        cout << "Age: " << ages[index] << " years" << endl;
        cout << "Address: " << addresses[index] << endl;
        cout << "Gender: " << genders[index] << endl;
    } else {
        cout << "Invalid index. Please try again." << endl;
    }
}

int main() {
    int choice;

    while (true) {
        cout << "Menu\n";
        cout << "1. Insert information\n";
        cout << "2. Display information\n";
        cout << "3. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                insertInformation();
                break;
            case 2:
                displayInformation();
                break;
            case 3:
                return 0;
            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    }

    return 0;
}
