package somepackage;

import javax.faces.bean.*;

@ManagedBean
public class LanguageForm {

	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language.trim();
	}

	public String checkLanguage() {
		if(language.equalsIgnoreCase("java")) {
			return ("confirmation");
		} else if (language.isEmpty()){
			return ("error");
		} else {
			return ("warning");
		}
	}
	
	public String toStartPage() {
		return ("index");
	}
}
