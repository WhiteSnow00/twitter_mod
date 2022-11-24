import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hde extends wkr<vy>
{
    public hde() {
        final vy g0 = vy.G0;
        Objects.requireNonNull(vy.Companion);
        final vy[] values = vy.values();
        int e;
        if ((e = vmw.E(values.length)) < 16) {
            e = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (int i = 0; i < values.length; ++i) {
            final vy vy = values[i];
            linkedHashMap.put((Object)vy.name(), (Object)vy);
        }
        super((Object)g0, (Map)linkedHashMap);
    }
}
