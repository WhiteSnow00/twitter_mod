import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class omu
{
    public static final nmp<omu> e;
    public final String a;
    public final String b;
    public final mmu c;
    public final wkq d;
    
    static {
        omu.e = new omu.omu$b();
    }
    
    public omu(final omu.omu$a omu$a) {
        this.a = omu$a.a;
        this.b = omu$a.b;
        this.c = omu$a.c;
        this.d = omu$a.d;
    }
    
    public final void a(final yfe yfe) throws IOException {
        yfe.r0();
        if (flr.g((CharSequence)this.a)) {
            yfe.u0("landing_url", this.a);
        }
        if (flr.g((CharSequence)this.b)) {
            yfe.u0("associated_tweet_id", this.b);
        }
        yfe.u0("display_type", ((Enum)this.c).name());
        yfe.u0("soft_intervention_type", this.d.name());
        yfe.h();
    }
}
