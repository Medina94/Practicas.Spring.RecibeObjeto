package Spring.objeto;

import java.util.HashMap;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class GenerarPDF {
	private JasperReport report;
	private JasperPrint print;
	private JasperViewer view;
	
	
	// CONSTRUCTOR
	public GenerarPDF() {
	}
	//-------------------------------------------------------------------------------------------------------
	public JasperReport getReport() {
		return report;
	}

	public void setReport(JasperReport report) {
		this.report = report;
	}

	public JasperPrint getPrint() {
		return print;
	}

	public void setPrint(JasperPrint print) {
		this.print = print;
	}

	public JasperViewer getView() {
		return view;
	}

	public void setView(JasperViewer view) {
		this.view = view;
	}

	//--------------------------------------------------------------------------------------------------------
	public void reporteCompile() {
		try {
			report = JasperCompileManager.compileReport("C:\\Users\\cmedina\\Desktop\\copia\\ReportePDF.jrxml");
			if(report != null) {
				System.out.println("encontrado");
			}else {
				System.out.println("no se encontro");
			}
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
	
	//------------------------------------------------------------------------------
	public void crearReporte(HashMap<String, Object> param) {
		try {
			print = JasperFillManager.fillReport(report, param, new JREmptyDataSource());
			
			
			//crea y exporta el pdf
			System.out.println("assaddsdasdas");
			JasperExportManager.exportReportToPdfFile(print, "C:\\Users\\cmedina\\Desktop\\ReporteCreado.pdf");
			
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
	//------------------------------------------------------------------------------
	public void visualizar() {
		view.viewReport(print, false);
	}
	
	
}
