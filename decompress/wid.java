import android.view.View;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wid implements View$OnLongClickListener
{
    public final int F0;
    public final b4e G0;
    public final Object H0;
    
    public wid(final b4e g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final boolean onLongClick(final View view) {
        switch (this.F0) {
            default: {
                final dkp dkp = (dkp)this.G0;
                final b5g b5g = (b5g)this.H0;
                e0e.f((Object)dkp, "this$0");
                e0e.f((Object)b5g, "$entry");
                return ((mk7)dkp.q).a((jk1)b5g, "voice");
            }
            case 0: {
                final xid xid = (xid)this.G0;
                final iq7$a iq7$a = (iq7$a)this.H0;
                e0e.f((Object)xid, "this$0");
                e0e.f((Object)iq7$a, "$conversation");
                final wp7 e = xid.e;
                if (e != null) {
                    e.d(iq7$a);
                }
                return true;
            }
        }
    }
}
