// 
// Decompiled by Procyon v0.6.0
// 

public enum hz9
{
    E0("Daily"), 
    F0("Weekly"), 
    G0("Periodically"), 
    H0("None"), 
    I0("");
    
    public static final hz9[] J0;
    public final String D0;
    
    public hz9(final String d0) {
        this.D0 = d0;
    }
    
    @Override
    public final String toString() {
        return this.D0;
    }
}
