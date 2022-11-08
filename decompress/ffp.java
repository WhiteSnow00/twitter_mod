import android.widget.TextView;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffp implements okx
{
    public final AppCompatEditText C0;
    public final mhh<ifp> D0;
    
    public ffp(View viewById) {
        zzd.f((Object)viewById, "rootView");
        viewById = viewById.findViewById(2131431804);
        zzd.e((Object)viewById, "rootView.findViewById(co\u2026.id.suggestion_edit_text)");
        this.C0 = (AppCompatEditText)viewById;
        this.D0 = (mhh<ifp>)ajy.a0((rtb)new ffp$c(this));
    }
    
    public final void T(final oax oax) {
        final ifp ifp = (ifp)oax;
        zzd.f((Object)ifp, "state");
        this.D0.b((Object)ifp);
    }
    
    public final b5j<efp> x() {
        final b5j map = r9x.b((TextView)this.C0).map((qtb)new mma((rtb)ffp$b.C0, 13));
        zzd.e((Object)map, "suggestionEditText.after\u2026ingBuilder(\"\"))\n        }");
        return (b5j<efp>)map;
    }
    
    public interface a
    {
        ffp a(final View p0);
    }
}
