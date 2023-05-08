package model;

import controller.ClothesController;
import controller.CustomerController;
import controller.OrderController;

public class Order extends Model {
    private static final String file = "order.txt";

    public static OrderController[] getOrderByCustomer(String id) {
        String[] allData = getAllData(file);
        StringBuilder prepare = new StringBuilder();
        for (String item: allData) {
            if (item.split(",")[1].equals(id)) {
                if (prepare.isEmpty()) {
                    prepare.append(item);
                } else {
                    prepare.append(" ").append(item);
                }
            }
        }

        if (prepare.isEmpty()) return null;

        int index = 0;
        String[] calcData = prepare.toString().split(" ");
        OrderController[] output = new  OrderController[calcData.length-1];
        for (String orderData: calcData) {
            String[] data = orderData.split(",");
            CustomerController customer = Customer.getCustomer(data[1]);
            ClothesController clothes = Clothes.getClothes(data[2]);
            assert customer != null;
            assert clothes != null;
            output[index] = new OrderController(id, customer, clothes, Boolean.valueOf(data[3]));
            index ++;
        }
        return output;
    }

    public static OrderController[] getOrdersByClothes(String id) {
        String[] allData = getAllData(file);
        StringBuilder prepare = new StringBuilder();
        for (String item: allData) {
            if (item.split(",")[2].equals(id)) {
                if (prepare.isEmpty()) {
                    prepare.append(item);
                } else {
                    prepare.append(" ").append(item);
                }
            }
        }

        if (prepare.isEmpty()) return null;

        int index = 0;
        String[] calcData = prepare.toString().split(" ");
        OrderController[] output = new  OrderController[calcData.length-1];
        for (String orderData: calcData) {
            String[] data = orderData.split(",");
            CustomerController customer = Customer.getCustomer(data[1]);
            ClothesController clothes = Clothes.getClothes(data[2]);
            assert customer != null;
            assert clothes != null;
            output[index] = new OrderController(id, customer, clothes, Boolean.valueOf(data[3]));
            index ++;
        }
        return output;
    }

    public static OrderController[] getNOkOrders(String id) {
        String[] allData = getAllData(file);
        StringBuilder prepare = new StringBuilder();
        for (String item: allData) {
            if (item.split(",")[3].equals(String.valueOf(false))) {
                if (prepare.isEmpty()) {
                    prepare.append(item);
                } else {
                    prepare.append(" ").append(item);
                }
            }
        }

        if (prepare.isEmpty()) return null;

        int index = 0;
        String[] calcData = prepare.toString().split(" ");
        OrderController[] output = new  OrderController[calcData.length-1];
        for (String orderData: calcData) {
            String[] data = orderData.split(",");
            CustomerController customer = Customer.getCustomer(data[1]);
            ClothesController clothes = Clothes.getClothes(data[2]);
            assert customer != null;
            assert clothes != null;
            output[index] = new OrderController(id, customer, clothes, Boolean.valueOf(data[3]));
            index ++;
        }
        return output;
    }

    public static boolean updateOrder(OrderController Order) {
        return update(Order.getId(), Order.toString(), file);
    }

    public static OrderController createOrder(CustomerController customer, ClothesController clothes) {
        String[] allData = getAllData(file);
        String id = String.valueOf(Integer.parseInt(allData[allData.length - 1].split(",")[0]) + 1);
        OrderController Order = new OrderController(id, customer, clothes, false);
        if (create(Order.toString(), file)) {
            return Order;
        } else {
            return null;
        }
    }
}
