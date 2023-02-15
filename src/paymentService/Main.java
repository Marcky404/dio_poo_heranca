package paymentService;
import paymentService.entities.Contract;
import paymentService.serviece.ContractService;
import java.time.LocalDate;


/*
Exercício de fixação
educandoweb.com.br
Prof. Dr. Nelio Alves
Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
número de meses desejado.
A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
e valor total do contrato). Em seguida, o programa deve ler o número de meses para
parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.

 */
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
