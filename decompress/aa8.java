import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.NoSuchElementException;
import j$.time.format.DateTimeFormatter;

// 
// Decompiled by Procyon v0.6.0
// 

public enum aa8
{
    public static final a Companion;
    public static final DateTimeFormatter E0;
    
    F0(2131951943), 
    G0(2131955640), 
    H0(2131955639), 
    I0(2131955642), 
    J0(2131955641), 
    K0(2131955643);
    
    public static final aa8[] L0;
    public final int D0;
    
    static {
        Companion = new a();
        E0 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }
    
    public aa8(final int d0) {
        this.D0 = d0;
    }
    
    public static final class a
    {
        public final aa8 a(final int n) {
            for (final aa8 aa8 : aa8.values()) {
                if (aa8.D0 == n) {
                    return aa8;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        
        public final String b() {
            final String format = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
            czd.e((Object)format, "sdf.format(Date())");
            return format;
        }
    }
}
