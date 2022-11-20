import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqo extends d2v<tmi>
{
    public jqo(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "owner");
        super(userIdentifier, 0);
    }
    
    public final tqc f0() {
        return (tqc)caa.f("safety_mode_convert_suggested_actions");
    }
    
    public final asc<tmi, kbv> g0() {
        return (asc<tmi, kbv>)new zrc();
    }
}
