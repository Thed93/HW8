import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap <String, String> phoneNumbers = new HashMap<>();

        //task1
        phoneNumbers.put("Антонов АА", "1");
        phoneNumbers.put("Бояров ББ", "2");
        phoneNumbers.put("Воинов ВВ", "3");
        phoneNumbers.put("Григорьев ГГ", "4");
        phoneNumbers.put("Денисов ДД", "5");
        phoneNumbers.put("Енотов ЕЕ", "6");
        phoneNumbers.put("Жеков ЖЖ", "7");
        phoneNumbers.put("Зайцев ЗЗ", "8");
        phoneNumbers.put("Игнатьев ИИ", "9");
        phoneNumbers.put("Карпов КК", "10");
        phoneNumbers.put("Леонов ЛЛ", "11");
        phoneNumbers.put("Мамонов ММ", "12");
        phoneNumbers.put("Нравов НН", "13");
        phoneNumbers.put("Ольгин ОО", "14");
        phoneNumbers.put("Павлодаров ПП", "15");
        phoneNumbers.put("Раков РР", "16");
        phoneNumbers.put("Сонный СС", "17");
        phoneNumbers.put("Трушин ТТ", "18");
        phoneNumbers.put("Ухов УУ", "19");
        phoneNumbers.put("Фролов ФФ", "20");


        //task4
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5, "test5");
        orderedMap.put(3, "test3");
        orderedMap.put(4, "test4");
        orderedMap.put(10, "test10");
        orderedMap.put(9, "test9");
        orderedMap.put(8, "test8");
        orderedMap.put(7, "test7");
        orderedMap.put(6, "test6");
        orderedMap.put(1, "test1");
        orderedMap.put(2, "test2");

        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()){
            System.out.printf("%d : %s%n", entry.getKey(), entry.getValue());

        }




    }


}