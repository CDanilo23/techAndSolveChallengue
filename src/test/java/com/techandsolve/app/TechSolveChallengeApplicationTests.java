package com.techandsolve.app;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;

import com.techandsolve.app.models.dao.VueloDao;
import com.techandsolve.app.models.entity.Vuelo;
import com.techandsolve.app.models.service.VueloService;
import com.techandsolve.app.models.service.VueloServiceImpl;
import com.techandsolve.app.transfer.VueloDto;

public class TechSolveChallengeApplicationTests {
	
	VueloService vueloService;
	
	List<Vuelo> listDao;
	
	List<VueloDto> listDto;
	
	@Before
	public void init() {
		VueloDao vueloDao = mock(VueloDao.class);
		listDao = Arrays.asList(new Vuelo("AWER58", "450", null, new Date()));
		PowerMockito.when(vueloDao.findAll()).thenReturn(listDao);
		vueloService = new VueloServiceImpl();
		Whitebox.setInternalState(vueloService, "vueloDao", vueloDao); 
	}

	@Test
	public void test_That_invokeFindAllMethod_then_return_Mocked_Data() {
		listDto = Arrays.asList(new VueloDto(1L,"AWER58", "450", null, null, null, new Date()));
		Mockito.when(vueloService.findAll()).thenReturn(listDto);
		
	}

}
