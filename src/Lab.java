public class Lab {

	private void showArray(int[] arr) {
		System.out.print("Массив: ");
		for (int j : arr) {
			System.out.print(j + " ");
		}
	}

	private long abs(long value) {
		if (value < 0) {
			value = -value;
		}
		return value;
	}

	// I Методы
	//1.1
	public double fraction(double value) {
		return value - (int) value;
	}

	//1.3
	public int charToNum(char value) {
		return (int) value - (int) '0';
	}

	//1.5
	public boolean is2Digits(int value) {
		int absValue = abs(value);
		return absValue / 10 != 0 && absValue / 100 == 0;
	}

	//1.7
	public boolean isInRange(int a, int b, int num) {
		return (num >= a && num <= b) || (num >= b && num <= a);
	}

	//1.9
	public boolean isEqual(int a, int b, int c) {
		return a == b && b == c;
	}


	//II Условия
	//2.1
	public int abs(int value) {
		if (value < 0) {
			value = -value;
		}
		return value;
	}

	//2.3
	public boolean is35(int value) {
		int absValue = abs(value);
		return (absValue % 3 == 0 || absValue % 5 == 0) && absValue % 15 != 0;
	}

	//2.5
	public int max3(int x, int y, int z) {
		int maxim = x;
		if (y > maxim) {
			maxim = y;
		}
		if (z > maxim) {
			maxim = z;
		}
		return maxim;
	}

	//2.7
	public int sum2(int x, int y) {
		int sum = x + y;
		if (sum >= 10 && sum <= 19) {
			sum = 20;
		}
		return sum;
	}

	//2.9
	public String day(int value) {
		String result;
		switch (value) {
			case 1:
				result = "Понедельник";
				break;
			case 2:
				result = "Вторник";
				break;
			case 3:
				result = "Среда";
				break;
			case 4:
				result = "Четверг";
				break;
			case 5:
				result = "Пятница";
				break;
			case 6:
				result = "Суббота";
				break;
			case 7:
				result = "Воскресенье";
				break;
			default:
				result = "Это не день недели";
		}
		return result;
	}


	//III Циклы
	//3.1
	public String listNums(int value) {
		String result = "";
		for (int i = 0; i <= value; i++) {
			result += i + " ";
		}
		return result;
	}

	//3.3
	public String chet(int value) {
		String result = "";
		for (int i = 0; i <= value; i = i + 2) {
			result += i + " ";
		}
		return result;
	}

	//3.5
	public int numLen(long value) {
		long temp = abs(value);
		int i = 1;
		while (temp / 10 != 0) {
			temp = temp / 10;
			i++;
		}
		return i;
	}

	//3.7
	public void square(int value) {
		String line = "";
		for (int i = 0; i < value; i++) {
			line += "*";
		}

		for (int i = 0; i < value; i++) {
			System.out.println(line);
		}
	}

	//3.9
	public void rightTriangle(int value) {
		String line;
		for (int i = 1; i <= value; i++) {
			line = "";
			for (int j = value - i; j > 0; j--) {
				line += " ";
			}

			for (int j = i; j > 0; j--) {
				line += "*";
			}
			System.out.println(line);
		}
	}


	//IV Массивы
	//4.1
	public int findFirst(int[] arr, int value) {
		int i = 0, id = -1;
		while (id == -1 && i < arr.length) {
			if (arr[i] == value) {
				id = i;
			}
			i++;
		}
		return id;
	}

	//4.3
	public int maxAbs(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (abs(arr[i]) > abs(max)) {
				max = arr[i];
			}
		}
		return max;
	}

	//4.5
	public int[] add(int[] arr, int[] ins, int pos) {
		int[] newArr = new int[arr.length + ins.length];
		for (int iArr = 0, iIns = 0, iNewArr = 0; iNewArr < newArr.length; iNewArr++) {
			if (iArr < pos) {
				newArr[iNewArr] = arr[iArr];
				iArr++;
			} else if (iIns < ins.length) {
				newArr[iNewArr] = ins[iIns];
				iIns++;
			} else {
				newArr[iNewArr] = arr[iArr];
				iArr++;
			}
		}
		showArray(arr);
		showArray(ins);
		return newArr;
	}

	//4.7
	public int[] reverseBack(int[] arr) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[arr.length - i - 1];
		}
		return newArr;
	}

	//4.9
	public int[] findAll(int[] arr, int x) {
		int lenNewArr = 0;
		for (int iArr = 0; iArr < arr.length; iArr++) {
			if (arr[iArr] == x) {
				lenNewArr++;
			}
		}

		int[] newArr = new int[lenNewArr];
		for (int iArr = 0, iNewArr = 0; iArr < arr.length; iArr++) {
			if (arr[iArr] == x) {
				newArr[iNewArr] = iArr;
				iNewArr++;
			}
		}
		return newArr;
	}

}

