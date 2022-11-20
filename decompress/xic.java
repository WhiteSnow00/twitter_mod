import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xic
{
    public final obi<?> a;
    public final jkq b;
    public final ua7 c;
    public final Activity d;
    
    public xic(final obi<?> a, final jkq b, final ua7 c, final Activity d) {
        czd.f((Object)a, "navigator");
        czd.f((Object)b, "softUserConfig");
        czd.f((Object)c, "customTabsManager");
        czd.f((Object)d, "activity");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final String s) {
        czd.f((Object)s, "url");
        if (this.b.a()) {
            this.c.i(this.d, s, (hp2)null);
        }
        else {
            final obi<?> a = this.a;
            final f51$a f51$a = new f51$a();
            f51$a.q(s);
            a.d((ym)((n4j)f51$a).e());
        }
    }
}
