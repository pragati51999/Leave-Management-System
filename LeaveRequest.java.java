package com.leave;

public class LeaveRequest {
	private Employee employee;
    private String date;
    private String reason;

    public LeaveRequest(Employee employee, String date, String reason) {
        this.employee = employee;
        this.date = date;
        this.reason = reason;
    }

    public Employee getEmployee() { return employee; }
    public String getDate() { return date; }
    public String getReason() { return reason; }
}

