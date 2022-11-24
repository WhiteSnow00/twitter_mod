import java.util.Map;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aej extends wkr<zdj>
{
    public aej() {
        final zdj h0 = zdj.H0;
        Objects.requireNonNull(zdj.Companion);
        final zdj[] values = zdj.values();
        int e;
        if ((e = vmw.E(values.length)) < 16) {
            e = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (int i = 0; i < values.length; ++i) {
            final zdj zdj = values[i];
            final String name = ((Enum)zdj).name();
            final Locale english = Locale.ENGLISH;
            e0e.e((Object)english, "ENGLISH");
            final String lowerCase = name.toLowerCase(english);
            e0e.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put((Object)lowerCase, (Object)zdj);
        }
        super((Object)h0, (Map)linkedHashMap);
    }
}
