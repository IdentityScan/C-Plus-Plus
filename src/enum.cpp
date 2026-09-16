#include <iostream>

// @author (Sahel_Cavalieri)
// @date 05:38 09/16/2026
// #brief Enum struct
// Information about total Lines:  39
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

// This a struct with CONSTANTS VALUES
enum Grade
{
	LOW, // 0
	MEDIUM, // 1
	HIGH, // 2
};

int main()
{
	enum Grade gd = LOW;
	std::cout << gd << "\n"; // Output 0

	switch (gd)
	{
	case 0:
		std::cout << "Grade is low.\n";
		break;
	case 1:
		std::cout << "Grade is medium.\n";
		break;
	case 2:
		std::cout << "Grade is high.\n";
		break;
	default:
		std::cout << "It's not valid grade.\n";
	}

	return 0;
}
