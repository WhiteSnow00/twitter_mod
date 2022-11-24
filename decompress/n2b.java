import android.util.SparseBooleanArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n2b
{
    public final SparseBooleanArray a;
    
    public n2b(final SparseBooleanArray a) {
        this.a = a;
    }
    
    public final int a(final int n) {
        omi.o(n, this.b());
        return this.a.keyAt(n);
    }
    
    public final int b() {
        return this.a.size();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n2b)) {
            return false;
        }
        final n2b n2b = (n2b)o;
        if (rnw.a >= 24) {
            return this.a.equals((Object)n2b.a);
        }
        if (this.b() != n2b.b()) {
            return false;
        }
        for (int i = 0; i < this.b(); ++i) {
            if (this.a(i) != n2b.a(i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        if (rnw.a < 24) {
            int b = this.b();
            for (int i = 0; i < this.b(); ++i) {
                b = b * 31 + this.a(i);
            }
            return b;
        }
        return this.a.hashCode();
    }
    
    public static final class a
    {
        public final SparseBooleanArray a;
        public boolean b;
        
        public a() {
            this.a = new SparseBooleanArray();
        }
        
        public final a a(final int n) {
            omi.p(this.b ^ true);
            this.a.append(n, true);
            return this;
        }
        
        public final n2b b() {
            omi.p(this.b ^ true);
            this.b = true;
            return new n2b(this.a);
        }
    }
}
