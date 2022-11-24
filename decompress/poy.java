import java.util.Collection;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class poy
{
    public static final HashSet a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    
    static {
        a = new HashSet((Collection<? extends E>)Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
        b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        c = Arrays.asList("auto", "app", "am");
        d = Arrays.asList("_r", "_dbg");
        final String[][] array = { ix.P0, null };
        final String[] q0 = ix.Q0;
        final int n = 1;
        array[1] = q0;
        int i = 0;
        int n2 = 0;
        while (i < 2) {
            n2 += array[i].length;
            ++i;
        }
        final String[] copy = Arrays.copyOf(array[0], n2);
        int length = array[0].length;
        for (int j = n; j < 2; ++j) {
            final String[] array2 = array[j];
            final int length2 = array2.length;
            System.arraycopy(array2, 0, copy, length, length2);
            length += length2;
        }
        e = Arrays.asList((String[])copy);
        f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
    
    public static boolean a(final String s) {
        return !poy.c.contains(s);
    }
}
