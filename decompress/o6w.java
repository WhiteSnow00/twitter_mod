import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o6w extends yp1<rs3$a>
{
    public final /* synthetic */ n6w D0;
    
    public o6w(final n6w d0) {
        this.D0 = d0;
    }
    
    public final void b(final Object o) {
        final rs3$a rs3$a = (rs3$a)o;
        final boolean b = rs3$a instanceof rs3$a$d;
        final Integer value = 31;
        if (b) {
            this.D0.J0.a((zfd)new d5s(2131958955, (nfd$c)nfd$c$b.b, "unpinnable_button", value, (View$OnClickListener)null, (Integer)null, (View$OnClickListener)null));
        }
        else if (rs3$a instanceof rs3$a$b) {
            ((j6w)this.D0.C0).b(true);
        }
        else if (rs3$a instanceof rs3$a$e) {
            ((j6w)this.D0.C0).b(false);
        }
        else if (rs3$a instanceof rs3$a$c || rs3$a instanceof rs3$a$a) {
            this.D0.J0.a((zfd)new d5s("Failed to toggle pinned state", (nfd$c)nfd$c$b.b, "channel_error", value, (View$OnClickListener)null, (String)null, (View$OnClickListener)null));
        }
    }
}
