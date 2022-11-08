import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public enum ndw
{
    D0("GenericBadgeLabel"), 
    E0("GenericInfoLabel"), 
    F0("ElectionsLabel"), 
    G0("AutomatedLabel");
    
    public final String C0;
    
    public ndw(final String c0) {
        this.C0 = c0;
    }
    
    public final String b() {
        return this.name().toLowerCase(Locale.ENGLISH);
    }
    
    @Override
    public final String toString() {
        return this.C0;
    }
}
