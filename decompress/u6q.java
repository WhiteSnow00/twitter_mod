import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import com.twitter.onboarding.ocf.d$b;
import com.twitter.onboarding.ocf.d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u6q
{
    public static final b g;
    public final d a;
    public final nnl<tmi> b;
    public final nnl<b> c;
    public final fg6<b> d;
    public final t19 e;
    public final t19 f;
    
    static {
        g = new b(false, null);
    }
    
    public u6q(final d a, final gwo gwo, final xbm xbm) {
        final nnl b = new nnl();
        this.b = (nnl<tmi>)b;
        final nnl c = new nnl();
        this.c = (nnl<b>)c;
        this.a = a;
        final ahm e = ahm.e();
        final ncs$a m = zh8.m("signup");
        m.d = "splash_screen";
        this.f = (t19)a.a((ncs)((n4j)m).e()).P().subscribeWith((ccj)new rno((ccj)e));
        final fg6 replay = ((h5j)b).switchMap((psb)new kgv((Object)h5j.defer((Callable)new a((h5j)e, h5j.defer((Callable)new r52((Object)this, 4)), null)).timeout(10L, TimeUnit.SECONDS, gwo).onErrorReturn((psb)naf.O0).map((psb)ivt.Y0), 4)).mergeWith((taj)c).replay(1);
        this.d = (fg6<b>)replay;
        this.e = replay.d();
        xbm.i((oj)new q00((Object)this, 20));
    }
    
    public static final class a implements Callable<taj<? extends msm<vbs, d$b>>>
    {
        public final h5j<msm<vbs, d$b>> D0;
        public final h5j<msm<vbs, d$b>> E0;
        public boolean F0;
        
        public a(final h5j d0, final h5j e0, final k6e k6e) {
            this.D0 = (h5j<msm<vbs, d$b>>)d0;
            this.E0 = (h5j<msm<vbs, d$b>>)e0;
        }
        
        @Override
        public final Object call() throws Exception {
            h5j<msm<vbs, d$b>> h5j;
            if (!this.F0) {
                this.F0 = true;
                h5j = this.D0;
            }
            else {
                h5j = this.E0;
            }
            return h5j;
        }
    }
    
    public static final class b
    {
        public final boolean a;
        public final msm<vbs, d$b> b;
        
        public b(final boolean a, final msm<vbs, d$b> b) {
            this.a = a;
            this.b = b;
        }
    }
}
