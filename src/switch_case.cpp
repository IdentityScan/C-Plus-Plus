#include <iostream>

// @author (Sahel_Cavalieri)
// @date 09:53 09/15/2026
// #brief Switch for specific option
// Information about total Lines:  42
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	int weekday = 2;

	switch (weekday)
	{
	case 0:
		std::cout << "Monday.\n";
		break;
	case 1:
		std::cout << "Tuesday.\n";
		break;
	case 2:
		std::cout << "Wednesday.\n";
		break;
	case 3:
		std::cout << "Tursday.\n";
		break;
	case 4:
		std::cout << "Friday.\n";
		break;
	case 5:
		std::cout << "Saturday.\n";
		break;
	case 6:
		std::cout << "Sunday.\n";
		break;
	default:
		std::cout << "Is invalid weekday.\n";
	}

	return 0;
}
