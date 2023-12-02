import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conta {
    private double saldo;

    @Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_especial_com_saldo_atual_de_reais(int saldoInicial) {
        this.saldo = -saldoInicial;
    }

    @When("^foi solicitado um saque no valor de (\\d+) reais$")
    public void foi_solicitado_um_saque_no_valor_de_reais(int valorSaque) {
        if (valorSaque <= Math.abs(saldo)) {
            saldo += valorSaque;
        }
    }

    @When("^foi realizado um depósito no valor de (\\d+) reais$")
    public void realizarDeposito(int valorDeposito) {
        saldo += valorDeposito;
    }

    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int novoSaldo) {
        assert saldo == -novoSaldo : "O saldo não foi atualizado corretamente após o saque.";
    }

    @Then("^não deve efetuar o saque e deve retornar a mensagem saldo insuficiente$")
    public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
       
    }
}

