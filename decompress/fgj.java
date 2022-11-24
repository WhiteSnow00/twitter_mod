import com.twitter.weaver.base.WeaverViewDelegateBinder$d;
import com.twitter.weaver.base.WeaverViewDelegateBinder;
import tv.periscope.android.lib.webrtc.janus.JanusClient;
import tv.periscope.android.lib.webrtc.janus.plugin.JanusPluginInteractor;
import tv.periscope.android.lib.webrtc.janus.plugin.JanusPluginManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgj implements rk6
{
    public final int F0;
    public final stb G0;
    
    public fgj(final stb g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        switch (this.F0) {
            default: {
                final stb g0 = this.G0;
                e0e.f((Object)g0, "$tmp0");
                g0.invoke(o);
                return;
            }
            case 18: {
                final stb g2 = this.G0;
                final n4p$b companion = n4p.Companion;
                e0e.f((Object)g2, "$tmp0");
                g2.invoke(o);
                return;
            }
            case 17: {
                final stb g3 = this.G0;
                e0e.f((Object)g3, "$tmp0");
                g3.invoke(o);
                return;
            }
            case 16: {
                final stb g4 = this.G0;
                e0e.f((Object)g4, "$tmp0");
                g4.invoke(o);
                return;
            }
            case 15: {
                JanusPluginManager.d(this.G0, o);
                return;
            }
            case 14: {
                JanusPluginManager.r(this.G0, o);
                return;
            }
            case 13: {
                JanusPluginInteractor.q(this.G0, o);
                return;
            }
            case 12: {
                JanusPluginInteractor.x(this.G0, o);
                return;
            }
            case 11: {
                JanusPluginInteractor.v(this.G0, o);
                return;
            }
            case 10: {
                JanusClient.a(this.G0, o);
                return;
            }
            case 9: {
                JanusClient.n(this.G0, o);
                return;
            }
            case 8: {
                final stb g5 = this.G0;
                e0e.f((Object)g5, "$tmp0");
                g5.invoke(o);
                return;
            }
            case 7: {
                final stb g6 = this.G0;
                e0e.f((Object)g6, "$tmp0");
                g6.invoke(o);
                return;
            }
            case 6: {
                final stb g7 = this.G0;
                e0e.f((Object)g7, "$tmp0");
                g7.invoke(o);
                return;
            }
            case 5: {
                final stb g8 = this.G0;
                e0e.f((Object)g8, "$tmp0");
                g8.invoke(o);
                return;
            }
            case 4: {
                final stb g9 = this.G0;
                final fyc$j companion2 = fyc.Companion;
                e0e.f((Object)g9, "$tmp0");
                g9.invoke(o);
                return;
            }
            case 3: {
                final stb g10 = this.G0;
                final fyc$j companion3 = fyc.Companion;
                e0e.f((Object)g10, "$tmp0");
                g10.invoke(o);
                return;
            }
            case 2: {
                final stb g11 = this.G0;
                final jvc$a companion4 = jvc.Companion;
                e0e.f((Object)g11, "$tmp0");
                g11.invoke(o);
                return;
            }
            case 1: {
                final stb g12 = this.G0;
                final WeaverViewDelegateBinder$d companion5 = WeaverViewDelegateBinder.Companion;
                e0e.f((Object)g12, "$tmp0");
                g12.invoke(o);
                return;
            }
            case 0: {
                final stb g13 = this.G0;
                e0e.f((Object)g13, "$tmp0");
                g13.invoke(o);
            }
        }
    }
}
