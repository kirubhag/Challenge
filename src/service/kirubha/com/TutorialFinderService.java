package service.kirubha.com;

public class TutorialFinderService {

	public String result;

	public String getTutorialList(String lang) {
		System.out.println("lang: " + lang);
		if (lang.equals("java")) {
			result = "Java brains";
		} else {
			result = "Language not supported yet.";
		}
		return result;
	}
}
