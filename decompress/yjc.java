import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yjc
{
    public final fci<?> a;
    public final glq b;
    public final zb7 c;
    public final Activity d;
    
    public yjc(final fci<?> a, final glq b, final zb7 c, final Activity d) {
        e0e.f((Object)a, "navigator");
        e0e.f((Object)b, "softUserConfig");
        e0e.f((Object)c, "customTabsManager");
        e0e.f((Object)d, "activity");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final String s) {
        e0e.f((Object)s, "url");
        if (this.b.a()) {
            this.c.i(this.d, s, (yp2)null);
        }
        else {
            final fci<?> a = this.a;
            final l51.a a2 = new l51.a();
            a2.q(s);
            a.d((cn)a2.e());
        }
    }
}
