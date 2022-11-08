import java.util.Collections;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xmx
{
    public String a;
    public String b;
    public Set<String> c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public int p;
    public boolean q;
    
    public xmx() {
        this.a = "";
        this.b = "";
        this.c = Collections.emptySet();
        this.d = "";
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.p = -1;
        this.q = false;
    }
    
    public static int b(final int n, final String s, final String s2, final int n2) {
        if (!s.isEmpty()) {
            int n3 = -1;
            if (n != -1) {
                if (s.equals(s2)) {
                    n3 = n + n2;
                }
                return n3;
            }
        }
        return n;
    }
    
    public final int a() {
        final int l = this.l;
        if (l == -1 && this.m == -1) {
            return -1;
        }
        int n = false ? 1 : 0;
        final boolean b = l == 1;
        if (this.m == 1) {
            n = 2;
        }
        return (b ? 1 : 0) | n;
    }
}
