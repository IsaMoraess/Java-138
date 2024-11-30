public class metodo {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria("12345");
        
        //DEPOSITO SIMPLES
        conta1.depositar(1000.0); 

        //DEPOSITO COM DESCRIÇÃO
        conta1.depositar(500.0, "Salário");
        
        //SAQUE
        System.out.println("Saldo da conta: " + conta1.getSaldo());
    }
}
