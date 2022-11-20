import com.twitter.onboarding.ocf.OcfContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kg6 extends ste implements qsb<Throwable, taj<? extends OcfContentViewResult>>
{
    public static final kg6 D0;
    
    static {
        D0 = new kg6();
    }
    
    public kg6() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        czd.f((Object)t, "error");
        m8a.d(t);
        return h5j.just((Object)new OcfContentViewResult(new zdj(2)));
    }
}
