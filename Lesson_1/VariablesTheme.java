import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n        1. ВЫВОД ASCII-ГРАФИКИ\n");
        System.out.println(String.join("\n",
                "                     /\\",
                "   J    a  v     v  /  \\",
                "   J   a a  v   v  /_( )\\",
                "J  J  aaaaa  V V  /      \\",
                " JJ  a     a  V  /___/\\___\\\n"));

        String asciiJava = """
                     /\\            
               J    /  \\  v     v  a
               J   /_( )\\  v   v  a a
            J  J  /      \\  V V  aaaaa
             JJ  /___/\\___\\  V  a     a
                """;
        System.out.println(asciiJava);

        System.out.println("        2. РАСЧЕТ СТОИМОСТИ ТОВАРА\n");
        float costPen = 105.5f;
        float costBook = 235.23f;

        // общая скидка 11%
        float totalDiscount = 0.11f;
        System.out.println("- Общая стоимость товаров без скидки = " + (costPen + costBook) + " руб.");
        System.out.println("- Общая сумма скидки = " + (costPen + costBook) * totalDiscount + " руб.");
        System.out.println("- Общая стоимость товаров со скидкой = " +
                (costPen + costBook) * (1 - totalDiscount) + " руб.");
        var costPenBd = new BigDecimal("105.50");
        var costBookBd = new BigDecimal("235.23");
        var totalDiscountBd = new BigDecimal("0.11");
        var goodsSum = costPenBd.add(costBookBd);
        var discountSum = goodsSum.multiply(totalDiscountBd).setScale(2, RoundingMode.HALF_UP);
        var discountedItemsTotalCost = goodsSum.subtract(discountSum).setScale(2, RoundingMode.HALF_UP);
        System.out.println("\n- Общая стоимость товаров без скидки = " + goodsSum + " руб.");
        System.out.println("- Общая сумма скидки = " + discountSum + " руб.");
        System.out.println("- Общая стоимость товаров со скидкой = " + discountedItemsTotalCost + " руб.");

        System.out.println("\n        3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ\n");
        System.out.println("    Исходные значения: a1 = 2, b1 = 5.");
        int a1 = 2;
        int b1 = 5;
        
        System.out.println("\n- Метод: с третьей переменной.");
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println(" Результат: a1 = " + a1 + ", b1 = " + b1);
        
        System.out.println("- Метод: арифметических операций.");
        b1 = b1 * a1 / b1;
        a1 = (a1 + a1) / a1;
        System.out.println(" Результат: a1 = " + a1 + ", b1 = " + b1);
        
        System.out.println("- Метод: побитовой операции ^");
        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println(" Результат: a1 = " + a1 + ", b1 = " + b1);
        
        System.out.println("\n      4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ\n");
        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;
        System.out.printf("    %-6d%-6d%-6d%-6d%-6d%-6d%n",
                code1, code2, code3, code4, code5, code6);
        System.out.printf("    %-6c%-6c%-6c%-6c%-6c%-6c%n%n",
                code1, code2, code3, code4, code5, code6);
        System.out.printf("    %c%c%c%c%c%c",
                code1, code2, code3, code4, code5, code6);

        System.out.println("\n\n      5. АНАЛИЗ КОДА ТОВАРА\n");
        int productCode = 247;
        int productCategory = productCode / 100;
        int subcategory = (productCode / 10) % 10;
        int packagingType = productCode % 10;
        int checkSum = productCategory + subcategory + packagingType;
        int verificationCode = productCategory * subcategory * packagingType;
        System.out.printf("""
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d
                """, productCode, productCategory, subcategory,
                packagingType, checkSum, verificationCode);

        System.out.println("\n      6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ\n");
        byte temperature = Byte.MAX_VALUE;
        byte tempIncr = ++temperature;
        byte tempDecr = --temperature;
        System.out.printf("%s%n", "[Температура, °С]:");
        System.out.printf("%11s%4d%n", "Исходное:", temperature);
        System.out.printf("%5s%5d%n", "+1:", tempIncr);
        System.out.printf("%5s%4d%n%n", "-1:", tempDecr);

        short pressure = Short.MAX_VALUE;
        short pressureIncr = ++pressure;
        short pressureDecr = --pressure;
        System.out.printf("%s%n", "[Давление, Pa]:");
        System.out.printf("%11s%,7d%n", "Исходное:", pressure);
        System.out.printf("%5s%7d%n", "+1:", pressureIncr);
        System.out.printf("%5s%6d%n%n", "-1:", pressureDecr);

        char systemStatusCode = Character.MAX_VALUE;
        char systemStatusCodeIncr = ++systemStatusCode;
        char systemStatusCodeDecr = --systemStatusCode;
        System.out.printf("%s%n", "[Код состояния системы, code]:");
        System.out.printf("%11s%,7d%n", "Исходное:", (int) systemStatusCode);
        System.out.printf("%5s%2d%n", "+1:", (int) systemStatusCodeIncr);
        System.out.printf("%5s%6d%n%n", "-1:", (int) systemStatusCodeDecr);

        int distanceTraveled = Integer.MAX_VALUE;
        int distanceTraveledIncr = ++distanceTraveled;
        int distanceTraveledDecr = --distanceTraveled;
        System.out.printf("%s%n", "[Пройденное расстояние, S (m)]:");
        System.out.printf("%11s%,14d%n", "Исходное:", distanceTraveled);
        System.out.printf("%5s%12d%n", "+1:", distanceTraveledIncr);
        System.out.printf("%5s%11d%n%n", "-1:", distanceTraveledDecr);

        long timeSinceStart = Long.MAX_VALUE;
        long timeSinceStartIncr = ++timeSinceStart;
        long timeSinceStartDecr = --timeSinceStart;
        System.out.printf("%s%n", "[Время с момента старта, T (sec)]:");
        System.out.printf("%11s%,26d%n", "Исходное:", timeSinceStart);
        System.out.printf("%5s%21d%n", "+1:", timeSinceStartIncr);
        System.out.printf("%5s%20d%n", "-1:", timeSinceStartDecr);

        System.out.println("\n      7. ВЫВОД ПАРАМЕТРОВ JVM И ОС\n");
        Runtime runtime = Runtime.getRuntime();
        int availableProcessors = runtime.availableProcessors();
        double totalMemory = runtime.totalMemory() / 1024 / 1024;
        double freeMemory = runtime.freeMemory() / 1024 / 1024;
        double usedMemory = totalMemory - freeMemory;
        double maxMemory = runtime.maxMemory() / 1024 / 1024;
        
        String systemDrive = System.getProperty("user.dir").substring(0, 2);
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String pathSeparator = System.getProperty("file.separator");
        
        System.out.printf("""
                Характеристики JVM:
                    Доступное число ядер: %d
                    Выделенная память: %.1f (Мб)
                    Свободная память: %.1f (Мб)
                    Используемая память: %.1f (Мб)
                    Максимально доступная для выделения память: %.1f (Мб)
                Параметры ОС:
                    системный диск: %s
                    Версия ОС: %s (v %s)
                    Версия Java: %s
                    символ разделения пути: '%s'
                """, availableProcessors, totalMemory, freeMemory, usedMemory,
                maxMemory, systemDrive, osName, osVersion, javaVersion, pathSeparator);
                
        System.out.println("\n      8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА\n");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        LocalTime localTime = LocalTime.now();
        String formattedStartTime = localTime.format(dtf);
        long start = System.nanoTime();

        // вложенная задача
        double result = 0;
        for (long i = 0; i < 3_000_000_000L; i++) {
            result += Math.sqrt(i % 1000);
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        double conversionToSeconds = timeElapsed / 1_000_000_000.0;
        LocalTime endTime = LocalTime.now();
        String formattedEndTime = endTime.format(dtf);
        System.out.printf("""
                | Старт проверки | %s |
                +----------------+--------------+
                | Финиш проверки | %s |
                +----------------+--------------+
                | Время работы   | %.3f сек    |
                """, formattedStartTime, formattedEndTime, conversionToSeconds);
    }
}