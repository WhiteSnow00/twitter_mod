import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.Charset;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xiz
{
    public final fpz a;
    public boolean b;
    
    static {
        new xiz(true);
    }
    
    public xiz() {
        this.a = new fpz(16);
    }
    
    public xiz(final boolean b) {
        final fpz a = new fpz(0);
        this.a = a;
        if (!this.b) {
            a.a();
            this.b = true;
        }
        if (!this.b) {
            a.a();
            this.b = true;
        }
    }
    
    public static final void b(final uiz uiz, final Object o) {
        final qrz c = uiz.c();
        final Charset a = glz.a;
        Objects.requireNonNull(o);
        final qrz d0 = qrz.D0;
        final rrz d2 = rrz.D0;
        boolean b = false;
        switch (((Enum)c.C0).ordinal()) {
            default: {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", uiz.a(), uiz.c().C0, o.getClass().getName()));
            }
            case 8: {
                if (o instanceof xnz) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", uiz.a(), uiz.c().C0, o.getClass().getName()));
            }
            case 7: {
                if (o instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", uiz.a(), uiz.c().C0, o.getClass().getName()));
            }
            case 6: {
                if (o instanceof bhz) {
                    return;
                }
                if (o instanceof byte[]) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", uiz.a(), uiz.c().C0, o.getClass().getName()));
            }
            case 5: {
                b = (o instanceof String);
                break;
            }
            case 4: {
                b = (o instanceof Boolean);
                break;
            }
            case 3: {
                b = (o instanceof Double);
                break;
            }
            case 2: {
                b = (o instanceof Float);
                break;
            }
            case 1: {
                b = (o instanceof Long);
                break;
            }
            case 0: {
                b = (o instanceof Integer);
                break;
            }
        }
        if (!b) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", uiz.a(), uiz.c().C0, o.getClass().getName()));
        }
    }
    
    public final void a(final uiz uiz, Object o) {
        if (uiz.d()) {
            if (!(o instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            final ArrayList list = new ArrayList();
            list.addAll((Collection)o);
            for (int size = list.size(), i = 0; i < size; ++i) {
                b(uiz, list.get(i));
            }
            o = list;
        }
        else {
            b(uiz, o);
        }
        ((iqz)this.a).d((Comparable)uiz, o);
    }
    
    public final Object clone() throws CloneNotSupportedException {
        final xiz xiz = new xiz();
        for (int i = 0; i < ((iqz)this.a).c(); ++i) {
            final Map.Entry e = ((iqz)this.a).e(i);
            xiz.a((uiz)e.getKey(), e.getValue());
        }
        final fpz a = this.a;
        Object o;
        if (((iqz)a).E0.isEmpty()) {
            o = tdy.L1;
        }
        else {
            o = ((iqz)a).E0.entrySet();
        }
        for (final Map.Entry<uiz, V> entry : o) {
            xiz.a(entry.getKey(), entry.getValue());
        }
        return xiz;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof xiz && ((iqz)this.a).equals((Object)((xiz)o).a));
    }
    
    @Override
    public final int hashCode() {
        return ((iqz)this.a).hashCode();
    }
}
