
    public class ContaBanco {
        // ATRIBUTOS
        public int numConta;
        protected String tipoConta;
        private String Dono;
        private float saldoConta;
        private boolean status;

    {

    }
    // Métodos Personalizados

    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Nº da conta: " + this.getNumConta());
        System.out.println("Conta tipo: " + this.getTipoConta());
        System.out.println("Nome do usuário: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldoConta());
        System.out.println("Status da conta: " + this.isStatus());
    }

    public void abrirConta(String t) {
        this.setTipoConta(t);
        this.setStatus(true);
        if ("cc".equals(t)) {
            this.setSaldoConta(50f);
        } else if ("cp".equals(t)) {
            this.setSaldoConta(150f);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldoConta() >= 0) {
            System.out.println("Conta com saldo positivo.");
        } else if (this.getSaldoConta() < 0) {
            System.out.println("Conta com saldo negativo.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldoConta(this.getSaldoConta() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Conta não existente. Impossível depositar.");
        }
    }

    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldoConta() >= v) {
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Conta inexistente. Impossível sacar");
        }
    }

    public void anuidade() {
        int v = 0;
        if (this.getTipoConta() == "cc") {
            v = 12;
        } else {
            if (this.getTipoConta() == "cp") {
                v = 20;
            }
            if (this.isStatus()) {
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Anuidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Conta Inexistente. Impossível pagar anuidade.");
            }
        }
    }

    // Metodos especiais
    public ContaBanco() {
        this.setSaldoConta(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipoConta() {
        return tipoConta;
    }


    public void setTipoConta(String t) {
        this.tipoConta = t;
        }

        public String getDono() {
            return Dono;
        }
        public void setDono(String dc){
            this.Dono = dc;
        }
        public float getSaldoConta() {
            return saldoConta;
        }
        public void setSaldoConta(float saldoConta) {
            this.saldoConta = saldoConta;
        }
        public boolean isStatus() {
            return status;
        }
        public void setStatus(boolean status) {
            this.status = status;
        }
    }
