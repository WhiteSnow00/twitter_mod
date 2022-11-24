import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l7k
{
    public static final a Companion;
    public final int a;
    public final List<q7k> b;
    
    static {
        Companion = new a();
    }
    
    public l7k(final int a, final List<q7k> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l7k)) {
            return false;
        }
        final l7k l7k = (l7k)o;
        return this.a == l7k.a && e0e.a((Object)this.b, (Object)l7k.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a * 31;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final List<q7k> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("PermissionResult(requestCode=");
        sb.append(a);
        sb.append(", permissions=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final l7k a(final int n, final String[] array, final int[] array2) {
            e0e.f((Object)array, "permissions");
            e0e.f((Object)array2, "grantResults");
            if (array.length == array2.length) {
                final int min = Math.min(array2.length, array.length);
                final ArrayList list = new ArrayList<Object>(min);
                for (int i = 0; i < min; ++i) {
                    list.add(new awj((Object)array2[i], (Object)array[i]));
                }
                final ArrayList list2 = new ArrayList(nr4.d1((Iterable)list, 10));
                for (final awj awj : list) {
                    list2.add((Object)new q7k((String)awj.G0, ((Number)awj.F0).intValue() == 0));
                }
                return new l7k(n, (List<q7k>)list2);
            }
            throw new IllegalArgumentException("Permissions size should always match grant results size.");
        }
    }
}
