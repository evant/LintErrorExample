package example.com.stringdeflinterror;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Foo {
    public static final String TYPE_ONE = "one";
    public static final String TYPE_TWO = "two";

    public void foo(@Type String foo) {
    }

    @StringDef({TYPE_ONE, TYPE_TWO})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }
}
