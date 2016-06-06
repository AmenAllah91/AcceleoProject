package org.bd.pfe.generator.main;

import java.io.IOException;

import org.bd.pfe.generator.presentation.template.CopyFile;

public class ExecuteGenerating {

	public static void main(String[] args) {
 	try  {
 			CopyFile.createRepertoire(System.getProperty("user.dir")+"/template1" , "E:/Projects/Projet/pfe/pfe-web/src/main/webapp/template1");
 	    	} 
 	catch (IOException e1)
        	{
 			 e1.printStackTrace();
        	}
		
 		Main.main(args);
 		GenerateProcess.main(args);
	}

}
