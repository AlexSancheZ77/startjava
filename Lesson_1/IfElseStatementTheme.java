import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[]args) {
        System.out.println("\n    1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA\n");
        System.out.println("Анализ данных пользователя:");
        System.out.println("------------------------------------+");
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

        int completedStepsYesterday = 7026;
        int completedStepsToday = 12245;
        int completedStepsTotalNum = completedStepsYesterday + completedStepsToday;
        System.out.println("Кол-во шагов за вчера = " + completedStepsYesterday);
        System.out.println("Кол-во шагов за сегодня = " + completedStepsToday);
        System.out.println("Кол-во шагов за вчера и сегодня = " + completedStepsTotalNum);
        if (completedStepsYesterday > completedStepsToday) {
            System.out.println("Вчера было пройдено больше шагов");
        } else if (completedStepsYesterday < completedStepsToday) {
            System.out.println("Сегодня было пройдено больше шагов");
        } else {
            System.out.println("Кол-во шагов за сегодня и вчера было одинаково");
        }
        double averageValueSteps = (double) completedStepsTotalNum / 2;
        System.out.printf("Среднее значение шагов = %.2f%n", averageValueSteps);
        
        System.out.println("\n    3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ\n");
        
        int guestsNumber = 0;
        if (guestsNumber == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestsNumber < 0) {
            System.out.println("Ошибка: кол-во гостей, не может быть отрицательным!");
        } else if (guestsNumber % 2 == 0) {
            System.out.println("Записалось гостей: " + guestsNumber +
                    " чел. Можно формировать пары для конкурсов.");
        } else {
            System.out.println("Записалось гостей: " + guestsNumber + " чел. Нужны индивидуальные задания.");
        }
        
        System.out.println("\n    4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА\n");
        
        System.out.println("Первый способ:");
        String name = "Alex";
        char first = name.charAt(0);
        if (first >= 'a' && first <= 'z') {
            System.out.println("Имя: '" + name + "' начинается с маленькой буквы '" +
                    first + "'");
        } else if (first >= 'A' && first <= 'Z') {
            System.out.println("Имя: '" + name + "' начинается с большой буквы '" +
                    first + "'");
        } else if (first >= '0' && first <= '9') {
            System.out.println("Имя: '" + name + "' начинается с цифры '" +
                    first + "'");
        } else {
            System.out.println("Имя: '" + name + "' начинается с символа '" +
                    '$' + "'");
        }

        System.out.println("Второй способ:");
        String name2 = "=Maria";
        char first2 = name2.charAt(0);
        if (Character.isLowerCase(first2)) {
            System.out.println("Имя: '" + name2 + "' начинается с маленькой буквы '" +
                    first2 + "'");
        } else if (Character.isUpperCase(first2)) {
            System.out.println("Имя: '" + name2 + "' начинается с большой буквы '" +
                    first2 + "'");
        } else if (Character.isDigit(first2)) {
            System.out.println("Имя: '" + name2 + "' начинается с цифры '" +
                    first2 + "'");
        } else {
            System.out.println("Имя: '" + name2 + "' начинается с символа '" +
                    '$' + "'");
        }

        System.out.println("\n    5. ИНВЕНТАРИЗАЦИЯ\n");

        int serialNumDb = 757;
        int serialNumOc = 303;
        boolean serialNumEqual = serialNumDb == serialNumOc;
        String dbStr = String.valueOf(serialNumDb);
        String ocStr = String.valueOf(serialNumOc);
        char firstDigitDb = dbStr.charAt(0);
        char secondDigitDb = dbStr.charAt(1);
        char thirdDigitDb = dbStr.charAt(2);
        char firstDigitOc = ocStr.charAt(0);
        char secondDigitOc = ocStr.charAt(1);
        char thirdDigitOc = ocStr.charAt(2);
        if (serialNumEqual) {
            System.out.println("[№" + serialNumDb + "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            String partialMatch = "" +
                    (firstDigitDb == firstDigitOc ? firstDigitDb : '_') +
                    (secondDigitDb == secondDigitOc ? secondDigitDb : '_') +
                    (thirdDigitDb == thirdDigitOc ? thirdDigitDb : '_') + "";
            boolean hasPartialMatch = (firstDigitDb == firstDigitOc) ||
                    (secondDigitDb == secondDigitOc) ||
                    (thirdDigitDb == thirdDigitOc);
            if (hasPartialMatch) {
                System.out.printf("""
                    Нет полного совпадения:
                    База данных: [№ %d ]
                    Фактический: [№ %s ]
                        """, serialNumDb, partialMatch);
            } else {
                System.out.println("[№" + serialNumOc + "]: оборудование не идентифицировано");
            }
        }

        System.out.println("\n    6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %\n");

        float depositSum = 321123.79f;
        float accrual;
        if (depositSum < 100000) {
            accrual = 0.05f;
        } else if (depositSum <= 300000) {
            accrual = 0.07f;
        } else {
            accrual = 0.10f;
        }
        float interestAmount = depositSum * accrual;
        float totalSum = interestAmount + depositSum;
        System.out.printf("Сумма вклада = %.2f руб.%n", depositSum);
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
        int historyEstimation = 0;
        if (historyScore > 91) {
            historyEstimation = 5;
        } else if (historyScore > 73) {
            historyEstimation = 4;
        } else if (historyScore > 60) {
            historyEstimation = 3;
        } else {
            historyEstimation = 2;
        }

        int programmingScore = 92;
        int programmingEstimation = 0;
        if (programmingScore > 91) {
            programmingEstimation = 5;
        } else if (programmingScore > 73) {
            programmingEstimation = 4;
        } else if (programmingScore > 60) {
            programmingEstimation = 3;
        } else {
            programmingEstimation = 2;
        }
        System.out.println("История: " + historyScore + "% - оценка: " + historyEstimation);
        System.out.println("Программирование : " + programmingScore + "% - оценка: " + programmingEstimation);
        double averageScore = (double) (historyEstimation + programmingEstimation) / 2;
        System.out.printf("Средний балл оценок по предметам: %.2f%n", averageScore);
        double averagePercent = (double) (historyScore + programmingScore) / 2;
        System.out.printf("Средний %% по предметам: %.2f%n", averagePercent);

        System.out.println("\n    8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ\n");

        var monthlySales = new BigDecimal("14124.747");
        var monthlyRent = new BigDecimal("5123.018");
        var monthlyProductionCost = new BigDecimal("9001.729");
        var monthlyProfit = monthlySales.subtract(monthlyRent).subtract(monthlyProductionCost)
                .setScale(2, RoundingMode.HALF_UP);
        var annualProfit = monthlyProfit.multiply(BigDecimal.valueOf(12));
        if (annualProfit.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        } else if (annualProfit.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: + " + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}