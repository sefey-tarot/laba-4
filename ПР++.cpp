#include <iostream>
#include <ctime>
using namespace std;
int b;
int c;
int n;
long int result = 0;
long long int answer = 0;

int F(int digit2) {
	if (digit2 == 0) {
		answer = answer + 0;
	}
	else if (digit2 > 0) {
		for (int i = 1; i <= digit2; i++) {
			if (i == 1) {
				answer = answer + (((b * 2) + c - 1)*100000000);
			}
			else {
				answer = 0;
				for (int j = 1; j < 100000001; j++) {
					answer = answer + ((b * 2) + c - i);
				}
			}
			result = answer + result;
		}
	}
	return result;
}
int main() {

	setlocale(LC_ALL, "Russian");
	cout << "Введите b";
	cin >> b;
	cout << "Введите c";
	cin >> c;
	cout << "Введите i";
	cin >> n;
	unsigned int start_time = clock();
	cout << F(n) << endl;
	unsigned int end_time = clock();
	unsigned int search_time = end_time - start_time;
	cout << search_time;
}
