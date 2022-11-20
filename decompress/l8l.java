import android.content.res.Resources;
import android.widget.TextView;
import android.view.View;
import android.view.ViewStub;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l8l extends u9l
{
    public l8l(final tcv tcv, final Context context) {
        super(tcv, context);
    }
    
    public final int e1() {
        return 2131625234;
    }
    
    public final gdv$b l0(final gdv$b gdv$b) {
        super.l0(gdv$b);
        gdv$b.a = "profile_blocked";
        return gdv$b;
    }
    
    public final void onInflate(final ViewStub viewStub, final View view) {
        view.findViewById(2131430758).setVisibility(8);
        final TextView textView = (TextView)view.findViewById(2131430757);
        final Resources z0 = ((ucv)this).z0();
        final String k0 = super.c1.K0;
        ngl.n(textView, z0.getString(2131952219, new Object[] { k0, k0 }), 2131954539);
    }
}
