package ar.edu.unq.poo2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroOrTest {

	private FiltroOr filtroOr; //SUT
	private Filtro filtroTrue; //DOC
	private Filtro filtroFalse; //DOC
	private Proyecto p;
	
	@BeforeEach
	void setUp() throws Exception {
		filtroTrue = mock(Filtro.class);
		filtroFalse = mock(Filtro.class);
		p = mock(Proyecto.class);
		
		when(filtroTrue.cumpleFiltro(p)).thenReturn(true);
		when(filtroFalse.cumpleFiltro(p)).thenReturn(false);
	}

//	@Test
//	void testSePreguntaAlHijoSiCumpleFiltro() {
//		List<Filtro> filtros;
//		
//		filtros = new ArrayList<Filtro>(Arrays.asList(filtroFalse, filtroTrue));
//		filtroOr = new FiltroOr(filtros);
//		
//		filtroOr.cumpleFiltro(p);
//		verify(filtroTrue).cumpleFiltro(p);
//		verify(filtroFalse).cumpleFiltro(p);
//	}
	
	@Test
	void testCumpleFiltro() {
		filtroOr = new FiltroOr(filtroTrue, filtroTrue);				
		
		assertTrue(filtroOr.cumpleFiltro(p));
		
		filtroOr = new FiltroOr(filtroTrue, filtroFalse);				
		
		assertTrue(filtroOr.cumpleFiltro(p));
		
		filtroOr = new FiltroOr(filtroFalse, filtroTrue);				
		
		assertTrue(filtroOr.cumpleFiltro(p));
		
		filtroOr = new FiltroOr(filtroFalse, filtroFalse);				
		
		assertFalse(filtroOr.cumpleFiltro(p));
	}

}
