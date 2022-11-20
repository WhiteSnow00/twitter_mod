import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pcl
{
    public boolean a;
    public final cnb b;
    public final jgl c;
    public final View d;
    public final UserIdentifier e;
    public final efv f;
    public final trc g;
    public final x32 h;
    public tcl i;
    public String j;
    public vcl k;
    public int l;
    public final qkq m;
    
    public pcl(final cnb b, final UserIdentifier e, final jgl c, final efv f, final r8x r8x, final trc g, final jto jto, final x32 h, final View view, final qkq m) {
        this.l = 0;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.d = view.findViewById(2131430733);
        this.m = m;
        f.g(r8x.b(), (n93)new jgk((Object)this, 13));
        f.i(r8x.g(), (n93)new so3((Object)this, 14));
        jto.a((mso)new pcl$a(this));
    }
    
    public final u32 a(final vcl vcl) {
        this.j = "bonus_follow";
        return new u32(this.b, this.e, vcl, this.d, this.c, this.h, this.m);
    }
    
    public final pj4 b() {
        this.j = "cluster_follow";
        return new pj4(this.b, this.e, this.c, this.f, this.d);
    }
    
    public final void c() {
        this.d.setVisibility(8);
    }
    
    public final void d() {
        final int l = this.l;
        if (l != 0) {
            if (l == 2) {
                if (this.i == null) {
                    final String j = this.j;
                    if (j != null) {
                        if (j.equals("cluster_follow")) {
                            this.i = (tcl)this.b();
                        }
                        else if (this.j.equals("bonus_follow")) {
                            final vcl k = this.k;
                            if (k != null) {
                                this.i = (tcl)this.a(k);
                            }
                        }
                    }
                }
                final tcl i = this.i;
                if (i != null) {
                    i.j();
                }
            }
        }
        else if (this.c.b != null) {
            if (asa.b().b("onboarding_bonus_follows_enabled", false)) {
                final ucl ucl = new ucl(((Context)this.b).getApplicationContext(), this.e, this.c.d());
                final trc g = this.g;
                ((anm)ucl).U((wv0$b)new qcl(this));
                g.f((orc)ucl);
                this.l = 1;
            }
            else {
                final long d = this.c.d();
                final y1c y1c = new y1c((Context)this.b, this.e);
                y1c.l1 = 3;
                y1c.j1 = d;
                final trc g2 = this.g;
                ((anm)y1c).U((wv0$b)new rcl(this));
                g2.f((orc)y1c);
                this.l = 1;
            }
        }
    }
}
