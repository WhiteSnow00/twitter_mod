import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rzi extends a3e<fp7$c$c, a>
{
    public final nsb<fzv> d;
    public final View$OnClickListener e;
    
    public rzi(final nsb<fzv> d, final View$OnClickListener e) {
        super((Class)fp7$c$c.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final a a = (a)v7x;
        final fp7$c$c fp7$c$c = (fp7$c$c)o;
        czd.f((Object)a, "viewHolder");
        czd.f((Object)fp7$c$c, "item");
        ((szi)a.E0.getValue()).setOnDismissListener((nsb)a.F0.d);
        ((szi)a.E0.getValue()).setSettingsButtonClickListener(a.F0.e);
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        czd.f((Object)viewGroup, "parent");
        final Context context = ((View)viewGroup).getContext();
        czd.e((Object)context, "parent.context");
        return (v7x)new a(context);
    }
    
    public final class a extends nk8
    {
        public final n4s E0;
        public final rzi F0;
        
        public a(final rzi f0, final Context context) {
            this.F0 = f0;
            super((View)new szi(context));
            this.E0 = (n4s)pps.n((nsb)new rzi$a$a(this));
        }
    }
}
