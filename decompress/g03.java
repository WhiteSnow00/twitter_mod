import com.twitter.business.api.BusinessInputTextContentViewArgs;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g03
{
    public static final a Companion;
    public final UserIdentifier a;
    public final String b;
    
    static {
        Companion = new a();
    }
    
    public g03(final UserIdentifier a, final BusinessInputTextContentViewArgs businessInputTextContentViewArgs) {
        e0e.f((Object)a, "userIdentifier");
        e0e.f((Object)businessInputTextContentViewArgs, "contentArgs");
        this.a = a;
        this.b = businessInputTextContentViewArgs.getScribePageName();
    }
    
    public static final class a
    {
    }
}
