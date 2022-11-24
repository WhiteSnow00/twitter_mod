import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n7w extends zp1<at3$a>
{
    public final m7w G0;
    
    public n7w(final m7w g0) {
        this.G0 = g0;
    }
    
    public final void b(final Object o) {
        final at3$a at3$a = (at3$a)o;
        final boolean b = at3$a instanceof at3$a$d;
        final Integer value = 31;
        if (b) {
            this.G0.M0.a((dgd)new q6s(2131958957, (rfd$c)rfd$c$b.b, "unpinnable_button", value, (View$OnClickListener)null, (Integer)null, (View$OnClickListener)null));
        }
        else if (at3$a instanceof at3$a$b) {
            ((i7w)this.G0.F0).b(true);
        }
        else if (at3$a instanceof at3$a$e) {
            ((i7w)this.G0.F0).b(false);
        }
        else if (at3$a instanceof at3$a$c || at3$a instanceof at3$a$a) {
            this.G0.M0.a((dgd)new q6s("Failed to toggle pinned state", (rfd$c)rfd$c$b.b, "channel_error", value, (View$OnClickListener)null, (String)null, (View$OnClickListener)null));
        }
    }
}
