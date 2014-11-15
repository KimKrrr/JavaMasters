package com.application.javamasters.views;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class HelpfulLinks extends Panel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5473842857424711853L;
	private VerticalLayout panelLayout = new VerticalLayout();
	private VerticalLayout linksLayout = new VerticalLayout();
	private Panel linksPanel = new Panel();
	private Link link1;
	private Link link2;
	private Link video;
	
	public HelpfulLinks(String link1, String link2, String video) {
		super();
		this.link1 = new Link(link1, new ExternalResource(link1));
		this.link2 = new Link(link2, new ExternalResource(link2));
		this.video = new Link("Video Turorial", new ExternalResource(video));
		
//		link1.setTargetName("_blank");
//		link2.setTargetName("_blank");

		
		this.setContent(panelLayout);
		panelLayout.addComponent(new Label("Helpful Links"));
		panelLayout.addComponent(linksPanel);
		this.linksPanel.setContent(linksLayout);
		linksLayout.addComponent(this.link1);
		linksLayout.addComponent(this.link2);
		linksLayout.addComponent(this.video);
	}
	
	

}

