import android.view.ViewStub;
import android.widget.TextSwitcher;
import android.view.View;
import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class amd
{
    public final Configuration a;
    public View b;
    public View c;
    public kyj d;
    public kyj e;
    public TextSwitcher f;
    public View g;
    public View h;
    public View i;
    public final int j;
    public final View k;
    public final ViewStub l;
    public final phm<View> m;
    public final int n;
    
    public amd(final View k, final int n, final int j, final Configuration a) {
        final phm e = phm.e();
        this.m = (phm<View>)e;
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
                po.b().a();
            }
        }
        this.n = k.getMinimumHeight();
    }
    
    public abstract void a(final View p0);
    
    public final View b() {
        this.e();
        final View i = this.i;
        vmw.g((Object)i);
        final View view = i;
        return i;
    }
    
    public final kyj c() {
        this.e();
        final kyj d = this.d;
        vmw.g((Object)d);
        return d;
    }
    
    public final kyj d() {
        this.e();
        final kyj e = this.e;
        vmw.g((Object)e);
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
