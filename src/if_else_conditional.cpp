#include <iostream>

// @author (Sahel_Cavalieri)
// @date 09:44 09/15/2026
// #brief Simple use of If\Else conditional comparison between values
// Information about total Lines:  24
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	int valuea = 2, valueb = 4;

	if (valuea < valueb)
	{
		std::cout << "The value " << valuea << " is minor then " << valueb << "\n";
	}
	else
	{
		std::cout << "The value " << valuea << " is major then " << valueb << "\n";
	}

	return 0;
}
