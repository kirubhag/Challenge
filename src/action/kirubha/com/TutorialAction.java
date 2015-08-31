package action.kirubha.com;

import service.kirubha.com.TutorialFinderService;

public class TutorialAction {

	public String TutorialList;
	public String lang;

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getTutorialList() {
		return TutorialList;
	}

	public void setTutorialList(String tutorialList) {
		TutorialList = tutorialList;
	}

	public TutorialFinderService tutorialFinderService = new TutorialFinderService();

	public String execute() {

		setTutorialList(tutorialFinderService.getTutorialList(lang));
		return "success";
	}
}
