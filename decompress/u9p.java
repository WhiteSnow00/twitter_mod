import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u9p extends jt2
{
    public final /* synthetic */ v9p C0;
    
    public u9p(final v9p c0) {
        this.C0 = c0;
    }
    
    public final void a(final Bundle bundle) {
        bundle.putBoolean("should_search_view_expanded", this.C0.d);
    }
    
    public final void v(final Parcelable parcelable) {
        this.C0.d = ((Bundle)parcelable).getBoolean("should_search_view_expanded");
    }
}
