package com.akhm.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.entity.AdminEntity;
import com.akhm.service.AdminService;
import com.ctc.wstx.shaded.msv_core.reader.Controller;
import com.google.common.util.concurrent.Service;

@RunWith(SpringJUnit4ClassRunner.class)
public class AdminControllerTest {
	@InjectMocks
	private AdminController adminController;
	@Mock
	private AdminService adminService;
	@Test
	public void testLogin() throws Exception
	{
		AdminService adminService=mock(AdminService.class);
		when(adminService.getAdmin(Mockito.any(), Mockito.any())).thenReturn((AdminEntity) adminService);
		ResponseEntity<AdminService> response=AdminControllerTest.login(adminService);
		assertNotNull(response.getBody());
	}
	private static ResponseEntity<AdminService> login(AdminService adminService2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public void loginExceptionTest()
	{
		AdminEntity adminEntity = new AdminEntity();
		when(adminService.getAdmin("samar@gmail.com", "3");
		ResponseEntity response = adminController.login((Map<String, String>) adminEntity);
		assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());

	}*/
	

}
