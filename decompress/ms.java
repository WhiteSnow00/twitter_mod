import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum ms
{
    G0('R'), 
    @Deprecated
    H0('1'), 
    @Deprecated
    I0('2'), 
    J0('A'), 
    K0('S'), 
    L0('C'), 
    M0('D'), 
    N0('Z'), 
    O0('X'), 
    P0('N'), 
    Q0('O');
    
    public static final Map<Character, ms> R0;
    public static final ms[] S0;
    public final char F0;
    
    static {
        int i = 0;
        final HashMap hashMap = new HashMap();
        for (ms[] values = values(); i < values.length; ++i) {
            final ms ms = values[i];
            hashMap.put(ms.F0, ms);
        }
        R0 = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public ms(final char f0) {
        this.F0 = f0;
    }
    
    public static ms b(final char c) {
        final ms ms = ms.R0.get(c);
        if (ms != null) {
            return ms;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("invalid field character: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }
}
