public class VariableNamesTheme {   
    public static void main(String[] args) {
        System.out.println("\n        1. РАЗНЫЕ ПЕРЕМЕННЫЕ\n");

        // Цифра
        int digit = 10;
        System.out.println("- Цифра = " + digit);

        // Сумма чисел
        int numberSum = 11 + 10;
        System.out.println("- Сумма чисел = " + numberSum);

        // Произведение цифр
        int numProduct = 3 * 7;
        System.out.println("- Произведение цифр = " + numProduct);

        // Максимальное число
        int maxNum = 999;
        System.out.println("- Максимальное число = " + maxNum);

        // Количество десятков
        int tenCount = 44 / 10;
        System.out.println("- Количество десятков = " + tenCount);

        // Вес собаки
        int dogWeight = 17;
        System.out.println("- Вес собаки = " + dogWeight + " кг");

        // Исходное число
        int originalNum = 30;
        System.out.println("- Исходное число = " + originalNum);

        // Процент по вкладу
        double percentageOfDeposit = 5.5;
        System.out.println("- Процент по вкладу = " + percentageOfDeposit + "%");

        // символ &
        char ampersand = '&';
        System.out.println("- Символ " + ampersand + " = нельзя использовать в имени переменной в Java. " + 
                "Можно использовать 'and', \n    '_' или camelCase для передачи смысла 'и'.");

        // Код ошибки
        int errCode = 404;
        System.out.println("- Код ошибки = " + errCode);

        // Тип сообщения
        String msgType = "404 Not Found";
        System.out.println("- Тип сообщения = " + msgType);

        // Число нулей
        int zeroNum = 3;
        System.out.println("- Число нулей в 1'000 = " + zeroNum);

        // Уникальное число
        int uniqueNum = 777;
        System.out.println("- Уникальное число = " + uniqueNum);

        // Случайное число
        int randomNum = 56;
        System.out.println("- Случайное число = " + randomNum);

        // Математическое выражение
        float mathExpression = (2 * 5) + 5 * 2 / 3f;
        System.out.println("- Математическое выражение = (2 * 5) + 5 * 2 / 3 = " + mathExpression);

        // Счет в игре
        String gameScore = "LIV|5:0|ARS";
        System.out.println("- Счет в игре = " + gameScore);

        // Максимальная длина
        String maxLen = "52 метра";
        System.out.println("- Максимальная длина = " + maxLen);

        // Пункт меню
        String menuItem = "Номер один";
        System.out.println("- Пункт меню = " + menuItem);

        // Стоимость кофе
        int coffeCost = 1200;
        System.out.println("- Стоимость кофе = " + coffeCost + " руб.");

        // Начальная дата
        String startDate = "19.02.2026";
        System.out.println("- Начальная дата = " + startDate);

        // Окончание диапазона
        int startRange = 1;
        int endRange = 99;
        System.out.println("- Окончание диапазона = [" + startRange + " , " + endRange + "]");

        // Имя работника месяца
        String monthEmployeeName = "Василиса Максимовна";
        System.out.println("- Имя работника месяца = " + monthEmployeeName);

        // Название электронной книги
        String ebookTitle = "'Искусство программирования'";
        System.out.println("- Название электронной книги = " + ebookTitle);

        // Размер
        int size = 1024;
        System.out.println("- Размер = " + size + " гб");

        // Вместимость
        String capacity = "2 литра";
        System.out.println("- Вместимость = " + capacity);

        // Счетчик
        int counter = 0;
        System.out.println("- Счетчик = " + counter);

        // Путь до файла
        String filePath = "C:/Java/StartJava/Lesson_1";
        System.out.println("- Путь до файла = " + filePath);

        // Количество чисел в строке
        int numCount = 0;
        System.out.println("- Количество чисел в строке = " + numCount);

        System.out.println("\n        2. BOOLEAN-ПЕРЕМЕННЫЕ\n");

        // Сотни равны?
        boolean isEqualHundreds = 100 == 100;
        System.out.println("- Сотни равны? = " + isEqualHundreds);

        // Компьютер включен?
        boolean isOnComputer = true;
        System.out.println("- Компьютер включен? = " + isComputerOn);

        // есть равные цифры?
        boolean hasEqualDigits = false;
        System.out.println("- есть равные цифры? = " + hasEqualDigits);
        
        // Служба создана?
        boolean isCreatedService = false;
        System.out.println("- Служба создана? = " + isCreatedService);

        // Файл пустой?
        boolean hasEmptyFile = true;
        System.out.println("- Файл пустой? = " + hasEmptyFile);
        
        // Соединение активное?
        boolean isActiveConnection = true;
        System.out.println("- Соединение активное? = " + isActiveConnection);
        
        // Новый?
        boolean isNew = false;
        System.out.println("- Новый? = " + isNew);
        
        // Электронная почта действительная?
        boolean isValidEmail = true;
        System.out.println("- Электронная почта действительная? = " + isValidEmail);
        
        // Имеются уникальные строки?
        boolean hasUniqueStrings = false;
        System.out.println("- Имеются уникальные строки? = " + hasUniqueStrings);
        
        System.out.println("\n        3. АББРЕВИАТУРЫ\n");
        
        // старый universally unique identifier
        String oldUuid = "550e8400-e29b-41d4-a716-446655440000";
        System.out.println("- Cтарый универсальный идентификатор = " + oldUuid);
        
        // Производитель оперативной памяти
        String ramManufacturer = "Kingston Technology";
        System.out.println("- Производитель оперативной памяти = " + ramManufacturer);
        
        // Емкость жесткого диска
        int hddCapacity = 1024;
        System.out.println("- Емкость жесткого диска = " + hddCapacity + " Gb");
        
        // Определение термина протокола передачи гипертекста
        String httpTermDefinition = "HyperText Transfer Protocol - Это набор правил, " + 
                "\n    по которым данные в интернете передаются между разными источниками, " + 
                "\n    обычно между компьютерами и серверами. (HTTP/3 - одна из версий)";
        System.out.println("- Определение термина протокола передачи гипертекста = " + httpTermDefinition);
        
        // Сокращенный uniform resource locator
        String shortUrl = "Uniform Resource Locator (URL) - https://dzen.ru/.";
        System.out.println("- Сокращенный унифицированный указатель ресурса = " + shortUrl);
        
        // Новый идентификатор клиента
        String newCid = "e143gp54989";
        System.out.println("- Новый идентификатор клиента = " + newCid);
        
        // количество символов в american standard code for information interchange
        String asciiCharNum = "128";
        System.out.println("- количество символов в ASCII = " + asciiCharNum);
    }
} 