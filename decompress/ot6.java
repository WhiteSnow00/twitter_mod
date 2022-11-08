import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ot6 extends wi8
{
    public static final nca f;
    
    static {
        f = nca.g("messages", "thread", "", "", "open_link");
    }
    
    public ot6(final Activity activity, final mbi<?> mbi, final jev jev, final UserIdentifier userIdentifier) {
        super(activity, (mbi)mbi, jev, userIdentifier);
    }
    
    public final void c(final w5w w5w) {
        final c7f a = c7f.a();
        final Activity b = super.b;
        final UserIdentifier e = super.e;
        final nca f = ot6.f;
        a.b((Context)b, null, w5w, e, f.toString(), f.toString(), super.d, null);
    }
    
    public final void d(final long n) {
        rbl.e((Context)super.b, UserIdentifier.fromId(n), (String)null, (hil)null, (jev)null, (qzo)null);
    }
    
    public final void e(final h4h h4h) {
        final mbi c = super.c;
        final c7l$a c7l$a = new c7l$a();
        c7l$a.c = h4h.I0;
        c.d((zm)((h4j)c7l$a).e());
    }
    
    public final void f(final gn3 gn3) {
        super.c.d((zm)f7a.a(gn3));
    }
    
    public final void g(final s1c s1c) {
    }
    
    public final void h(final qgc qgc) {
        super.c.d((zm)f7a.b(qgc));
    }
}
