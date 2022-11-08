import tv.periscope.model.NarrowcastSpaceType;
import java.util.Set;
import tv.periscope.android.api.UploadTestResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kuo extends gue implements rtb<UploadTestResponse, String>
{
    public final /* synthetic */ huo C0;
    public final /* synthetic */ long D0;
    public final /* synthetic */ String E0;
    public final /* synthetic */ huo.c F0;
    public final /* synthetic */ Set<String> G0;
    public final /* synthetic */ boolean H0;
    public final /* synthetic */ boolean I0;
    public final /* synthetic */ NarrowcastSpaceType J0;
    
    public kuo(final huo c0, final long d0, final String e0, final huo.c f0, final Set<String> g0, final boolean h0, final boolean i0, final NarrowcastSpaceType j0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final UploadTestResponse uploadTestResponse = (UploadTestResponse)o;
        zzd.f((Object)uploadTestResponse, "it");
        final m3k b = this.C0.b;
        final String region = uploadTestResponse.region;
        final ncq b2 = ncq.Companion.b(100, 100);
        final long d0 = this.D0;
        final String e0 = this.E0;
        final huo.c f0 = this.F0;
        int a;
        if (f0 != null) {
            a = f0.a;
        }
        else {
            a = 0;
        }
        String b3;
        if (f0 != null) {
            b3 = f0.b;
        }
        else {
            b3 = null;
        }
        return b.createBroadcast(region, "audio-room", b2, false, true, d0, e0, a, b3, (Set)this.G0, this.H0, this.I0, this.J0, (String)null);
    }
}
