import java.util.HashMap;
import java.util.concurrent.Callable;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t5k implements li2, n4k$a
{
    public final Context a;
    public final dsb b;
    public final tsc c;
    public final x3c d;
    public final h6k e;
    public final de6 f;
    public UserIdentifier g;
    
    public t5k(final Context context, final tsc c) {
        final dsb b = new dsb();
        final x3c n = xi4.n();
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = n;
        this.e = i6k.a(UserIdentifier.UNDEFINED, (String)null);
        this.f = new de6();
    }
    
    public final boolean a(final String s) {
        return this.b.f(flr.o(s, -1L), 1);
    }
    
    public final boolean b(final String s) {
        return this.b.f(flr.o(s, -1L), 4);
    }
    
    public final void c(final UserIdentifier userIdentifier) {
        final tdw tdw = new tdw((fhw)kbv.d2(userIdentifier));
        this.g = userIdentifier;
        this.e.c = userIdentifier;
        ((HashMap)this.b.F0).clear();
        this.f.e();
        this.f.a(t5j.fromCallable((Callable)new ofw((Object)tdw, 6)).subscribeOn((bxo)this.d.F0).observeOn((bxo)this.d.G0).subscribe((rk6)new a3x((Object)this, 8)));
        this.f.a(t5j.fromCallable((Callable)new k5d(tdw, 6)).subscribeOn((bxo)this.d.F0).observeOn((bxo)this.d.G0).subscribe((rk6)new ec2((Object)this, 24)));
    }
    
    public final void d(final qdw qdw) {
        this.c(qdw.k());
    }
    
    public final void e(final String s) {
        final long o = flr.o(s, -1L);
        this.b.k(o, 4);
        this.c.f(new b22(this.a, this.g, o, (gjl)null, 3));
        final h6k e = this.e;
        sbw.b(e.b.a(e.c, dda.g(e.a, "composition", "periscope", "user_modal", "unblock"), (d1p)null));
    }
    
    public final void f(final String s) {
        final long o = flr.o(s, -1L);
        this.b.j(o, 4);
        this.c.f(new b22(this.a, this.g, o, (gjl)null, 1));
        final h6k e = this.e;
        sbw.b(e.b.a(e.c, dda.g(e.a, "composition", "periscope", "chat_carousel", "block"), (d1p)null));
    }
}
