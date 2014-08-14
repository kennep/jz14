package no.miles.jz14.publicfields;

import no.miles.jz14.Customer;
import no.miles.jz14.Entity;

@Entity(name="ORDER")
public class Order {
    public String orderId;
    public Customer customer;
}
