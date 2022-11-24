import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r5j
{
    public static boolean a(final Object o, final Object o2) {
        boolean b = false;
        if (o != o2) {
            if (o == null) {
                return b;
            }
            if (!o.equals(o2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    public static final class a
    {
        public final List<String> a;
        public final Object b;
        
        public a(final Object b) {
            Objects.requireNonNull(b, "null reference");
            this.b = b;
            this.a = new ArrayList();
        }
        
        public final a a(final String s, final Object o) {
            final ArrayList a = this.a;
            final String value = String.valueOf(o);
            final StringBuilder sb = new StringBuilder(s.length() + 1 + value.length());
            sb.append(s);
            sb.append("=");
            sb.append(value);
            a.add(sb.toString());
            return this;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                sb.append((String)this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }
}
