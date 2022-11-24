import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddl
{
    public boolean a;
    public final dob b;
    public final vgl c;
    public final View d;
    public final UserIdentifier e;
    public final sfv f;
    public final tsc g;
    public final g42 h;
    public hdl i;
    public String j;
    public jdl k;
    public int l;
    public final nlq m;
    
    public ddl(final dob b, final UserIdentifier e, final vgl c, final sfv f, final k9x k9x, final tsc g, final duo duo, final g42 h, final View view, final nlq m) {
        this.l = 0;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.d = view.findViewById(2131430734);
        this.m = m;
        f.g(k9x.b(), (fa3)new kg1((Object)this, 13));
        f.i(k9x.g(), (fa3)new qjl((Object)this, 13));
        duo.a((gto<?>)new ddl$a(this));
    }
    
    public final d42 a(final jdl jdl) {
        this.j = "bonus_follow";
        return new d42(this.b, this.e, jdl, this.d, this.c, this.h, this.m);
    }
    
    public final uk4 b() {
        this.j = "cluster_follow";
        return new uk4(this.b, this.e, this.c, this.f, this.d);
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
                            this.i = (hdl)this.b();
                        }
                        else if (this.j.equals("bonus_follow")) {
                            final jdl k = this.k;
                            if (k != null) {
                                this.i = (hdl)this.a(k);
                            }
                        }
                    }
                }
                final hdl i = this.i;
                if (i != null) {
                    i.j();
                }
            }
        }
        else if (this.c.b != null) {
            if (ita.b().b("onboarding_bonus_follows_enabled", false)) {
                final idl idl = new idl(((Context)this.b).getApplicationContext(), this.e, this.c.d());
                final tsc g = this.g;
                ((pnm)idl).U((aw0$b)new edl(this));
                g.f((pnm)idl);
                this.l = 1;
            }
            else {
                final long d = this.c.d();
                final y2c y2c = new y2c((Context)this.b, this.e);
                y2c.n1 = 3;
                y2c.l1 = d;
                final tsc g2 = this.g;
                ((pnm)y2c).U((aw0$b)new fdl(this));
                g2.f(y2c);
                this.l = 1;
            }
        }
    }
}
