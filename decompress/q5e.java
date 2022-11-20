import tv.periscope.android.lib.webrtc.janus.JanusClient;
import tv.periscope.android.lib.webrtc.janus.plugin.JanusPluginInteractor;
import tv.periscope.android.lib.webrtc.janus.plugin.JanusPluginManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5e implements lj6
{
    public final int D0;
    public final qsb E0;
    
    public q5e(final qsb e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void accept(final Object o) {
        switch (this.D0) {
            default: {
                final qsb e0 = this.E0;
                czd.f((Object)e0, "$tmp0");
                e0.invoke(o);
                return;
            }
            case 9: {
                final qsb e2 = this.E0;
                final t3p$b companion = t3p.Companion;
                czd.f((Object)e2, "$tmp0");
                e2.invoke(o);
                return;
            }
            case 8: {
                final qsb e3 = this.E0;
                czd.f((Object)e3, "$tmp0");
                e3.invoke(o);
                return;
            }
            case 7: {
                final qsb e4 = this.E0;
                czd.f((Object)e4, "$tmp0");
                e4.invoke(o);
                return;
            }
            case 6: {
                JanusPluginManager.d(this.E0, o);
                return;
            }
            case 5: {
                JanusPluginManager.r(this.E0, o);
                return;
            }
            case 4: {
                JanusPluginInteractor.q(this.E0, o);
                return;
            }
            case 3: {
                JanusPluginInteractor.x(this.E0, o);
                return;
            }
            case 2: {
                JanusPluginInteractor.v(this.E0, o);
                return;
            }
            case 1: {
                JanusClient.a(this.E0, o);
                return;
            }
            case 0: {
                JanusClient.n(this.E0, o);
            }
        }
    }
}
