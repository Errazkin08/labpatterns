package iterator;

import java.util.*;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientAdapter implements InvertedIterator{
	private  Covid19Pacient pacient;
	private int index;
	private List<Symptom> lista;
	
	public Covid19PacientAdapter(String name,int years) {
		pacient=new Covid19Pacient(name,years);
		index=0;
		lista= new ArrayList<Symptom>(pacient.getSymptoms());
		Collections.sort(lista,new ComSymptomName());
	}
	public Covid19PacientAdapter (Covid19Pacient pacient) {
		this.pacient=pacient;
		index=0;
		lista= new ArrayList<Symptom>(pacient.getSymptoms());
		Collections.sort(lista,new ComSevIndex());
	}

	@Override
	public Object previous() {
		index--;
		return lista.get(index) ;
	}

	@Override
	public boolean hasPrevious() {
		return index>0;
	}

	@Override
	public void goLast() {
		index=lista.size();
		
	}

}
