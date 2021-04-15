package Problem4;

public class CopyByCopyConstructor {
	
	StringBuffer sb = new StringBuffer();

	public CopyByCopyConstructor() {

	}

	public CopyByCopyConstructor(String theText) {
		sb.append(theText);
	}

	public CopyByCopyConstructor(CopyByCopyConstructor cbcc) {
		sb = new StringBuffer(cbcc.getText());
	}

	public void setText(String theText) {
		sb.setLength(0);
		sb.append(theText);
	}

	public String getText() {
		return sb.toString();
	}

}
