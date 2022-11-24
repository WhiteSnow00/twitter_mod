import com.twitter.app.dynamicdelivery.manager.DynamicDeliveryInstallManager$DynamicDeliveryException;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fp9 implements o3r
{
    public static final a Companion;
    public final ep9 a;
    public final znl<dp9> b;
    public final gp9 c;
    public final String d;
    public boolean e;
    
    static {
        Companion = new a();
    }
    
    public fp9(final ep9 a, final znl<dp9> b, final gp9 c) {
        e0e.f((Object)a, "manager");
        e0e.f((Object)b, "eventPublishSubject");
        e0e.f((Object)c, "config");
        this.a = a;
        this.b = b;
        this.c = c;
        String d;
        if (c instanceof gp9$b) {
            d = ((gp9$b)c).a;
        }
        else {
            if (!(c instanceof gp9$a)) {
                throw new NoWhenBranchMatchedException();
            }
            d = ((gp9$a)c).a.toString();
            e0e.e((Object)d, "config.locale.toString()");
        }
        this.d = d;
    }
    
    @Override
    public final void a(final Object o) {
        final n3r n3r = (n3r)o;
        e0e.f((Object)n3r, "state");
        final int h = n3r.h();
        if (h != 2) {
            if (h != 8) {
                if (h != 4) {
                    if (h != 5) {
                        if (h == 6) {
                            Object o2;
                            if (this.e) {
                                o2 = new dp9$c$b(this.d, (Throwable)new DynamicDeliveryInstallManager$DynamicDeliveryException(n3r.c()));
                            }
                            else {
                                o2 = new dp9$c$a(this.d, (Throwable)new DynamicDeliveryInstallManager$DynamicDeliveryException(n3r.c()), n3r.a());
                            }
                            this.b.onNext(o2);
                        }
                    }
                    else {
                        this.b.onNext((Object)new dp9$d(this.d));
                        final gp9 c = this.c;
                        if (c instanceof gp9$b) {
                            this.a.l(this.d);
                        }
                        else if (c instanceof gp9$a) {
                            this.a.k(((gp9$a)c).a);
                        }
                    }
                }
                else {
                    this.e = true;
                    this.b.onNext((Object)new dp9$a(this.d, n3r.a()));
                }
            }
            else {
                this.b.onNext((Object)new dp9$g(this.d, n3r));
            }
        }
        else {
            this.b.onNext((Object)new dp9$f(this.d, n3r.a() / (float)Math.max(1L, n3r.i())));
        }
    }
    
    public static final class a
    {
    }
}
