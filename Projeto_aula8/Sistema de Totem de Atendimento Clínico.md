# Atividade Prática: Sistema de Totem de Atendimento Clínico

**Unidade Curricular:** Programação Orientada a Objetos (POO)  
**Curso:** Tecnologia em Análise e Desenvolvimento de Sistemas (ADS) - 2ª Fase  
**Conteúdos:** Classes Abstratas, Herança, Polimorfismo, Encapsulamento, Operador `instanceof` e Coleções (`List` / `ArrayList`)

---

## 1. Contextualização
A clínica médica **"Saúde & Vida"** está implementando um protótipo de **Totem Eletrônico** para organizar o atendimento na recepção.

O sistema deve permitir a emissão de senhas de atendimento (Comuns e Preferenciais). Todas as senhas geradas devem ser armazenadas em uma **lista dinâmica (`ArrayList`)**. No momento em que o atendente chama a próxima senha, o sistema deve **priorizar o atendimento de pacientes preferenciais** antes de chamar os pacientes comuns.

---

## 2. Requisitos do Sistema

### 2.1. Modelagem de Classes (Herança e Polimorfismo)

1. **Classe Abstrata `Senha` (Superclasse):**
   * **Atributos privados:**
     * `numero` (`int`): número sequencial da senha.
     * `dataHora` (`String` ou `LocalDateTime`): momento da emissão.
   * **Métodos:**
     * Construtores para inicializar os atributos.
     * Métodos *Getters* e *Setters* (Encapsulamento).
     * Método abstrato: `public abstract String formatarSenha();`  
       *(Obriga as subclasses a definirem como o código da senha será exibido).*
     * Método: `public void exibirDados();`  
       *(Imprime a senha formatada e a data/hora de emissão).*

2. **Classe `SenhaComum` (Subclasse de `Senha`):**
   * Herda de `Senha` utilizando `super`.
   * Sobrescreve (`@Override`) o método `formatarSenha()`, retornando o prefixo `"C-"` junto ao número com 3 dígitos (Ex: `"C-001"`, `"C-002"`).

3. **Classe `SenhaPreferencial` (Subclasse de `Senha`):**
   * Herda de `Senha`.
   * **Atributo privado extra:**
     * `motivo` (`String`): indicação da preferência (Ex: *"Gestante"*, *"Idoso"*, *"PCD"*, *"Lactante"*).
   * Construtor que recebe os dados da superclasse e o `motivo`.
   * Sobrescreve (`@Override`) o método `formatarSenha()`, retornando o prefixo `"P-"` com o número e o motivo (Ex: `"P-001 (Idoso)"`).

---

### 2.2. Gerenciamento com Lista e Regra de Prioridade

4. **Classe `TotemAtendimento`:**
   * **Atributos:**
     * `listaSenhas` (`List<Senha>`): lista dinâmica que armazena objetos do tipo `Senha` (usando polimorfismo para conter tanto `SenhaComum` quanto `SenhaPreferencial`).
     * `contador` (`int`): controle sequencial para numeração das senhas (iniciando em 1).
   * **Métodos obrigatórios:**
     * `adicionarSenha(Senha senha)`: insere a nova senha na lista (`listaSenhas.add(senha)`).
     * `emitirSenhaComum()`: instancia uma `SenhaComum`, adiciona na lista e a retorna.
     * `emitirSenhaPreferencial(String motivo)`: instancia uma `SenhaPreferencial`, adiciona na lista e a retorna.
     * `chamarProximaSenha()` (**Regra de Prioridade**):
       1. Se a lista estiver vazia, exibir aviso: *"Não há senhas cadastradas na lista para atendimento."*
       2. **Busca por Prioridade:** Percorrer a lista procurando se existe algum objeto do tipo `SenhaPreferencial` (utilizando o operador `instanceof`).
          * Se encontrar, remove e atende essa senha preferencial imediatamente (`listaSenhas.remove(i)`).
       3. **Atendimento Normal:** Se não houver nenhuma senha preferencial na lista, atende a primeira senha comum (`listaSenhas.remove(0)`).
       4. Exibir mensagem no console: `">>> CHAMANDO NO GUICHÊ: [Senha Formatada]"`.
     * `listarTodasSenhas()`: percorre a lista e exibe todas as senhas que estão aguardando e o total (`listaSenhas.size()`).

---

### 2.3. Execução Interativa (Classe `MainTotem`)

5. **Classe `MainTotem`:**
   * Criar um menu interativo no console utilizando `Scanner` dentro de um laço `do-while`:
     ```text
     ==================================================
        SISTEMA DE TOTEM DE ATENDIMENTO - CLÍNICA      
     ==================================================
     1 - Emitir Senha Comum
     2 - Emitir Senha Preferencial
     3 - Chamar Próxima Senha
     4 - Listar Senhas Pendentes
     5 - Relatório de Senhas Atendidas
     0 - Encerrar Sistema
     Escolha uma opção: 
     ```

