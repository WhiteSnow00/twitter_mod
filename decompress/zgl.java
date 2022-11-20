import android.widget.TextView;
import android.view.View;
import android.view.ViewStub;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zgl extends u9l
{
    public zgl(final tcv tcv, final Context context) {
        super(tcv, context);
    }
    
    public final int d1() {
        return 2131625246;
    }
    
    public final int e1() {
        return 2131625247;
    }
    
    public final void onInflate(final ViewStub viewStub, final View view) {
        final Context q0 = ((ucv)this).q0();
        ngl.y((TextView)view.findViewById(2131432663), ngl.d(super.c1.G0), d4j.i(q0, 2130968591), d4j.i(q0, 2130969074), (odf)new val(((ucv)this).q0(), ((ucv)this).Z0, ((ucv)this).E0.v0().h()));
    }
}
