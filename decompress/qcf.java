// 
// Decompiled by Procyon v0.6.0
// 

public enum qcf
{
    public static final a Companion;
    
    D0("AddToBookmarks"), 
    E0("AddToMoment"), 
    F0("Autoplay"), 
    G0("CopyLink"), 
    H0("Embed"), 
    I0("Follow"), 
    J0("HideCommunityTweet"), 
    K0("Like"), 
    L0("ListsAddRemove"), 
    M0("MuteConversation"), 
    N0("PinToProfile"), 
    O0("QuoteTweet"), 
    P0("React"), 
    Q0("RemoveFromCommunity"), 
    R0("Reply"), 
    S0("ReplyDownVote"), 
    T0("Retweet"), 
    U0("SendViaDm"), 
    V0("ShareTweetVia"), 
    W0("ShowRetweetActionMenu"), 
    X0("ViewHiddenReplies"), 
    Y0("ViewTweetActivity"), 
    Z0("VoteOnPoll"), 
    a1("Unknown");
    
    public final String C0;
    
    static {
        Companion = new a();
    }
    
    public qcf(final String c0) {
        this.C0 = c0;
    }
    
    public static final class a
    {
    }
}
