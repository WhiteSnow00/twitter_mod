import java.util.Map;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akl extends wkr<zjl>
{
    public akl() {
        final zjl g0 = zjl.G0;
        Objects.requireNonNull(zjl.Companion);
        final zjl[] values = zjl.values();
        int e;
        if ((e = vmw.E(values.length)) < 16) {
            e = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (int i = 0; i < values.length; ++i) {
            final zjl zjl = values[i];
            final String name = ((Enum)zjl).name();
            final Locale english = Locale.ENGLISH;
            e0e.e((Object)english, "ENGLISH");
            final String lowerCase = name.toLowerCase(english);
            e0e.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put((Object)lowerCase, (Object)zjl);
        }
        super((Object)g0, (Map)linkedHashMap);
    }
}
