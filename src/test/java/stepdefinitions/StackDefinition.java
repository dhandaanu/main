package stepdefinitions;

import PageObject.Stack;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackDefinition {
	
	Stack stack = new Stack();
	
	@Given("User is logged in and on Home Page")
	public void user_is_logged_in_and_on_home_page() {
		stack.openHomePage();
		stack.validateLogin();
	}

	@When("User clicks on stack Get started button or from drop menu stack item")
	public void user_clicks_on_stack_get_started_button_or_from_drop_menu_stack_item() {
		stack.stackStartBtn();
		stack.navigate();
		stack.dropdown();
		stack.listStack();
	}

	@Then("User is on stack Intro page")
	public void user_is_on_stack_intro_page() {
		stack.onStackPage();
	}

	@Given("User is on opertaion stack Intro page")
	public void User_is_on_opertaion_stack_intro_page() {
		stack.onStackPageAssert();
	}

	@When("user clicks on opertaion in stack")
	public void user_clicks_on_opertaion_in_stack() {
		stack.operationStack();
	}

	 @And("User clicks on try here")
	 public void  And_User_clicks_on_try_here() {
		 stack.tryHere();
	 }

	@Then("User lands on tryEditor page")
	public void user_lands_on_try_editor_page() {
		stack.onTryeditorpage();
	}
	
	@Given("User lands on Editor page for invalid code")
	public void user_lands_on_editor_page_for_invalid_code() {
		stack.onTryeditorpage();
	}

	@When("User enters invalid code to run on editor")
	public void user_enters_invalid_code_to_run_on_editor(DataTable table) throws InterruptedException{
		stack.enterInvalidCode(table);
		
	}

	@And("User clicks Run to execute code")
	public void user_clicks_run_to_execute_code() throws InterruptedException {
	    stack.runBtn();
	}

	@Then("User gets a error message and dismisses it")
	public void user_gets_a_error_message_and_dismisses_it() throws InterruptedException {
		stack.inValidOutputMessage();
	}

	@Given("User lands on Editor page valid code")
	public void user_lands_on_editor_page_valid_code() {
		stack.navigate();
		stack.tryHere();
	}

	@When("User enters python code to run on editor")
	public void user_enters_python_code_to_run_on_editor(DataTable table1) throws InterruptedException {
		stack.enterpythonCode(table1);
	   
	}

	@And("User clicks Run to execute pythone code")
	public void user_clicks_run_to_execute_pythone_code() throws InterruptedException {
		 stack.runBtn();
	}

	@Then("User gets a valid output")
	public void user_gets_a_valid_output() {
		stack.validOutput();
	}
	
	@Given("The user is on Stack page for clicks on implementation")
	public void the_user_is_on_stack_page_for_clicks_on_implementation() {
		stack.navigate();
	}

	@When("user clicks on implementation")
	public void user_clicks_on_implementation() {
		stack.implementation();
	}

	@Given("The user on Stack page for clicks on Applications")
	public void the_user_on_stack_page_for_clicks_on_Applications() {
		stack.navigate();	
	}

	@When("user clicks on Applications")
	public void user_clicks_on_applications() {
		stack.application();
	}
	    
   
   @Given("The user is on Stack page for click practice quest")
	public void The_user_is_on_Stack_page_for_click_practice_quest() {
		stack.navigate();
	}

	@When("user clicks on practice questions")
	public void user_clicks_on_practice_questions() {
		stack.practiceQuestions();
	}

	@Then("User lands on practice page")
	public void user_lands_on_practice_page() {
		stack.pacticeQuesAssert();
	}

}