import android.content.Context;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pp4 implements ny9<op4>
{
    public final dob F0;
    public final fci<?> G0;
    
    public pp4(final dob f0, final fci<?> g0) {
        e0e.f((Object)g0, "navigator");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void r(final Object o) {
        final op4 op4 = (op4)o;
        e0e.f((Object)op4, "effect");
        if (e0e.a((Object)op4, (Object)op4$b.a)) {
            this.G0.k();
        }
        else if (op4 instanceof op4$c) {
            final qgv a = ((op4$c)op4).a;
            rcl.e((Context)this.F0, UserIdentifier.Companion.a(a.F0), a.M0, a.d1, null, a.s1);
        }
    }
}
