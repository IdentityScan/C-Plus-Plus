#include <iostream>
#include<cctype> // It's need for use methoad isdigit()

// @author (Sahel_Cavalieri)
// @date 10:03 09/15/2026
// #brief String's Operators like isdigit(variable)
// Information about total Lines:  28
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	
	std::string wordone = "Perfect Dark - Nintendo 64";

	// Output 6 and 4

	for (int i = 0; i < wordone.length(); i++)
	{
		if (std::isdigit(wordone[i]))
		{
			std::cout << "This digit (number's value).\n";
			std::cout << wordone[i] << "\n";
		}
	}

	return 0;
}
