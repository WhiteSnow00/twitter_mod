import tv.periscope.android.lib.webrtc.janus.JanusClient;
import tv.periscope.android.lib.webrtc.janus.plugin.JanusPluginInteractor;
import tv.periscope.android.lib.webrtc.janus.plugin.JanusPluginManager;
import tv.periscope.android.lib.webrtc.janus.session.JanusSessionManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d1d implements rk6
{
    public final int F0;
    public final stb G0;
    
    public d1d(final stb g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        switch (this.F0) {
            default: {
                final stb g0 = this.G0;
                final f2d$a companion = f2d.Companion;
                e0e.f((Object)g0, "$tmp0");
                g0.invoke(o);
                return;
            }
            case 14: {
                final stb g2 = this.G0;
                e0e.f((Object)g2, "$tmp0");
                g2.invoke(o);
                return;
            }
            case 13: {
                JanusSessionManager.f(this.G0, o);
                return;
            }
            case 12: {
                JanusPluginManager.c(this.G0, o);
                return;
            }
            case 11: {
                JanusPluginManager.o(this.G0, o);
                return;
            }
            case 10: {
                JanusPluginInteractor.t(this.G0, o);
                return;
            }
            case 9: {
                JanusPluginInteractor.b(this.G0, o);
                return;
            }
            case 8: {
                JanusPluginInteractor.l(this.G0, o);
                return;
            }
            case 7: {
                JanusClient.e(this.G0, o);
                return;
            }
            case 6: {
                JanusClient.h(this.G0, o);
                return;
            }
            case 5: {
                final stb g3 = this.G0;
                e0e.f((Object)g3, "$tmp0");
                g3.invoke(o);
                return;
            }
            case 4: {
                final stb g4 = this.G0;
                e0e.f((Object)g4, "$tmp0");
                g4.invoke(o);
                return;
            }
            case 3: {
                final stb g5 = this.G0;
                e0e.f((Object)g5, "$tmp0");
                g5.invoke(o);
                return;
            }
            case 2: {
                final stb g6 = this.G0;
                e0e.f((Object)g6, "$tmp0");
                g6.invoke(o);
                return;
            }
            case 1: {
                final stb g7 = this.G0;
                e0e.f((Object)g7, "$tmp0");
                g7.invoke(o);
                return;
            }
            case 0: {
                final stb g8 = this.G0;
                e0e.f((Object)g8, "$tmp0");
                g8.invoke(o);
            }
        }
    }
}
