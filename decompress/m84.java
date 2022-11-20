import java.util.Map;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m84 extends akr<l84>
{
    public m84() {
        final l84 e0 = l84.E0;
        Objects.requireNonNull(l84.Companion);
        final l84[] values = l84.values();
        int o;
        if ((o = rpb.O(values.length)) < 16) {
            o = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(o);
        for (int i = 0; i < values.length; ++i) {
            final l84 l84 = values[i];
            final String name = ((Enum)l84).name();
            final Locale english = Locale.ENGLISH;
            czd.e((Object)english, "ENGLISH");
            final String lowerCase = name.toLowerCase(english);
            czd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put((Object)lowerCase, (Object)l84);
        }
        super((Object)e0, (Map)linkedHashMap);
    }
}
