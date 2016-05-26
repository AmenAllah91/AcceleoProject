package org.bd.pfe.generator.persistance;

public class TypeToAttributes {
	public String convertToAttributes(String s) {
switch (s) {
case "Mail":
	return "String";
case "Image":
	return "byte[]";
case "PieceJointe":
	return "String";
	
}
		return s;
	}

}
