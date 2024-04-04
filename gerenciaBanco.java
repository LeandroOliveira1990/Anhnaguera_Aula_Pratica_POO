import java.util.Scanner;

public class gerenciaBanco {

     static class pessoa {
        Scanner ler = new Scanner(System.in);

        private String nome;
        private String sobrenome;
        private String cpf;

        
        public pessoa() {
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void ObterDados(){
            System.out.print("Informe seu nome: ");
            setNome(nome = ler.nextLine());
    
            System.out.print("Informe seu sobrenome: ");
            setSobrenome(sobrenome = ler.nextLine());
    
            System.out.print("Informe seu cpf: ");
            setCpf(cpf = ler.nextLine());

        }

        public void retornaDados(){
            System.out.println("Nome completo do usuário: " + getNome() + " " + getSobrenome() + "\n" + "CPF: " + getCpf() + "\n");

        }     
           
        
    }

    static class banco{
        Scanner ler = new Scanner(System.in);

        private double saldo = 0;
        private double deposito;
        private double retirada;

        public banco() {
        }

        public double getSaldo() {
            return saldo;
        }

        public double getDeposito() {
            return deposito;
        }

        public void setDeposito(double deposito) {
            this.deposito = deposito;
        }

        public double getRetirada() {
            return retirada;
        }

        public void setRetirada(double retirada) {
            this.retirada = retirada;
        }

        public void mostrarSaldo(){
            System.out.println("Seu saldo é de = R$ " + getSaldo() + " \n");

        }

        public void depositar(){
            System.out.print("Digite o valor que deseja depositar: R$ ");
                        setDeposito(deposito = ler.nextDouble());
                        saldo = getSaldo() + deposito;
                        deposito = 0;

        }

        public void retirar(){
            System.out.print("Digite o valor que deseja retirar: R$ ");
                        setRetirada( retirada = ler.nextDouble());
                        if (retirada <= getSaldo()) {
                            saldo = getSaldo() - retirada;
                            
                        }else{
                            System.out.println("\n***Saldo Insuficiente***\n");
                        }
                        retirada = 0;     

        }

        
        
        

    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        

        int selecao;

        System.out.println("*************************************");
        System.out.println("BEM VINDO AO BANCO ANHANGUERA");
        System.out.println("*************************************\n");

        pessoa p = new pessoa();
        p.ObterDados();

        banco b = new banco();
       
        

        do {
            System.out.println("\nEscolha uma opção abaixo:");
            System.out.println("1 = Para consultar seu Saldo");
            System.out.println("2 = Para realizar um Depósito");
            System.out.println("3 = Para realizar uma Retirada");
            System.out.println("4 = Para informações do usuário");
            System.out.println("0 = Para encerrar");
            System.out.print("Digite a opção: ");
            selecao = ler.nextInt();
            System.out.println();

            switch (selecao) {
                case 1:

                        b.mostrarSaldo();
                    
                    break;

                case 2:

                        b.depositar();

                    break;

                case 3:

                           b.retirar();               


                    break;

                    case 4:

                        p.retornaDados();

                        

                    break;

                case 0:
                        System.out.println("Obrigado por utilizar nosso Banco até a próxima!\n");

                    break;
            
                default:
                System.out.println("!!! OPÇÃO INVÁLIDA TENTE NOVAMENTE !!! \n");
                    break;
            }
        } while (selecao != 0);

        ler.close();

    }

    

    
 }


