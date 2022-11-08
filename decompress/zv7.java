import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zv7 extends gue implements rtb<View, gvl>
{
    public final /* synthetic */ oxu C0;
    public final /* synthetic */ bfm D0;
    public final /* synthetic */ wv1 E0;
    
    public zv7(final oxu c0, final bfm d0, final wv1 e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        zzd.f((Object)view, "view");
        final oxu c0 = this.C0;
        gvl gvl;
        if (c0 != null) {
            gvl = new gvl(view, c0, this.D0, this.E0);
        }
        else {
            gvl = null;
        }
        return gvl;
    }
}
