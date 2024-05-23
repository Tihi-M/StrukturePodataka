
public class Element {
	int count;
	int value;
	
	public Element(int value_,int count_) {
		this.count = count_;
		this.value = value_;
	}
	
	@Override
	public String toString(){
		return Integer.toString(this.value) + "(cnt:"+Integer.toString(count)+") ";
	}
}
