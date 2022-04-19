public class ContaCorrente{
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valor ; 
    double  valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar){
        //tem saldo na conta
        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        } else { //nao tem saldo na conta
          if(especial){
              //verificar se o limite especial tem saldo
             double limite = limiteEspecial + saldo;
             if (limite >= quantiaASacar){
                saldo -= quantiaASacar;
                return true;
             } else {
                 return false;
             }
          } else {
              return false; //nao e especial e nao tem saldo
        }
      }
    }
    //metodo para depositar dinheiro
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    //metodo para consultar o saldo
    void consultarSaldo(){
        System.out.println("Deposito atual da conta " + saldo);
    }
   //metodo para verificar se tem cheque especial
   boolean verificarUsoChequeEspecial(){
    return saldo < 0;
   }
}