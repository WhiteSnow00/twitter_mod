import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mgg extends dn1<wl1>
{
    public final /* synthetic */ Uri D0;
    
    public mgg(final Uri d0) {
        this.D0 = d0;
    }
    
    public final void b(final Object o) {
        final wl1 wl1 = (wl1)o;
        if (wl1 instanceof y7s) {
            final m29 m29 = new m29();
            m29.c(wl1.o0().d().subscribe((fk6)new d1t((Object)wl1, (Object)this.D0, (Object)m29, 2)));
        }
    }
}
