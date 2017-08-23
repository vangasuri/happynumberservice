package com.company.integration.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class HappyNumberService {

	public List<Integer> getHappyNumbers(Integer rangeValue) {
		return IntStream.rangeClosed(0, rangeValue).filter(this::isHappy).boxed().collect(Collectors.toList());
	}

	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();

		while (!set.contains(n)) {
			set.add(n);

			n = getSum(n);

			if (n == 1)	{
				return true;
			}
		}
		return false;
	}

	public int getSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10) * (n % 10);
			n = n / 10;
		}
		return sum;
	}
}
