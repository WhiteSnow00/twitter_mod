import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sqz extends vrz
{
    public sqz(final int n) {
        super(n);
    }
    
    public final void a() {
        if (!super.I0) {
            for (int i = 0; i < this.c(); ++i) {
                final Map.Entry e = this.e(i);
                if (((hkz)e.getKey()).d()) {
                    e.setValue(Collections.unmodifiableList((List<?>)e.getValue()));
                }
            }
            Object o;
            if (super.H0.isEmpty()) {
                o = lp7.r1;
            }
            else {
                o = super.H0.entrySet();
            }
            for (final Map.Entry<hkz, V> entry : o) {
                if (entry.getKey().d()) {
                    entry.setValue((V)Collections.unmodifiableList((List<?>)entry.getValue()));
                }
            }
        }
        super.a();
    }
}
