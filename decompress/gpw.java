import java.io.IOException;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Map;
import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public class gpw<T> extends StringBasedTypeConverter<T>
{
    public final T a;
    public final Map<String, T> b;
    
    public gpw(final T[] array, final T a) {
        Object o;
        if (array != null) {
            o = Arrays.asList(array);
        }
        else {
            o = ged.G0;
            final int a2 = o5j.a;
        }
        final kkg t = kkg.t();
        for (final Object next : o) {
            if (next != a) {
                t.w((Object)next.toString(), next);
            }
        }
        this.b = (Map)((z4j)t).e();
        this.a = a;
    }
    
    public String convertToString(final T t) {
        return t.toString();
    }
    
    public T getFromString(final String s) {
        final T value = this.b.get(s);
        final T a = this.a;
        T t = value;
        if (value == null) {
            t = a;
        }
        return t;
    }
    
    public final void serialize(final T t, final String s, final boolean b, final yfe yfe) throws IOException {
        if (b) {
            yfe.u0(s, this.convertToString(t));
        }
        else {
            yfe.s0(this.convertToString(t));
        }
    }
}
