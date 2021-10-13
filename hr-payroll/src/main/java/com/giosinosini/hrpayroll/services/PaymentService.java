package com.giosinosini.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.giosinosini.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment (long workerId, int days) {
		return new Payment("João", 250.00, days);
	}
}
