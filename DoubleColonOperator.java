import java.util.function.*;
import java.util.*;
import java.util.stream.*;

interface Interf{
	public void m();
}

public class DoubleColonOperator{
	public static void m2(){
		System.out.println("If this method contains thousand lines of codes we can simple reuse it if it is required somewhere else");
	}
	public static void main(String[] args){
		Interf i = DoubleColonOperator::m2;
		i.m();
	}
}