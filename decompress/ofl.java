import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofl implements tib, nbe
{
    public final qcl a;
    public final n5k b;
    public final r5k c;
    public final m29 d;
    public final img e;
    public final ocw f;
    public final Context g;
    public final rv1<tib$a> h;
    public final zml<Long> i;
    public final nhw j;
    public uuy k;
    public hfv l;
    
    public ofl(final Context g, final ocw f, final r5k c, final n5k b, final qcl a, final nhw j) {
        this.d = new m29();
        this.h = (rv1<tib$a>)new rv1();
        this.i = (zml<Long>)new zml();
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = new img((Object)g, (Object)UserIdentifier.getCurrent(), (Object)psc.c());
        this.f = f;
        this.g = g;
    }
    
    public final void a(final boolean b) {
        final hfv l = this.l;
        if (l == null) {
            return;
        }
        this.a.n(b, tdy.i0(l.H1));
        final int h1 = this.l.H1;
        int h2;
        if (b) {
            h2 = tdy.L0(h1, 1);
        }
        else {
            h2 = tdy.Y0(tdy.Y0(h1, 1), 2048);
        }
        this.l.H1 = h2;
        this.b.e(b, tdy.i0(h2), (xzo)this.c);
    }
    
    public final void b(final boolean b) {
        this.a.n(true, b);
        this.b.e(true, b, (xzo)this.c);
        final hfv l = this.l;
        if (l == null) {
            return;
        }
        if (b) {
            l.H1 = tdy.L0(l.H1, 2048);
        }
        else {
            l.H1 = tdy.Y0(l.H1, 2048);
        }
    }
    
    public final tib$a c() {
        final hfv l = this.l;
        if (l == null) {
            return (tib$a)tib$a$b.a;
        }
        if (tdy.Y(l.H1)) {
            return (tib$a)tib$a$a.a;
        }
        if (tdy.e0(this.l.H1)) {
            return (tib$a)new tib$a$c(tdy.i0(this.l.H1));
        }
        return (tib$a)tib$a$d.a;
    }
}
