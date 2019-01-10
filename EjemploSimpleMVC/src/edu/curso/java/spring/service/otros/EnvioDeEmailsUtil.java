package edu.curso.java.spring.service.otros;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class EnvioDeEmailsUtil {
	
	private static Log log = LogFactory.getLog(EnvioDeEmailsUtil.class);
	
	@Async
	public void notificarNuevaAltaProducto() {
		log.info("Enviando correos...");
		try {
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Fin envio correos");
		
	}
	
	@Scheduled(fixedRate=15000) // cada 15 seg
	public void consultarPedidosPendientes() {
		log.info("Consultando pedidos pendientes..");		
	}
	
	@Scheduled(cron = "1 * * * * *") // cada 1 min
	public void consultarPedidosCancelados() {
		log.info("Consultando pedidos cancelados..");
	}
	
}
