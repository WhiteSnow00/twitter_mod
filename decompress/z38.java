import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z38 extends v3e<yp7$c$e, a>
{
    public final View$OnClickListener d;
    public boolean e;
    
    public z38(final View$OnClickListener d) {
        super((Class)yp7$c$e.class);
        this.d = d;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final yp7$c$e yp7$c$e = (yp7$c$e)o;
        zzd.f((Object)a, "viewHolder");
        zzd.f((Object)yp7$c$e, "item");
        if (!this.e) {
            saw.b((okm)new zf4(new String[] { "messages:inbox", m0n.W(gid.E0, false), "low_quality_pivot", "impression" }));
            this.e = true;
        }
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final Context context = ((View)viewGroup).getContext();
        zzd.e((Object)context, "parent.context");
        return (c7x)new a(context, this.d);
    }
    
    public static final class a extends el8
    {
        public a(final Context context, final View$OnClickListener onClickListener) {
            zzd.f((Object)onClickListener, "onShowClickedListener");
            final tq7 tq7 = new tq7(context);
            super((View)tq7);
            tq7.setOnClickListener(onClickListener);
        }
    }
}
