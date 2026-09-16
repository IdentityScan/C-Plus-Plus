#include <iostream>

// @author (Sahel_Cavalieri)
// @date 06:43 09/16/2026
// #brief Inherith Class and protected attributes
// Information about total Lines:  77
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

class ResidentEvil
{
	// Only Acess own class and child class
protected:
	std::string name_customers;
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
		name_customers = "Kojima";
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

class Capcom : public ResidentEvil
{
public:
	void specificInformation()
	{
		std::cout << "Title: " << title << "\n";
		std::cout << "Customers: " << name_customers << "\n";
		std::cout << "Ip: " << p_ip << "\n";
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
	Capcom cap1;
	cap1.specificInformation();

	return 0;
}
