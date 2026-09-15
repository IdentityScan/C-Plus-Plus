#include <iostream>

// @author (Sahel_Cavalieri)
// @date 10:14 09/15/2026
// #brief Array, acess by index and Array's Size
// Information about total Lines:  24
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	int grade[5] = { 1,2,3,4,5 };

	// Size array isn't use length() and sizeof
	// Size type (int data type) / size first element array
	int sizeArray = sizeof(grade) / sizeof(grade[0]);

	std::cout << grade[0] << "\n"; // Output first element - 1
	std::cout << grade[4] << "\n"; // Output last element - 5

	// Why size - 1? Size's totals = 5 (but the last index is 4)
	std::cout << grade[sizeArray - 1] << "\n"; // Same grade[4], last element
	return 0;
}
