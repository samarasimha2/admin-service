package com.akhm.sevice.impl;

import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.akhm.repository.AdminRepository;
import com.akhm.repository.entity.AdminEntity;
import com.akhm.service.AdminService;


@RunWith(SpringJUnit4ClassRunner.class)
public class AdminServiceImplTest {
	@Mock
	private AdminService adminService;
	@Mock
	private AdminRepository adminRepository;
	@Test
	public void getAdminTest() throws Exception
	{
		AdminEntity adminEntity=new AdminEntity();
		Mockito.when(adminRepository.findByEmailIdAndPassword("samara@gmail.com", "1234")).thenReturn(adminEntity);
		AdminEntity admin=adminService.getAdmin("samara@gmail.com", "1234");
		assertNull(admin);
		
	}
	
	@Test
	public void getAdmin_ExceptionTest() throws Exception
	{
		AdminEntity adminEntity=new AdminEntity();
		//Mockito.when(adminRepository.findByEmailIdAndPassword("samara@gmail.com", "1234")).thenReturn(adminEntity);
		AdminEntity admin=adminService.getAdmin("samara@gmail.com", "1234");
		assertNull(admin);
		
	}
	
}