// 
// Decompiled by Procyon v0.6.0
// 

public enum hvu
{
    public static final a Companion;
    
    G0("UNKNOWN__");
    
    public static final hvu[] H0;
    public final String F0;
    
    static {
        Companion = new a();
        shw.y0((Object[])new String[] { "Blocked", "BounceDeleted", "Bounced", "ExclusiveTweet", "NsfwLoggedOut", "NsfwViewerHasNoStatedAge", "NsfwViewerIsUnderage", "Protected", "Suspended" });
    }
    
    public hvu(final String f0) {
        this.F0 = f0;
    }
    
    public static final class a
    {
    }
}
