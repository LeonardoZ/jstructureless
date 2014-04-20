package br.com.leonardoz.structures;

public class Counter {

	private Integer index = 0;

	public Integer add() {
		return index++;
	}

	public Integer remove() {
		return index--;
	}


	public Integer getIndex() {
		return index;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((index == null) ? 0 : index.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (index == null) {
			if (other.index != null)
				return false;
		} else if (!index.equals(other.index))
			return false;
		return true;
	}
	
	
	
}
