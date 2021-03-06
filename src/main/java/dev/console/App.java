package dev.console;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.CalculService;

public class App {

	private Scanner scanner;
	private CalculService calculatrice;
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public App(Scanner scanner, CalculService calculatrice) {
		this.scanner = scanner;
		this.calculatrice = calculatrice;
	}

	protected void afficherTitre() {
		LOG.info("**** Application Calculatrice ****");
	}

	public void demarrer() {
		afficherTitre();
		String expression ;
		while (true) {
			LOG.info("Veuillez saisir une expression : ");
			expression = scanner.nextLine();
			if (expression.equals("fin")) {
				LOG.info("Au revoir :)");
				return;
			} else {
				evaluer(expression);
				
			}
		}
	}

	protected void evaluer(String expression) {
		calculatrice.additionner(expression);
		

	}
}
