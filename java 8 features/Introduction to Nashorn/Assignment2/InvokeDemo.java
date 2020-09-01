import javax.script.*;
import java.io.FileReader;

class InvokeDemo{
	public static void main(String []args){
		try{
		ScriptEngine se=new ScriptEngineManager().getEngineByName("nashorn");
		FileReader fr=new FileReader("Demo.js");
		se.eval(fr);
		Invocable invocable=(Invocable)se;
		System.out.println(invocable.invokeFunction("check",24));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}		
}