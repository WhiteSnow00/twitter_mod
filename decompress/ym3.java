import java.util.Iterator;
import java.net.URI;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ym3 implements xea
{
    public final Random D0;
    public final xwt E0;
    public final b5s F0;
    
    public ym3(final xwt e0, final b5s f0) {
        czd.f((Object)e0, "featureConfiguration");
        czd.f((Object)f0, "syntheticProbeManagerImpl");
        final Random d0 = new Random();
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void a(final arc<?, ?> arc) {
        czd.f((Object)arc, "operation");
        final String j = arc.j("x-cache");
        final int n = 1;
        final boolean b = j != null;
        if (this.E0.h && arc.z() && b) {
            final int nextInt = this.D0.nextInt(10000);
            Objects.requireNonNull(xwt.Companion);
            if (nextInt < asa.b().f("traffic_per_request_static_content_decider", 5000)) {
                final xwt e0 = this.E0;
                final URI c = arc.c;
                czd.e((Object)c, "operation.uri");
                Objects.requireNonNull(e0);
                final String host = c.getHost();
                while (true) {
                    for (final String s : e0.d) {
                        czd.e((Object)host, "host");
                        if (zkr.c0((CharSequence)s, (CharSequence)host, false)) {
                            final boolean b2 = true;
                            if (b2) {
                                return;
                            }
                            final long i = arc.n.j;
                            Objects.requireNonNull(xwt.Companion);
                            if (i >= asa.b().h("traffic_image_response_threshold_bytes", 30720L) && i < asa.b().h("traffic_video_response_threshold_bytes", 524288L)) {
                                this.F0.b(UserIdentifier.LOGGED_OUT);
                                return;
                            }
                            int n2;
                            if (i >= asa.b().h("traffic_video_response_threshold_bytes", 524288L)) {
                                n2 = n;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n2 != 0) {
                                this.F0.c(UserIdentifier.LOGGED_OUT);
                            }
                            return;
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
        }
    }
    
    @Override
    public final void b(final arc<?, ?> arc, final Exception ex) {
        czd.f((Object)arc, "httpOperation");
    }
    
    @Override
    public final void c(final arc<?, ?> arc) {
    }
    
    @Override
    public final void d(final arc<?, ?> arc) {
        czd.f((Object)arc, "httpOperation");
    }
}
