import tv.periscope.android.api.PsRequest;
import tv.periscope.chatman.api.IdempotenceHeaderMap;
import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.android.api.GetAudioSpaceMetaRequest;
import tv.periscope.android.api.AuthedApiService;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d11 extends enm<d11$a, p01, f1c>
{
    public final vtn E0;
    public final UserIdentifier F0;
    public final AuthedApiService G0;
    public final xmp H0;
    public final r2e I0;
    
    public d11(final vtn e0, final UserIdentifier f0, final AuthedApiService g0, final xmp h0, final r2e i0) {
        czd.f((Object)e0, "roomPeriscopeAuthenticator");
        czd.f((Object)f0, "userIdentifier");
        czd.f((Object)g0, "authedApiService");
        czd.f((Object)h0, "sessionCache");
        czd.f((Object)i0, "isSubscribedDataSource");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public static final eaq f(final d11 d11, final Object o) {
        return d11.R(o);
    }
    
    public final /* bridge */ eaq R(final Object o) {
        return this.h((d11$a)o);
    }
    
    public final orc c(final Object o) {
        final d11$a d11$a = (d11$a)o;
        czd.f((Object)d11$a, "args");
        return (orc)new f1c(d11$a.a, d11$a.b, this.F0);
    }
    
    public final Object d(final orc orc) {
        final f1c f1c = (f1c)orc;
        czd.f((Object)f1c, "request");
        final xrc t = ((orc)f1c).T();
        czd.e((Object)t, "request.result");
        if (!t.b) {
            kbv kbv;
            if ((kbv = (kbv)t.h) == null) {
                kbv = new kbv(new hbv[] { new hbv(t.c) });
            }
            throw new d11.d11$b(kbv);
        }
        final p01 p = (p01)t.g;
        if (p != null) {
            return p;
        }
        throw new IllegalStateException("No AudioSpace response object".toString());
    }
    
    public final eaq<p01> h(final d11$a d11$a) {
        czd.f((Object)d11$a, "args");
        return (eaq<p01>)this.E0.b().p((psb)new k1i((qsb)new qsb<w3k.b, lcq<? extends p01>>(this, d11$a) {
            public final d11 D0;
            public final d11$a E0;
            
            public final Object invoke(final Object o) {
                final w3k.b b = (w3k.b)o;
                czd.f((Object)b, "results");
                eaq eaq;
                if (b.b.f()) {
                    eaq = eaq.n((Throwable)b.b.c());
                }
                else if (djo.u()) {
                    eaq = d11.f(this.D0, this.E0);
                }
                else {
                    final GetAudioSpaceMetaRequest getAudioSpaceMetaRequest = new GetAudioSpaceMetaRequest(this.E0.a, (Integer)null, (Integer)null, 6, (rf8)null);
                    final String b2 = this.D0.H0.b();
                    if (b2 == null) {
                        eaq = eaq.n((Throwable)new IllegalStateException("User is not authenticated for Periscope"));
                    }
                    else {
                        ((PsRequest)getAudioSpaceMetaRequest).cookie = b2;
                        final d11 d0 = this.D0;
                        final AuthedApiService g0 = d0.G0;
                        final wmp d2 = d0.H0.d();
                        eaq = g0.getAudioSpace(getAudioSpaceMetaRequest, d2 != null && d2.a(), (IdempotenceHeaderMap)IdempotenceHeaderMapImpl.Companion.create()).p((psb)new s4i((qsb)new f11(this.D0, this.E0), 21));
                    }
                }
                return eaq;
            }
        }, 18)).f((ucq)this.E0.c());
    }
}
