import com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel$subscribeAudioSpace$1", f = "AudioSpaceHeroViewModel.kt", l = {}, m = "invokeSuspend")
public final class n21 extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ AudioSpaceHeroViewModel C0;
    public final /* synthetic */ String D0;
    
    public n21(final AudioSpaceHeroViewModel c0, final String d0, final ap6<? super n21> ap6) {
        this.C0 = c0;
        this.D0 = d0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new n21(this.C0, this.D0, (ap6<? super n21>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final n21 n21 = (n21)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        n21.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final AudioSpaceHeroViewModel c0 = this.C0;
        final n21$a n21$a = new n21$a(c0, this.D0);
        final soe<Object>[] v0 = AudioSpaceHeroViewModel.V0;
        c0.T((rtb)n21$a);
        final AudioSpaceHeroViewModel c2 = this.C0;
        final String d0 = this.D0;
        c2.Q0.g(d0, true);
        final p1o n0 = c2.N0;
        zzd.f((Object)d0, "value");
        n0.b(d0, true);
        return oyv.a;
    }
}
