import tv.periscope.android.api.PsRequest;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import tv.periscope.android.api.AssociateTweetWithBroadcastRequest;
import tv.periscope.chatman.api.IdempotenceHeaderMap;
import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.android.api.GetAudioSpaceMetaRequest;
import tv.periscope.android.api.EditBroadcastRequest;
import java.util.Set;
import tv.periscope.android.api.AuthedApiService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tv6 implements sv6
{
    public final ibm a;
    public final hmp b;
    public final AuthedApiService c;
    public final qvo d;
    
    public tv6(final ibm a, final hmp b, final AuthedApiService c, final qvo d) {
        zzd.f((Object)a, "releaseCompletable");
        zzd.f((Object)b, "sessionCache");
        zzd.f((Object)c, "authedApiService");
        zzd.f((Object)d, "ioScheduler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static b5j h(final tv6 tv6, final String s, final String s2, final Set set, final boolean b, Long n, boolean b2, final int n2) {
        if ((n2 & 0x10) != 0x0) {
            n = null;
        }
        if ((n2 & 0x80) != 0x0) {
            b2 = false;
        }
        b5j b5j;
        if (tv6.i() == null) {
            final NullPointerException a = xv6.a;
            b5j = b5j.error((Throwable)xv6.a);
            zzd.e((Object)b5j, "error(NoCookieException)");
        }
        else {
            final AuthedApiService c = tv6.c;
            final String i = tv6.i();
            zzd.c((Object)i);
            final NullPointerException a2 = xv6.a;
            b5j = c.replayBroadcastEdit(new EditBroadcastRequest(i, s2, n, (Long)null, s, (Long)null, set, b, b2)).subscribeOn(tv6.d);
            zzd.e((Object)b5j, "authedApiService\n       \u2026.subscribeOn(ioScheduler)");
        }
        return b5j;
    }
    
    public final n9q<x21> a(final String s) {
        zzd.f((Object)s, "roomId");
        final int a = xa0.a().a();
        oio.c();
        final GetAudioSpaceMetaRequest getAudioSpaceMetaRequest = new GetAudioSpaceMetaRequest(s, Integer.valueOf(a), (Integer)null);
        final String i = this.i();
        if (i == null) {
            final NullPointerException a2 = xv6.a;
            return (n9q<x21>)n9q.n((Throwable)xv6.a);
        }
        ((PsRequest)getAudioSpaceMetaRequest).cookie = i;
        final AuthedApiService c = this.c;
        final gmp d = this.b.d();
        boolean b = true;
        if (d == null || !d.a()) {
            b = false;
        }
        return (n9q<x21>)c.getAudioSpaceParticipants(getAudioSpaceMetaRequest, b, (IdempotenceHeaderMap)IdempotenceHeaderMapImpl.Companion.create()).w((qtb)new jhb((rtb)tv6$a.C0, 16));
    }
    
    public final iz5 b(final String s, final long n) {
        zzd.f((Object)s, "spaceId");
        if (this.i() == null) {
            final NullPointerException a = xv6.a;
            return (iz5)new tz5((Throwable)xv6.a);
        }
        final AuthedApiService c = this.c;
        final String i = this.i();
        zzd.c((Object)i);
        final n9q associateTweetWithBroadcast = c.associateTweetWithBroadcast(new AssociateTweetWithBroadcastRequest(i, s, String.valueOf(n), true));
        Objects.requireNonNull(associateTweetWithBroadcast);
        return (iz5)new yz5((ubq)associateTweetWithBroadcast);
    }
    
    public final iz5 c(final String s, final String s2, final Set<String> set, final long n) {
        zzd.f((Object)s, "roomId");
        zzd.f((Object)set, "topicIds");
        final iz5 ignoreElements = h(this, s, s2, set, true, TimeUnit.MILLISECONDS.toSeconds(n), false, 224).ignoreElements();
        zzd.e((Object)ignoreElements, "editBroadcast(\n        t\u2026e,\n    ).ignoreElements()");
        return xv6.a(ignoreElements, this.a);
    }
    
    public final iz5 d(final String s, final String s2, final Set<String> set, final boolean b) {
        final iz5 ignoreElements = h(this, s, s2, set, b, null, false, 240).ignoreElements();
        zzd.e((Object)ignoreElements, "editBroadcast(\n        t\u2026y,\n    ).ignoreElements()");
        return ignoreElements;
    }
    
    public final iz5 e(final String s, final String s2, final Set<String> set) {
        zzd.f((Object)s, "roomId");
        zzd.f((Object)s2, "title");
        zzd.f((Object)set, "topicIds");
        final iz5 ignoreElements = h(this, s, s2, set, true, null, false, 240).ignoreElements();
        zzd.e((Object)ignoreElements, "editBroadcast(\n        t\u2026e,\n    ).ignoreElements()");
        return xv6.a(ignoreElements, this.a);
    }
    
    public final iz5 f(final String s, final String s2, final Set<String> set, final boolean b, final boolean b2) {
        zzd.f((Object)s, "roomId");
        zzd.f((Object)set, "topicIds");
        final iz5 ignoreElements = h(this, s, s2, set, b, null, b2, 112).ignoreElements();
        zzd.e((Object)ignoreElements, "editBroadcast(\n        t\u2026ng\n    ).ignoreElements()");
        return ignoreElements;
    }
    
    public final iz5 g(final String s, final String s2, final Set<String> set) {
        zzd.f((Object)s, "roomId");
        zzd.f((Object)set, "topicIds");
        final iz5 ignoreElements = h(this, s, s2, set, false, null, false, 240).ignoreElements();
        zzd.e((Object)ignoreElements, "editBroadcast(\n        r\u2026e,\n    ).ignoreElements()");
        return xv6.a(ignoreElements, this.a);
    }
    
    public final String i() {
        return this.b.b();
    }
}
