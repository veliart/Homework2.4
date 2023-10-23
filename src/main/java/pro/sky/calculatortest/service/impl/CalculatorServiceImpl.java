package pro.sky.calculatortest.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculatortest.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	@Override
	public int addition(int num1, int num2) {
		return (num1 + num2);
	}
	@Override
	public int subtraction(int num1, int num2) {
		return (num1 - num2);
	}
	@Override
	public int multiplication(int num1, int num2) {
		return (num1 * num2);
	}
	public double division(int num1, int num2) {
		return ((double) num1 / (double) num2);
	}
}
