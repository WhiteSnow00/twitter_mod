import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.appcompat.app.e;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u4k implements ryd<Object>
{
    public final Activity F0;
    public final fci<?> G0;
    public final nn H0;
    public final r4k I0;
    
    public u4k(final Activity f0, final fci<?> g0, final nn h0, final r4k i0) {
        e0e.f((Object)f0, "activity");
        e0e.f((Object)g0, "navigator");
        e0e.f((Object)h0, "activityFinisher");
        e0e.f((Object)i0, "banningHandler");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final boolean k() {
        final e.a a = new e.a((Context)this.F0);
        a.a.g = ((Context)this.F0).getString(2131956309);
        a.i(((Context)this.F0).getString(2131956307), (DialogInterface$OnClickListener)new t4k((Object)this, 0));
        a.g(((Context)this.F0).getString(2131956306), null);
        a.k();
        return true;
    }
}
