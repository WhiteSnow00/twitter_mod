import androidx.appcompat.widget.Toolbar;
import android.view.View;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v0i implements okx<z0i, p0i, o0i>
{
    public final mbi<?> C0;
    public final epb D0;
    public final p E0;
    public final u3s F0;
    public final mhh<z0i> G0;
    
    public v0i(final View view, final mbi<?> c0, final epb d0, final p e0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)c0, "navigator");
        zzd.f((Object)d0, "fragmentProvider");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = (u3s)rp2.z0((otb)new v0i$b(view));
        this.G0 = (mhh<z0i>)ajy.a0((rtb)new v0i$d(this));
    }
    
    public final void T(final oax oax) {
        final z0i z0i = (z0i)oax;
        zzd.f((Object)z0i, "state");
        this.G0.b((Object)z0i);
    }
    
    public final void s(final Object o) {
        final o0i o0i = (o0i)o;
        zzd.f((Object)o0i, "effect");
        if (o0i instanceof o0i$a) {
            this.C0.j();
        }
    }
    
    public final b5j<p0i> x() {
        final Object value = this.F0.getValue();
        zzd.e(value, "<get-toolbar>(...)");
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)zi8.L((Toolbar)value).map((qtb)new zt1((rtb)v0i$c.C0, 28)) });
        zzd.e((Object)mergeArray, "mergeArray(toolbar.navig\u2026onIntent.OnBackPressed })");
        return (b5j<p0i>)mergeArray;
    }
}
