#include <iostream>

// @author (Sahel_Cavalieri)
// @date 06:23 09/16/2026
// #brief Strutc like global variable and object
// Information about total Lines:  58
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

class ResidentEvil
{

public:
	std::string title;
	int p_ip;
	char p_identity;

	// Constructor is special method for initialization variables
	ResidentEvil()
	{
		p_ip = 34;
		p_identity = 'd';
		title = "Resident Evil 3 - Nemesis";
	}

	// Another Constructor you can add with arguments
	ResidentEvil(std::string ntitle)
	{
		title = ntitle;
		p_identity = 'c';
		p_ip = 14;
	}

	void showInformation()
	{
		//std::cout << "Number Ip: " << ip << "\n";
		std::cout << "Title: " << title << "\n";
		if (p_identity == 'c')
		{
			std::cout << "Identity: Free for All\n";
		}
		else if (p_identity == 'd')
		{
			std::cout << "Identity: For +18\n";
		}
	}
};

int main()
{
	ResidentEvil revil1;// First Constructor 
	ResidentEvil revil2("Resident Evil - Village"); // Second Constructor

	revil1.showInformation();
	revil2.showInformation();

	return 0;
}
