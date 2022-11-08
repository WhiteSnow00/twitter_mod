import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lzi extends v3e<yp7$c$c, a>
{
    public final otb<oyv> d;
    public final View$OnClickListener e;
    
    public lzi(final otb<oyv> d, final View$OnClickListener e) {
        super((Class)yp7$c$c.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final yp7$c$c yp7$c$c = (yp7$c$c)o;
        zzd.f((Object)a, "viewHolder");
        zzd.f((Object)yp7$c$c, "item");
        ((mzi)a.D0.getValue()).setOnDismissListener((otb)a.E0.d);
        ((mzi)a.D0.getValue()).setSettingsButtonClickListener(a.E0.e);
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final Context context = ((View)viewGroup).getContext();
        zzd.e((Object)context, "parent.context");
        return (c7x)new a(context);
    }
    
    public final class a extends el8
    {
        public final u3s D0;
        public final /* synthetic */ lzi E0;
        
        public a(final Context context) {
            super((View)new mzi(context));
            this.D0 = (u3s)rp2.z0((otb)new lzi$a$a(this));
        }
    }
}
