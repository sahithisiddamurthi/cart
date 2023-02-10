package com.salonService.app.services;

import java.time.LocalDate;
import java.util.List;

import com.salonService.app.entity.Appointment;
import com.salonService.app.exception.AppointmentException;
import com.salonService.app.exception.DuplicateAppointmentException;

public interface IAppointmentService {
	public Appointment addAppointment(Appointment appointment)throws DuplicateAppointmentException;
	public String removeAppointment(long id);

	public String updateAppointment(long id, Appointment appointments)throws AppointmentException;

	public Appointment getAppointmentById(Long id) throws AppointmentException;

	public List<Appointment> getAllAppointments() ;

	public List<Appointment> getOpenAppointments() ;
	
	public Appointment addAppointmentToCustomer(Appointment appointment,int custId)throws Exception ;
	
	public Appointment updateAppointmentDate(long id,LocalDate preferredDate)throws AppointmentException;
	
	public List<Appointment> getAppointmentByDate(LocalDate date);
}
