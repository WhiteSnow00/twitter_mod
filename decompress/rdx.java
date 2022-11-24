import java.util.HashMap;
import android.os.SystemClock;
import java.util.Objects;
import android.util.Pair;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rdx implements sdx
{
    public static final List<Integer> e;
    public final Map<Integer, Long> a;
    public Pair<Integer, Long> b;
    public final twj c;
    public final boolean d;
    
    static {
        rdx.e = (ged)ged.i((Object[])new Integer[] { 0, 25, 50, 75, 80, 100 });
    }
    
    public rdx(final twj c, final boolean d) {
        this.c = c;
        this.d = d;
        this.a = (nuh$a)nuh.a(21);
        for (int i = 0; i <= 100; i += 5) {
            ((HashMap<Integer, Long>)this.a).put(Integer.valueOf(i), Long.valueOf(0L));
        }
    }
    
    public final Map<Integer, Long> a() {
        final kkg$a kkg$a = new kkg$a(21);
        final ged e = rdx.e;
        int intValue = ((List<Integer>)e).get(((List)e).size() - 1);
        int n = ((List)e).size() - 1;
        int i = 100;
        long n2 = 0L;
        while (i >= 0) {
            Long value;
            if ((value = ((HashMap<K, Long>)this.a).get(i)) == null) {
                value = 0L;
            }
            n2 += value;
            int n3;
            int intValue2;
            if (this.d) {
                n3 = n;
                if (i <= (intValue2 = intValue)) {
                    if (n2 != 0L) {
                        ((kkg)kkg$a).w((Object)intValue, (Object)n2);
                    }
                    n3 = --n;
                    intValue2 = intValue;
                    if (n >= 0) {
                        intValue2 = ((List<Integer>)rdx.e).get(n);
                        n3 = n;
                    }
                }
            }
            else {
                ((kkg)kkg$a).w((Object)i, (Object)n2);
                intValue2 = intValue;
                n3 = n;
            }
            i -= 5;
            n = n3;
            intValue = intValue2;
        }
        return (Map)((z4j)kkg$a).e();
    }
    
    public final void b(final float n) {
        final int n2 = (int)n;
        final int n3 = n2 - n2 % 5;
        Objects.requireNonNull(this.c);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final Pair<Integer, Long> b = this.b;
        if (b == null) {
            if (n != 0.0f) {
                this.b = (Pair<Integer, Long>)new Pair((Object)n3, (Object)elapsedRealtime);
            }
        }
        else {
            final long longValue = (long)b.second;
            Long value;
            if ((value = ((HashMap<K, Long>)this.a).get(this.b.first)) == null) {
                value = 0L;
            }
            ((HashMap<Integer, Long>)this.a).put((Integer)this.b.first, Long.valueOf(value + (elapsedRealtime - longValue)));
            Pair b2;
            if (n != 0.0f) {
                b2 = new Pair((Object)n3, (Object)elapsedRealtime);
            }
            else {
                b2 = null;
            }
            this.b = (Pair<Integer, Long>)b2;
        }
    }
}
