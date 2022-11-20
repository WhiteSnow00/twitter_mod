import java.util.concurrent.TimeUnit;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qiv
{
    public final UserIdentifier a;
    public final String b;
    public final nnl<miv> c;
    public final mv1<lvj<agv, String>> d;
    public final h5j<lvj<agv, String>> e;
    
    public qiv(final UserIdentifier a, final xbm xbm) {
        czd.f((Object)a, "owner");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = "compose_message";
        final long n = eiv.b();
        final nnl c = new nnl();
        this.c = (nnl<miv>)c;
        final mv1 d = new mv1();
        this.d = (mv1<lvj<agv, String>>)d;
        final h5j share = ((h5j)d).share();
        czd.e((Object)share, "resultsSubject.share()");
        this.e = (h5j<lvj<agv, String>>)share;
        xbm.i((oj)new hs9(((h5j)c).debounce(n, TimeUnit.MILLISECONDS).flatMap((psb)new byn((qsb)oiv.D0, 18)).observeOn(owo.c()).subscribe((lj6)new fwi((qsb)new piv(this), 23)), 13));
    }
}
