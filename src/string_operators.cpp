#include <iostream>
#include<string> // It's need for use this operators.

// @author (Sahel_Cavalieri)
// @date 09:59 09/15/2026
// #brief String's Operators like .at, .front, .back and change values by Index
// Information about total Lines:  26
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	
	std::string word = "Horizon Zero Dawn - Aloy";

	std::cout << word.at(0) << "\n"; // Output first index - H
	std::cout << word.front() << "\n"; // Same word.at(0)
	std::cout << word.back() << "\n"; // Output last index - y
	
	// Change letter by index
	word[6] = ' '; // Replace none (former n)

	std::cout << word << "\n"; // Output Horizo Zero Dawn - Aloy 

	return 0;
}
