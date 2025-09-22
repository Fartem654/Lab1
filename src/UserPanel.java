public class UserPanel {

	CheckInput input = new CheckInput();
	Lab lab = new Lab();

	private void showArray(int[] arr) {
		System.out.print("Результат: ");
		for (int j : arr) {
			System.out.print(j + " ");
		}
	}

	// Задача 1
	private void t1C1() {
		System.out.println("Методы, задача 1");
		double value = input.inputDouble("Введите дробное число: "), result = 0;
		result = lab.fraction(value);
		System.out.println("Результат: " + result);
	}

	private void t1C2() {
		System.out.println("Условия, задача 1");
		int value = input.inputInt(), result = 0;
		result = lab.abs(value);
		System.out.println("Результат: " + result);
	}

	private void t1C3() {
		System.out.println("Циклы, задача 1");
		int value = input.inputIntRangeMin("Введите целое число большее или равное нулю: ", -1);
		String result = "";
		result = lab.listNums(value);
		System.out.println("Результат: " + result);
	}

	private void t1C4() {
		System.out.println("Массивы, задача 1");
		int[] arr = input.createArrInt();
		int value = input.inputInt(), result;
		result = lab.findFirst(arr, value);
		System.out.println("Результат: " + result);
	}

	// задача 3
	private void t2C1() {
		System.out.println("Методы, задача 3");
		char value = input.inputCharDigit();
		int result = 0;
		result = lab.charToNum(value);
		System.out.println("Результат: " + result);
	}

	private void t2C2() {
		System.out.println("Условия, задача 3");
		int value = input.inputInt();
		boolean result = false;
		result = lab.is35(value);
		System.out.println("Результат: " + result);
	}

	private void t2C3() {
		System.out.println("Циклы, задача 3");
		int value = input.inputIntRangeMin("Введите целое число большее или равное нулю: ", -1);
		String result = "";
		result = lab.chet(value);
		System.out.println("Результат: " + result);
	}

	private void t2C4() {
		System.out.println("Массивы, задача 3");
		int[] arr = input.createArrInt();
		int result = 0;
		result = lab.maxAbs(arr);
		System.out.println("Результат: " + result);
	}

	// задача 5
	private void t3C1() {
		System.out.println("Методы, задача 5");
		int value = input.inputInt();
		boolean result = false;
		result = lab.is2Digits(value);
		System.out.println("Результат: " + result);
	}

	private void t3C2() {
		System.out.println("Условия, задача 5");
		int x = input.inputInt(), y = input.inputInt(), z = input.inputInt(), result = 0;
		result = lab.max3(x, y, z);
		System.out.println("Результат: " + result);
	}

	private void t3C3() {
		System.out.println("Циклы, задача 5");
		long value = input.inputInt();
		int result = 0;
		result = lab.numLen(value);
		System.out.println("Результат: " + result);
	}

	private void t3C4() {
		System.out.println("Массивы, задача 5");
		int[] result, arr = input.createArrInt("Создание массива 1"), ins = input.createArrInt(
				"Создание массива 2");
		int pos = input.inputIntRange("Введите позицию элемента от 0 до " + (arr.length) + ": ", -1,
				arr.length + 1);
		result = lab.add(arr, ins, pos);
		System.out.println("Позиция " + pos);
		showArray(result);
	}

	// задача 7
	private void t4C1() {
		System.out.println("Методы, задача 7");
		int a = input.inputInt(), b = input.inputInt(), num = input.inputInt();
		boolean result = false;
		result = lab.isInRange(a, b, num);
		System.out.println("Результат: " + result);
	}

	private void t4C2() {
		System.out.println("Условия, задача 7");
		int x = input.inputInt(), y = input.inputInt(), result = 0;
		result = lab.sum2(x, y);
		System.out.println("Результат: " + result);
	}

	private void t4C3() {
		System.out.println("Циклы, задача 7");
		int value = input.inputIntRangeMin("Введите целое число больше нуля:", 0);
		lab.square(value);
	}

	private void t4C4() {
		System.out.println("Массивы, задача 7");
		int[] result, arr = input.createArrInt();
		result = lab.reverseBack(arr);
		showArray(result);
	}

	// задача 9
	private void t5C1() {
		System.out.println("Методы, задача 9");
		int a = input.inputInt(), b = input.inputInt(), c = input.inputInt();
		boolean result = false;
		result = lab.isEqual(a, b, c);
		System.out.println("Результат: " + result);
	}

	private void t5C2() {
		System.out.println("Условия, задача 9");
		int value = input.inputInt();
		String result = "";
		result = lab.day(value);
		System.out.println("Результат: " + result);
	}

	private void t5C3() {
		System.out.println("Циклы, задача 9");
		int value = input.inputIntRangeMin("Введите целое число больше нуля:", 0);
		lab.rightTriangle(value);
	}

	private void t5C4() {
		System.out.println("Массивы, задача 9");
		int[] result, arr = input.createArrInt();
		int value = input.inputInt();
		result = lab.findAll(arr, value);
		showArray(result);
	}

	public void choiceTask() {
		int chapter, task;
		System.out.println("Выберите раздел: ");
		System.out.println("1 - Методы\n2 - Условия\n3 - Циклы\n4 - Массивы");
		chapter = input.inputIntRange("Введите число от 1 до 4: ", 0, 5);
		task = input.inputIntRange("Введите номер задачи от 1 до 5: ", 0, 6);

		switch (task) {
			case 1:
				switch (chapter) {
					case 1:
						t1C1();
						break;
					case 2:
						t1C2();
						break;
					case 3:
						t1C3();
						break;
					case 4:
						t1C4();
						break;
				}
				break;
			case 2:
				switch (chapter) {
					case 1:
						t2C1();
						break;
					case 2:
						t2C2();
						break;
					case 3:
						t2C3();
						break;
					case 4:
						t2C4();
						break;
				}
				break;
			case 3:
				switch (chapter) {
					case 1:
						t3C1();
						break;
					case 2:
						t3C2();
						break;
					case 3:
						t3C3();
						break;
					case 4:
						t3C4();
						break;
				}
				break;
			case 4:
				switch (chapter) {
					case 1:
						t4C1();
						break;
					case 2:
						t4C2();
						break;
					case 3:
						t4C3();
						break;
					case 4:
						t4C4();
						break;
				}
				break;
			case 5:
				switch (chapter) {
					case 1:
						t5C1();
						break;
					case 2:
						t5C2();
						break;
					case 3:
						t5C3();
						break;
					case 4:
						t5C4();
						break;
				}
				break;
		}
	}
}
