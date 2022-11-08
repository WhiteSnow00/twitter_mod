import android.view.ViewGroup;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class znh extends v3e<eoh$j, foh>
{
    public final LayoutInflater d;
    public final zlh e;
    
    public znh(final LayoutInflater d, final zlh e) {
        zzd.f((Object)d, "layoutInflater");
        zzd.f((Object)e, "listIntentDispatcher");
        super((Class)eoh$j.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final foh foh = (foh)c7x;
        final eoh$j eoh$j = (eoh$j)o;
        zzd.f((Object)foh, "viewHolder");
        zzd.f((Object)eoh$j, "item");
        final String a = eoh$j.a;
        zzd.f((Object)a, "text");
        foh.Y0.setText((CharSequence)a);
        final String b = eoh$j.b;
        zzd.f((Object)b, "text");
        foh.Z0.setText((CharSequence)b);
        foh.X0.setChecked(eoh$j.c);
        foh.W0.setOnClickListener((View$OnClickListener)new kuf((Object)new xnh(this, eoh$j, foh), 15));
        final ynh ynh = new ynh(foh);
        final View a2 = foh.a1;
        zzd.e((Object)a2, "row");
        bqe.s(a2, (otb)ynh);
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131624838, viewGroup, false);
        zzd.e((Object)inflate, "layoutInflater.inflate(R\u2026ation_row, parent, false)");
        return (c7x)new foh(inflate);
    }
}
