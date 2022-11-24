import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j6r extends wkr<i6r>
{
    public j6r() {
        final i6r h0 = i6r.H0;
        Objects.requireNonNull(i6r.Companion);
        final i6r[] values = i6r.values();
        int e;
        if ((e = vmw.E(values.length)) < 16) {
            e = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (int i = 0; i < values.length; ++i) {
            final i6r i6r = values[i];
            linkedHashMap.put((Object)i6r.F0, (Object)i6r);
        }
        super((Object)h0, (Map)linkedHashMap);
    }
}
