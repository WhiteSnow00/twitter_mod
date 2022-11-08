import android.view.View;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vet extends v3e<uet, a>
{
    public final ydj d;
    
    public vet(final ydj d) {
        super((Class)uet.class);
        this.d = d;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final uet uet = (uet)o;
        final ydj d = this.d;
        final xdj a2 = uet.a;
        if (a2 != null) {
            d.a(a.D0, (xwm)a2);
        }
        else {
            ((View)a.D0).setVisibility(8);
        }
        final ydj d2 = this.d;
        final xdj b = uet.b;
        if (b != null) {
            d2.a(a.E0, (xwm)b);
        }
        else {
            ((View)a.E0).setVisibility(8);
        }
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        return (c7x)new a(LayoutInflater.from(((View)viewGroup).getContext()), viewGroup);
    }
    
    public static final class a extends el8
    {
        public final TextView D0;
        public final TextView E0;
        
        public a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
            final View inflate = layoutInflater.inflate(2131625104, viewGroup, false);
            super(inflate);
            this.D0 = (TextView)inflate.findViewById(2131429432);
            this.E0 = (TextView)inflate.findViewById(2131429409);
        }
    }
}
