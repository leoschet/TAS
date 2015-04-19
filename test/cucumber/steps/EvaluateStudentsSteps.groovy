/**
 * Created by Pedro Henrique Sousa de Moraes on 18/04/2015.
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

import tas.EvaluationCriterion

import static cucumber.api.groovy.EN.*

Given(~'^the system does not have an evaluation criterion with name “([^"]*)”$') {
    String criterionName ->
        assert EvaluationCriterion.findByName(criterionName) == null
}

When(~'^I create an evaluation criterion with name “([^"]*)”$') {
    String criterionName ->
        EvaluationCriterion.create(criterionName)
}

Then(~'^the evaluation criterion with name "([^"]*)" is properly stored in the system$') {
    String criterionName ->
        assert EvaluationCriterion.findByName(criterionName) != null
}

//////////////////////////////////////////////////////////////////////////////////////////////
Given(~'^I am on the Students Page$') {

}

And(~'^the student "([^"]*)" is registered in the system$') {

}

And(~'^there is a criterion called "([^"]*)" registered in the system$') {

}

And(~'^I should see a table with "([^"]*)" in a row and "Requirements" in a column$') {

}

When(~'^I change the value of the cell in line "([^"]*)" and column "([^"]*)" to "([^"]*)"$') {

}

And(~'^I click on “([^"]*)” button$') {

}

Then(~'^I am still viewing the Students Page$') {

}