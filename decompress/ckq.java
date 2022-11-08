// 
// Decompiled by Procyon v0.6.0
// 

public enum ckq
{
    D0("gate"), 
    E0("login"), 
    F0("view_profile"), 
    G0("view_lists"), 
    H0("view_topics"), 
    I0("direct_message"), 
    J0("bookmark"), 
    K0("tweet"), 
    L0("like_tweet"), 
    M0("retweet_tweet"), 
    N0("reply_tweet"), 
    O0("super_follow"), 
    P0("protected_follow"), 
    Q0("tip"), 
    R0("join_spaces"), 
    S0("create_spaces"), 
    T0("view_spaces"), 
    U0("device_follow"), 
    V0("polling");
    
    public final String C0;
    
    public ckq(final String c0) {
        this.C0 = c0;
    }
    
    @Override
    public final String toString() {
        return this.C0;
    }
}
