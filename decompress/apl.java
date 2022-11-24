import com.twitter.util.user.UserIdentifier;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apl implements ch1
{
    public final kfw a;
    public final znl<wg1> b;
    
    public apl(final kfw a, final kcm kcm, final rql rql, final h1w h1w) {
        final znl b = new znl();
        this.b = (znl<wg1>)b;
        this.a = a;
        final de6 de6 = new de6();
        kcm.i((sj)new gsw(de6, 4));
        de6.a(rql.a().filter((ouk)new ke4((Object)this, 7)).subscribe((rk6)new ec2((Object)this, 17)));
        final t5j c = a.c();
        Objects.requireNonNull(h1w);
        final t5j switchMap = c.switchMap((rtb)new zx9((Object)h1w, 7));
        Objects.requireNonNull((Object)b);
        de6.a(switchMap.subscribe((rk6)new di3((Object)b, 18)));
    }
    
    public static wg1 b(final bti bti, final String b, final Integer n) {
        final wg1.b b2 = new wg1.b();
        b2.c = n;
        b2.b = b;
        b2.a = bti.B;
        return (wg1)b2.e();
    }
    
    public final void a(final UserIdentifier a, final String b) {
        if (b.equals("launcher")) {
            final nda a2 = nda.a();
            final fg4 fg4 = new fg4(new String[] { "app:badge:::clear" });
            ((o1p)fg4).A();
            a2.b(a, (tlm)fg4);
        }
        final wg1.b b2 = new wg1.b();
        b2.c = 0;
        b2.b = b;
        b2.a = a;
        this.b.onNext((Object)b2.e());
    }
}
