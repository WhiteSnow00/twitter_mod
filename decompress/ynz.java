import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ynz implements hnz
{
    public rll<o0u<byte[]>> a;
    public final rll<o0u<byte[]>> b;
    public final emz c;
    
    public ynz(final Context context, final emz c) {
        this.c = c;
        final y63 e = y63.e;
        w0u.b(context);
        final r0u c2 = w0u.a().c((y3a)e);
        if (y63.d.contains(new j4a("json"))) {
            this.a = new exe((rll<Object>)new kjz(c2));
        }
        this.b = new exe((rll<Object>)new wnz(c2));
    }
    
    public static haa<byte[]> b(final emz emz, final qnz qnz) {
        final int a = emz.a();
        if (qnz.a != 0) {
            return new za1<byte[]>((Object)qnz.a(a), azk.C0);
        }
        return new za1<byte[]>((Object)qnz.a(a), azk.D0);
    }
    
    public final void a(final qnz qnz) {
        if (this.c.a() == 0) {
            final exe a = this.a;
            if (a != null) {
                ((o0u)a.get()).a((haa)b(this.c, qnz));
            }
            return;
        }
        this.b.get().a((haa)b(this.c, qnz));
    }
}
