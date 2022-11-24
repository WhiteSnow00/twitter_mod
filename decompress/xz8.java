import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xz8
{
    public final dob a;
    public final gn b;
    public final mji c;
    public final ixm d;
    
    public xz8(final dob a, final gn b, final mji c, final ixm d) {
        e0e.f((Object)b, "activityArgsIntentFactory");
        e0e.f((Object)c, "logger");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final gf4 a(final String s, final ptb<vzv> ptb) {
        final int b = b1b.B((Context)this.a, 2130969086);
        final int b2 = b1b.B((Context)this.a, 2130969088);
        Integer value;
        if (b2 != 0) {
            value = b2;
        }
        else {
            value = null;
        }
        return (gf4)new xz8$a(b, (ptb)ptb, this, s, value);
    }
}
