import java.util.Objects;
import java.util.Collection;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bb6 extends ztr<ytr>
{
    public final pjw G0;
    public final ogc H0;
    public boolean I0;
    public int J0;
    
    public bb6(final Context context) {
        super(context);
        this.G0 = new pjw(context, 2131625917);
        this.H0 = new ogc(context);
        this.I0 = false;
        this.J0 = 0;
    }
    
    public static String k(final int n, final ytr ytr) {
        if (n == 1) {
            return ikr.l(((njw)ytr).b);
        }
        if (n == 2) {
            return ((ngc)ytr).a;
        }
        return "";
    }
    
    public final void a(final View view, final Context context, final Object o) {
        final ytr ytr = (ytr)o;
        final int h = this.h(ytr);
        if (h != 0) {
            if (h == 1) {
                this.H0.g(view, (ngc)ytr);
            }
        }
        else {
            this.G0.g(view, context, (njw)ytr);
        }
    }
    
    public final /* bridge */ int d(final Object o) {
        return this.h((ytr)o);
    }
    
    public final View f(final Context context, final int n, final ViewGroup viewGroup) {
        if (n == 0) {
            return this.G0.f(context, n, viewGroup);
        }
        if (n == 1) {
            return this.H0.f(context, n, viewGroup);
        }
        if (n == 2) {
            return LayoutInflater.from(context).inflate(2131625629, viewGroup, false);
        }
        throw new IllegalArgumentException(udu.z("Invalid view type ", n));
    }
    
    public final ytr g(final int n) {
        if (this.j() && n == this.getCount() - 1) {
            return (ytr)new ukb();
        }
        return (ytr)super.getItem(n);
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
        final ytr g = this.g(n);
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
    
    public final int h(final ytr ytr) {
        if (ytr instanceof njw) {
            return 0;
        }
        if (ytr instanceof ngc) {
            return 1;
        }
        if (ytr instanceof ukb) {
            return 2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid suggestion type ");
        sb.append(ytr);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void i(final Collection<Long> collection) {
        final ijw h0 = this.G0.H0;
        Objects.requireNonNull(h0);
        h0.a = dnp.r((Iterable)collection);
    }
    
    public final boolean j() {
        return this.I0 && this.J0 != 2;
    }
}
