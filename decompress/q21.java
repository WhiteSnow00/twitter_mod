import com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel$unsubscribeAudioSpace$1", f = "AudioSpaceHeroViewModel.kt", l = {}, m = "invokeSuspend")
public final class q21 extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ AudioSpaceHeroViewModel C0;
    public final /* synthetic */ String D0;
    
    public q21(final AudioSpaceHeroViewModel c0, final String d0, final ap6<? super q21> ap6) {
        this.C0 = c0;
        this.D0 = d0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new q21(this.C0, this.D0, (ap6<? super q21>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final q21 q21 = (q21)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        q21.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final AudioSpaceHeroViewModel c0 = this.C0;
        final String d0 = this.D0;
        c0.Q0.g(d0, false);
        final p1o n0 = c0.N0;
        zzd.f((Object)d0, "value");
        n0.b(d0, false);
        this.C0.V((Object)d21$a.a);
        return oyv.a;
    }
}
