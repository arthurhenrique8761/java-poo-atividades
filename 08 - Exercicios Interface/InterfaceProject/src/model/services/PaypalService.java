package model.services;

public class PaypalService implements OnlinePaymentService {

    @Override
    public Double interest(Double amount, Integer months) {
        return 0.0;
    }

    @Override
    public Double paymentFee(Double amount) {
        return 0.0;
    }

    // paypal aplica um juros simples de 1% a cada parcela mais uma taxa de pagamento de 2%
}
