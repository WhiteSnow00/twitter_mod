import com.twitter.business.settings.overview.compose.SwitchAccountConfirmationBottomSheetDialogArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i3s extends zoc
{
    public final SwitchAccountConfirmationBottomSheetDialogArgs F0;
    public final h3s G0;
    
    public i3s(final p66 p3, final SwitchAccountConfirmationBottomSheetDialogArgs f0, final h3s g0) {
        czd.f((Object)p3, "composeDependencies");
        czd.f((Object)f0, "dialogArgs");
        czd.f((Object)g0, "switchAccountActionDispatcher");
        super(p3);
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void b(final x66 x66, final int n) {
        final x66 h = x66.h(1755380830);
        final n96$b a = n96.a;
        j3s.d(this.F0.getAccountType(), this.G0, (hv8)null, h, 64, 4);
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(this, n) {
                public final i3s D0;
                public final int E0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    this.D0.b(x66, this.E0 | 0x1);
                    return fzv.a;
                }
            });
        }
    }
}
