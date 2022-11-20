import java.util.AbstractMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dge extends akr<Integer>
{
    public dge() {
        final Integer value = 3;
        super((Object)value, new Map.Entry[] { (Map.Entry)new AbstractMap.SimpleImmutableEntry("VisibilityPrivate", 0), (Map.Entry)new AbstractMap.SimpleImmutableEntry("VisibilityPublic", 1), (Map.Entry)new AbstractMap.SimpleImmutableEntry("VisibilitySecret", 2), (Map.Entry)new AbstractMap.SimpleImmutableEntry("VisibilityUnspecified", value) });
    }
}
