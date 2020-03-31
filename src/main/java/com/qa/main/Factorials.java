package com.qa.main;

public class Factorials 
{
	public static int getFactorialNumber(int bigBoiNum)
	{
		int i = 1;
		int j = i;
		while (j < bigBoiNum)
		{
			i++;
			j = j * i;
			if (j == bigBoiNum)
			{
				return i;
			}
		}
		System.out.println("None");
		i = 0;
		return i;
	}

}
