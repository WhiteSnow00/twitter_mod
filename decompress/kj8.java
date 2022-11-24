import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class kj8 extends zm1
{
    public final Activity b;
    public final fci c;
    public final sfv d;
    public final UserIdentifier e;
    
    public kj8(final Activity b, final fci<?> c, final sfv d, final UserIdentifier e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final boolean b(final w6w w6w) {
        return true;
    }
    
    public void c(final w6w w6w) {
        k7f.a().b((Context)this.b, null, w6w, this.e, null, null, this.d, null);
    }
    
    public void d(final long n) {
        rcl.e((Context)this.b, UserIdentifier.fromId(n), null, null, null, null);
    }
    
    public void e(final z4h z4h) {
        final fci c = this.c;
        final b8l$a b8l$a = new b8l$a();
        b8l$a.c = z4h.L0;
        c.d((cn)((z4j)b8l$a).e());
    }
    
    public void f(final on3 on3) {
        this.c.d((cn)t7a.a(on3));
    }
    
    public void h(final sgc sgc) {
        this.c.d((cn)t7a.b(sgc));
    }
}
