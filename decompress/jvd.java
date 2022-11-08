import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvd extends zf4
{
    public final String Z0;
    public final int a1;
    
    public jvd(final String z0, final int a1, final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        super(userIdentifier);
        this.Z0 = z0;
        this.a1 = a1;
    }
    
    @Override
    public final void B(final tfe tfe) {
        super.B(tfe);
        tfe.i0(this.Z0);
        tfe.T("id", this.a1);
        tfe.h();
    }
}
