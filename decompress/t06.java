import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t06 extends bq1
{
    public static final t06.t06$a Companion;
    
    static {
        Companion = new t06.t06$a();
    }
    
    public t06(final String s, final bq1 bq1, final wut wut, final zau zau, final xca<okm> xca, final long n, final long n2, final z06 o, final boolean b) {
        super(s, bq1, wut, zau, xca, null, b, false, 384);
        if (bq1 != null) {
            synchronized (bq1.c) {
                if (!hi.h(bq1.l)) {
                    throw new IllegalArgumentException("Can't add CompletedSpan to a parent not in-process");
                }
                if (bq1.m > TimeUnit.MILLISECONDS.toMicros(n)) {
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
        if (n2 > zau.a()) {
            throw new IllegalArgumentException("CompletedSpan cannot end in the future");
        }
        if (o.C0) {
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
    
    public final boolean U(final uhr uhr) {
        return false;
    }
}
