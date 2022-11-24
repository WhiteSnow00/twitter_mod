import android.view.View;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgt extends b4e<bgt, a>
{
    public final qej d;
    
    public cgt(final qej d) {
        super((Class)bgt.class);
        this.d = d;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final a a = (a)n8x;
        final bgt bgt = (bgt)o;
        final qej d = this.d;
        final pej a2 = bgt.a;
        if (a2 != null) {
            d.a(a.G0, (fym)a2);
        }
        else {
            ((View)a.G0).setVisibility(8);
        }
        final qej d2 = this.d;
        final pej b = bgt.b;
        if (b != null) {
            d2.a(a.H0, (fym)b);
        }
        else {
            ((View)a.H0).setVisibility(8);
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        return (n8x)new a(LayoutInflater.from(((View)viewGroup).getContext()), viewGroup);
    }
    
    public static final class a extends sl8
    {
        public final TextView G0;
        public final TextView H0;
        
        public a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
            final View inflate = layoutInflater.inflate(2131625106, viewGroup, false);
            super(inflate);
            this.G0 = (TextView)inflate.findViewById(2131429433);
            this.H0 = (TextView)inflate.findViewById(2131429410);
        }
    }
}
