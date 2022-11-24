import android.content.Context;
import android.widget.TextView;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rp7 extends b4e<iq7$b, a>
{
    public final Resources d;
    
    public rp7(final Resources d) {
        e0e.f((Object)d, "res");
        super((Class)iq7$b.class);
        this.d = d;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final a a = (a)n8x;
        final iq7$b iq7$b = (iq7$b)o;
        e0e.f((Object)a, "viewHolder");
        e0e.f((Object)iq7$b, "item");
        a.G0.setText((CharSequence)this.d.getString(iq7$b.a));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131624630, viewGroup, false);
        e0e.e((Object)inflate, "from(parent.context).inf\u2026st_header, parent, false)");
        return (n8x)new a(inflate);
    }
    
    public static final class a extends sl8
    {
        public final TextView G0;
        
        public a(final View view) {
            super(view);
            this.G0 = (TextView)view;
            final Context context = view.getContext();
            e0e.e((Object)context, "itemView.context");
            view.setBackgroundColor(b1b.B(context, 2130969036));
        }
    }
}
