import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zja implements View$OnClickListener
{
    public final aka D0;
    public final int E0;
    
    public zja(final aka d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        final aka d0 = this.D0;
        final int e0 = this.E0;
        czd.f((Object)d0, "this$0");
        final lo h0 = d0.H0;
        if (h0 != null) {
            final Object value = d0.G0.get(e0);
            final nka nka = (nka)h0.E0;
            final uja uja = (uja)value;
            czd.f((Object)nka, "this$0");
            czd.f((Object)uja, "exploreLocation");
            nka.H0.onNext((Object)uja);
        }
    }
}
