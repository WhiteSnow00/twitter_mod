import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uft implements okx<igt, oft, nft>
{
    public final View C0;
    public final ydj D0;
    public final mft E0;
    public TextView F0;
    public TextView G0;
    public RecyclerView H0;
    public final zml<oft> I0;
    public final rd6 J0;
    public final mhh<igt> K0;
    
    public uft(final View c0, final ydj d0, final ibm ibm, final mft e0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)d0, "ocfRichTextProcessorHelper");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)e0, "actionClickListener");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = (TextView)c0.findViewById(2131432088);
        this.G0 = (TextView)c0.findViewById(2131427503);
        this.H0 = (RecyclerView)c0.findViewById(2131428448);
        this.I0 = (zml<oft>)new zml();
        this.J0 = new rd6();
        ibm.i((rj)new czo((Object)this, 18));
        this.K0 = (mhh<igt>)ajy.a0((rtb)new uft$b(this));
    }
    
    public static final void a(final uft uft, final xdj xdj, final otb otb) {
        final TextView g0 = (TextView)uft.C0.findViewById(2131427503);
        uft.G0 = g0;
        if (g0 != null) {
            uft.D0.a(g0, (xwm)xdj);
        }
        final TextView g2 = uft.G0;
        if (g2 != null) {
            final b5j map = asy.q((View)g2).map((qtb)new ozb((rtb)new vft(uft, otb), 1));
            if (map != null) {
                final j29 subscribe = map.subscribe();
                if (subscribe != null) {
                    uft.J0.a(subscribe);
                }
            }
        }
    }
    
    public final void T(final oax oax) {
        final igt igt = (igt)oax;
        zzd.f((Object)igt, "state");
        this.K0.b((Object)igt);
    }
    
    public final void s(final Object o) {
        final nft nft = (nft)o;
        zzd.f((Object)nft, "effect");
        if (nft instanceof nft$a) {
            this.E0.a(((nft$a)nft).a);
        }
    }
    
    public final b5j<oft> x() {
        return (b5j<oft>)this.I0;
    }
}
