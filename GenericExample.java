
public class GenericExample<T> {

	private T data;
	private String dataType;
	
	public GenericExample(T data, String type)
	{
		this.data = data;
		dataType = type;
	}
	
	public T getData()
	{
		return data;
	}
	
}
