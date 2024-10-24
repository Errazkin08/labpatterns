package adapter2;

import java.util.Iterator;
import java.util.Set;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames = new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {
	    return columnNames.length;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
	    // Challenge!
		  
		  Iterator<Symptom> it=pacient.getSymptoms().iterator();
		  int i=0;
		  Symptom s=null;
		  while(i <=row && it.hasNext()) {
			  s= (Symptom)it.next();
			  i++;
		  }
		  if(col==0) {
			  return s;
		  }
		  return pacient.getWeight(s);
	  }
	}
