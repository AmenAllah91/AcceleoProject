package org.bd.pfe.generator.persistance;

public class PackageToPath {
	public String convertPackageToPath(String p){
		String s=p.replace(".", "/") ;
		String path = s;
		return path ;
	}

	

}
