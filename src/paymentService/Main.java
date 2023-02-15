package paymentService;
import paymentService.entities.Contract;
import paymentService.serviece.ContractService;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        // Objeto preenchido
        Contract contract = new Contract(LocalDate.now(), 600.00);
        ContractService service = new ContractService();
        service.processContract(contract, 3);

        System.out.println("Portion: \n");
        contract.getInstalments().forEach(i -> System.out.println(i));

    }
}
