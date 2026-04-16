import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[]args) {
        System.out.println("\n    1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA\n");
        System.out.println("Анализ данных пользователя:\n------------------------------------+");
        boolean maleGender = false;
        int age = 25;
        double height = 1.86;
        if (!maleGender) {
            System.out.println("Пол - женский");
        } else {
            System.out.println("Пол - мужской");
        }

        if (age > 18) {
            System.out.println("Возраст - совершеннолетний (" + age + ") лет");
        } else {
            System.out.println("Возраст - подросток (" + age + ") лет");
        }

        if (height < 1.8) {
            System.out.println("Рост - средний(" + height + ") см.");
        } else {
            System.out.println("Рост - высокий(" + height + ") см.");
        }

        System.out.println("\n    2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ\n");

        int stepsYesterday = 7026;
        int stepsToday = 12245;
        int totalSteps = stepsYesterday + stepsToday;
        System.out.println("Кол-во шагов за вчера = " + stepsYesterday);
        System.out.println("Кол-во шагов за сегодня = " + stepsToday);
        System.out.println("Кол-во шагов за вчера и сегодня = " + totalSteps);
        if (stepsYesterday > stepsToday) {
            System.out.println("Вчера было пройдено больше шагов");
        } else if (stepsYesterday < stepsToday) {
            System.out.println("Сегодня было пройдено больше шагов");
        } else {
            System.out.println("Кол-во шагов за сегодня и вчера было одинаково");
        }
        double averageSteps = (double) totalSteps / 2;
        System.out.printf("Среднее значение шагов = %.2f%n", averageSteps);
        
        System.out.println("\n    3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ\n");
        
        int guestNumber = 0;
        if (guestNumber == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestNumber < 0) {
            System.out.println("Ошибка: кол-во гостей, не может быть отрицательным!");
        } else if (guestNumber % 2 == 0) {
            System.out.println("Записалось гостей: " + guestNumber +
                    " чел. Можно формировать пары для конкурсов.");
        } else {
            System.out.println("Записалось гостей: " + guestNumber + " чел. Нужны индивидуальные задания.");
        }
        
        System.out.println("\n    4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА\n");
        
        System.out.println("Первый способ:");
        String name = "Alex";
        char firstChar = name.charAt(0);
        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println("'" + name + "'" + " начинается с маленькой буквы '" +
                    firstChar + "'");
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println("'" + name + "'" + " начинается с большой буквы '" +
                    firstChar + "'");
        } else if (firstChar >= '0' && firstChar <= '9') {
            System.out.println("'" + name + "'" + " начинается с цифры '" +
                    firstChar + "'");
        } else {
            System.out.println("'" + name + "'" + " начинается с символа '" +
                    '$' + "'");
        }

        System.out.println("Второй способ:");
        String name2 = "=Maria";
        char firstChar2 = name2.charAt(0);
        if (Character.isLowerCase(firstChar2)) {
            System.out.println("'" + name2 + "'" + " начинается с маленькой буквы '" +
                    firstChar2 + "'");
        } else if (Character.isUpperCase(firstChar2)) {
            System.out.println("'" + name2 + "'" + " начинается с большой буквы '" +
                    firstChar2 + "'");
        } else if (Character.isDigit(firstChar2)) {
            System.out.println("'" + name2 + "'" + " начинается с цифры '" +
                    firstChar2 + "'");
        } else {
            System.out.println("'" + name2 + "'" + " начинается с символа '" +
                    '$' + "'");
        }

        System.out.println("\n    5. ИНВЕНТАРИЗАЦИЯ\n");

        int serialNumDb = 367;
        int serialNumOc = 345;
        int hundredsDb = serialNumDb / 100;
        int dozensDb = (serialNumDb / 10) % 10;
        int unitsDb = serialNumDb % 10;
        int hundredsOc = serialNumOc / 100;
        int dozensOc = (serialNumOc / 10) % 10;
        int unitsOc = serialNumOc % 10;
        if (serialNumDb == serialNumOc) {
            System.out.println("[№" + serialNumDb + "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            String partialMatch =
                    (hundredsDb == hundredsOc ? String.valueOf(hundredsDb) : "_") +
                    (dozensDb == dozensOc ? String.valueOf(dozensDb) : "_") +
                    (unitsDb == unitsOc ? String.valueOf(unitsDb) : "_");
            boolean hasPartialMatch = !partialMatch.equals("___");
            if (hasPartialMatch) {
                System.out.printf("""
                    Нет полного совпадения:
                    База данных: [№%d]
                    Фактический: [№%s]
                        """, serialNumDb, partialMatch);
            } else {
                System.out.println("[№" + serialNumOc + "]: оборудование не идентифицировано");
            }
        }

        System.out.println("\n    6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %\n");

        float depositSum = 321123.79f;
        float accrual = 0.10f;
        if (depositSum < 100000) {
            accrual = 0.05f;
        } else if (depositSum <= 300000) {
            accrual = 0.07f;
        }
        float interestAmount = depositSum * accrual;
        float totalSum = interestAmount + depositSum;
        System.out.printf("Сумма вклада = %f руб.%n", depositSum);
        System.out.printf("сумма начисленного процента = %f руб.%n", interestAmount);
        System.out.printf("итоговая сумма с процентом = %f руб.%n%n", totalSum);

        var depositSumBd = new BigDecimal("321123.79");
        var threshold1 = new BigDecimal("100000");
        var threshold2 = new BigDecimal("300000");
        var accrualBd = BigDecimal.ZERO;
        if (depositSumBd.compareTo(threshold1) < 0) {
            accrualBd = new BigDecimal("0.05"); // 5 %
        } else if (depositSumBd.compareTo(threshold2) <= 0) {
            accrualBd = new BigDecimal("0.07"); // 7 %
        } else {
            accrualBd = new BigDecimal("0.10"); // 10 %
        }
        var interestAmountBd = depositSumBd.multiply(accrualBd).setScale(2, RoundingMode.HALF_UP);
        var totalSumBd = depositSumBd.add(interestAmountBd);
        System.out.println("Сумма вклада = " + depositSumBd + " руб.");
        System.out.println("Сумма начисленного процента = " + interestAmountBd + " руб.");
        System.out.println("Итоговая сумма с процента = " + totalSumBd + " руб.");

        System.out.println("\n    7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ %\n");

        int historyScore = 59;
        int historyEstimation = 2;
        if (historyScore > 91) {
            historyEstimation = 5;
        } else if (historyScore > 73) {
            historyEstimation = 4;
        } else if (historyScore > 60) {
            historyEstimation = 3;
        }

        int programmingScore = 92;
        int programmingEstimation = 2;
        if (programmingScore > 91) {
            programmingEstimation = 5;
        } else if (programmingScore > 73) {
            programmingEstimation = 4;
        } else if (programmingScore > 60) {
            programmingEstimation = 3;
        }
        System.out.println("История: " + historyScore + "% - оценка: " + historyEstimation);
        System.out.println("Программирование : " + programmingScore + "% - оценка: " + programmingEstimation);

        double averageScore = (double) (historyEstimation + programmingEstimation) / 2;

        System.out.printf("Средний балл оценок по предметам: %.2f%n", averageScore);

        double averagePercent = (double) (historyScore + programmingScore) / 2;

        System.out.printf("Средний %% по предметам: %.2f%n", averagePercent);

        System.out.println("\n    8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ\n");

        var monthlySales = new BigDecimal("25439.423");
        var monthlyRent = new BigDecimal("5123.018");
        var monthlyProductionCost = new BigDecimal("9001.729");
        var monthlyProfit = monthlySales.subtract(monthlyRent).subtract(monthlyProductionCost)
                .setScale(2, RoundingMode.HALF_UP);
        var annualProfit = monthlyProfit.multiply(BigDecimal.valueOf(12));
        if (annualProfit.signum() < 0) {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        } else if (annualProfit.signum() > 0) {
            System.out.println("Прибыль за год: + " + annualProfit + " руб.");
        }
    }
}