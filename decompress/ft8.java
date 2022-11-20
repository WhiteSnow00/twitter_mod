import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ft8 extends akr<et8>
{
    public ft8() {
        final et8 d0 = et8.D0;
        Objects.requireNonNull(et8.Companion);
        final et8[] values = et8.values();
        int o;
        if ((o = rpb.O(values.length)) < 16) {
            o = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(o);
        for (int i = 0; i < values.length; ++i) {
            final et8 et8 = values[i];
            linkedHashMap.put((Object)((Enum)et8).name(), (Object)et8);
        }
        super((Object)d0, (Map)linkedHashMap);
    }
}
