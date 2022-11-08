import com.twitter.business.api.BusinessInputTextContentViewArgs;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vz2
{
    public static final a Companion;
    public final UserIdentifier a;
    public final String b;
    
    static {
        Companion = new a();
    }
    
    public vz2(final UserIdentifier a, final BusinessInputTextContentViewArgs businessInputTextContentViewArgs) {
        zzd.f((Object)a, "userIdentifier");
        zzd.f((Object)businessInputTextContentViewArgs, "contentArgs");
        this.a = a;
        this.b = businessInputTextContentViewArgs.getScribePageName();
    }
    
    public static final class a
    {
    }
}
