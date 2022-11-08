// 
// Decompiled by Procyon v0.6.0
// 

public enum qvh
{
    D0("none"), 
    E0("notifications"), 
    F0("home_timeline"), 
    G0("tweet_replies");
    
    public final String C0;
    
    public qvh(final String c0) {
        this.C0 = c0;
    }
    
    @Override
    public final String toString() {
        return this.C0;
    }
}
