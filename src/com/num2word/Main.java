package com.num2word;

public class Main {

    public static void main(String[] args) {
	 NumericToWord.DefaultProcessor processor = new NumericToWord.DefaultProcessor();
	 processor.CurrencyPrefix = "Dollars";
	 processor.CurrenncySuffix = "Cents";
	 System.out.print(processor.getName(23598.56));
    }
}
