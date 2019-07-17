package Spring.objeto;

import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class TestPdf {
	public static void main(String[] args) {
		GenerarPDF pdf = new GenerarPDF();
		pdf.reporteCompile();
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("parameter1", new String("111"));
		param.put("parameter2", new String("hola"));
		
		pdf.crearReporte(param);
		
		pdf.visualizar();
	}
}
