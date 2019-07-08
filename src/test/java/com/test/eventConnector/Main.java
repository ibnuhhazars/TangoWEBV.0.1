package com.test.eventConnector;

public class Main {
	
	private OnClick click = new OnClick();
	private OnSetText setText = new OnSetText();
	private OnVerify verify = new OnVerify();
	private OnEnter enter = new OnEnter();
	private OnSelect select = new OnSelect();
	private OnNavigate navigate = new OnNavigate();
	private OnGetText gettext = new OnGetText();
	
	public OnClick getClick() {
		return click;
	}

	public void setClick(OnClick click) {
		this.click = click;
	}

	public OnSetText getSetText() {
		return setText;
	}

	public void setSetText(OnSetText setText) {
		this.setText = setText;
	}

	public OnVerify getVerify() {
		return verify;
	}

	public void setVerify(OnVerify verify) {
		this.verify = verify;
	}

	public OnEnter getEnter() {
		return enter;
	}

	public void setEnter(OnEnter enter) {
		this.enter = enter;
	}

	public OnSelect getSelect() {
		return select;
	}

	public void setSelect(OnSelect select) {
		this.select = select;
	}

	public OnNavigate getNavigate() {
		return navigate;
	}

	public void setNavigate(OnNavigate navigate) {
		this.navigate = navigate;
	}

	public OnGetText getGettext() {
		return gettext;
	}

	public void setGettext(OnGetText gettext) {
		this.gettext = gettext;
	}
}
