package com.dingy.dingyserver.datamodels;

import java.util.Date;
import java.util.List;

public class Task {

	
	
	private String id;
	private String name;
	private Date created;
	private DingyUser creator;
	
	
	
	private List<DingyUser> admins;
	private List<Task> sub_tasks;
	
	
	//does the task reset? (for example a weekly cleaning task)
	private boolean is_recurring;
	
	//how often the task will reset (i.e go into voting phase)
	private int recurrance_frequency;
	
	
	private boolean is_in_voting_phase;
	
}
