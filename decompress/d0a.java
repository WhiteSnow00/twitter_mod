import java.io.IOException;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonEmailVerificationRequestInput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d0a extends aj8<JsonEmailVerificationRequestInput, tmi>
{
    public d0a() {
        super((Class)tmi.class, "email_verify_begin");
    }
    
    public final asc<tmi, kbv> e() {
        return (asc<tmi, kbv>)v8g.d();
    }
    
    public final int g() {
        return 1;
    }
    
    public final void i(final tqc$a tqc$a, Object d) {
        final JsonEmailVerificationRequestInput jsonEmailVerificationRequestInput = (JsonEmailVerificationRequestInput)d;
        try {
            d = new ujr(rih.a((Object)jsonEmailVerificationRequestInput), lm6.G0);
        }
        catch (final IOException ex) {
            m8a.d((Throwable)ex);
            d = null;
        }
        tqc$a.n("/1.1/onboarding/begin_verification.json", "/");
        final int a = c5j.a;
        tqc$a.e = arc$b.G0;
        tqc$a.d = (vqc)d;
    }
}
