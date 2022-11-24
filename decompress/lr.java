// 
// Decompiled by Procyon v0.6.0
// 

public final class lr implements m1l<l4a>
{
    public final m1l<l4a> a;
    
    public lr(final m1l<l4a> a) {
        this.a = a;
    }
    
    @Override
    public final void a(final pk6<l4a> pk6, final n1l n1l) {
        this.a.a((pk6<l4a>)new b(pk6, null), n1l);
    }
    
    public static final class b extends kn8<l4a, l4a>
    {
        public b(final pk6 pk6, final lr$a object) {
            super(pk6);
        }
        
        public final void i(final Object o, final int n) {
            final l4a l4a = (l4a)o;
            if (l4a == null) {
                super.b.c(null, n);
            }
            else {
                if (!l4a.l(l4a)) {
                    l4a.j();
                }
                super.b.c(l4a, n);
            }
        }
    }
}
