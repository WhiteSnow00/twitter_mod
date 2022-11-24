import android.net.Uri;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzf extends tt2
{
    public final gzf F0;
    
    public hzf(final gzf f0) {
        this.F0 = f0;
    }
    
    public final void a(final Bundle bundle) {
        final gzf f0 = this.F0;
        f0.U0 = null;
        final ysj x = ((zsj)f0.P0).x();
        if (x != null) {
            bundle.putParcelable("current_selected_page_uri", (Parcelable)x.a);
            this.F0.U0 = x.a;
        }
    }
    
    public final void v(final Parcelable parcelable) {
        this.F0.U0 = (Uri)((Bundle)parcelable).getParcelable("current_selected_page_uri");
    }
}
