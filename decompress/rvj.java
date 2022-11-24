import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rvj extends b4e<iq7$c$d, a>
{
    public rvj() {
        super((Class)iq7$c$d.class);
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final a a = (a)n8x;
        final iq7$c$d iq7$c$d = (iq7$c$d)o;
        e0e.f((Object)a, "viewHolder");
        e0e.f((Object)iq7$c$d, "item");
        if (iq7$c$d.a) {
            a.G0.setVisibility(8);
            a.H0.setVisibility(0);
        }
        else {
            a.G0.setVisibility(0);
            a.H0.setVisibility(8);
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        return (n8x)new a(viewGroup);
    }
    
    public static final class a extends sl8
    {
        public final View G0;
        public final View H0;
        
        public a(final ViewGroup viewGroup) {
            final View x = m51.x(viewGroup, "parent", 2131624722, viewGroup, false);
            super(x);
            final View viewById = x.findViewById(2131430782);
            e0e.e((Object)viewById, "heldView.findViewById(co\u2026i.list.R.id.progress_dot)");
            this.G0 = viewById;
            final View viewById2 = x.findViewById(2131430778);
            e0e.e((Object)viewById2, "heldView.findViewById(R.id.progress_bar)");
            this.H0 = viewById2;
        }
    }
}
