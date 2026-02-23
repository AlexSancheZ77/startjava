// Задание на именование переменных

// 1. РАЗНЫЕ ПЕРЕМЕННЫЕ
public class VariableNamesTheme {   
    public static void main(String[] args) {
        System.out.println("\n        1. РАЗНЫЕ ПЕРЕМЕННЫЕ\n");

        // Цифра
        int digit = 10;
        System.out.println("Цифра = " + digit);

        // Сумма чисел
        int numberSum = 11 + 10;
        System.out.println("\nСумма чисел = " + numberSum);

        // Произведение цифр
        int numProduct = 3 * 7;
        System.out.println("\nПроизведение цифр = " + numProduct);

        // Максимальное число
        int maxNum = 999;
        System.out.println("\nМаксимальное число = " + maxNum);

        // Количество десятков
        int tenCount = 44 / 10;
        System.out.println("\nКоличество десятков = " + tenCount);

        // Вес собаки
        int dogWeight = 17;
        System.out.println("\nВес собаки = " + dogWeight + " кг");

        // Исходное число
        int originalNum = 30;
        System.out.println("\nИсходное число = " + originalNum);

        // Процент по вкладу
        double percentageOfDeposit = 5.5;
        System.out.println("\nПроцент по вкладу = " + percentageOfDeposit + "%");

        // символ &
        char ampersand = '&';
        System.out.println("\nСимвол " + ampersand + " = нельзя использовать в имени переменной в Java. " + 
                "Можно использовать 'and', \n'_' или camelCase для передачи смысла 'и'.");

        // Код ошибки
        int errCode = 404;
        System.out.println("\nКод ошибки = " + errCode);

        // Тип сообщения
        String msgType = "404 Not Found";
        System.out.println("\nТип сообщения = " + msgType);

        // Число нулей
        int zeroNum = 3;
        System.out.println("\nЧисло нулей в 1'000 = " + zeroNum);

        // Уникальное число
        int unicueNum = 777;
        System.out.println("\nУникальное число = " + unicueNum);

        // Случайное число
        int randomNum = 56;
        System.out.println("\nСлучайное число = " + randomNum);

        // Математическое выражение
        float mathematicalExpression = (2 * 5) + 5 * 2 / 3f;
        System.out.println("\nМатематическое выражение = (2 * 5) + 5 * 2 / 3 = " + mathematicalExpression);

        // Счет в игре
        String inGameScore = "LIV|5:0|ARS";
        System.out.println("\nСчет в игре = " + inGameScore);

        // Максимальная длина
        String lenMax = "52 метра";
        System.out.println("\nМаксимальная длина = " + lenMax);

        // Пункт меню
        String menuItem = "Номер один";
        System.out.println("\nПункт меню = " + menuItem);

        // Стоимость кофе
        int coffeCost = 1200;
        System.out.println("\nСтоимость кофе = " + coffeCost + " руб.");

        // Начальная дата
        String startingDate = "19.02.2026";
        System.out.println("\nНачальная дата = " + startingDate);

        // Окончание диапазона
        int beginningOfRange = 1;
        int endOfRange = 99;
        System.out.println("\nОкончание диапазона = [" + beginningOfRange + " , " + endOfRange + "]");

        // Имя работника месяца
        String employeeOfTheMonthName = "Василиса Максимовна";
        System.out.println("\nИмя работника месяца = " + employeeOfTheMonthName);

        // Название электронной книги
        String ebookName = "'Искусство программирования'";
        System.out.println("\nНазвание электронной книги = " + ebookName);

        // Размер
        int size = 1024;
        System.out.println("\nРазмер = " + size + " гб");

        // Вместимость
        String capacity = "2 литра";
        System.out.println("\nВместимость = " + capacity);

        // Счетчик
        int counter = 0;
        System.out.println("\nСчетчик = " + counter);

        // Путь до файла
        String filePath = "C:/Java/StartJava/Lesson_1";
        System.out.println("\nПуть до файла = " + filePath);

        // Количество чисел в строке
        int numCount = 0;
        System.out.println("\nКоличество чисел в строке = " + numCount);

        System.out.println("\n        2. BOOLEAN-ПЕРЕМЕННЫЕ");

        // Сотни равны?
        Boolean hundredsEqual = 100 == 100;
        System.out.println("\nСотни равны? = " + hundredsEqual);

        // Компьютер включен?
        Boolean isComputerOn = true;
        System.out.println("\nКомпьютер включен? = " + isComputerOn);

        // есть равные цифры?
        int num1 = 124;
        int num2 = 137;
        int digit1Num1 = num1 / 100;
        int digit1Num2 = (num1 / 10) % 10;
        int digit1Num3 = num1 % 10;
        int digit2Num1 = num2 / 100;
        int digit2Num2 = (num2 / 10) % 10;
        int digit2Num3 = num2 % 10;
        boolean hasEqualDigits =
                digit1Num1 == digit2Num1 || digit1Num1 == digit2Num2 || digit1Num1 == digit2Num3 ||
                digit1Num2 == digit2Num1 || digit1Num2 == digit2Num2 || digit1Num2 == digit2Num3 ||
                digit1Num3 == digit2Num1 || digit1Num3 == digit2Num2 || digit1Num3 == digit2Num3;
        System.out.println("\nесть равные цифры? = " + hasEqualDigits);
        
        // Служба создана?
        boolean isServiceCreated = false;
        System.out.println("\nСлужба создана? = " + isServiceCreated);

        // Файл пустой?
        boolean isFileAmpty = true;
        System.out.println("\nФайл пустой? = " + isFileAmpty);
        
        // Соединение активное?
        boolean isActiveConnection = true;
        System.out.println("\nСоединение активное? = " + isActiveConnection);
        
        // Новый?
        boolean isNew = false;
        System.out.println("\nНовый? = " + isNew);
        
        // Электронная почта действительная?
        boolean isValidEmail = true;
        System.out.println("\nЭлектронная почта действительная? = " + isValidEmail);
        
        // Имеются уникальные строки?
        boolean hasUniqueStrings = false;
        System.out.println("\nИмеются уникальные строки? = " + hasUniqueStrings);
        
        System.out.println("\n        3. АББРЕВИАТУРЫ");
        
        // старый universally unique identifier
        String oldUuid = "550e8400-e29b-41d4-a716-446655440000";
        System.out.println("\nCтарый универсальный идентификатор = " + oldUuid);
        
        // Производитель оперативной памяти
        String ramManufacturer = "Kingston Technology";
        System.out.println("\nПроизводитель оперативной памяти = " + ramManufacturer);
        
        // Емкость жесткого диска
        int hddCapacity = 1024;
        System.out.println("\nЕмкость жесткого диска = " + hddCapacity + " Gb");
        
        // Определение термина протокола передачи гипертекста
        String httpProtocol = "HyperText Transfer Protocol - Это набор правил, " + 
                "\n    по которым данные в интернете передаются между разными источниками, " + 
                "\n    обычно между компьютерами и серверами. (HTTP/3 - одна из версий)";
        System.out.println("\nОпределение термина протокола передачи гипертекста = " + httpProtocol);
        
        // Сокращенный uniform resource locator
        String abbreviatedUrl = "Uniform Resource Locator (URL) - https://dzen.ru/.";
        System.out.println("\nСокращенный унифицированный указатель ресурса = " + abbreviatedUrl);
        
        // Новый идентификатор клиента
        String newClientId = "e143gp54989";
        System.out.println("\nНовый идентификатор клиента = " + newClientId);
        
        // количество символов в american standard code for information interchange
        String asciiCharNum = "128";
        System.out.println("\nколичество символов в ASCII = " + asciiCharNum);
    }
} 
