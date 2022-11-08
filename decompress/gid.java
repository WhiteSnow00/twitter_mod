// 
// Decompiled by Procyon v0.6.0
// 

public enum gid
{
    C0, 
    D0, 
    E0, 
    F0;
    
    public static gid b(final boolean b, final boolean b2) {
        if (b) {
            return gid.C0;
        }
        if (b2) {
            return gid.F0;
        }
        return gid.E0;
    }
    
    public final boolean e() {
        return this == gid.C0;
    }
    
    public final boolean f() {
        return this == gid.E0 || this == gid.D0;
    }
}
