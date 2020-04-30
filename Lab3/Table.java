package Lab3;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

//Table用来标注表的名字
@Target(TYPE)
@Retention(RUNTIME)
public @interface Table {
	String value();
}
