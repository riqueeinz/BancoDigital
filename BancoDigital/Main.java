public class Main {
   
   public static void main(String[] args) {
    Cliente henrique = new Cliente();
    henrique.setNome("Henrique");


        Conta cc = new ContaCorrente(henrique);
        Conta poupanca = new ContaPoupanca(henrique);
        
        //cc.depositar(100);
		//cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

   }

}

