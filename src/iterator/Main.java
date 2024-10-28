package iterator;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("s1", 10, 1), 1);
			p.addSymptom(new Symptom("s2", 10, 2), 2);
			p.addSymptom(new Symptom("s3", 10, 3), 3);
			p.addSymptom(new Symptom("s4", 10, 4), 4);
			p.addSymptom(new Symptom("s5", 10, 5), 5);
			
			InvertedIterator i=new Covid19PacientAdapter(p);
			i.goLast();
			while(i.hasPrevious())
				System.out.println(i.previous());

		}

	}

