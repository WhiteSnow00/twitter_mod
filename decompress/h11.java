import tv.periscope.android.api.PsRequest;
import tv.periscope.chatman.api.IdempotenceHeaderMap;
import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.android.api.GetAudioSpaceMetaRequest;
import tv.periscope.android.api.AuthedApiService;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h11 extends omm<h11$a, t01, c2c>
{
    public final htn D0;
    public final UserIdentifier E0;
    public final AuthedApiService F0;
    public final hmp G0;
    public final m3e H0;
    
    public h11(final htn d0, final UserIdentifier e0, final AuthedApiService f0, final hmp g0, final m3e h0) {
        zzd.f((Object)d0, "roomPeriscopeAuthenticator");
        zzd.f((Object)e0, "userIdentifier");
        zzd.f((Object)f0, "authedApiService");
        zzd.f((Object)g0, "sessionCache");
        zzd.f((Object)h0, "isSubscribedDataSource");
        super((psc)null, 1, (hg8)null);
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public static final /* synthetic */ n9q f(final h11 h11, final Object o) {
        return h11.S(o);
    }
    
    public final ksc c(final Object o) {
        final h11$a h11$a = (h11$a)o;
        zzd.f((Object)h11$a, "args");
        return (ksc)new c2c(h11$a.a, h11$a.b, this.E0);
    }
    
    public final Object d(final ksc ksc) {
        final c2c c2c = (c2c)ksc;
        zzd.f((Object)c2c, "request");
        final tsc t = ((ksc)c2c).T();
        zzd.e((Object)t, "request.result");
        if (!t.b) {
            pav pav;
            if ((pav = (pav)t.h) == null) {
                pav = new pav(new mav[] { new mav(t.c) });
            }
            throw new h11.h11$b(pav);
        }
        final t01 t2 = (t01)t.g;
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("No AudioSpace response object".toString());
    }
    
    public final n9q<t01> h(final h11$a h11$a) {
        zzd.f((Object)h11$a, "args");
        return (n9q<t01>)this.D0.b().p((qtb)new q3m((rtb)new rtb<u3k$b, ubq<? extends t01>>() {
            public final /* synthetic */ h11 C0;
            
            public final Object invoke(final Object o) {
                final u3k$b u3k$b = (u3k$b)o;
                zzd.f((Object)u3k$b, "results");
                n9q n9q;
                if (u3k$b.b.f()) {
                    n9q = n9q.n((Throwable)u3k$b.b.c());
                }
                else if (oio.u()) {
                    n9q = h11.f(this.C0, h11$a);
                }
                else {
                    final GetAudioSpaceMetaRequest getAudioSpaceMetaRequest = new GetAudioSpaceMetaRequest(h11$a.a, (Integer)null, (Integer)null, 6, (hg8)null);
                    final String b = this.C0.G0.b();
                    if (b == null) {
                        n9q = n9q.n((Throwable)new IllegalStateException("User is not authenticated for Periscope"));
                    }
                    else {
                        ((PsRequest)getAudioSpaceMetaRequest).cookie = b;
                        final h11 c0 = this.C0;
                        final AuthedApiService f0 = c0.F0;
                        final gmp d = c0.G0.d();
                        n9q = f0.getAudioSpace(getAudioSpaceMetaRequest, d != null && d.a(), (IdempotenceHeaderMap)IdempotenceHeaderMapImpl.Companion.create()).p((qtb)new ozb((rtb)new j11(this.C0, h11$a), 13));
                    }
                }
                return n9q;
            }
        }, 16)).f((dcq)this.D0.c());
    }
}
