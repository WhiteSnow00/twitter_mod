import java.util.AbstractMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfr extends gjr<Integer>
{
    public kfr() {
        final Integer value = 2;
        super((Object)value, new Map.Entry[] { (Map.Entry)new AbstractMap.SimpleImmutableEntry("success", 1), (Map.Entry)new AbstractMap.SimpleImmutableEntry("failure", value), (Map.Entry)new AbstractMap.SimpleImmutableEntry("cancel", 3) });
    }
}
