package aula6;

public class Cliente {

        private String nome;
        private String email;
        private long cpf;
        private String dt_nascimento;
        private Endereco endereco = new Endereco();
        private Veiculo veiculo;

        public Cliente(String nome, String email, long cpf, String dt_nascimento, String logradouro, int numero, String complemento, int cep){
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
            this.dt_nascimento = dt_nascimento;
            this.endereco.setLogradouro(logradouro);
            this.endereco.setComplemento(complemento);
            this.endereco.setNumero(numero);
            this.endereco.setCep(cep);

        }

        public Cliente(String nome, String email, int cpf, String dt_nascimento){
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
            this.dt_nascimento = dt_nascimento;

        }
        
        /*public Cliente(String nome, String email, int cpf, String dt_nascimento, String placa, long renavam, String chassi){
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
            this.dt_nascimento = dt_nascimento;
        }*/

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public long getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public String getDt_nascimento() {
            return dt_nascimento;
        }

        public void setDt_nascimento(String dt_nascimento) {
            this.dt_nascimento = dt_nascimento;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }

}
