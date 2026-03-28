import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        LocalTime localTime = LocalTime.now();
        final String formattedStartTime = localTime.format(dtf);
        final long start = System.nanoTime();

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
        float penCost = 105.5f;
        float bookCost = 235.23f;

        // общая скидка 11%
        float totalDiscount = 0.11f;
        System.out.println("- Общая стоимость товаров без скидки = " + (penCost + bookCost) + " руб.");
        System.out.println("- Общая сумма скидки = " + (penCost + bookCost) * totalDiscount + " руб.");
        System.out.println("- Общая стоимость товаров со скидкой = " +
                (penCost + bookCost) * (1 - totalDiscount) + " руб.");
        var penCostBd = new BigDecimal("105.50");
        var bookCostBd = new BigDecimal("235.23");
        var totalDiscountBd = new BigDecimal("0.11");
        var goodsSum = penCostBd.add(bookCostBd);
        var discountSum = goodsSum.multiply(totalDiscountBd).setScale(2, RoundingMode.HALF_UP);
        var discountedItemsTotalCost = goodsSum.subtract(discountSum).setScale(2, RoundingMode.HALF_UP);
        System.out.println("\n- Общая стоимость товаров без скидки = " + goodsSum + " руб.");
        System.out.println("- Общая сумма скидки = " + discountSum + " руб.");
        System.out.println("- Общая стоимость товаров со скидкой = " + discountedItemsTotalCost + " руб.");

        System.out.println("\n        3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ\n");
        System.out.println("Исходные значения: a1 = 2, b1 = 5.");
        int a1 = 2;
        int b1 = 5;
        
        System.out.println("\n- Метод: с третьей переменной.");
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println(" Результат: a1 = " + a1 + ", b1 = " + b1);
        
        System.out.println("- Метод: арифметических операций.");
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
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
        System.out.printf("%-6d%-6d%-6d%-6d%-6d%-6d%n",
                code1, code2, code3, code4, code5, code6);
        System.out.printf("%-6c%-6c%-6c%-6c%-6c%-6c%n",
                code1, code2, code3, code4, code5, code6);

        System.out.println("\n      5. АНАЛИЗ КОДА ТОВАРА\n");
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
        System.out.printf("""
                [Температура, °С]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n
                """, temperature, ++temperature, --temperature);

        short pressure = Short.MAX_VALUE;
        System.out.printf("""
                [Давление, Pa]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n
                """, pressure, ++pressure, --pressure);

        char systemStatusCode = Character.MAX_VALUE;
        System.out.printf("""
                [Код состояния системы, code]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n
                """, (int) systemStatusCode, (int) ++systemStatusCode, (int) --systemStatusCode);

        int distanceTraveled = Integer.MAX_VALUE;
        System.out.printf("""
                [Пройденное расстояние, S (m)]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n
                """, distanceTraveled, ++distanceTraveled, --distanceTraveled);

        long timeSinceStart = Long.MAX_VALUE;
        System.out.printf("""
                [Время с момента старта, T (sec)]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """, timeSinceStart, ++timeSinceStart, --timeSinceStart);

        System.out.println("\n      7. ВЫВОД ПАРАМЕТРОВ JVM И ОС\n");
        Runtime rt = Runtime.getRuntime();
        int availableProcessors = rt.availableProcessors();
        double btToMb = 1024 * 1024;
        double totalMemory = rt.totalMemory() / btToMb;
        double freeMemory = rt.freeMemory() / btToMb;
        double usedMemory = totalMemory - freeMemory;
        double maxMemory = rt.maxMemory() / btToMb;
        
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
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        double conversionToSeconds = timeElapsed / 1e9;
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