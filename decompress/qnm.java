import android.content.Context;
import android.widget.TextView;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qnm extends a3e<fp7$c$b, a>
{
    public final Resources d;
    
    public qnm(final Resources d) {
        czd.f((Object)d, "res");
        super((Class)fp7$c$b.class);
        this.d = d;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final a a = (a)v7x;
        final fp7$c$b fp7$c$b = (fp7$c$b)o;
        czd.f((Object)a, "viewHolder");
        czd.f((Object)fp7$c$b, "item");
        a.E0.setText((CharSequence)this.d.getString(0));
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        czd.f((Object)viewGroup, "parent");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131624629, viewGroup, false);
        czd.e((Object)inflate, "from(parent.context).inf\u2026pty_state, parent, false)");
        return (v7x)new a(inflate);
    }
    
    public static final class a extends nk8
    {
        public final TextView E0;
        
        public a(final View view) {
            super(view);
            this.E0 = (TextView)view;
            final Context context = view.getContext();
            czd.e((Object)context, "itemView.context");
            view.setBackgroundColor(d4j.i(context, 2130969036));
        }
    }
}
