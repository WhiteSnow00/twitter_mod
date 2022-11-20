import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y6k
{
    public static final a Companion;
    public final int a;
    public final List<c7k> b;
    
    static {
        Companion = new a();
    }
    
    public y6k(final int a, final List<c7k> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y6k)) {
            return false;
        }
        final y6k y6k = (y6k)o;
        return this.a == y6k.a && czd.a((Object)this.b, (Object)y6k.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a * 31;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final List<c7k> b = this.b;
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
        public final y6k a(final int n, final String[] array, final int[] array2) {
            czd.f((Object)array, "permissions");
            czd.f((Object)array2, "grantResults");
            if (array.length == array2.length) {
                final int min = Math.min(array2.length, array.length);
                final ArrayList list = new ArrayList<Object>(min);
                for (int i = 0; i < min; ++i) {
                    list.add(new lvj((Object)array2[i], (Object)array[i]));
                }
                final ArrayList list2 = new ArrayList(iq4.H((Iterable)list, 10));
                for (final lvj lvj : list) {
                    list2.add((Object)new c7k((String)lvj.E0, ((Number)lvj.D0).intValue() == 0));
                }
                return new y6k(n, (List<c7k>)list2);
            }
            throw new IllegalArgumentException("Permissions size should always match grant results size.");
        }
    }
}
