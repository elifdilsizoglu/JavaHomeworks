package Business;

import Entities.Order;

public interface OrderService {
	void add(Order order);
	void delete(Order order);
	void update(Order order);
}
