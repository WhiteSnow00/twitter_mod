import android.view.ViewStub;
import android.widget.TextSwitcher;
import android.view.View;
import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wld
{
    public final Configuration a;
    public View b;
    public View c;
    public qxj d;
    public qxj e;
    public TextSwitcher f;
    public View g;
    public View h;
    public View i;
    public final int j;
    public final View k;
    public final ViewStub l;
    public final kgm<View> m;
    public final int n;
    
    public wld(final View k, final int n, final int j, final Configuration a) {
        final kgm e = kgm.e();
        this.m = (kgm<View>)e;
        this.a = a;
        this.k = k;
        final ViewStub l = (ViewStub)k.findViewById(n);
        this.l = l;
        this.j = j;
        if (l == null) {
            e.onNext((Object)(this.i = k.findViewById(j)));
            e.onComplete();
            final View i = this.i;
            if (i != null) {
                this.a(i);
            }
            if (this.i == null) {
                bl0.a().a();
            }
        }
        this.n = k.getMinimumHeight();
    }
    
    public abstract void a(final View p0);
    
    public final View b() {
        this.e();
        final View i = this.i;
        pf8.r(i);
        final View view = i;
        return i;
    }
    
    public final qxj c() {
        this.e();
        final qxj d = this.d;
        pf8.r(d);
        return d;
    }
    
    public final qxj d() {
        this.e();
        final qxj e = this.e;
        pf8.r(e);
        return e;
    }
    
    public final void e() {
        if (this.i == null) {
            final ViewStub l = this.l;
            if (l != null && ((View)l).getParent() != null) {
                final View inflate = this.l.inflate();
                this.i = inflate;
                this.m.onNext((Object)inflate);
                this.m.onComplete();
            }
            else {
                this.i = this.k.findViewById(this.j);
            }
            final View i = this.i;
            if (i != null) {
                this.a(i);
            }
        }
    }
}
