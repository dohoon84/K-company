package krx;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, ANNOTATION_TYPE})
public @interface Repeat {
  /**
   * set value.
   */
  int value() default 1;
}