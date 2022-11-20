import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afk
{
    public static final afk a;
    public static final UserIdentifier b;
    
    static {
        a = new afk();
        b = UserIdentifier.Companion.c();
    }
    
    public static void a(final String s) {
        final UserIdentifier b = afk.b;
        fca.a().b(b, (elm)new af4(b, vba.Companion.e("tweet", "container_conversation", "pinned_reply", s, "click")));
    }
}
