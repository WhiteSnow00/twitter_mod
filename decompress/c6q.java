import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import com.twitter.onboarding.ocf.d$b;
import com.twitter.onboarding.ocf.d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c6q
{
    public static final b g;
    public final d a;
    public final zml<pmi> b;
    public final zml<b> c;
    public final zg6<b> d;
    public final j29 e;
    public final j29 f;
    
    static {
        g = new b(false, null);
    }
    
    public c6q(final d a, final qvo qvo, final ibm ibm) {
        final zml b = new zml();
        this.b = (zml<pmi>)b;
        final zml c = new zml();
        this.c = (zml<b>)c;
        this.a = a;
        final kgm e = kgm.e();
        final sbs$a j = yqh.j("signup");
        j.d = "splash_screen";
        this.f = (j29)a.a((sbs)((h4j)j).e()).P().subscribeWith((wbj)new cno((wbj)e));
        final zg6 replay = ((b5j)b).switchMap((qtb)new yga((Object)b5j.defer((Callable)new a((b5j)e, b5j.defer((Callable)new uh8((Object)this, 8)), null)).timeout(10L, TimeUnit.SECONDS, qvo).onErrorReturn((qtb)fkc.R0).map((qtb)psf.W0), 7)).mergeWith((naj)c).replay(1);
        this.d = (zg6<b>)replay;
        this.e = replay.d();
        ibm.i((rj)new igc((Object)this, 16));
    }
    
    public static final class a implements Callable<naj<? extends vrm<abs, d$b>>>
    {
        public final b5j<vrm<abs, d$b>> C0;
        public final b5j<vrm<abs, d$b>> D0;
        public boolean E0;
        
        public a(final b5j c0, final b5j d0, final lwe lwe) {
            this.C0 = (b5j<vrm<abs, d$b>>)c0;
            this.D0 = (b5j<vrm<abs, d$b>>)d0;
        }
        
        @Override
        public final Object call() throws Exception {
            b5j<vrm<abs, d$b>> b5j;
            if (!this.E0) {
                this.E0 = true;
                b5j = this.C0;
            }
            else {
                b5j = this.D0;
            }
            return b5j;
        }
    }
    
    public static final class b
    {
        public final boolean a;
        public final vrm<abs, d$b> b;
        
        public b(final boolean a, final vrm<abs, d$b> b) {
            this.a = a;
            this.b = b;
        }
    }
}
