import android.view.ViewGroup;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mn3 extends v3e<u94, nn3>
{
    public final s94 d;
    public final LayoutInflater e;
    
    public mn3(final s94 d, final LayoutInflater e) {
        zzd.f((Object)d, "viewModel");
        zzd.f((Object)e, "layoutInflater");
        super((Class)u94.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final nn3 nn3 = (nn3)c7x;
        final u94 u94 = (u94)o;
        zzd.f((Object)nn3, "viewHolder");
        zzd.f((Object)u94, "item");
        nn3.l0((View$OnClickListener)null);
        final String c0 = ((xwm)u94.a.b).C0;
        zzd.e((Object)c0, "item.choiceValue.text.text");
        nn3.D0.setText((CharSequence)c0);
        final boolean g = this.d.g(u94.a);
        final View e0 = nn3.E0;
        int visibility;
        if (g) {
            visibility = 0;
        }
        else {
            visibility = 4;
        }
        e0.setVisibility(visibility);
        if (!g) {
            nn3.l0((View$OnClickListener)new ibg(this, u94, 12));
        }
        ibm.i((rj)new czo((Object)nn3, 17));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        return (c7x)new nn3(this.e, viewGroup);
    }
}
