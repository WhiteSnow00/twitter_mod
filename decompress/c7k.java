import android.content.Context;
import android.app.Activity;
import com.twitter.permissions.PermissionContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public class c7k implements o7k
{
    public final zl1 a;
    public final u7k b;
    public final b7k c;
    public final jo6<k7k, PermissionContentViewResult> d;
    
    public c7k(final b7k c, final u7k b, final zl1 a, final fci<?> fci, final String s) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = fci.g(PermissionContentViewResult.class, (itm<PermissionContentViewResult>)p71.f1, s);
    }
    
    public final t5j<Boolean> a() {
        if (this.b()) {
            return (t5j<Boolean>)t5j.just((Object)Boolean.TRUE);
        }
        final k7k.a a = this.c.a((Activity)this.a);
        this.c(a);
        this.d.d((Object)a.e());
        return (t5j<Boolean>)this.d.a().map((rtb)ho9.Z0);
    }
    
    public final boolean b() {
        return this.b.a((Context)this.a, this.c.b());
    }
    
    public void c(final k7k.a a) {
    }
}
