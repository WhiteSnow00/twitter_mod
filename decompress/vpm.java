import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vpm implements x6j<dom, List<iq7$c>>
{
    public final hm9<kni, akd> F0;
    public final kq7 G0;
    
    public vpm(final hm9<kni, akd> f0, final kq7 g0) {
        e0e.f((Object)f0, "inboxSettingsSource");
        e0e.f((Object)g0, "inboxListItemDataSource");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void close() {
    }
    
    @Override
    public final t5j w(final Object o) {
        final dom dom = (dom)o;
        e0e.f((Object)dom, "inbox");
        final t5j switchMap = this.F0.w((Object)kni.a).switchMap((rtb)new uma((stb)new upm(this, dom), 5));
        e0e.e((Object)switchMap, "override fun queryObserv\u2026tItems(settings, inbox) }");
        return switchMap;
    }
}
