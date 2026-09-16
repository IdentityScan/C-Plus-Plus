#include <iostream>
#include<fstream>
#include<string>
#include<Windows.h>

// @author (Sahel_Cavalieri)
// @date 05:23 09/16/2026
// #brief Open file and read print on screen
// Information about total Lines:  33
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	std::string content;

	std::ifstream ReadFile("sahel.txt");

	if (ReadFile.is_open())
	{
		while (std::getline(ReadFile, content))
		{
			std::cout << content;
		}
	}
	else
	{
		std::cout << "Can't possible open file.\n";
		exit(1);
	}
	
	return 0;
}
