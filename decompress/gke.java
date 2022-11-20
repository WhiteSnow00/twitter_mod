import java.util.regex.Pattern;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gke extends StringBasedTypeConverter<spv>
{
    public static final spv a;
    public static final dw1<String, spv> b;
    
    static {
        a = spv.E0;
        final ArrayList list = new ArrayList();
        for (final spv spv : spv.values()) {
            final String name = spv.name();
            final String lowerCase = name.toLowerCase(Locale.ENGLISH);
            final String[] split = lowerCase.split("_");
            for (int j = 0; j < split.length; ++j) {
                final String s = split[j];
                final Pattern a2 = ikr.a;
                czd.f((Object)s, "str");
                final Locale default1 = Locale.getDefault();
                czd.e((Object)default1, "getDefault()");
                split[j] = vkr.R(s, default1);
            }
            final String k = ikr.i((CharSequence)"", (Object[])split);
            for (int l = 0; l < 3; ++l) {
                list.add(new AbstractMap.SimpleImmutableEntry<String, spv>((new String[] { name, lowerCase, k })[l], spv));
            }
        }
        b = new dw1((Iterable)list);
    }
    
    public final String convertToString(final Object o) {
        return (String)gke.b.a((Object)o);
    }
    
    public final Object getFromString(final String s) {
        final spv spv = (spv)gke.b.get((Object)s);
        final spv a = gke.a;
        spv spv2 = spv;
        if (spv == null) {
            spv2 = a;
        }
        return spv2;
    }
}
