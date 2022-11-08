import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijw extends gjr<fjw>
{
    public ijw() {
        final fjw g0 = fjw.G0;
        Objects.requireNonNull(fjw.Companion);
        final fjw[] values = fjw.values();
        int w0;
        if ((w0 = kq9.W0(values.length)) < 16) {
            w0 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(w0);
        for (int i = 0; i < values.length; ++i) {
            final fjw fjw = values[i];
            linkedHashMap.put((Object)fjw.C0, (Object)fjw);
        }
        super((Object)g0, (Map)linkedHashMap);
    }
}
