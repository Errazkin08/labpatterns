package iterator;

import java.util.Comparator;

import domain.Symptom;

public class ComSevIndex  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return ((Symptom) o1).getSeverityIndex()- ((Symptom)o2).getSeverityIndex();
	}

}
