package runnerfile;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)

	@CucumberOptions(
						features = {".//feature/login.feature",
								},
						
//						features = {".//feature/loginDtt.feature" },
						
						
			
						glue =     {"StepDefintionStudio"},
						
						plugin =   { "pretty",
									"html:target/report.html",
									"json:target/Cucumber.json",
									"rerun:target/rerun.txt",
									},
						
						monochrome = true
						
	                
	                
	                 )
	public class runnerfile{
		

	}

