import android.view.View;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f3p extends mg8
{
    public final oys N0;
    
    public f3p(final Fragment fragment, final kva<vxs> kva, final vl3 vl3, final oys n0, final boolean b, final sxm sxm, final bxo bxo, final bxo bxo2, final kcm kcm) {
        super(fragment, vl3, (kva)kva, b, sxm, bxo, bxo2, kcm);
        this.N0 = n0;
    }
    
    public final void onClick(final View view) {
        super.onClick(view);
        final Object tag = view.getTag(2131432057);
        final int a = o5j.a;
        final vxs vxs = (vxs)tag;
        if (vxs != null) {
            if (vxs.f() != null) {
                final String f = vxs.f().f;
                String s = "";
                String s2;
                if ((s2 = f) == null) {
                    s2 = "";
                }
                final String g = vxs.f().g;
                if (g != null) {
                    s = g;
                }
                this.N0.h(s2, s, "caret_click", (d1p)crv.a(vxs.f()));
            }
        }
    }
}
