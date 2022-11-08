import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d5p extends gue implements rtb<Map<String, ? extends lfw>, gvj<? extends List<? extends Long>, ? extends Map<String, ? extends lfw>>>
{
    public final /* synthetic */ List<Long> C0;
    
    public d5p(final List<Long> c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Map map = (Map)o;
        zzd.f((Object)map, "userPresenceMap");
        return new gvj((Object)this.C0, (Object)map);
    }
}
