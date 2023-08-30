package com.bhabanisjena.mockito.test_doubles.dummy;

public class DummyEmailService implements EmailService
{
	@Override
	public void sendMail(String message)
	{
		throw new AssertionError("Method not implemented");
	}
}
