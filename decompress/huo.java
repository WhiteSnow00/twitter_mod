import kotlin.NoWhenBranchMatchedException;
import tv.periscope.android.api.CreateBroadcastResponse;
import java.util.List;
import tv.periscope.android.api.PsCancelScheduledAudioBroadcastResponse;
import tv.periscope.android.api.AuthedApiService;
import tv.periscope.android.signer.SignerClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huo
{
    public static final b Companion;
    public final htn a;
    public final m3k b;
    public final SignerClient c;
    public final AuthedApiService d;
    public final hmp e;
    public final zau f;
    public snj<a> g;
    
    static {
        Companion = new b();
    }
    
    public huo(final htn a, final m3k b, final SignerClient c, final AuthedApiService d, final hmp e, final zau f) {
        zzd.f((Object)a, "roomPeriscopeAuthenticator");
        zzd.f((Object)b, "periscopeApiManager");
        zzd.f((Object)c, "signerClient");
        zzd.f((Object)d, "authedApiService");
        zzd.f((Object)e, "sessionCache");
        zzd.f((Object)f, "twSystemClock");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        final snj b2 = snj.b;
        final int a2 = w4j.a;
        this.g = (snj<a>)b2;
    }
    
    public final n9q<PsCancelScheduledAudioBroadcastResponse> a(final String s) {
        zzd.f((Object)s, "roomId");
        this.b();
        return (n9q<PsCancelScheduledAudioBroadcastResponse>)((n9q)new taq((ubq)this.a.b(), (qtb)new uii((rtb)new huo$d(s, this), 21))).f((dcq)this.a.c());
    }
    
    public final void b() {
        final snj b = snj.b;
        final int a = w4j.a;
        this.g = (snj<a>)b;
    }
    
    public final n9q<List<CreateBroadcastResponse>> c() {
        if (this.g.f()) {
            final Object c = this.g.c();
            zzd.e(c, "cachedResponse.get()");
            final a a = (a)c;
            if (this.f.a() - a.a < 300000L) {
                n9q n9q;
                if (a instanceof a.huo$a$b) {
                    n9q = n9q.v((Object)((a.huo$a$b)a).b);
                }
                else {
                    if (!(a instanceof a.huo$a$a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n9q = n9q.n(((a.huo$a$a)a).b);
                }
                return (n9q<List<CreateBroadcastResponse>>)n9q;
            }
        }
        return (n9q<List<CreateBroadcastResponse>>)this.a.b().p((qtb)new ozb((rtb)new huo$e(this), 17)).f((dcq)this.a.c()).m((fk6)new yhc((rtb)new huo$f(this), 21)).k((fk6)new cwt((rtb)new huo$g(this), 24));
    }
    
    public abstract static class a
    {
        public final long a;
        
        public a(final long a) {
            this.a = a;
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c
    {
        public final int a;
        public final String b;
        
        public c(final int a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return this.a == c.a && zzd.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a * 31;
        }
        
        @Override
        public final String toString() {
            final int a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("TicketArgs(total=");
            sb.append(a);
            sb.append(", groupId=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
