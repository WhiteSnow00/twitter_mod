import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public enum wfb implements vfb
{
    C0, 
    D0, 
    E0, 
    F0, 
    G0, 
    H0;
    
    @Override
    public final boolean b() {
        final int ordinal = this.ordinal();
        boolean b = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b = b;
                if (ordinal == 2) {
                    return b;
                }
                if (ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            b = false;
        }
        return b;
    }
    
    public final boolean e() {
        final int ordinal = this.ordinal();
        final boolean b = true;
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            boolean b2 = b;
            if (ordinal == 3) {
                return b2;
            }
            b2 = b;
            if (ordinal == 4) {
                return b2;
            }
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
