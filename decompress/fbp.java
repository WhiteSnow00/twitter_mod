import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbp extends tt2
{
    public final gbp F0;
    
    public fbp(final gbp f0) {
        this.F0 = f0;
    }
    
    public final void a(final Bundle bundle) {
        bundle.putBoolean("should_search_view_expanded", this.F0.d);
    }
    
    public final void v(final Parcelable parcelable) {
        this.F0.d = ((Bundle)parcelable).getBoolean("should_search_view_expanded");
    }
}
