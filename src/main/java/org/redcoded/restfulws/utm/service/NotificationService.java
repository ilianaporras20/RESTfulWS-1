package org.redcoded.restfulws.utm.service;

import java.util.List;

import org.redcoded.restfulws.utm.model.Notification;

public interface NotificationService {
	public List<Notification> getNotifications();
	public Notification notify(String subject, String message, List<String> toAddress, List<String> ccAddress);
}