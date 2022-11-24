import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class o88<T extends n8a> extends mk1<T>
{
    public List<T> m;
    public float n;
    public float o;
    public float p;
    public float q;
    
    public o88(final List<T> p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   mk1.<init>:()V
        //     4: aload_0        
        //     5: ldc             -3.4028235E38
        //     7: putfield        o88.n:F
        //    10: aload_0        
        //    11: ldc             3.4028235E38
        //    13: putfield        o88.o:F
        //    16: aload_0        
        //    17: ldc             -3.4028235E38
        //    19: putfield        o88.p:F
        //    22: aload_0        
        //    23: ldc             3.4028235E38
        //    25: putfield        o88.q:F
        //    28: aload_0        
        //    29: aload_1        
        //    30: putfield        o88.m:Ljava/util/List;
        //    33: aload_1        
        //    34: ifnonnull       48
        //    37: aload_0        
        //    38: new             Ljava/util/ArrayList;
        //    41: dup            
        //    42: invokespecial   java/util/ArrayList.<init>:()V
        //    45: putfield        o88.m:Ljava/util/List;
        //    48: aload_0        
        //    49: getfield        o88.m:Ljava/util/List;
        //    52: astore_1       
        //    53: aload_1        
        //    54: ifnull          128
        //    57: aload_1        
        //    58: invokeinterface java/util/List.isEmpty:()Z
        //    63: ifeq            69
        //    66: goto            128
        //    69: aload_0        
        //    70: ldc             -3.4028235E38
        //    72: putfield        o88.n:F
        //    75: aload_0        
        //    76: ldc             3.4028235E38
        //    78: putfield        o88.o:F
        //    81: aload_0        
        //    82: ldc             -3.4028235E38
        //    84: putfield        o88.p:F
        //    87: aload_0        
        //    88: ldc             3.4028235E38
        //    90: putfield        o88.q:F
        //    93: aload_0        
        //    94: getfield        o88.m:Ljava/util/List;
        //    97: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   102: astore_1       
        //   103: aload_1        
        //   104: invokeinterface java/util/Iterator.hasNext:()Z
        //   109: ifeq            128
        //   112: aload_0        
        //   113: aload_1        
        //   114: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   119: checkcast       Ln8a;
        //   122: invokevirtual   o88.g0:(Ln8a;)V
        //   125: goto            103
        //   128: return         
        //    Signature:
        //  (Ljava/util/List<TT;>;Ljava/lang/String;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final float F() {
        return this.q;
    }
    
    public final T I(final float n, final float n2) {
        return this.R(n, n2, a.H0);
    }
    
    public final T R(final float n, final float n2, final a a) {
        final int i0 = this.i0(n, n2, a);
        if (i0 > -1) {
            return this.m.get(i0);
        }
        return null;
    }
    
    public final float U() {
        return this.p;
    }
    
    public final int Z() {
        return this.m.size();
    }
    
    public final float d() {
        return this.n;
    }
    
    public final void g0(final T t) {
        if (t == null) {
            return;
        }
        if (t.b() < this.q) {
            this.q = t.b();
        }
        if (t.b() > this.p) {
            this.p = t.b();
        }
        this.h0(t);
    }
    
    public final float h() {
        return this.o;
    }
    
    public final void h0(final T t) {
        if (t.a() < this.o) {
            this.o = t.a();
        }
        if (t.a() > this.n) {
            this.n = t.a();
        }
    }
    
    public final int i(final n8a n8a) {
        return this.m.indexOf(n8a);
    }
    
    public final int i0(float a, final float n, final a a2) {
        final List<T> m = this.m;
        if (m != null && !m.isEmpty()) {
            int i = 0;
            int n2 = this.m.size() - 1;
            while (i < n2) {
                final int n3 = (i + n2) / 2;
                final float n4 = this.m.get(n3).b() - a;
                final List<T> j = this.m;
                final int n5 = n3 + 1;
                final float b = j.get(n5).b();
                final float abs = Math.abs(n4);
                final float abs2 = Math.abs(b - a);
                Label_0170: {
                    if (abs2 >= abs) {
                        if (abs >= abs2) {
                            final double n6 = n4;
                            if (n6 < 0.0) {
                                if (n6 < 0.0) {
                                    break Label_0170;
                                }
                                continue;
                            }
                        }
                        n2 = n3;
                        continue;
                    }
                }
                i = n5;
            }
            int n7;
            if ((n7 = n2) != -1) {
                final float b2 = this.m.get(n2).b();
                int k;
                if (a2 == o88.a.F0) {
                    k = n2;
                    if (b2 < a && (k = n2) < this.m.size() - 1) {
                        k = n2 + 1;
                    }
                }
                else {
                    k = n2;
                    if (a2 == o88.a.G0) {
                        k = n2;
                        if (b2 > a && (k = n2) > 0) {
                            k = n2 - 1;
                        }
                    }
                }
                n7 = k;
                if (!Float.isNaN(n)) {
                    while (k > 0) {
                        final List<T> l = this.m;
                        final int n8 = k - 1;
                        if (l.get(n8).b() != b2) {
                            break;
                        }
                        k = n8;
                    }
                    a = this.m.get(k).a();
                Label_0414:
                    while (true) {
                        int n9 = k;
                        n8a n8a;
                        int n10;
                        do {
                            n10 = n9 + 1;
                            if (n10 >= this.m.size()) {
                                break Label_0414;
                            }
                            n8a = this.m.get(n10);
                            if (n8a.b() != b2) {
                                break Label_0414;
                            }
                            n9 = n10;
                        } while (Math.abs(n8a.a() - n) >= Math.abs(a - n));
                        a = n;
                        k = n10;
                    }
                    n7 = k;
                }
            }
            return n7;
        }
        return -1;
    }
    
    public final boolean n(final T t) {
        List<T> m;
        if ((m = this.m) == null) {
            m = new ArrayList<T>();
        }
        this.g0(t);
        return m.add(t);
    }
    
    public final T o(final int n) {
        return this.m.get(n);
    }
    
    public final String toString() {
        final StringBuffer sb = new StringBuffer();
        final StringBuffer sb2 = new StringBuffer();
        final StringBuilder f = ehk.f("DataSet, label: ");
        String c;
        if ((c = super.c) == null) {
            c = "";
        }
        f.append(c);
        f.append(", entries: ");
        f.append(this.m.size());
        f.append("\n");
        sb2.append(f.toString());
        sb.append(sb2.toString());
        for (int i = 0; i < this.m.size(); ++i) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(this.m.get(i).toString());
            sb3.append(" ");
            sb.append(sb3.toString());
        }
        return sb.toString();
    }
    
    public final void u(final float n, final float n2) {
        final List<T> m = this.m;
        if (m != null) {
            if (!m.isEmpty()) {
                this.n = -3.4028235E38f;
                this.o = Float.MAX_VALUE;
                for (int i = this.i0(n, Float.NaN, a.G0); i <= this.i0(n2, Float.NaN, a.F0); ++i) {
                    this.h0(this.m.get(i));
                }
            }
        }
    }
    
    public final List<T> v(final float n) {
        final ArrayList list = new ArrayList();
        int n2 = this.m.size() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = (n2 + i) / 2;
            final n8a n8a = this.m.get(n3);
            if (n == n8a.b()) {
                int j;
                for (j = n3; j > 0 && this.m.get(j - 1).b() == n; --j) {}
                while (j < this.m.size()) {
                    final n8a n8a2 = this.m.get(j);
                    if (n8a2.b() != n) {
                        break;
                    }
                    list.add(n8a2);
                    ++j;
                }
                break;
            }
            if (n > n8a.b()) {
                i = n3 + 1;
            }
            else {
                n2 = n3 - 1;
            }
        }
        return list;
    }
    
    public enum a
    {
        F0, 
        G0, 
        H0;
        
        public static final a[] I0;
    }
}
