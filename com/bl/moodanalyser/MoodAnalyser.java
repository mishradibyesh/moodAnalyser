package com.bl.moodanalyser;

public class MoodAnalyser {

	//method to analyse mood by reading string
	 public String analyseMood(String message) {

	        if (message.toLowerCase().contains("sad")) {
	            return "SAD";
	        } else {
	            return null;
	        }
	    }
	}