package annotations;


import java.lang.annotation.*;
import Sorter_Strategy.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SortController{
	
	String strategy;

}