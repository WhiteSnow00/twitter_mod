import java.util.Map;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lk extends gjr<kk>
{
    public lk() {
        final kk d0 = kk.D0;
        Objects.requireNonNull(kk.Companion);
        final kk[] values = kk.values();
        int w0;
        if ((w0 = kq9.W0(values.length)) < 16) {
            w0 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(w0);
        for (int i = 0; i < values.length; ++i) {
            final kk kk = values[i];
            final String name = kk.name();
            final Locale english = Locale.ENGLISH;
            zzd.e((Object)english, "ENGLISH");
            final String lowerCase = name.toLowerCase(english);
            zzd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put((Object)lowerCase, (Object)kk);
        }
        super((Object)d0, (Map)linkedHashMap);
    }
}
