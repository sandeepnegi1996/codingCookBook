package business;

import model.Amount;

public interface ClientBO {

	Amount getClientProductSum(List<product> products)
		throws DifferentCurrenciesException;
}
