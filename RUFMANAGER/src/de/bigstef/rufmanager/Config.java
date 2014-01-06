package de.bigstef.rufmanager;

public interface Config {

	
	// CONSTANTS
	static final String YOUR_SERVER_URL =  "http://bigstef.no-ip.biz/gcm/";
	// YOUR_SERVER_URL : Server url where you have placed your server files
    // Google project id
    static final String GOOGLE_SENDER_ID = "347681772729";  // Place here your Google project id

    /**
     * Tag used on log messages.
     */
    static final String TAG = "Rufmanager";

    static final String DISPLAY_MESSAGE_ACTION =
            "de.bigstef.rufmanager.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";
		
	
}
