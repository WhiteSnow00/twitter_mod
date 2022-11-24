import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Bundle;
import java.util.Map;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdy
{
    public static final jdy b;
    public final EnumMap a;
    
    static {
        b = new jdy(null, null);
    }
    
    public jdy(final Boolean b, final Boolean b2) {
        final EnumMap a = new EnumMap((Class<K>)ady.class);
        (this.a = a).put((Enum)ady.G0, b);
        a.put((Enum)ady.H0, b2);
    }
    
    public jdy(final EnumMap enumMap) {
        (this.a = new EnumMap((Class<K>)ady.class)).putAll(enumMap);
    }
    
    public static jdy a(final Bundle bundle) {
        if (bundle == null) {
            return jdy.b;
        }
        final EnumMap enumMap = new EnumMap((Class<K>)ady.class);
        for (final ady ady : ady.values()) {
            enumMap.put((Enum)ady, i(((BaseBundle)bundle).getString(ady.F0)));
        }
        return new jdy(enumMap);
    }
    
    public static jdy b(final String s) {
        final EnumMap enumMap = new EnumMap((Class<K>)ady.class);
        if (s != null) {
            int n = 0;
            while (true) {
                final ady[] i0 = ady.I0;
                if (n >= 2) {
                    break;
                }
                final ady ady = i0[n];
                final int n2 = n + 2;
                if (n2 < s.length()) {
                    final char char1 = s.charAt(n2);
                    Boolean b = null;
                    if (char1 != '-') {
                        if (char1 != '0') {
                            if (char1 != '1') {
                                b = b;
                            }
                            else {
                                b = Boolean.TRUE;
                            }
                        }
                        else {
                            b = Boolean.FALSE;
                        }
                    }
                    enumMap.put((Enum)ady, b);
                }
                ++n;
            }
        }
        return new jdy(enumMap);
    }
    
    public static final int h(final Boolean b) {
        if (b == null) {
            return 0;
        }
        if (b) {
            return 1;
        }
        return 2;
    }
    
    public static Boolean i(final String s) {
        if (s == null) {
            return null;
        }
        if (s.equals("granted")) {
            return Boolean.TRUE;
        }
        if (s.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }
    
    public final jdy c(final jdy jdy) {
        final EnumMap enumMap = new EnumMap((Class<K>)ady.class);
        for (final ady ady : ady.values()) {
            final Boolean b = this.a.get(ady);
            final Boolean b2 = jdy.a.get(ady);
            Boolean value;
            if (b == null) {
                value = b2;
            }
            else {
                value = b;
                if (b2 != null) {
                    value = (b && b2);
                }
            }
            enumMap.put((Enum)ady, value);
        }
        return new jdy(enumMap);
    }
    
    public final jdy d(final jdy jdy) {
        final EnumMap enumMap = new EnumMap((Class<K>)ady.class);
        for (final ady ady : ady.values()) {
            Boolean b;
            if ((b = this.a.get(ady)) == null) {
                b = jdy.a.get(ady);
            }
            enumMap.put((Enum)ady, b);
        }
        return new jdy(enumMap);
    }
    
    public final String e() {
        final StringBuilder sb = new StringBuilder("G1");
        final ady[] i0 = ady.I0;
        for (int j = 0; j < 2; ++j) {
            final Boolean b = this.a.get(i0[j]);
            char c;
            if (b == null) {
                c = '-';
            }
            else if (b) {
                c = '1';
            }
            else {
                c = '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof jdy)) {
            return false;
        }
        final jdy jdy = (jdy)o;
        for (final ady ady : ady.values()) {
            if (h((Boolean)this.a.get(ady)) != h((Boolean)jdy.a.get(ady))) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean f(final ady ady) {
        final Boolean b = this.a.get(ady);
        return b == null || b;
    }
    
    public final boolean g(final jdy jdy, final ady... array) {
        for (final ady ady : array) {
            final Boolean b = this.a.get(ady);
            final Boolean b2 = jdy.a.get(ady);
            final Boolean false = Boolean.FALSE;
            if (b == false && b2 != false) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.a.values().iterator();
        int n = 17;
        while (iterator.hasNext()) {
            n = n * 31 + h((Boolean)iterator.next());
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("settings: ");
        final ady[] values = ady.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            final ady ady = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(((Enum)ady).name());
            sb.append("=");
            final Boolean b = this.a.get(ady);
            if (b == null) {
                sb.append("uninitialized");
            }
            else {
                String s;
                if (!b) {
                    s = "denied";
                }
                else {
                    s = "granted";
                }
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
