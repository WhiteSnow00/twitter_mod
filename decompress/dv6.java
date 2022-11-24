// 
// Decompiled by Procyon v0.6.0
// 

public enum dv6
{
    public static final a Companion;
    
    G0("UNKNOWN__");
    
    public static final dv6[] H0;
    public final String F0;
    
    static {
        Companion = new a();
        shw.y0((Object[])new String[] { "BadMedia", "ConversationNameTooLong", "ConversationNotExist", "FlaggedAsSpam", "GenericValidationFailure", "InactiveDevice", "OperationNotPermitted", "SafetyRateLimited", "SpamWait", "TooFewParticipants", "TooManyParticipants", "UserRateLimited" });
    }
    
    public dv6(final String f0) {
        this.F0 = f0;
    }
    
    public static final class a
    {
    }
}
