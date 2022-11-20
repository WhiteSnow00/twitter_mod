import java.util.AbstractMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5r extends akr<Integer>
{
    public a5r() {
        final Integer value = 2;
        super((Object)value, new Map.Entry[] { (Map.Entry)new AbstractMap.SimpleImmutableEntry("succeeded", 0), (Map.Entry)new AbstractMap.SimpleImmutableEntry("pending", 1), (Map.Entry)new AbstractMap.SimpleImmutableEntry("in_progress", 1), (Map.Entry)new AbstractMap.SimpleImmutableEntry("failed", value) });
    }
}
