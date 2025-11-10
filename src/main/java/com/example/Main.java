package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Product> products = Set.of(new Product(1L, "Iphone", "Electronics", new BigDecimal(100000)),
                new Product(2L, "Старик и море", "Books", new BigDecimal(300)),
                new Product(3L, "Алхимик", "Books", new BigDecimal(350)),
                new Product(4L, "Памперсы", "Children's products", new BigDecimal(2500)),
                new Product(5L, "Мягкая игрушка", "Toys", new BigDecimal(1000)),
                new Product(6L, "Детская смесь", "Children's products", new BigDecimal(1200)),
                new Product(7L, "Молоко", "Children's products", new BigDecimal(100)),
                new Product(8L, "Машинка", "Toys", new BigDecimal(400)),
                new Product(9L, "Кукла", "Toys", new BigDecimal(500)),
                new Product(10L, "Война и мир", "Books", new BigDecimal(250)),
                new Product(11L, "MacBook", "Electronics", new BigDecimal(250000)),
                new Product(12L, "airPods", "Electronics", new BigDecimal(20000)),
                new Product(13L, "Стиральная машина", "Electronics", new BigDecimal(14000)),
                new Product(14L, "Холодильник", "Electronics", new BigDecimal(30000)),
                new Product(15L, "Мертвые души", "Books", new BigDecimal(270)),
                new Product(16L, "Шаолинь", "Books", new BigDecimal(550)),
                new Product(17L, "Настолка", "Toys", new BigDecimal(3200)),
                new Product(18L, "Коляска", "Toys", new BigDecimal(1300)),
                new Product(19L, "Агушка", "Children's products", new BigDecimal(180)),
                new Product(20L, "Присыпка", "Children's products", new BigDecimal(560)),
                new Product(21L, "Соска", "Children's products", new BigDecimal(490)),
                new Product(22L, "Осень", "Books", new BigDecimal(190)),
                new Product(23L, "Морозилка", "Electronics", new BigDecimal(22000)),
                new Product(24L, "Леди баг", "Toys", new BigDecimal(3700)),
                new Product(25L, "Каталка", "Toys", new BigDecimal(1650))
        );

        Set<Product> products1 = Set.of(new Product(1L, "Iphone", "Electronics", new BigDecimal(100000)));
        Set<Product> products2 = Set.of(new Product(2L, "Старик и море", "Books", new BigDecimal(300)));
        Set<Product> products3 = Set.of(new Product(3L, "Алхимик", "Books", new BigDecimal(350)));
        Set<Product> products4 = Set.of(new Product(4L, "Памперсы", "Children's products", new BigDecimal(2500)));
        Set<Product> products5 = Set.of(new Product(5L, "Мягкая игрушка", "Toys", new BigDecimal(1000)));
        Set<Product> products6 = Set.of(new Product(6L, "Детская смесь", "Children's products", new BigDecimal(1200)));
        Set<Product> products7 = Set.of(new Product(7L, "Молоко", "Children's products", new BigDecimal(100)));
        Set<Product> products8 = Set.of(new Product(8L, "Машинка", "Toys", new BigDecimal(400)));
        Set<Product> products9 = Set.of(new Product(9L, "Кукла", "Toys", new BigDecimal(500)));
        Set<Product> products10 = Set.of(new Product(10L, "Война и мир", "Books", new BigDecimal(250)));
        Set<Product> products11 = Set.of(new Product(11L, "MacBook", "Electronics", new BigDecimal(250000)));
        Set<Product> products12 = Set.of(new Product(12L, "airPods", "Electronics", new BigDecimal(20000)));
        Set<Product> products13 = Set.of(new Product(13L, "Стиральная машина", "Electronics", new BigDecimal(14000)));
        Set<Product> products14 = Set.of(new Product(14L, "Холодильник", "Electronics", new BigDecimal(30000)));
        Set<Product> products15 = Set.of(new Product(15L, "Мертвые души", "Books", new BigDecimal(270)));
        Set<Product> products16 = Set.of(new Product(16L, "Шаолинь", "Books", new BigDecimal(550)));
        Set<Product> products17 = Set.of(new Product(17L, "Настолка", "Toys", new BigDecimal(3200)));
        Set<Product> products18 = Set.of(new Product(18L, "Коляска", "Toys", new BigDecimal(1300)));
        Set<Product> products19 = Set.of(new Product(19L, "Агушка", "Children's products", new BigDecimal(180)));
        Set<Product> products20 = Set.of(new Product(20L, "Присыпка", "Children's products", new BigDecimal(560)));
        Set<Product> products21 = Set.of(new Product(21L, "Соска", "Children's products", new BigDecimal(490)));
        Set<Product> products22 = Set.of(new Product(22L, "Осень", "Books", new BigDecimal(190)));
        Set<Product> products23 = Set.of(new Product(23L, "Морозилка", "Electronics", new BigDecimal(22000)));
        Set<Product> products24 = Set.of(new Product(24L, "Леди баг", "Toys", new BigDecimal(3700)));
        Set<Product> products25 = Set.of(new Product(25L, "Каталка", "Toys", new BigDecimal(1650)));

        Set<Order> orders = Set.of(
                new Order(1L, LocalDate.of(2021, 2, 15),
                        LocalDate.of(2021, 2, 20), "Доставлен", products1),
                new Order(2L, LocalDate.of(2021, 3, 10),
                        LocalDate.of(2021, 3, 15), "Доставлен", products2),
                new Order(3L, LocalDate.of(2021, 3, 14),
                        LocalDate.of(2021, 3, 18), "Обработка", products3),
                new Order(4L, LocalDate.of(2021, 3, 15),
                        LocalDate.of(2021, 3, 19), "Доставляется", products4),
                new Order(5L, LocalDate.of(2021, 2, 28),
                        LocalDate.of(2021, 3, 5), "Доставлен", products5),
                new Order(6L, LocalDate.of(2021, 3, 15),
                        LocalDate.of(2021, 3, 20), "Доставлен", products6),
                new Order(7L, LocalDate.of(2021, 4, 10),
                        LocalDate.of(2021, 4, 15), "Доставлен", products7),
                new Order(8L, LocalDate.of(2021, 4, 14),
                        LocalDate.of(2021, 4, 18), "Обработка", products8),
                new Order(9L, LocalDate.of(2021, 4, 15),
                        LocalDate.of(2021, 4, 19), "Доставляется", products9),
                new Order(10L, LocalDate.of(2021, 3, 28),
                        LocalDate.of(2021, 4, 5), "Доставлен", products10),
                new Order(11L, LocalDate.of(2021, 5, 15),
                        LocalDate.of(2021, 5, 20), "Доставлен", products11),
                new Order(12L, LocalDate.of(2021, 6, 10),
                        LocalDate.of(2021, 6, 15), "Доставлен", products12),
                new Order(13L, LocalDate.of(2021, 6, 14),
                        LocalDate.of(2021, 6, 18), "Обработка", products13),
                new Order(14L, LocalDate.of(2021, 6, 15),
                        LocalDate.of(2021, 6, 19), "Доставляется", products14),
                new Order(15L, LocalDate.of(2021, 5, 28),
                        LocalDate.of(2021, 6, 5), "Доставлен", products15),
                new Order(16L, LocalDate.of(2021, 1, 15),
                        LocalDate.of(2021, 1, 20), "Доставлен", products16),
                new Order(17L, LocalDate.of(2021, 2, 10),
                        LocalDate.of(2021, 2, 15), "Доставлен", products17),
                new Order(18L, LocalDate.of(2021, 3, 14),
                        LocalDate.of(2021, 3, 18), "Обработка", products18),
                new Order(19L, LocalDate.of(2021, 2, 15),
                        LocalDate.of(2021, 2, 19), "Доставляется", products19),
                new Order(20L, LocalDate.of(2021, 1, 28),
                        LocalDate.of(2021, 2, 5), "Доставлен", products20),
                new Order(21L, LocalDate.of(2021, 2, 25),
                        LocalDate.of(2021, 2, 28), "Доставлен", products21),
                new Order(22L, LocalDate.of(2021, 3, 15),
                        LocalDate.of(2021, 3, 20), "Доставлен", products22),
                new Order(23L, LocalDate.of(2021, 3, 24),
                        LocalDate.of(2021, 3, 28), "Обработка", products23),
                new Order(24L, LocalDate.of(2021, 3, 25),
                        LocalDate.of(2021, 3, 29), "Доставляется", products24),
                new Order(25L, LocalDate.of(2021, 2, 10),
                        LocalDate.of(2021, 3, 15), "Доставлен", products25));

        Set<Order> orders1 = Set.of(
                new Order(1L, LocalDate.of(2021, 2, 15),
                        LocalDate.of(2021, 2, 20), "Доставлен", products1),
                new Order(2L, LocalDate.of(2021, 3, 10),
                        LocalDate.of(2021, 3, 15), "Доставлен", products2),
                new Order(3L, LocalDate.of(2021, 3, 14),
                        LocalDate.of(2021, 3, 18), "Обработка", products3),
                new Order(4L, LocalDate.of(2021, 3, 15),
                        LocalDate.of(2021, 3, 19), "Доставляется", products4),
                new Order(5L, LocalDate.of(2021, 2, 28),
                        LocalDate.of(2021, 3, 5), "Доставлен", products5));

        Set<Order> orders2 = Set.of(
                new Order(6L, LocalDate.of(2021, 3, 15),
                        LocalDate.of(2021, 3, 20), "Доставлен", products6),
                new Order(7L, LocalDate.of(2021, 4, 10),
                        LocalDate.of(2021, 4, 15), "Доставлен", products7),
                new Order(8L, LocalDate.of(2021, 4, 14),
                        LocalDate.of(2021, 4, 18), "Обработка", products8),
                new Order(9L, LocalDate.of(2021, 4, 15),
                        LocalDate.of(2021, 4, 19), "Доставляется", products9),
                new Order(10L, LocalDate.of(2021, 3, 28),
                        LocalDate.of(2021, 4, 5), "Доставлен", products10));

        Set<Order> orders3 = Set.of(
                new Order(11L, LocalDate.of(2021, 5, 15),
                        LocalDate.of(2021, 5, 20), "Доставлен", products11),
                new Order(12L, LocalDate.of(2021, 6, 10),
                        LocalDate.of(2021, 6, 15), "Доставлен", products12),
                new Order(13L, LocalDate.of(2021, 6, 14),
                        LocalDate.of(2021, 6, 18), "Обработка", products13),
                new Order(14L, LocalDate.of(2021, 6, 15),
                        LocalDate.of(2021, 6, 19), "Доставляется", products14),
                new Order(15L, LocalDate.of(2021, 5, 28),
                        LocalDate.of(2021, 6, 5), "Доставлен", products15));

        Set<Order> orders4 = Set.of(
                new Order(16L, LocalDate.of(2021, 1, 15),
                        LocalDate.of(2021, 1, 20), "Доставлен", products16),
                new Order(17L, LocalDate.of(2021, 2, 10),
                        LocalDate.of(2021, 2, 15), "Доставлен", products17),
                new Order(18L, LocalDate.of(2021, 3, 14),
                        LocalDate.of(2021, 3, 18), "Обработка", products18),
                new Order(19L, LocalDate.of(2021, 2, 15),
                        LocalDate.of(2021, 2, 19), "Доставляется", products19),
                new Order(20L, LocalDate.of(2021, 1, 28),
                        LocalDate.of(2021, 2, 5), "Доставлен", products20));

        Set<Order> orders5 = Set.of(
                new Order(21L, LocalDate.of(2021, 2, 25),
                        LocalDate.of(2021, 2, 28), "Доставлен", products21),
                new Order(22L, LocalDate.of(2021, 3, 15),
                        LocalDate.of(2021, 3, 20), "Доставлен", products22),
                new Order(23L, LocalDate.of(2021, 3, 24),
                        LocalDate.of(2021, 3, 28), "Обработка", products23),
                new Order(24L, LocalDate.of(2021, 3, 25),
                        LocalDate.of(2021, 3, 29), "Доставляется", products24),
                new Order(25L, LocalDate.of(2021, 2, 10),
                        LocalDate.of(2021, 3, 15), "Доставлен", products25));

        Set<Customer> customers = Set.of(new Customer(1L, "Василий Васильевич", 1L, orders1),
                new Customer(2L, "Дмитрий Евгеньевич", 3L, orders2),
                new Customer(3L, "Мария Владимировна", 3L, orders3),
                new Customer(4L, "Олег Васильевич", 2L, orders4),
                new Customer(5L, "Инокентий Павлович", 2L, orders5)
        );

        //Задание 1
        //Получите список продуктов из категории "Books" с ценой более 100.
        System.out.println("Задание 1");
        Set<Product> priceBook = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> "Books".equals(product.getCategory()))
                .filter(product -> product.getPrice().compareTo(new BigDecimal(100)) > 0)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        priceBook.forEach(System.out::println);

        System.out.println("\n");

        //Задание 2
        //Получите список заказов с продуктами из категории "Children's products".
        System.out.println("Задание 2");
        Set<Product> listProduct = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> "Children's products".equals(product.getCategory()))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        listProduct.forEach(System.out::println);

        System.out.println("\n");

        //Задание 3
        //Получите список продуктов из категории "Toys" и примените скидку 10% и получите сумму всех продуктов.

        System.out.println("Задание 3");
        Set<Product> discountedToys = new LinkedHashSet<>();
        BigDecimal totalPrice = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> "Toys".equals(product.getCategory()))
                .map(product -> {
                    BigDecimal discountedPrice = product.getPrice().multiply(new BigDecimal("0.9"));
                    Product discountedProduct = new Product(
                            product.getId(),
                            product.getName(),
                            product.getCategory(),
                            discountedPrice
                    );
                    discountedToys.add(discountedProduct);
                    return discountedPrice;
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        discountedToys.forEach(System.out::println);
        System.out.println("Общая сумма после скидки: " + totalPrice);


        System.out.println("\n");

        //Задание 4
        //Получите список продуктов, заказанных клиентом второго уровня между 01-фев-2021 и 01-апр-2021.
        System.out.println("Задание 4");
        Set<Product> listProdectClien = customers.stream()
                .filter(customer -> customer.getLevel() == 2)
                .flatMap(customer -> customer.getOrderSet().stream())
                .filter(order -> {
                    LocalDate orderDate = order.getDate();
                    return !orderDate.isBefore(LocalDate.of(2021, 2, 1)) &&
                            !orderDate.isAfter(LocalDate.of(2021, 4, 1));
                })
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        listProdectClien.forEach(System.out::println);

        System.out.println("\n");


        //Задание 5
        //Получите топ 2 самые дешевые продукты из категории "Books".

        System.out.println("Задание 5");
        Set<Product> topTwoBook = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> "Books".equals(product.getCategory()))
                .sorted(Comparator.comparing(Product::getPrice))
                .limit(2)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        topTwoBook.forEach(System.out::println);

        System.out.println("\n");

        //Задание 6
        //Получите 3 самых последних сделанных заказа
        System.out.println("Задание 6");
        Set<Order> lastOrder = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .sorted(Comparator.comparing(Order::getDeliveryDate).reversed())
                .limit(3)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        lastOrder.forEach(System.out::println);

        System.out.println("\n");

        //Задание 7
        //Получите список заказов, сделанных 15-марта-2021, выведите id заказов в консоль и затем верните список их продуктов.

        System.out.println("Задание 7");
        System.out.println("ID заказов 15-марта-2021:");
        Set<Product> orderMart = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .filter(order -> order.getDate().equals(LocalDate.of(2021, 3, 15)))
                .peek(order -> System.out.println(order.getId()))
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toSet());
        System.out.println("Продукты из заказов:");
        orderMart.forEach(System.out::println);




        System.out.println("\n");

        //Задание 8
        //Рассчитайте общую сумму всех заказов, сделанных в феврале 2021.

        System.out.println("Задание 8");
        double summ = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .filter(order -> order.getDeliveryDate().getMonth() == Month.FEBRUARY && order.getDeliveryDate().getYear() == 2021)
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getPrice)
                .mapToDouble(BigDecimal::doubleValue)
                .sum();
        System.out.println(summ);


        System.out.println("\n");

        //Задание 9
        // Рассчитайте средний платеж по заказам, сделанным 14-марта-2021.

        System.out.println("Задание 9");
        double mediumPayment = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .filter(order -> order.getDate().equals(LocalDate.of(2021, 3, 14)))
                .mapToDouble(order -> order.getProducts().stream().mapToDouble(p -> p.getPrice().doubleValue()).sum())
                .average()
                .orElse(0.0);
        System.out.println("Среднее значение: " + mediumPayment);

        System.out.println("\n");

        //Задание 10
        //Получите набор статистических данных (сумма, среднее, максимум, минимум, количество) для всех продуктов категории "Книги".

        System.out.println("Задание 10");

        DoubleSummaryStatistics stat = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> "Books".equals(product.getCategory()))
                .mapToDouble(product -> product.getPrice().doubleValue())
                .summaryStatistics();
        System.out.println("Статистика по книгам: ");
        System.out.println("Количество: " + stat.getCount());
        System.out.println("Сумма: " + stat.getSum());
        System.out.println("Среднее: " + stat.getAverage());
        System.out.println("Максимум: " + stat.getMin());
        System.out.println("Минимум: " + stat.getMax());

        System.out.println("\n");

        //Задание 11
        // Получите данные Map<Long, Integer> → key - id заказа, value - кол-во товаров в заказе

        System.out.println("Задание 11");


        Map<Long, Integer> ordProd = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .collect(Collectors.toMap(Order::getId, order -> order.getProducts().size()));
        System.out.println(ordProd);

        System.out.println("\n");

        //Задание 12
        //Создайте Map<Customer, List<Order>> → key - покупатель, value - список его заказов

        System.out.println("Задание 12");
        Map<Customer, List<Order>> userOrde = customers.stream()
                .collect(Collectors.toMap(customer -> customer, customer -> new ArrayList<>(customer.getOrderSet())));
        userOrde.forEach((customer, order) -> {
            System.out.println("Пользователь: " + customer.getName());
            System.out.println("Заказы: " + order);
            System.out.println();
        });

        System.out.println("\n");

        //Задание 13
        //Создайте Map<Order, Double> → key - заказ, value - общая сумма продуктов заказа.

        System.out.println("Задание 13");
        Map<Order, Double> sumProd = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .collect(Collectors.toMap(order -> order, order -> order.getProducts().stream()
                        .mapToDouble(product -> product.getPrice().doubleValue()).sum()));
        sumProd.forEach((order, sum) -> {
            System.out.println("Заказ: " + order);
            System.out.println("Сумма: " + sum);
        });

        System.out.println("\n");

        //Задание 14
        //Получите Map<String, List<String>> → key - категория, value - список названий товаров в категории
        System.out.println("Задание 14");

        Map<String, List<String>> categProd = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName, Collectors.toList())));
        categProd.forEach((category, name) -> {
            System.out.println("категория: " + category);
            System.out.println("имя: " + name);
        });


        System.out.println("\n");
        //Задание 15
        //Получите Map<String, Product> → самый дорогой продукт по каждой категории.
        System.out.println("Задание 15");
        Map<String, Product> maxPriceCateg = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice, BigDecimal::compareTo)), Optional::get)));
        maxPriceCateg.forEach((category, product) -> {
            System.out.println("Категория: " + category);
            System.out.println("Самый дорогой:" + product.getName() + product.getPrice());
        });


    }
}