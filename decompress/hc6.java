import java.util.Objects;
import java.util.Collection;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hc6 extends xur<wur>
{
    public final ekw I0;
    public final qhc J0;
    public boolean K0;
    public int L0;
    
    public hc6(final Context context) {
        super(context);
        this.I0 = new ekw(context, 2131625917);
        this.J0 = new qhc(context);
        this.K0 = false;
        this.L0 = 0;
    }
    
    public static String k(final int n, final wur wur) {
        if (n == 1) {
            return flr.l(((ckw)wur).b);
        }
        if (n == 2) {
            return ((phc)wur).a;
        }
        return "";
    }
    
    public final void a(final View view, final Context context, final Object o) {
        final wur wur = (wur)o;
        final int h = this.h(wur);
        if (h != 0) {
            if (h == 1) {
                this.J0.g(view, (phc)wur);
            }
        }
        else {
            this.I0.g(view, context, (ckw)wur);
        }
    }
    
    public final /* bridge */ int d(final Object o) {
        return this.h((wur)o);
    }
    
    public final View f(final Context context, final int n, final ViewGroup viewGroup) {
        if (n == 0) {
            return this.I0.f(context, n, viewGroup);
        }
        if (n == 1) {
            return this.J0.f(context, n, viewGroup);
        }
        if (n == 2) {
            return LayoutInflater.from(context).inflate(2131625629, viewGroup, false);
        }
        throw new IllegalArgumentException(rk0.B("Invalid view type ", n));
    }
    
    public final wur g(final int n) {
        if (this.j() && n == this.getCount() - 1) {
            return (wur)new vlb();
        }
        return (wur)super.getItem(n);
    }
    
    public final int getCount() {
        if (this.j()) {
            return super.getCount() + 1;
        }
        return super.getCount();
    }
    
    public final /* bridge */ Object getItem(final int n) {
        return this.g(n);
    }
    
    public final long getItemId(final int n) {
        final wur g = this.g(n);
        if (g != null) {
            return g.getId();
        }
        return -1L;
    }
    
    public final int getItemViewType(final int n) {
        return this.h(this.g(n));
    }
    
    public final int getViewTypeCount() {
        return 3;
    }
    
    public final int h(final wur wur) {
        if (wur instanceof ckw) {
            return 0;
        }
        if (wur instanceof phc) {
            return 1;
        }
        if (wur instanceof vlb) {
            return 2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid suggestion type ");
        sb.append(wur);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void i(final Collection<Long> collection) {
        final xjw j0 = this.I0.J0;
        Objects.requireNonNull(j0);
        j0.a = aop.r((Iterable)collection);
    }
    
    public final boolean j() {
        return this.K0 && this.L0 != 2;
    }
}
