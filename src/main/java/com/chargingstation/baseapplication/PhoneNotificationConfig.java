package com.chargingstation.baseapplication;

import org.springframework.stereotype.Service;

@Service
public interface PhoneNotificationConfig {
	String getChargingNotification();
	String getChargedNotification();
}
	