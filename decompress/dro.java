// 
// Decompiled by Procyon v0.6.0
// 

public enum dro
{
    G0("OneDay"), 
    H0("ThreeDays"), 
    I0("SevenDays");
    
    public static final dro[] J0;
    public final String F0;
    
    public dro(final String f0) {
        this.F0 = f0;
    }
    
    @Override
    public final String toString() {
        return this.F0;
    }
}
