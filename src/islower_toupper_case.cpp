#include <iostream>
#include<string>

// @author (Sahel_Cavalieri)
// @date 09:17 09/15/2026
// #brief Identity upper or lower case on sentence and convert first letter to upperscale
// Information about total Lines:  33
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	std::string word = "Xena Warrior Princess";
	std::string nword = "default";
	int flag = std::islower(word[0]);
	std::cout << flag << "\n";
	if (!flag)
	{
		std::cout << "Is Upper Scale. Because first letter is X\n";
		std::cout << word << "\n";
	}
	else
	{
		std::cout << "Is lower Scale. Because first letter is x\n";
		nword = word;
		nword[0] = std::toupper(nword[0]);
		std::cout << "Now first letter is Upper Scale.\n";
		std::cout << nword << "\n";
	}


	return 0;
}
