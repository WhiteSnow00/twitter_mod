import android.os.SystemClock;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpz
{
    public final String a;
    public long b;
    
    public mpz(final opz opz) {
        this(opz, opz.Q().p());
    }
    
    public mpz(final opz opz, final String a) {
        this.a = a;
        Objects.requireNonNull((r1n)opz.c());
        this.b = SystemClock.elapsedRealtime();
    }
}
