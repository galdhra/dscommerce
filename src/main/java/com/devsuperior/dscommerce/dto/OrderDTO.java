package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.*;

import javax.validation.constraints.*;
import java.time.*;
import java.util.*;

public class OrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus satus;

    private ClientDTO client;

    private PaymentDTO payment;
    @NotEmpty(message = "Deve haver pelo menos um item")
    private List<OrderItemDTO> items = new ArrayList<>();

    public OrderDTO(Long id, Instant moment, OrderStatus satus, ClientDTO client, PaymentDTO payment) {
        this.id = id;
        this.moment = moment;
        this.satus = satus;
        this.client = client;
        this.payment = payment;
    }

    public OrderDTO(Order entity) {
        id = entity.getId();
        moment = entity.getMoment();
        satus = entity.getStatus();
        client = new ClientDTO(entity.getClient());
        payment = (entity.getPayment() == null ? null : new PaymentDTO(entity.getPayment()));
        for(OrderItem item : entity.getItems()){
              items.add(new OrderItemDTO(item));

        }
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getSatus() {
        return satus;
    }

    public ClientDTO getClient() {
        return client;
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public List<OrderItemDTO> getItems() {
        return items;
    }

    public Double getTotal() {
        double sum = 0;
                for(OrderItemDTO item: items) {
                    sum += item.getSubTotal();
                }
        return sum;
    }
}
