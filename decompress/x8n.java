import tv.periscope.android.api.PsRequest;
import tv.periscope.android.api.CreateClipRequest;
import tv.periscope.android.api.AuthedApiService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x8n implements w8n
{
    public final unp a;
    public final AuthedApiService b;
    public final NullPointerException c;
    
    public x8n(final unp a, final AuthedApiService b) {
        e0e.f((Object)a, "sessionCache");
        e0e.f((Object)b, "authedApiService");
        this.a = a;
        this.b = b;
        this.c = new NullPointerException("Cookie not found in session cache");
    }
    
    @Override
    public final bbq<String> a(final String s, final long n, final long n2) {
        e0e.f((Object)s, "spaceId");
        if (this.a.b() == null) {
            return (bbq<String>)bbq.n((Throwable)this.c);
        }
        final CreateClipRequest createClipRequest = new CreateClipRequest(s, n, n2);
        ((PsRequest)createClipRequest).cookie = this.a.b();
        final AuthedApiService b = this.b;
        final tnp d = this.a.d();
        return (bbq<String>)b.createClip(createClipRequest, d != null && d.a()).w((rtb)new wsn((stb)x8n$a.F0, 9)).I(jxo.c());
    }
}
