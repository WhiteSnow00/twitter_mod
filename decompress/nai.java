// 
// Decompiled by Procyon v0.6.0
// 

public final class nai implements k4h$a
{
    public final double a(final v4h v4h) {
        final int ordinal = v4h.ordinal();
        if (ordinal == 0) {
            return 0.0;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
            fr0.q0("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", new Object[] { v4h });
            return 0.0;
        }
        return 1.0;
    }
}
