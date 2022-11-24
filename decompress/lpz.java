import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpz implements uoz
{
    public qml<x1u<byte[]>> a;
    public final qml<x1u<byte[]>> b;
    public final rnz c;
    
    public lpz(final Context context, final rnz c) {
        this.c = c;
        final h73 e = h73.e;
        e2u.b(context);
        final a2u c2 = e2u.a().c((k4a)e);
        if (h73.d.contains(new v4a("json"))) {
            this.a = new lxe((qml<Object>)new xkz(c2));
        }
        this.b = new lxe((qml<Object>)new jpz(c2));
    }
    
    public static vaa<byte[]> b(final rnz rnz, final dpz dpz) {
        final int a = rnz.a();
        if (dpz.c != 0) {
            return new za1<byte[]>((Object)dpz.a(a), zzk.F0);
        }
        return new za1<byte[]>((Object)dpz.a(a), zzk.G0);
    }
    
    public final void a(final dpz dpz) {
        if (this.c.a() == 0) {
            final lxe a = this.a;
            if (a != null) {
                ((x1u)a.get()).a((vaa)b(this.c, dpz));
            }
            return;
        }
        this.b.get().a((vaa)b(this.c, dpz));
    }
}
