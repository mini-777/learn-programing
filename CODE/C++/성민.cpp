#include <iostream>
using namespace std;


/*
void main()
{
	int a = 3;
	int b = 7;

	a = a ^ b;
	b = a ^ b;
	a = a ^ b;


	cout << a << " " << b << endl;

}

*/
int main()
{
	cout << "10000보다 작은 정수를 입력하시오 ";
	int a;
	int count = 0;
	cin >> a;
	count = (a < 10) ? 1 : (a < 100) ? 2 : (a < 1000) ? 3 : (a < 10000) ? 4 : printf("10000보다 큽니다.");

	cout << count << "자리 수입니다" << endl;

	return 0;

}