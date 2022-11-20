import android.widget.TextView;
import android.view.View;
import android.view.ViewStub;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eel extends u9l
{
    public eel(final tcv tcv, final Context context) {
        super(tcv, context);
    }
    
    public final int e1() {
        return 2131625240;
    }
    
    public final gdv$b l0(final gdv$b gdv$b) {
        super.l0(gdv$b);
        gdv$b.a = "profile_smart_blocked";
        return gdv$b;
    }
    
    public final void onInflate(final ViewStub viewStub, final View view) {
        ngl.n((TextView)view.findViewById(2131430766), ((ucv)this).z0().getString(2131955942, new Object[] { super.c1.K0, " " }), 2131954540);
    }
}
