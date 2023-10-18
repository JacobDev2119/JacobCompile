#include<iostream>
using namespace std;

void jacob(){
	float grade1, grade2, grade3, grade4;
	cout << "COMPUTE THE AVERAGE\n";
	cout << endl;
	cout << "Enter your grade in English: ";
	cin >> grade1;
	cout << "Enter your grade in Math: ";
	cin >> grade2;
	cout << "Enter your grade in Science: ";
	cin >> grade3;
	cout << "Enter your grade in Filipino: ";
	cin >> grade4;
	
	float ave =  (grade1 + grade2 + grade3 +  grade4)/4;
	cout << "Your average is: " << ave;
	cout << endl;
	if(ave >= 75){
		cout << "You passed!";
		
	}
	else
		cout << "You failed!";
	
	cout << endl;
	system("pause");
	system("cls");
}

void kyle(){
	int num1, num2;
	char ope;
	cout << "CALCULATOR\n";
	cout << endl;
	cout << "Enter a number: ";
	cin >> num1;
	
	cout << "Enter a numer: ";
	cin >> num2;
	
	cout << "Choose operator: ";
	cin >> ope;
	
	if(ope == '+'){
		int sum =  num1 + num2;
		cout << "Sum: " << sum;
	}
	if(ope == '-'){
		int sub =  num1 - num2;
		cout << "Sub: " << sub;
	}
	if(ope == '*'){
		int diff =  num1 * num2;
		cout << "Sum: " << diff;
	}
	if(ope == '/'){
		int quo =  num1 / num2;
		cout << "Sum: " << quo;
	}
	cout << endl;
	system("pause");
	system("cls");
}

int main(){
int op;
	do{
	cout<<"Data Structure And Algorithm"<<endl;
	cout << "OPTIONS\n";
	cout << "[1] DELA CERNA SCENARIO\n";
	cout << "[2] ABECILLA SCENARIO\n";
	cout << "[3] Exit\n";
	cin >> op;
	
	switch(op){
		case 1: 
		system("cls");
		jacob();
		break;
		
		case 2:
		system("cls");
		kyle();
		break;
		
		case 3:
			cout << "Thank you! :)";
			break;
			
		default:
			cout << "Invalid Input\n";
			system("pause");
			system("cls");
			cout << endl;
			
			
	}
	
	}while(op != 3);
	
	
	
}