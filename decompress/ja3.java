import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ja3 extends wkr<ia3>
{
    public ja3() {
        final ia3 h0 = ia3.H0;
        Objects.requireNonNull(ia3.Companion);
        final ia3[] values = ia3.values();
        int e;
        if ((e = vmw.E(values.length)) < 16) {
            e = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (int i = 0; i < values.length; ++i) {
            final ia3 ia3 = values[i];
            linkedHashMap.put((Object)ia3.F0, (Object)ia3);
        }
        super((Object)h0, (Map)linkedHashMap);
    }
}
