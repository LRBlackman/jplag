package jplag.java15;

import jplag.ProgramI;

import java.io.File;

public class Language implements jplag.Language {
	private Parser parser;

	public Language(ProgramI program) {
		this.parser = new Parser(false);
		this.parser.setProgram(program);
	}

	public int errorsCount() {
		return this.parser.errorsCount();
	}

	public String[] suffixes() {
		String[] res = { ".java", ".jav", ".JAVA", ".JAV" };
		return res;
	}

	public String name() {
		return "Java1.5 Parser";
	}

	public String getShortName() {
		return "java15";
	}

	public int min_token_match() {
		return 8;
	}

	public jplag.Structure parse(File dir, String[] files) {
		System.out.println("Java1.5Flag");
		return this.parser.parse(dir, files);
	}

	public boolean errors() {
		return this.parser.getErrors();
	}

	public boolean supportsColumns() {
		return true;
	}

	public boolean isPreformated() {
		return true;
	}

	public boolean usesIndex() {
		return false;
	}

	public int noOfTokens() {
		return jplag.java15.JavaToken.numberOfTokens();
	}

	public String type2string(int type) {
		return jplag.java15.JavaToken.type2string(type);
	}
}
