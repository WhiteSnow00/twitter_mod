import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bz implements xy
{
    public final Set<uol> a;
    public final kfw b;
    public final rql c;
    public final bxo d;
    public final bxo e;
    public final t5j<dgd> f;
    
    public bz(final Set<? extends uol> a, final kfw b, final rql c, final bxo d, final bxo e) {
        e0e.f((Object)a, "dataConverters");
        e0e.f((Object)b, "userManager");
        e0e.f((Object)c, "pushNotificationBroadcaster");
        e0e.f((Object)d, "subscribeScheduler");
        e0e.f((Object)e, "observeScheduler");
        this.a = (Set<uol>)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new znl();
    }
    
    public final t5j<? extends dgd> a() {
        final ojf$a ojf$a = new ojf$a(this.a.size() + 1);
        ((ojf)ojf$a).p((Object)this.f);
        ((ojf)ojf$a).q((Iterable)new t5e((Iterable)this.a, (lub)new qys((Object)this, 1)).t3());
        final t5j merge = t5j.merge((Iterable)((z4j)ojf$a).e());
        e0e.e((Object)merge, "merge(inAppMessageDataList)");
        return (t5j<? extends dgd>)merge;
    }
}
