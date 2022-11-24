import android.widget.CompoundButton;
import android.view.ViewGroup;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g84 extends b4e<ba4, h84>
{
    public final qej d;
    public final z94 e;
    public final LayoutInflater f;
    
    public g84(final qej d, final z94 e, final LayoutInflater f) {
        super((Class)ba4.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final h84 h84 = (h84)n8x;
        final ba4 ba4 = (ba4)o;
        h84.l0(null);
        this.d.a(h84.I0, (fym)ba4.a.b);
        this.d.a(h84.J0, (fym)ba4.a.c);
        ((CompoundButton)h84.G0).setChecked(this.e.f(ba4.a));
        h84.l0((CompoundButton$OnCheckedChangeListener)new f84(this, ba4));
        kcm.i((sj)new n0p((Object)h84, 22));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        return (n8x)new h84(this.f, viewGroup);
    }
}
