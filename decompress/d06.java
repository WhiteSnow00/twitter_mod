import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d06 extends xp1
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public d06(final String s, final xp1 xp1, final mvt mvt, final sbu sbu, final fca<elm> fca, final long n, final long n2, final j06 o, final boolean b) {
        super(s, xp1, mvt, sbu, (fca)fca, (rvt)null, b, false, 384);
        if (xp1 != null) {
            synchronized (xp1.c) {
                if (!ze.g(xp1.l)) {
                    throw new IllegalArgumentException("Can't add CompletedSpan to a parent not in-process");
                }
                if (xp1.m > TimeUnit.MILLISECONDS.toMicros(n)) {
                    throw new IllegalArgumentException("CompletedSpan cannot start before its parent started");
                }
            }
        }
        if (n < 0L) {
            throw new IllegalArgumentException("Start time cannot be negative");
        }
        if (n > n2) {
            throw new IllegalArgumentException("CompletedSpan cannot end before it begins");
        }
        if (n2 > sbu.a()) {
            throw new IllegalArgumentException("CompletedSpan cannot end in the future");
        }
        if (o.D0) {
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            super.m = milliseconds.toMicros(n);
            super.n = milliseconds.toMicros(n2);
            super.o = o;
            this.m(3);
            if (b) {
                this.k();
            }
            return;
        }
        throw new IllegalArgumentException("CompletedSpan must have a completed Completion type");
    }
    
    public final boolean U(final oir oir) {
        return false;
    }
    
    public static final class a
    {
    }
}
