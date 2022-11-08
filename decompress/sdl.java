import android.widget.TextView;
import android.view.View;
import android.view.ViewStub;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sdl extends i9l
{
    public sdl(final ybv ybv, final Context context) {
        super(ybv, context);
    }
    
    public final int e1() {
        return 2131625238;
    }
    
    public final lcv$b m0(final lcv$b lcv$b) {
        super.m0(lcv$b);
        lcv$b.a = "profile_smart_blocked";
        return lcv$b;
    }
    
    public final void onInflate(final ViewStub viewStub, final View view) {
        bgl.n((TextView)view.findViewById(2131430764), ((acv)this).z0().getString(2131955942, new Object[] { super.b1.J0, " " }), 2131954540);
    }
}
