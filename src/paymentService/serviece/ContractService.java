package paymentService.serviece;

import paymentService.entities.Contract;
import paymentService.entities.Instalment;

import java.util.stream.IntStream;

public class ContractService {

    OnlinePaymentService playpalService = new PlaypalService();


    public void processContract(Contract contract, Integer months) {

        IntStream.rangeClosed(1, months).forEachOrdered(i -> {
            Double priceOfPotion = contract.getTotalValue() / months;
            Double interest = playpalService.interest(priceOfPotion, i);

            Double interestPayment = priceOfPotion + interest;
            Double paymentFee = playpalService.paymentFree(interestPayment);

            Double resultPortion = interestPayment + paymentFee;

            contract.addInstalment(new Instalment(contract.getDate().plusMonths(i), resultPortion));

        });


    }


}
