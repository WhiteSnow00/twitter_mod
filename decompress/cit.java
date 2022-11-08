import android.view.View$OnClickListener;
import androidx.appcompat.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cit implements okx<sc2, qc2, pc2>
{
    public final zml<qc2> C0;
    public final mhh<sc2> D0;
    
    public cit(final Toolbar toolbar, final mbi<?> mbi) {
        zzd.f((Object)toolbar, "toolbar");
        zzd.f((Object)mbi, "navigator");
        this.C0 = (zml<qc2>)new zml();
        toolbar.setNavigationOnClickListener((View$OnClickListener)new yrf((Object)mbi, 8));
        toolbar.setOnMenuItemClickListener((Toolbar.Toolbar$f)new bit(this));
        this.D0 = (mhh<sc2>)ajy.a0((rtb)cit$a.C0);
    }
    
    public final void T(final oax oax) {
        final sc2 sc2 = (sc2)oax;
        zzd.f((Object)sc2, "state");
        this.D0.b((Object)sc2);
    }
    
    public final b5j x() {
        return (b5j)this.C0;
    }
}
