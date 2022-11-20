import java.util.Map;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlm extends akr<clm>
{
    public dlm() {
        final clm d0 = clm.D0;
        Objects.requireNonNull(clm.Companion);
        final clm[] values = clm.values();
        int o;
        if ((o = rpb.O(values.length)) < 16) {
            o = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(o);
        for (int i = 0; i < values.length; ++i) {
            final clm clm = values[i];
            final String name = ((Enum)clm).name();
            final Locale english = Locale.ENGLISH;
            czd.e((Object)english, "ENGLISH");
            final String lowerCase = name.toLowerCase(english);
            czd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put((Object)lowerCase, (Object)clm);
        }
        super((Object)d0, (Map)linkedHashMap);
    }
}
