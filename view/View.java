package fa.training.view;

import fa.training.entity.Customer;
import fa.training.utils.Validator;

public class View {

	public static Customer inputCustomer() {

		String firstName = Validator.inputString("Input firstName: ");
		String lastName = Validator.inputString("Input last name: ");
		String phone = Validator.inputString("Input phone: ");
		String email = Validator.inputString("Input email:");
		String street = Validator.inputString("Input street: ");
		String city = Validator.inputString("Input city: ");
		String state = Validator.inputString("Input state:");

		return Customer.builder()
				.firstName(firstName)
				.lastName(lastName)
				.phone(phone)
				.email(email)
				.street(street)
				.city(city)
				.state(state).build();
	}
}
