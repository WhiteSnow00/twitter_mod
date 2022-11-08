import java.util.Map;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h3q extends gjr<g3q>
{
    public h3q() {
        final g3q d0 = g3q.D0;
        Objects.requireNonNull(g3q.Companion);
        final g3q[] values = g3q.values();
        int w0;
        if ((w0 = kq9.W0(values.length)) < 16) {
            w0 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(w0);
        for (int i = 0; i < values.length; ++i) {
            final g3q g3q = values[i];
            final String lowerCase = g3q.name().toLowerCase(Locale.ROOT);
            zzd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            linkedHashMap.put((Object)lowerCase, (Object)g3q);
        }
        super((Object)d0, (Map)linkedHashMap);
    }
}
