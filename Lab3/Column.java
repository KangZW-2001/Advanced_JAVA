package Lab3;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


//Column用来标注每个field对应的表中字段是什么
@Target(FIELD)
@Retention(RUNTIME)
public @interface Column {
	String value();
}
