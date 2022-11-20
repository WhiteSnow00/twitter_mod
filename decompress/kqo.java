// 
// Decompiled by Procyon v0.6.0
// 

public enum kqo
{
    E0("OneDay"), 
    F0("ThreeDays"), 
    G0("SevenDays");
    
    public static final kqo[] H0;
    public final String D0;
    
    public kqo(final String d0) {
        this.D0 = d0;
    }
    
    @Override
    public final String toString() {
        return this.D0;
    }
}
