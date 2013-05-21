package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named("tp")
@SessionScoped
public class TabbedPane implements Serializable {

	private static final long serialVersionUID = 1L;

	private int index;

	private static final int JEFFERSON_INDEX = 0;
	private static final int ROOSEVELT_INDEX = 1;
	private static final int LINCOLN_INDEX = 2;
	private static final int WASHINGTON_INDEX = 3;

	public TabbedPane() {
		index = JEFFERSON_INDEX;
	}

	// Action Listners
	public void jeffersonAction(ActionEvent e) {
		index = JEFFERSON_INDEX;
	}

	public void rooseveltAction(ActionEvent e) {
		index = ROOSEVELT_INDEX;
	}

	public void lincolnAction(ActionEvent e) {
		index = LINCOLN_INDEX;
	}

	public void washingtonAction(ActionEvent e) {
		index = WASHINGTON_INDEX;
	}

	// CSS styles
	public String getJeffersonStyle() {
		return getCSS(JEFFERSON_INDEX);
	}

	public String getRooseveltStyle() {
		return getCSS(ROOSEVELT_INDEX);
	}

	public String getLincolnStyle() {
		return getCSS(LINCOLN_INDEX);
	}

	public String getWashingtonStyle() {
		return getCSS(WASHINGTON_INDEX);
	}

	private String getCSS(int forIndex) {
		return forIndex == index ? "tabbedPaneTextSelected" : "tabbedPaneText";
	}

	// Render content for each president
	public boolean isJeffersonCurrent() {
		return index == JEFFERSON_INDEX;
	}

	public boolean isRooseveltCurrent() {
		return index == ROOSEVELT_INDEX;
	}

	public boolean isLincolnCurrent() {
		return index == LINCOLN_INDEX;
	}

	public boolean isWashingtonCurrent() {
		return index == WASHINGTON_INDEX;
	}
}
