import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffs
{
    public static final a Companion;
    public static final ffs b;
    public static final ffs c;
    public static final ffs d;
    public final int a;
    
    static {
        Companion = new a();
        b = new ffs(0);
        c = new ffs(1);
        d = new ffs(2);
    }
    
    public ffs(final int a) {
        this.a = a;
    }
    
    public final boolean a(final ffs ffs) {
        final int a = this.a;
        return (ffs.a | a) == a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ffs && this.a == ((ffs)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        if (this.a == 0) {
            return "TextDecoration.None";
        }
        final ArrayList list = new ArrayList();
        if ((this.a & 0x1) != 0x0) {
            list.add("Underline");
        }
        if ((this.a & 0x2) != 0x0) {
            list.add("LineThrough");
        }
        if (list.size() == 1) {
            final StringBuilder j = fu8.j("TextDecoration.");
            j.append(list.get(0));
            return j.toString();
        }
        final StringBuilder i = fu8.j("TextDecoration[");
        i.append(blz.p(list, ", ", null, 62));
        i.append(']');
        return i.toString();
    }
    
    public static final class a
    {
    }
}
