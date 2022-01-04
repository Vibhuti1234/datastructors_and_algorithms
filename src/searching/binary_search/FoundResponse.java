package searching.binary_search;

public class FoundResponse {
private boolean isFound;
private int index;
public FoundResponse() {
	super();
	
}
public FoundResponse(boolean isFound, int index) {
	super();
	this.isFound = isFound;
	this.index = index;
}
public boolean isFound() {
	return isFound;
}
public void setFound(boolean isFound) {
	this.isFound = isFound;
}
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}

}
