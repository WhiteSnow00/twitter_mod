import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alb implements Comparator
{
    public static final alb G0;
    public static final alb H0;
    public static final alb I0;
    public final int F0;
    
    static {
        G0 = new alb(0);
        H0 = new alb(1);
        I0 = new alb(2);
    }
    
    public alb(final int f0) {
        this.F0 = f0;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        switch (this.F0) {
            default: {
                final hgq$a hgq$a = (hgq$a)o;
                final hgq$a hgq$a2 = (hgq$a)o2;
                final iox h = hgq.h;
                return Float.compare(hgq$a.c, hgq$a2.c);
            }
            case 1: {
                return Collections.max((Collection<? extends jl8$a>)o).f((jl8$a)Collections.max((Collection<? extends jl8$a>)o2));
            }
            case 0: {
                final byte[] array = (byte[])o;
                final byte[] array2 = (byte[])o2;
                final int length = array.length;
                final int length2 = array2.length;
                final int n = 0;
                int length3;
                int length4;
                if (length != length2) {
                    length3 = array.length;
                    length4 = array2.length;
                }
                else {
                    int n2 = 0;
                    while (true) {
                        final int n3 = n;
                        if (n2 >= array.length) {
                            return n3;
                        }
                        if (array[n2] != array2[n2]) {
                            length3 = array[n2];
                            length4 = array2[n2];
                            break;
                        }
                        ++n2;
                    }
                }
                return length3 - length4;
            }
        }
    }
}
