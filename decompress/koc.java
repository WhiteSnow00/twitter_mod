import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class koc
{
    public final Activity a;
    public final jt3 b;
    public final j8v c;
    public final l5t d;
    public final m29 e;
    public final m29 f;
    public final j5t g;
    public final nht h;
    
    public koc(final Activity a, final jt3 b, final j8v c, final ibm ibm, final e9a e9a, final l5t d, final a1s a1s, final j5t g, final nht h) {
        final m29 e = new m29();
        this.e = e;
        this.f = new m29();
        this.a = a;
        this.b = b;
        this.c = c;
        ibm.i((rj)new aq1((Object)this, 12));
        this.d = d;
        this.g = g;
        this.h = h;
        if (d.a() && a1s.b) {
            d.c(h5t.F0);
            a1s.b(true);
        }
        final b5j a2 = c.a();
        final jpa jpa = new jpa((Object)this, 14);
        Objects.requireNonNull(e9a);
        e.c(a2.subscribe((fk6)jpa, (fk6)new shd((Object)e9a, 14)));
    }
}
