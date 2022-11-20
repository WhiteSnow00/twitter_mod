import android.os.Bundle;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dso extends ste implements qsb<kso, fzv>
{
    public final cso D0;
    
    public dso(final cso d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final kso kso = (kso)o;
        final fso d = this.D0.d;
        final cbw b = d.b;
        final af4$a af4$a = new af4$a(d.a);
        af4$a.o("onboarding", "", "save_password", "", "show_success");
        b.c((elm)((n4j)af4$a).e());
        this.D0.b.startIntentSenderForResult(kso.D0.getIntentSender(), 326547282, (Intent)null, 0, 0, 0, (Bundle)null);
        return fzv.a;
    }
}
