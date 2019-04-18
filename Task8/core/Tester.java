package core;


/*
 * 1. ����������� � ���� ������ 3 ������������, ������ �� ������� ����� ��������������� �������� ������ 
 * ��������� this(...); ����������� � ���������� ������ ���������� ������� � ������� ������� ��������.
   2. �������� ��� ������� ���� get- � set- ������ � ������� ������� ������ ������ ������.
   3. �������� ����� � ������� ������� ������ ������ ������, ������� ����� ���������� salary*2;
   4. �������� ����� � ������� ������� ������ ������ ������, ������� ����� ���������� ���������� ����� � �������;
   5. �������� ����� � ������� ������� ������ ������ � ��� ����������� � ������ �������, ������� ������� �� ����� 
   ��� � �������;
   6. �������� ����� � ������� ������� ��������, ������� � ���� ������ ����� �������� ��� ���������� � ������������.
 */

public class Tester {

	public String name;
	public String surname;
	protected int experienceInYears;
	String englishLevel;
	private double salary;
	
	// 1 + ��� �������: ���� ����������� ��������� �������� ������� � ������ ������� ��� ������ ������ �� private/protected 
	// ������������� ����� ������ ��� ������������ ������ ����� ������, ����������� ***
	private Tester(String name, String surname) 
	{
		this.name = name;
		this.surname = surname;
		printNameSurname();
	}	
	
	Tester(String name, String surname, String englishLevel) 
	{
		this(name, surname);
		this.englishLevel = englishLevel;
	}	
	
	public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) 
	{
		this(name, surname, englishLevel);
    	this.experienceInYears = experienceInYears;
		this.salary = salary;
	}

	// 2
	String getName() 
	{
		return name;
	}

	void setName(String name) 
	{
		this.name = name;
	}

	String getSurname() 
	{
		return surname;
	}

	void setSurname(String surname) 
	{
		this.surname = surname;
	}

	int getExperienceInYears() 
	{
		return experienceInYears;
	}

	void setExperienceInYears(int experienceInYears) 
	{
		this.experienceInYears = experienceInYears;
	}

	String getEnglishLevel() 
	{
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) 
	{
		this.englishLevel = englishLevel;
	}

	double getSalary() 
	{
		return salary;
	}

	void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	// 3
	private double doubleSalary()
	{
		final int salary_2 = 2;
		return salary_2*this.salary;
	}
	
	// 4
	int experienceInMonths ()
	{
		final int ExperienceWorking = 12;
		return ExperienceWorking * experienceInYears;
	}

	// 5 
	protected void printNameSurname()
	{
		System.out.println(this.name + " " + this.surname);
	}
	
	// 6 
	public void printAll()
	{
		final String C = " ";
		System.out.println(this.name + C + this.surname + C + this.experienceInYears + C + this.englishLevel + C + this.salary);
	}
	
	// *** ���. �������: ����� ��� ������ ������������, ������������ � ������ �������
	public static Tester newTester (String name, String surname)
	{
		return new Tester(name, surname);
	}
}
