import com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel$checkRoomStatus$1", f = "AudioSpaceHeroViewModel.kt", l = {}, m = "invokeSuspend")
public final class i21 extends xzr implements gub<rco, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ AudioSpaceHeroViewModel D0;
    public final /* synthetic */ fpf E0;
    
    public i21(final AudioSpaceHeroViewModel d0, final fpf e0, final ap6<? super i21> ap6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final i21 i21 = new i21(this.D0, this.E0, (ap6<? super i21>)ap6);
        i21.C0 = c0;
        return (ap6<oyv>)i21;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i21 i21 = (i21)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        i21.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final rco rco = (rco)this.C0;
        final AudioSpaceHeroViewModel d0 = this.D0;
        final rtb<r21, r21> rtb = (rtb<r21, r21>)new rtb<r21, r21>() {
            public final /* synthetic */ fpf D0 = i21.this.E0;
            
            public final Object invoke(final Object o) {
                final r21 r21 = (r21)o;
                zzd.f((Object)r21, "$this$setState");
                final rco c0 = rco;
                if (c0 instanceof rco$a) {
                    final String a = ((rco$a)c0).a;
                    final fpf d0 = this.D0;
                    String b;
                    if (d0 != null) {
                        b = d0.b;
                    }
                    else {
                        b = null;
                    }
                    if (zzd.a((Object)a, (Object)b)) {
                        final boolean b2 = true;
                        return r21.l(r21, (fpf)null, b2, (mdq)null, false, false, 29);
                    }
                }
                final boolean b2 = false;
                return r21.l(r21, (fpf)null, b2, (mdq)null, false, false, 29);
            }
        };
        final soe<Object>[] v0 = AudioSpaceHeroViewModel.V0;
        d0.Q((rtb)rtb);
        return oyv.a;
    }
}
