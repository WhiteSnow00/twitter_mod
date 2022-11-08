import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wjc
{
    public final mbi<?> a;
    public final rjq b;
    public final pb7 c;
    public final Activity d;
    
    public wjc(final mbi<?> a, final rjq b, final pb7 c, final Activity d) {
        zzd.f((Object)a, "navigator");
        zzd.f((Object)b, "softUserConfig");
        zzd.f((Object)c, "customTabsManager");
        zzd.f((Object)d, "activity");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final String s) {
        zzd.f((Object)s, "url");
        if (this.b.a()) {
            this.c.i(this.d, s, null);
        }
        else {
            final mbi<?> a = this.a;
            final k51$a k51$a = new k51$a();
            k51$a.q(s);
            a.d((zm)((h4j)k51$a).e());
        }
    }
}
