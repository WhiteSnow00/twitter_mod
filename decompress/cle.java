import java.util.regex.Pattern;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cle extends StringBasedTypeConverter<dqv>
{
    public static final dqv a;
    public static final lw1<String, dqv> b;
    
    static {
        a = dqv.G0;
        final ArrayList list = new ArrayList();
        for (final dqv dqv : dqv.values()) {
            final String name = dqv.name();
            final String lowerCase = name.toLowerCase(Locale.ENGLISH);
            final String[] split = lowerCase.split("_");
            for (int j = 0; j < split.length; ++j) {
                final String s = split[j];
                final Pattern a2 = flr.a;
                e0e.f((Object)s, "str");
                final Locale default1 = Locale.getDefault();
                e0e.e((Object)default1, "getDefault()");
                split[j] = slr.g1(s, default1);
            }
            final String k = flr.i((CharSequence)"", (Object[])split);
            for (int l = 0; l < 3; ++l) {
                list.add(new AbstractMap.SimpleImmutableEntry<String, dqv>((new String[] { name, lowerCase, k })[l], dqv));
            }
        }
        b = new lw1((Iterable)list);
    }
    
    public final String convertToString(final Object o) {
        return (String)cle.b.a((Object)o);
    }
    
    public final Object getFromString(final String s) {
        final dqv dqv = (dqv)cle.b.get((Object)s);
        final dqv a = cle.a;
        dqv dqv2 = dqv;
        if (dqv == null) {
            dqv2 = a;
        }
        return dqv2;
    }
}
