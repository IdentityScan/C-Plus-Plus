#include <iostream>

// @author (Sahel_Cavalieri)
// @date 09:47 09/15/2026
// #brief Loop use While and If conditional
// Information about total Lines:  27
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	bool flagcycle = true;
	int count = 10;

	while (flagcycle != false)
	{
		std::cout << "Countdown: " << count << "\n";
		if (count <= 0)
		{
			flagcycle = false;
		}
		count--;
	}

	return 0;
}
