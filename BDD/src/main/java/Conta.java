import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conta {
	
@Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
// Write code here that turns the phrase above into concrete actions
throw new PendingException();
}

@When("^foi solicitado um saque no valor de (\\d+) reais$")
public void foi_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
// Write code here that turns the phrase above into concrete actions
throw new PendingException();
}

@Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
// Write code here that turns the phrase above into concrete actions
throw new PendingException();
}

@Then("^não deve efetuar o saque e deve retornar a mensagem saldo insuficiente$")
public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() throws Throwable {
// Write code here that turns the phrase above into concrete actions
throw new PendingException();
}

}
