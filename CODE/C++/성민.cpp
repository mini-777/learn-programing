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
	cout << "10000���� ���� ������ �Է��Ͻÿ� ";
	int a;
	int count = 0;
	cin >> a;
	count = (a < 10) ? 1 : (a < 100) ? 2 : (a < 1000) ? 3 : (a < 10000) ? 4 : printf("10000���� Ů�ϴ�.");

	cout << count << "�ڸ� ���Դϴ�" << endl;

	return 0;

}