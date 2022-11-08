import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class viq implements okx<cpq, coq, klq>
{
    public static final viq.viq$a Companion;
    public final Context C0;
    public final ViewGroup D0;
    public final u3s E0;
    
    static {
        Companion = new viq.viq$a();
    }
    
    public viq(final View view, final Context c0) {
        zzd.f((Object)view, "view");
        zzd.f((Object)c0, "context");
        this.C0 = c0;
        this.D0 = (ViewGroup)view;
        this.E0 = (u3s)rp2.z0((otb)new viq$b(this));
    }
    
    public final void T(final oax oax) {
        final cpq cpq = (cpq)oax;
        zzd.f((Object)cpq, "state");
        final oio a = oio.a;
        if (dta.b().b("voice_rooms_spaces_card_social_proof_enabled", false)) {
            ((mhh)this.E0.getValue()).b((Object)cpq);
        }
    }
}
